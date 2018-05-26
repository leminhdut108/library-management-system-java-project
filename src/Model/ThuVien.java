package Model;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hctha_000
 */
public class ThuVien {
    
    public static boolean checkNumeric(String textField){
    try {
            int in = Integer.parseInt(textField);
            return true; //Đây là 1 số
          }
         catch (NumberFormatException e) {
            return false; // Đây không phải là số
        }
    }
    public static boolean checkValidDate(String dateString) {
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    df.setLenient(false);
    try {
        df.parse(dateString);
        return true;
    } catch (ParseException e) {
        return false;
    }
    
    } 
    
    public static String getToday(){
    Date today = new Date();
    String ngay = new SimpleDateFormat("dd").format(today);
    String thang = new SimpleDateFormat("MM").format(today);
    String nam = new SimpleDateFormat("YYYY").format(today);
    return (nam + "-" + thang + "-" + ngay);
    
    }
    
    public static String getTodayNgayThangNam(){
    Date today = new Date();
    String ngay = new SimpleDateFormat("dd").format(today);
    String thang = new SimpleDateFormat("MM").format(today);
    String nam = new SimpleDateFormat("YYYY").format(today);
    return (ngay + "/" + thang + "/" + nam);
    
    }
    public static int getDayBetween(String start, String end){
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
  long diff = -1;
  try {
    Date dateStart = simpleDateFormat.parse(start);
    Date dateEnd = simpleDateFormat.parse(end);

    diff = Math.round((dateEnd.getTime() - dateStart.getTime()) / (double) 86400000);
  } catch (Exception e) {
    //handle the exception according to your own situation
  }
  return (int)diff;
}
        
    
    
    
    public static void xuatFilePDF(String url , JTable table, String title, Rectangle PageSize) {
        
        try{
            com.itextpdf.text.Document document = new com.itextpdf.text.Document(PageSize);
        
        PdfWriter writer;
        writer = PdfWriter.getInstance(document,new FileOutputStream(url));

        // writer = PdfWriter.getInstance(document, new
        // FileOutputStream("my_jtable_fonts.pdf"));
        document.open();
        PdfContentByte cb = writer.getDirectContent();

        PdfTemplate tp = cb.createTemplate(table.getWidth(), table.getHeight());
        
        
        
        document.addTitle(title);
        
        Graphics2D g2;

        g2 = tp.createGraphicsShapes(table.getWidth(), table.getHeight());        
        // g2 = tp.createGraphics(500, 500);
        
        table.print(g2);
        float x,y;
            x = (PageSize.getWidth() - table.getWidth())/2;
           y = (PageSize.getHeight() - table.getHeight());
            
        g2.dispose();
        cb.addTemplate(tp, x, y);
        

        
         
        
           
        
        
        
        // step 5: we close the document
        
        document.close();
        
        JOptionPane.showMessageDialog(null, "Xuất file thành công!");
        }
        catch(DocumentException ex){
        JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra :" + ex, "ERROR", 2);
        }
        catch(IOException ex){
        JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra :" + ex, "ERROR", 2);
        }
    }
    
    public static void xuatFilePDF2(String fileName ,String textBefore,String[] columnName, String textAfter, JTable table, String title, Rectangle PageSize) {
        try{
        BaseFont bf = BaseFont.createFont("Font\\vuTimes.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
        Font font = new Font(bf,15);
        
            
            com.itextpdf.text.Document document = new com.itextpdf.text.Document(PageSize);
        
        String currentDir = System.getProperty("user.dir");
        String urlFile = System.getProperty("user.dir") +"/src/FilePDF/" +fileName + ".pdf";
        System.out.println("Current dir using System:" +currentDir);
        PdfWriter writer;
        File file = new File(urlFile);
        file.getParentFile().mkdirs();//Tạo thư mục cha cho file
        writer = PdfWriter.getInstance(document,new FileOutputStream(urlFile));

        // writer = PdfWriter.getInstance(document, new
        // FileOutputStream("my_jtable_fonts.pdf"));
        document.open();
        PdfContentByte cb = writer.getDirectContent();

        PdfTemplate tp = cb.createTemplate(table.getWidth(), table.getHeight());
        
        
        
        document.addTitle(title.trim());
        
        int hang = table.getRowCount();
        int cot = table.getColumnCount();
        PdfPTable pdftable = new PdfPTable(cot);
        for(int i = 0; i < cot; i++){
            
        //pdftable.addCell(columnName[i]);
        pdftable.addCell(new PdfPCell(new Phrase(columnName[i],font)));
        }
        //DefaultTableModel dm = new (DefaultTableModel) table.getModel();
        TableModel model = (TableModel) table.getModel();
        String gt = "";
        for(int j= 0; j < hang; j++){
            for(int i = 0; i < cot; i++){
                gt = "";
                if(model.getValueAt(j,i) != null) gt = model.getValueAt(j,i).toString();
                if(gt.trim().equals("") || gt == null){ pdftable.addCell(" ");}
            else {
                    //pdftable.addCell(gt,font);
                pdftable.addCell(new PdfPCell(new Phrase(gt,font)));
                }   
        }}
        document.add(new Paragraph(textBefore + "\n\n",font));
        document.add(pdftable);
        document.add(new Paragraph("\n\n" +textAfter,font));
         
        
           
        
        
        
        // step 5: we close the document
        
        document.close();
        if (JOptionPane.showConfirmDialog(null, "Xuất file " +title.trim() +" thành công!\n" +"Bạn có muốn mở không ?") == JOptionPane.YES_OPTION) {
        openPDFfile(urlFile);
        }
        //JOptionPane.showMessageDialog(null, "Xuất file " +title +" thành công!\n" + url);
        }
        catch(DocumentException ex){
        JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra :" + ex, "ERROR", 2);
        }
        catch(IOException ex){
        JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra :" + ex, "ERROR", 2);
        }
        
         
    }
    public static void resetTable(JTable table) {
        DefaultTableModel dm = (DefaultTableModel) table.getModel();
        int rowCount = dm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
    }
    
    public static void openPDFfile(String url) {
        
        try {
        //Process p = Runtime.getRuntime().exec ("\"" +url + "\""); cach nay cham hon
        if (Desktop.isDesktopSupported()) {       
        File myFile = new File(url);
        Desktop.getDesktop().open(myFile);
        }  
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra : openPDFfile " + ex, "ERROR", 2);
        }
    
    }
    
    public static boolean initData(boolean bb, String thongbao, String url){
    try {
            FileInputStream fileInPutStream = new FileInputStream(url);
            Reader reader = new java.io.InputStreamReader(fileInPutStream, "Unicode");
            BufferedReader buffReader = new BufferedReader(reader);
            String line = null;
            String querty = null;
            StringBuilder sb = new StringBuilder();

                while ((line = buffReader.readLine()) != null) {
                    
                    sb.append(line);
                }
                DBConnection db = new DBConnection();
                db.getConnection();
                while(sb.indexOf(";")>=0){
                querty = sb.substring(0, sb.indexOf(";"));
                sb.delete(0,sb.indexOf(";")+1);
                db.state.execute(querty);
                
                }
            


                if(!thongbao.equals("no"))JOptionPane.showMessageDialog(null, thongbao);
                
            //Đóng kết nối với file.
            reader.close();
            return bb;

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
        return (!bb);
    }
    
}
