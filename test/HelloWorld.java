
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * First iText example: Hello World.
 */
public class HelloWorld {

    /**
     * Path to the resulting PDF file.
     */
    public static final String RESULT
            = "C:\\Users\\hctha_000\\Desktop\\hello.pdf";

    /**
     * Creates a PDF file: hello.pdf
     *
     * @param args no arguments needed
     */
    public static void main(String[] args)
            throws DocumentException, IOException {
        new HelloWorld().createPdf(RESULT);
    }

    /**
     * Creates a PDF document.
     *
     * @param filename the path to the new PDF document
     * @throws DocumentException
     * @throws IOException
     */
    public void createPdf(String filename)
            throws DocumentException, IOException {
        // step 1
        Document document = new Document();
        // step 2
        PdfWriter.getInstance(document, new FileOutputStream(filename));
        // step 3
        
        BaseFont bf = BaseFont.createFont("C:\\Windows\\Fonts\\vuTimes.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
        Font font = new Font(bf,15);
        document.open();
        // step 4
        String pa = "Họ và tên         : Lê Ngọc Long\n"
                + "MSSV                : 20142659\n"
                + "Đề tài               : Xây dựng chương trình quản lý thư viện";
        pa += "\n\nTrường Đại Học Bách Khoa Hà Nội          Cộng Hòa - Xã Hội - Chủ Nghĩa - Việt Nam\n"
                + "      Thư viện Tạ Quang Bửu                              Độc Lập - Tự Do - Hạnh Phúc" ;
        pa += "\n\n                                         TÌM KIẾM SÁCH THEO xxx";
        
        document.add(new Paragraph(pa,font));




        // step 5
        document.close();
    }
}
