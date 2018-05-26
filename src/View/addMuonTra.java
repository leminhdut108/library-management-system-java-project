/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DBConnection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class addMuonTra extends javax.swing.JFrame {

    DefaultTableModel dm;
    String MaMuonTra = "";
    int soSachMuon = 0;

    public addMuonTra() {
        initComponents();
        getListJComboBox_DocGia();
        getListJComboBox_Sach();
        setTitle("Thêm Mượn Trả - Phần mềm quản lí thư viện");
        setExtendedState(MAXIMIZED_BOTH);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox_DocGia = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox_Sach = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox_DocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_DocGiaActionPerformed(evt);
            }
        });

        jLabel2.setText("Độc Giả");

        jLabel3.setText("Sách");

        jLabel4.setText("Ngày trả dự kiến");

        jLabel5.setText("Tiền Phạt/Ngày");

        jButton1.setText("Thêm vào phiếu mượn");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Mượn Trả", "Mã Quyển", "Tiền Phạt/Ngày", "Ngày Trả Dự Kiến"
            }
        ));
        jScrollPane1.setViewportView(Table1);

        jLabel6.setText("Mã Mượn Trả");

        jLabel7.setText("Đặt Cọc");

        jLabel8.setText("Ghi Chú");

        jButton2.setText("Xóa từ phiếu mượn");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Tạo Phiếu Mượn");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox_Sach, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(292, 292, 292))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_DocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(158, 158, 158)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_Sach, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(26, 26, 26)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(jComboBox_DocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)))
                .addGap(218, 218, 218))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_DocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_DocGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_DocGiaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        themVaoPhieuMuon(jTextField2.getText(), jTextField1.getText());


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        taoPhieuMuon((String) jComboBox_DocGia.getSelectedItem(), jTextField3.getText(), jTextField4.getText(), jTextField5.getText());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        xoaTuPhieuMuon();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(Table1.getRowCount() == 0){
        if (JOptionPane.showConfirmDialog(null, "Bạn chưa mượn quyển nào cả. Bạn có muốn thoát ra không?\nNếu thoát phiếu mượn này sẽ bị hủy.") == JOptionPane.YES_OPTION) {
        deletePhieuMuon(MaMuonTra);
            this.dispose();
            QuanLiMuonTra newQuanLiMuonTra = new QuanLiMuonTra();
            newQuanLiMuonTra.showWindows();
        }
        }else{
        this.dispose();
        QuanLiMuonTra newQuanLiMuonTra = new QuanLiMuonTra();
        newQuanLiMuonTra.showWindows();
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addMuonTra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox_DocGia;
    private javax.swing.JComboBox<String> jComboBox_Sach;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

    private void getListJComboBox_DocGia() {
        try {

            jComboBox_DocGia.removeAllItems();
            String[] MaDocGia = getMaDocGia();

            for (String MaDocGia1 : MaDocGia) {
                jComboBox_DocGia.addItem(getXtuTablemaY("TenDocGia", "DocGia", "MaDocGia = '" + MaDocGia1 + "'"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +setJComboBox_MaDocGia", "ERROR", 2);
        }
    }

    private void getListJComboBox_Sach() {
        try {

            jComboBox_Sach.removeAllItems();
            String[] MaSach = getMaSach();

            for (String MaSach1 : MaSach) {
                jComboBox_Sach.addItem(getXtuTablemaY("TenSach", "Sach", "MaSach = '" + MaSach1 + "'"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +setJComboBox_MaSach", "ERROR", 2);
        }
    }

    private String[] getMaDocGia() {
        String[] maDocGia = null;
        String sqlSelectMaDocGia = null;
        sqlSelectMaDocGia = "SELECT DISTINCT  MaDocGia FROM DocGia GROUP BY MaDocGia ASC;";

        try {
            int i = 0, SoMaDocGia = 0;
            DBConnection dbgetMaDocGia = new DBConnection();
            dbgetMaDocGia.getConnection();
            System.out.println(sqlSelectMaDocGia);
            dbgetMaDocGia.excuteQuery(sqlSelectMaDocGia);

            while (dbgetMaDocGia.result.next()) {
                SoMaDocGia++;
            }
            dbgetMaDocGia.result.beforeFirst();
            maDocGia = new String[SoMaDocGia];
            while (dbgetMaDocGia.result.next()) {
                maDocGia[i] = dbgetMaDocGia.result.getString("MaDocGia");
                i++;
            }
            dbgetMaDocGia.freeConnection();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +getMaMuonTra", "ERROR", 2);
        }

        return maDocGia;

    }

    private String[] getMaSach() {
        String[] maSach = null;
        String sqlSelectMaSach = null;
        sqlSelectMaSach = "SELECT DISTINCT  MaSach FROM ChiTietSach WHERE TrangThai = 'Còn' GROUP BY MaSach ASC;";

        try {
            int i = 0, SoMaSach = 0;
            DBConnection dbgetMaSach = new DBConnection();
            dbgetMaSach.getConnection();
            System.out.println(sqlSelectMaSach);
            dbgetMaSach.excuteQuery(sqlSelectMaSach);

            while (dbgetMaSach.result.next()) {
                SoMaSach++;
            }
            dbgetMaSach.result.beforeFirst();
            maSach = new String[SoMaSach];
            while (dbgetMaSach.result.next()) {
                maSach[i] = dbgetMaSach.result.getString("MaSach");
                i++;
            }
            dbgetMaSach.freeConnection();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +getMaSach", "ERROR", 2);
        }

        return maSach;

    }

    private boolean checkChiTietMuonTraTextFiled(String tienphat, String ngaytradukien) {
        if (!Model.ThuVien.checkNumeric(tienphat)) {
            JOptionPane.showMessageDialog(null, "Số tiền phạt bạn nhập không hợp lệ");
            return false;
        }
        if (!Model.ThuVien.checkValidDate(ngaytradukien)) {
            JOptionPane.showMessageDialog(null, "Ngày trả dự kiến bạn nhập không hợp lệ");
            return false;
        } else if (Model.ThuVien.getDayBetween(Model.ThuVien.getToday(), ngaytradukien) < 0) {
            JOptionPane.showMessageDialog(null, "Bạn không thể nhập 1 ngày trong quá khứ.");
            return false;
        }
        return true;
    }

    private boolean checkMuonTraTextFiled(String MaMuonTra, String DatCoc) {
        if (!Model.ThuVien.checkNumeric(DatCoc)) {
            JOptionPane.showMessageDialog(null, "Số tiền đặt cọc bạn nhập không hợp lệ");
            return false;
        }
        if (isExistMaMuonTra(MaMuonTra)) {
            JOptionPane.showMessageDialog(null, "Mã Mượn Trả đã tồn tại.Vui lòng nhập mã khác.");
            return false;
        }
        return true;
    }

    private boolean isExistMaMuonTra(String MaMuonTra) {
        // true tương ứng với Mã Muon Tra đã tồn tại
        // false tương ứng với Mã Muon Tra chưa tồn tại

        String sqlCheckMaDocGia = "SELECT * FROM MuonTra WHERE (MaMuonTra = '" + MaMuonTra + "');";
        DBConnection checkMaMuonTra = new DBConnection();
        checkMaMuonTra.getConnection();
        checkMaMuonTra.excuteQuery(sqlCheckMaDocGia);
        boolean rs = true;
        try {
            rs = checkMaMuonTra.result.next();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +isExistMaMuonTra", "ERROR", 2);
        }
        checkMaMuonTra.freeConnection();
        return (rs);
    }

    private void themVaoPhieuMuon(String tienphat, String ngaytradukien) {
            if(jComboBox_Sach.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Không còn sách nào để mượn!");
            } else{
            if (this.MaMuonTra.equals("")) {
                JOptionPane.showMessageDialog(null, "Bạn chưa tạo phiếu mượn!");
            }  else if (checkChiTietMuonTraTextFiled(tienphat, ngaytradukien)) {
                if(soSachMuon >= 3) {
                JOptionPane.showMessageDialog(null, "Bạn chỉ có thể mượn tối đa 3 quyển trong 1 lần mượn!");
                }else{
                String tenSach = (String) jComboBox_Sach.getSelectedItem();
                String maSach = getXtuTablemaY("MaSach", "Sach", "TenSach = '" + tenSach + "'");
                String maQuyen = getXtuTablemaY("MaQuyen", "ChiTietSach", "MaSach = '" + maSach + "' AND TrangThai = 'Còn'");

                try {

                    String sql = "INSERT INTO ChiTietMuonTra(MaMuonTra, MaQuyen, TienPhatTrenNgay, NgayTraDuKien) VALUES ('"
                            + this.MaMuonTra + "','"
                            + maQuyen + "',"
                            + tienphat + ",'"
                            + ngaytradukien + "');";
                    DBConnection db = new DBConnection();
                    db.getConnection();
                    System.out.println(sql);
                    db.state.execute(sql);
                    dm = (DefaultTableModel) Table1.getModel();
                    String[] rowData = {this.MaMuonTra, maQuyen, tienphat, ngaytradukien};
                    dm.addRow(rowData);
                    setTrangThaiSach(maQuyen, "Đã Muợn");
                    db.freeConnection();
                    soSachMuon ++;
                    
                    
                    JOptionPane.showMessageDialog(null, "Đã thêm quyển " +tenSach +" vào phiếu mượn thành công");
                    getListJComboBox_Sach();
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +themVaoPhieuMuon", "ERROR", 2);
                }
            }}
        }
    }

    private void taoPhieuMuon(String DocGia, String MaMuonTra, String DatCoc, String GhiChu) {

        if(jTextField3.getText().trim().equals("")){
        JOptionPane.showMessageDialog(null, "Bạn chưa nhập Mã Mượn Trả.");
        }
        else {
        if (checkMuonTraTextFiled(MaMuonTra, DatCoc)) {
            if (GhiChu.equals("")) {
                GhiChu = "Không";
            }
            String sql = "INSERT INTO MuonTra(MaMuonTra,MaDocGia,NgayMuon,DatCoc,GhiChu) VALUES ('"
                    + MaMuonTra + "','"
                    + getXtuTablemaY("MaDocGia", "DocGia", "TenDocGia = '" + DocGia + "'") + "','"
                    + Model.ThuVien.getToday() + "',"
                    + DatCoc + ",'"
                    + GhiChu + "');";
            DBConnection db = new DBConnection();
            System.out.println(sql);
            db.getConnection();
            try {
                this.MaMuonTra = MaMuonTra;
                db.state.execute(sql);
                db.freeConnection();
                JOptionPane.showMessageDialog(null, "Tạo thành công phiếu mượn " + MaMuonTra + " của độc giả " + DocGia);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +taoPhieuMuon", "ERROR", 2);
            }

        }
        }
        
    }

    private String getXtuTablemaY(String x, String table, String dieuKien) {
        // Lấy x từ bảng table co dk :dieuKienThem
        DBConnection db = new DBConnection();
            db.getConnection();
        try {
            String sql = "SELECT " + x + " FROM " + table + " WHERE " + dieuKien + ";";
            System.out.println(sql);
            
            db.excuteQuery(sql);
            db.result.next();
            return db.result.getString(x);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +getXtuTablemaY", "ERROR", 2);
        }
        db.freeConnection();
        return null;
    }

    private void setTrangThaiSach(String maQuyen, String trangthai) {
        String sql = "UPDATE ChiTietSach SET TrangThai = '" + trangthai + "' WHERE MaQuyen = '" + maQuyen + "';";
        
        DBConnection db = new DBConnection();
        db.getConnection();
        try {
            db.state.execute(sql);
            System.out.println(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +setTrangThaiSach", "ERROR", 2);
        }
        db.freeConnection();

    }

    private void xoaTuPhieuMuon() {
        int[] table1SelectedRows = Table1.getSelectedRows();
        int dodaibang = table1SelectedRows.length;
        if (dodaibang <= 0) {
            JOptionPane.showMessageDialog(null, "Bạn phải chọn 1 bản ghi");
        } else {{
                
                TableModel model = (TableModel) Table1.getModel();
                try {
                    DBConnection deleteQuyen = new DBConnection();
                    deleteQuyen.getConnection();
                    String quyenDcXoa = "";
                    String[] maQuyen= new String[dodaibang];
                    for (int i = 0; i < dodaibang; i++) {
                    maQuyen[i] = model.getValueAt(table1SelectedRows[i], 1).toString();
                    quyenDcXoa += maQuyen[i] + "\n";
                    }
                    for (int i = 0; i < dodaibang; i++) {
                        String querty = "DELETE FROM ChiTietMuonTra WHERE (MaQuyen = '" +maQuyen[i] + "');";
                        setTrangThaiSach(maQuyen[i], "Còn");
                        System.out.println(querty);
                        deleteQuyen.state.execute(querty);
                        soSachMuon --;
                    }
                    deleteQuyen.freeConnection();
                    JOptionPane.showMessageDialog(null, "Đã xóa quyển :\n" +quyenDcXoa +"thành công");
                    getListJComboBox_Sach();
                    refreshTable1(MaMuonTra);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +xoaTuPhieuMuon", "ERROR", 2);
                }
            }
        }
        getListJComboBox_Sach();
    }

    public void showWindows() {
        //this.setSize(600,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void refreshTable1(String MaMuonTra) {
        try {
            dm = (DefaultTableModel) Table1.getModel();
            Model.ThuVien.resetTable(Table1);
            String sqlQuerty = "SELECT * FROM ChiTietMuonTra WHERE MaMuonTra ='" + MaMuonTra + "';";
            DBConnection dbRefreshTable = new DBConnection();
            dbRefreshTable.getConnection();
            dbRefreshTable.excuteQuery(sqlQuerty);
            System.out.println(sqlQuerty);
            while (dbRefreshTable.result.next()) {

                String[] rowData = {dbRefreshTable.result.getString("MaMuonTra"), dbRefreshTable.result.getString("MaQuyen"), dbRefreshTable.result.getString("TienPhatTrenNgay"), dbRefreshTable.result.getString("NgayTraDuKien")};
                dm.addRow(rowData);

            }
            dbRefreshTable.freeConnection();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +refreshTable1", "ERROR", 2);
        }
    }

    private void deletePhieuMuon(String MaMuonTra) {
        try {
            DBConnection deleteMuonTra = new DBConnection();
            deleteMuonTra.getConnection();
            String querty = "DELETE FROM MuonTra WHERE (MaMuonTra = '" +MaMuonTra  + "');";
            deleteMuonTra.state.execute(querty);
            System.out.println(querty);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +deletePhieuMuon", "ERROR", 2);
        }
    }

    
}
