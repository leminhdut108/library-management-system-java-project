/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DBConnection;
import com.itextpdf.text.PageSize;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hctha_000
 */
public class QuanLiMuonTra extends javax.swing.JFrame {

    /**
     * Creates new form QuanLiMuonTra
     */
    DefaultTableModel dm;

    int error = -1;
    boolean checkFirstColumn = false;

    public QuanLiMuonTra() {
        initComponents();
        setTitle("Mượn Trả - Phần mềm quản lí thư viện");
        setExtendedState(MAXIMIZED_BOTH);
        this.setVisible(true);

        RefreshMuonTraTable();
        getListJComboBox_MaMuonTra();
        getListJComboBox_MaDocGia();
    }

    private void RefreshMuonTraTable() {
        try {
            dm = (DefaultTableModel) MuonTraTable.getModel();
            Model.ThuVien.resetTable(MuonTraTable);
            String sqlQuerty = "SELECT * FROM MuonTra ;";
            DBConnection dbRefreshTable = new DBConnection();
            dbRefreshTable.getConnection();
            dbRefreshTable.excuteQuery(sqlQuerty);
            System.out.println(sqlQuerty);
            while (dbRefreshTable.result.next()) {

                
                
                String[] rowData = {dbRefreshTable.result.getString("MaMuonTra"), dbRefreshTable.result.getString("MaDocGia"), dbRefreshTable.result.getString("NgayMuon"), dbRefreshTable.result.getString("DatCoc"), dbRefreshTable.result.getString("GhiChu")};

                dm.addRow(rowData);

            }
            dbRefreshTable.freeConnection();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +RefreshTable", "ERROR", 2);
        }

    }

    private String[] getMaMuonTra() {
        String[] maMuonTra = null;
        String sqlSelectMaMuonTra = null;
        sqlSelectMaMuonTra = "SELECT DISTINCT  MaMuonTra FROM MuonTra GROUP BY MaMuonTra ASC;";
        try {
            int i = 0, SoMaMuonTra = 0;
            DBConnection dbgetMaMuonTra = new DBConnection();
            dbgetMaMuonTra.getConnection();
            System.out.println(sqlSelectMaMuonTra);
            dbgetMaMuonTra.excuteQuery(sqlSelectMaMuonTra);

            while (dbgetMaMuonTra.result.next()) {
                SoMaMuonTra++;
            }
            dbgetMaMuonTra.result.beforeFirst();
            maMuonTra = new String[SoMaMuonTra];
            while (dbgetMaMuonTra.result.next()) {
                maMuonTra[i] = dbgetMaMuonTra.result.getString("MaMuonTra");
                i++;
            }
            dbgetMaMuonTra.freeConnection();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +getMaMuonTra", "ERROR", 2);
        }

        return maMuonTra;

    }

    private String[] getMaDocGia() {
        String[] maDocGia = null;
        String sqlSelectMaDocGia = null;
        sqlSelectMaDocGia = "SELECT DISTINCT  MaDocGia FROM MuonTra GROUP BY MaDocGia ASC;";

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

    private void getListJComboBox_MaMuonTra() {

        try {

            jComboBox_MaMuonTra.removeAllItems();
            jComboBox_MaMuonTra.addItem("null");

            String[] MaMuonTra = getMaMuonTra();

            for (String MaMuonTra1 : MaMuonTra) {
                jComboBox_MaMuonTra.addItem(MaMuonTra1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +setJComboBox_MaMuonTra", "ERROR", 2);
        }
    }

    private void getListJComboBox_MaDocGia() {

        try {

            jComboBox_MaDocGia.removeAllItems();
            jComboBox_MaDocGia.addItem("null");
            String[] MaDocGia = getMaDocGia();

            for (String MaDocGia1 : MaDocGia) {
                jComboBox_MaDocGia.addItem(MaDocGia1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +setJComboBox_MaDocGia", "ERROR", 2);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("quanlythuvien?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        muontraQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT m FROM Muontra m");
        muontraList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : muontraQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ChiTietMuonTraTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        MuonTraTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jComboBox_MaMuonTra = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_MaDocGia = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        Button_TimKiem = new javax.swing.JButton();
        buttonLogout = new javax.swing.JButton();
        buttonTurnBack = new javax.swing.JButton();
        TextFieldNgayMuon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextFieldDatCoc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextFieldGhiChu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Button_TimKiem1 = new javax.swing.JButton();
        Button_TimKiem2 = new javax.swing.JButton();
        Button_TimKiem3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Button_TimKiem4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ChiTietMuonTraTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên Quyển", "Mã Quyển", "Tiền Phạt/Ngày", "Ngày Trả Dự Kiến", "Ngày Trả"
            }
        ));
        jScrollPane2.setViewportView(ChiTietMuonTraTable);

        MuonTraTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Mượn Trả", "Mã Độc Giả", "Ngày Mượn", "Đặt Cọc", "Ghi Chú"
            }
        ));
        MuonTraTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MuonTraTableMouseReleased(evt);
            }
        });
        MuonTraTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MuonTraTableKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(MuonTraTable);

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã Mượn Trả");

        jLabel2.setText("Mã Độc Giả");

        Button_TimKiem.setText("Tìm Kiếm");
        Button_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_TimKiemActionPerformed(evt);
            }
        });

        buttonLogout.setText("Đăng xuất");
        buttonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogoutActionPerformed(evt);
            }
        });

        buttonTurnBack.setText("Back");
        buttonTurnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTurnBackActionPerformed(evt);
            }
        });

        jLabel3.setText("Ngày Mượn");

        jLabel4.setText("Đặt Cọc");

        jLabel5.setText("Ghi Chú");

        Button_TimKiem1.setText("Thêm Phiếu Mượn Trả");
        Button_TimKiem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_TimKiem1ActionPerformed(evt);
            }
        });

        Button_TimKiem2.setText("Xóa Chi Tiết Mượn Trả");
        Button_TimKiem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_TimKiem2ActionPerformed(evt);
            }
        });

        Button_TimKiem3.setText("Xóa Phiếu Mượn Trả");
        Button_TimKiem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_TimKiem3ActionPerformed(evt);
            }
        });

        jButton2.setText("Xuất file");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Button_TimKiem4.setText("Xóa Chữ");
        Button_TimKiem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_TimKiem4ActionPerformed(evt);
            }
        });

        jButton3.setText("Trả Sách");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_MaMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_MaDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldNgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldDatCoc, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(Button_TimKiem4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(buttonTurnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Button_TimKiem2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Button_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(Button_TimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Button_TimKiem3)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox_MaMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(TextFieldNgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox_MaDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(TextFieldDatCoc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(TextFieldGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_TimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_TimKiem3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button_TimKiem2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonTurnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button_TimKiem4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(228, 228, 228))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        RefreshMuonTraTable();
        Model.ThuVien.resetTable(ChiTietMuonTraTable);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MuonTraTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MuonTraTableMouseReleased
        showChiTietMuonTraTable();
        setNoiDungTextField(getNoiDungtuMuonTraGiaTable());
    }//GEN-LAST:event_MuonTraTableMouseReleased

    private void MuonTraTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MuonTraTableKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            showChiTietMuonTraTable();
            setNoiDungTextField(getNoiDungtuMuonTraGiaTable());
        }
    }//GEN-LAST:event_MuonTraTableKeyReleased

    private void Button_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_TimKiemActionPerformed

        timKiem(getNoiDungTextField());

    }//GEN-LAST:event_Button_TimKiemActionPerformed

    private void buttonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        LoginForm newlogin = new LoginForm();
        newlogin.showWindows();
    }//GEN-LAST:event_buttonLogoutActionPerformed

    private void buttonTurnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTurnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        LibrarianForm newLibrarianForm = new LibrarianForm();
        newLibrarianForm.showWindows();
    }//GEN-LAST:event_buttonTurnBackActionPerformed

    private void Button_TimKiem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_TimKiem1ActionPerformed
        this.dispose();
        addMuonTra newaddMuonTra = new addMuonTra();
        newaddMuonTra.showWindows();
    }//GEN-LAST:event_Button_TimKiem1ActionPerformed

    private void Button_TimKiem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_TimKiem2ActionPerformed
        xoaChiTietMuonTra();
    }//GEN-LAST:event_Button_TimKiem2ActionPerformed

    private void Button_TimKiem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_TimKiem3ActionPerformed
        xoaPhieuMuonTra();
    }//GEN-LAST:event_Button_TimKiem3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        xuatFile();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Button_TimKiem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_TimKiem4ActionPerformed
        setNoiDungTextField(new String[] {"","","","","",""});
    }//GEN-LAST:event_Button_TimKiem4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        traSach();
    }//GEN-LAST:event_jButton3ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLiMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLiMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLiMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLiMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLiMuonTra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_TimKiem;
    private javax.swing.JButton Button_TimKiem1;
    private javax.swing.JButton Button_TimKiem2;
    private javax.swing.JButton Button_TimKiem3;
    private javax.swing.JButton Button_TimKiem4;
    private javax.swing.JTable ChiTietMuonTraTable;
    private javax.swing.JTable MuonTraTable;
    private javax.swing.JTextField TextFieldDatCoc;
    private javax.swing.JTextField TextFieldGhiChu;
    private javax.swing.JTextField TextFieldNgayMuon;
    private javax.swing.JButton buttonLogout;
    private javax.swing.JButton buttonTurnBack;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox_MaDocGia;
    private javax.swing.JComboBox<String> jComboBox_MaMuonTra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private java.util.List<View.Muontra> muontraList;
    private javax.persistence.Query muontraQuery;
    // End of variables declaration//GEN-END:variables

    private void showChiTietMuonTraTable() {
        try {
            int i = MuonTraTable.getSelectedRow();
            if (i >= 0) {

                dm = (DefaultTableModel) MuonTraTable.getModel();
                String MaMuonTra = (dm.getValueAt(i, 0).toString());
                jComboBox_MaMuonTra.setSelectedItem(MaMuonTra);
                jComboBox_MaDocGia.setSelectedItem((dm.getValueAt(i, 1).toString()));

                Model.ThuVien.resetTable(ChiTietMuonTraTable);
                String sqlQuerty = "SELECT * FROM ChiTietMuonTra  WHERE MaMuonTra = '" + MaMuonTra + "';";
                DBConnection dbShowChiTietMuonTraTable = new DBConnection();
                dbShowChiTietMuonTraTable.getConnection();
                dbShowChiTietMuonTraTable.excuteQuery(sqlQuerty);
                System.out.println(sqlQuerty);
                 String maQ = "",maS = "",tenS = "";
                dm = (DefaultTableModel) ChiTietMuonTraTable.getModel();
                while (dbShowChiTietMuonTraTable.result.next()) {

                maQ = dbShowChiTietMuonTraTable.result.getString("MaQuyen");
                maS = getXtuTablemaY("MaSach","ChiTietSach","MaQuyen = '" +maQ +"'")[0];
                tenS = getXtuTablemaY("TenSach","Sach","MaSach = '" +maS +"'")[0];
                    
                    String[] rowData = {tenS, maQ, dbShowChiTietMuonTraTable.result.getString("TienPhatTrenNgay"), dbShowChiTietMuonTraTable.result.getString("NgayTraDuKien"), dbShowChiTietMuonTraTable.result.getString("NgayTra")};
                    dm.addRow(rowData);

                }
                dbShowChiTietMuonTraTable.freeConnection();

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +showChiTietMuonTraTable", "ERROR", 2);
        }
    }


    public void showWindows() {
        //this.setSize(600,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void timKiem(String[] input) {
        if (checkInput(0, input)) {
            String[] sqlInput = setSqlInput(1, input);
            String sqlQuerty = "SELECT * FROM MuonTra WHERE ";
            for (int i = 0; i < 5; i++) {
                sqlQuerty += sqlInput[i];
            }
            sqlQuerty += ";";

            DBConnection dbTimKiem = new DBConnection();
            dbTimKiem.getConnection();
            dbTimKiem.excuteQuery(sqlQuerty);
            System.out.println(sqlQuerty);

            int SoKetQua = 0;

            try {
                while (dbTimKiem.result.next()) {
                    SoKetQua++;
                }
                if (SoKetQua == 0) {
                    JOptionPane.showMessageDialog(null, "Không tìm thấy bản ghi nào phù hợp!");
                } else {

                    Model.ThuVien.resetTable(MuonTraTable);
                    dm = (DefaultTableModel) MuonTraTable.getModel();
                    dbTimKiem.result.beforeFirst();
                    while (dbTimKiem.result.next()) {

                        String[] rowData = {dbTimKiem.result.getString("MaMuonTra"), dbTimKiem.result.getString("MaDocGia"), dbTimKiem.result.getString("NgayMuon"), dbTimKiem.result.getString("DatCoc"), dbTimKiem.result.getString("GhiChu")};

                        dm.addRow(rowData);

                    }
                    dbTimKiem.freeConnection();
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +nút tìm kiếm", "ERROR", 2);
            }
        }
    }

    private String[] getNoiDungTextField() {
        String[] NoiDungTextField = new String[5];
        if (((String) jComboBox_MaMuonTra.getSelectedItem()).equals("null")) {
            NoiDungTextField[0] = "";
        } else {
            NoiDungTextField[0] = (String) jComboBox_MaMuonTra.getSelectedItem();
        }
        if (((String) jComboBox_MaDocGia.getSelectedItem()).equals("null")) {
            NoiDungTextField[1] = "";
        } else {
            NoiDungTextField[1] = (String) jComboBox_MaDocGia.getSelectedItem();
        }
        NoiDungTextField[2] = TextFieldNgayMuon.getText().trim();
        NoiDungTextField[3] = TextFieldDatCoc.getText().trim();
        NoiDungTextField[4] = TextFieldGhiChu.getText().trim();

        return NoiDungTextField;
    }

    private boolean checkInput(int checkType, String[] input) {// false : có lỗi, true : không có lỗi
        // checkType = 0 : check của Tìm kiếm 
        // checkType = 1 : check của Thêm hoặc Chỉnh sửa 
        // checkType = 2 : check lấy error

        boolean check = false;
        for (int i = 0; i < 5; i++) {
            if (!input[i].equals("")) {
                check = true;
            }
        }
        if (check == false) {
            if (checkType != 2) {
                JOptionPane.showMessageDialog(null, "Bạn chưa nhập thông tin nào!!");
            }
            error = 0;
            return false;
        }
        if (input[0].equals("") && checkType != 0) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập mã mượn trả!!");
            return false;
        }
        if (input[1].equals("") && checkType != 0) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập mã độc giả!!");
            return false;
        }

        if (!Model.ThuVien.checkNumeric(input[3]) && !input[3].equals("")) {
            JOptionPane.showMessageDialog(null, "Thông tin Số tiền đặt cọc bạn nhập không hợp lệ!!");
            return false;
        }

        if (!Model.ThuVien.checkValidDate(input[2]) && !input[2].equals("")) {
            JOptionPane.showMessageDialog(null, "Thông tin Ngày Mượn bạn nhập không hợp lệ!!");
            return false;
        }
        return true; // Không có lỗi

    }

    public String[] setSqlInput(int setType, String[] input) {
        //setType = 0 : câu lênh sql chỉnh sửa, setType = 1 : câu lênh sql tìm kiếm
        String[] sqlInput = new String[5];
        checkFirstColumn = false;
        String link = "";
        if (setType == 1) {
            link = " AND ";
        }
        if (setType == 0) {
            link = " , ";
        }

        if (input[0].equals("")) {
            sqlInput[0] = "";
        } else {
            sqlInput[0] = "MaMuonTra = '" + input[0] + "'";
            checkFirstColumn = true;
        }
        if (input[1].equals("")) {
            sqlInput[1] = "";
        } else {
            if (checkFirstColumn) {
                sqlInput[1] = link + "MaDocGia = '" + input[1] + "'";
            } else {
                sqlInput[1] = "MaDocGia = '" + input[1] + "'";
                checkFirstColumn = true;
            }
        }
        if (input[2].equals("")) {
            sqlInput[2] = "";
        } else {
            if (checkFirstColumn) {
                sqlInput[2] = link + "NgayMuon = '" + input[2] + "'";
            } else {
                sqlInput[2] = "NgayMuon = '" + input[2] + "'";
                checkFirstColumn = true;
            }
        }
        if (input[3].equals("")) {
            sqlInput[3] = "";
        } else {
            if (checkFirstColumn) {
                sqlInput[3] = link + "DatCoc = " + input[3];
            } else {
                sqlInput[3] = "DatCoc = " + input[3];
                checkFirstColumn = true;
            }
        }
        if (input[4].equals("")) {
            sqlInput[4] = "";
        } else {
            if (checkFirstColumn) {
                sqlInput[4] = link + "GhiChu = '" + input[4] + "'";
            } else {
                sqlInput[4] = "GhiChu = '" + input[4] + "'";
                checkFirstColumn = true;
            }
        }

        return sqlInput;

    }

    private String[] getNoiDungtuMuonTraGiaTable() {
        String[] input = new String[] {"","","","",""};
        int i = MuonTraTable.getSelectedRow();
        if(i>=0){
        TableModel model = (TableModel) MuonTraTable.getModel();
        
        for (int j = 0; j < 5; j++) {
            input[j] = model.getValueAt(i, j).toString();
        }
        }
        return input;
    }

    private void setNoiDungTextField(String[] input) {
        if (input[0].equals("")) {
            jComboBox_MaMuonTra.setSelectedItem("null");
        } else {
            jComboBox_MaMuonTra.setSelectedItem(input[0]);
        }
        if (input[1].equals("")) {
            jComboBox_MaDocGia.setSelectedItem("null");
        } else {
            jComboBox_MaDocGia.setSelectedItem(input[1]);
        }
        TextFieldNgayMuon.setText(input[2]);
        TextFieldDatCoc.setText(input[3]);
        TextFieldGhiChu.setText(input[4]);

    }

    private void addMuonTra(String[] input) {
        try {
            if (checkInput(1, input)) {
                if (isExistMaMuonTra(input[0])) {
                    JOptionPane.showMessageDialog(null, "Mã Mượn Trả đã tồn tại. Vui lòng nhập Mã Mượn Trả khác!", "ERROR", 2);
                } else {
                    String[] sqlInput = new String[5];
                    sqlInput = setSqlInput(0, input);
                    String sqlAddMuontra = "INSERT INTO MuonTra (MaMuonTra, MaDocGia, NgayMuon, DatCoc, GhiChu) VALUES ( '"
                            + input[0] + "','"
                            + input[1] + "','"
                            + Model.ThuVien.getToday() + "',"
                            + "0,"
                            + "'NONAME';";

                    String sqlUpdateMuonTra = "UPDATE MuonTra SET ";
                    for (int i = 0; i < 5; i++) {
                        sqlUpdateMuonTra += sqlInput[i];
                    }

                    sqlUpdateMuonTra += " WHERE MaMuonTra = '" + input[0] + "';";
                    DBConnection addMuonTra = new DBConnection();
                    addMuonTra.getConnection();
                    System.out.println(sqlAddMuontra);
                    addMuonTra.state.execute(sqlAddMuontra);
                    System.out.println(sqlUpdateMuonTra);
                    addMuonTra.state.execute(sqlUpdateMuonTra);
                    addMuonTra.freeConnection();

                    JOptionPane.showMessageDialog(null, "Đã thêm mượn trả " + input[0] + " thành công");

                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +addMuonTra", "ERROR", 2);
        }
        refreshMuonTraTable();

    }

    private void refreshMuonTraTable() {
        try {
            dm = (DefaultTableModel) MuonTraTable.getModel();
            Model.ThuVien.resetTable(MuonTraTable);
            String sqlQuerty = "SELECT * FROM MuonTra ;";
            DBConnection dbRefreshTable = new DBConnection();
            dbRefreshTable.getConnection();
            dbRefreshTable.excuteQuery(sqlQuerty);
            System.out.println(sqlQuerty);
            while (dbRefreshTable.result.next()) {

                String[] rowData = {dbRefreshTable.result.getString("MaMuonTra"), dbRefreshTable.result.getString("MaDocGia"), dbRefreshTable.result.getString("NgayMuon"), dbRefreshTable.result.getString("DatCoc"), dbRefreshTable.result.getString("GhiChu")};
                dm.addRow(rowData);

            }
            dbRefreshTable.freeConnection();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +refreshMuonTraTable", "ERROR", 2);
        }
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

    private void xoaPhieuMuonTra() {
        int[] muontraTableSelectedRows = MuonTraTable.getSelectedRows();
        if (muontraTableSelectedRows.length <= 0) {
            JOptionPane.showMessageDialog(null, "Bạn phải chọn 1 bản ghi");
        } else {
            if (muontraTableSelectedRows.length > 0) {
                TableModel model = (TableModel) MuonTraTable.getModel();
                String muontraDaChon = "";
                for (int i = 0; i < muontraTableSelectedRows.length; i++) {
                    muontraDaChon += model.getValueAt(muontraTableSelectedRows[i], 0).toString() + "\n";
                }
                if (JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa mã mượn trả : \n" + muontraDaChon + "không ?") == JOptionPane.YES_OPTION) {
                    try {
                        DBConnection deleteMuonTra = new DBConnection();
                        deleteMuonTra.getConnection();
                        for (int i = 0; i < muontraTableSelectedRows.length; i++) {
                            int soMMT = Integer.parseInt(getXtuTablemaY("count(*)", "ChiTietMuonTra", "MaMuonTra = '" + model.getValueAt(muontraTableSelectedRows[i], 0).toString() + "'")[0]);

                            String querty1 = "DELETE FROM ChiTietMuonTra WHERE (MaMuonTra = '" + model.getValueAt(muontraTableSelectedRows[i], 0).toString() + "');";
                            String[] maQ = getXtuTablemaY("MaQuyen", "ChiTietMuonTra", " MaMuonTra = '" + model.getValueAt(muontraTableSelectedRows[i], 0).toString() + "'");

                            for (int j = 0; j < soMMT; j++) {

                                setXtuTablemaY("TrangThai", "ChiTietSach", "Còn", "MaSach = '" + maQ[j] + "'");
                            }

                            String querty = "DELETE FROM MuonTra WHERE (MaMuonTra = '" + model.getValueAt(muontraTableSelectedRows[i], 0).toString() + "');";
                            System.out.println(querty1);
                            deleteMuonTra.state.execute(querty1);
                            System.out.println(querty);
                            deleteMuonTra.state.execute(querty);

                        }
                        JOptionPane.showMessageDialog(null, "Xóa thành công!");
                        Model.ThuVien.resetTable(ChiTietMuonTraTable);
                        refreshMuonTraTable();
                        deleteMuonTra.freeConnection();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +xoaMuonTra", "ERROR", 2);
                    }
                }
            }

        }
    }

    private void xoaChiTietMuonTra() {

        int[] muontraTableSelectedRows = ChiTietMuonTraTable.getSelectedRows();
        if (muontraTableSelectedRows.length <= 0) {
            JOptionPane.showMessageDialog(null, "Bạn phải chọn 1 bản ghi");
        } else {
            TableModel model = (TableModel) ChiTietMuonTraTable.getModel();
            String muontraDaChon = "";
            for (int i = 0; i < muontraTableSelectedRows.length; i++) {
                muontraDaChon += model.getValueAt(muontraTableSelectedRows[i], 1).toString() + "\n";
            }
            if (JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa Quyển : \n" + muontraDaChon + "không ?") == JOptionPane.YES_OPTION) {

                DBConnection deleteMuonTra = new DBConnection();
                deleteMuonTra.getConnection();

                for (int i = 0; i < muontraTableSelectedRows.length; i++) {
                    try {
                        String querty1 = "DELETE FROM ChiTietMuonTra WHERE (MaQuyen = '" + model.getValueAt(muontraTableSelectedRows[i], 1).toString() + "');";
                        deleteMuonTra.state.execute(querty1);
                        System.out.println(querty1);
                        setXtuTablemaY("TrangThai", "ChiTietSach", "Còn", "MaQuyen = '" + model.getValueAt(muontraTableSelectedRows[i], 1).toString() + "'");

                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +xoaChiTietMuonTra", "ERROR", 2);
                    }
                }
                JOptionPane.showMessageDialog(null, "Xóa thành công!");
                refreshChiTietMuonTraTable((String) jComboBox_MaMuonTra.getSelectedItem());

                deleteMuonTra.freeConnection();

            }
        }

    }
    private void traSach() {

        int mTableSelectedRow = MuonTraTable.getSelectedRow();
        int muontraTableSelectedRow = ChiTietMuonTraTable.getSelectedRow();
        if (muontraTableSelectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Bạn phải chọn 1 bản ghi");
        } else {
            TableModel model = (TableModel) MuonTraTable.getModel();
            String maMuonTra = model.getValueAt(mTableSelectedRow, 0).toString();
            model = (TableModel) ChiTietMuonTraTable.getModel();
            String maQuyen = "";
                maQuyen += model.getValueAt(muontraTableSelectedRow, 1).toString();
            if (JOptionPane.showConfirmDialog(null, "Bạn có muốn trả Quyển : " + maQuyen + "không ?") == JOptionPane.YES_OPTION) {
                DBConnection deleteMuonTra = new DBConnection();
                deleteMuonTra.getConnection();

//                        String querty1 = "DELETE FROM ChiTietMuonTra WHERE (MaQuyen = '" + model.getValueAt(muontraTableSelectedRow, 1).toString() + "');";
//                        deleteMuonTra.state.execute(querty1);
//                        System.out.println(querty1);
setXtuTablemaY("TrangThai", "ChiTietSach", "Còn", "MaQuyen = '" + model.getValueAt(muontraTableSelectedRow, 1).toString() + "'");
setXtuTablemaY("NgayTra", "ChiTietMuonTra", Model.ThuVien.getToday(), "MaQuyen = '" + maQuyen + "' AND MaMuonTra = '" + maMuonTra + "'");
                JOptionPane.showMessageDialog(null, "Trả Sách thành công!");
                refreshChiTietMuonTraTable((String) jComboBox_MaMuonTra.getSelectedItem());
                deleteMuonTra.freeConnection();
            }
        }

    }

    private void refreshChiTietMuonTraTable(String MaMuonTra) {
        try {
            dm = (DefaultTableModel) ChiTietMuonTraTable.getModel();
            String maQ = "",maS = "",tenS = "";
            Model.ThuVien.resetTable(ChiTietMuonTraTable);
            String sqlQuerty = "SELECT * FROM ChiTietMuonTra WHERE MaMuonTra ='" + MaMuonTra + "';";
            DBConnection dbRefreshTable = new DBConnection();
            dbRefreshTable.getConnection();
            dbRefreshTable.excuteQuery(sqlQuerty);
            System.out.println(sqlQuerty);
            while (dbRefreshTable.result.next()) {
                maQ = dbRefreshTable.result.getString("MaQuyen");
                maS = getXtuTablemaY("MaSach","ChiTietSach","MaQuyen = '" +maQ +"'")[0];
                tenS = getXtuTablemaY("TenSach","Sach","MaSach = '" +maS +"'")[0];
                        // Lấy x từ bảng table co dk :dieuKienThem
                String[] rowData = {tenS,maQ , dbRefreshTable.result.getString("TienPhatTrenNgay"), dbRefreshTable.result.getString("NgayTraDuKien"), dbRefreshTable.result.getString("NgayTra")};
                dm.addRow(rowData);

            }
            dbRefreshTable.freeConnection();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +refreshChiTietMuonTraTable", "ERROR", 2);
        }
    }

    private void setXtuTablemaY(String x, String table, String valuX, String dieuKien) {
        // set x từ bảng table bang gia tri valuX voi dk: dieuKienThem
        try {
            String sql = "UPDATE " + table + " SET " + x + " = '" + valuX + "' WHERE " + dieuKien + ";";

            System.out.println(sql);
            DBConnection db = new DBConnection();
            db.getConnection();
            db.state.execute(sql);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +setXtuTablemaY", "ERROR", 2);
        }

    }

    private String[] getXtuTablemaY(String x, String table, String dieuKien) {
        // Lấy x từ bảng table co dk :dieuKienThem
        try {
            String sql = "SELECT " + x + " FROM " + table + " WHERE " + dieuKien + ";";
            System.out.println(sql);
            DBConnection db = new DBConnection();
            db.getConnection();
            db.excuteQuery(sql);
            int soKQ = 0, i = 0;
            while (db.result.next()) {
                soKQ++;
            }
            String[] kq;
            if (soKQ == 0) {
                return null;
            } else {
                kq = new String[soKQ];
            }
            db.result.beforeFirst();
            while (db.result.next()) {
                kq[i] = db.result.getString(x);
                i++;
            }
            return kq;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +getXtuTablemaY", "ERROR", 2);
        }
        return null;
    }

    private void xuatFile() {
        if(MuonTraTable.getSelectedRow() < 0){
        JOptionPane.showMessageDialog(null, "Bạn chưa chọn phiếu mượn!");
        }else{
            
            
        String[] thongTinPhieuMuon = getNoiDungtuMuonTraGiaTable();      
        String TongTienPhat = getXtuTablemaY("sum(TienPhatTrenNgay*(NgayTra - NgayMuon))","MuonTra m,ChiTietMuonTra c ","(m.MaMuonTra = '" +thongTinPhieuMuon[0] +"' AND c.MaMuonTra = m.MaMuonTra AND c.NgayTra IS NOT NULL)")[0];
        String tenDocGia = getXtuTablemaY("TenDocGia","DocGia","MaDocGia ='" + thongTinPhieuMuon[1] + "'")[0];
        String[] tenCot = {"Tên Quyển","Mã Quyển","Tiền Phạt/Ngày","Ngày Trả Dự Kiến","Ngày Trả"};;
        String title = "Phiếu Mượn Trả";
        String fileName = "PhieuMuonTra";
        String bf = "Họ và tên         : Lê Ngọc Long\n"
                + "MSSV                : 20142659\n"
                + "Đề tài               : Xây dựng chương trình quản lý thư viện";
        bf += "\n\nTrường Đại Học Bách Khoa Hà Nội          Cộng Hòa - Xã Hội - Chủ Nghĩa - Việt Nam\n"
                + "      Thư viện Tạ Quang Bửu                                Độc Lập - Tự Do - Hạnh Phúc" ;
        bf += "\n\n                                                   " +title.toUpperCase();
        String kt = "\nMã Mượn Trả : " + thongTinPhieuMuon[0] +"\nTên Độc Giả : " +tenDocGia +"\nMã Độc Giả : " +thongTinPhieuMuon[1] +"\nNgày Mượn :" 
                + thongTinPhieuMuon[2] +"\nĐặt Cọc :" +thongTinPhieuMuon[3] +" (VNĐ)\nTổng Tiền Phạt :" +TongTienPhat +" (VNĐ)\nGhi Chú :" +thongTinPhieuMuon[4] +"\n";
        
        
        
        String af = "Hà Nội, Việt Nam Ngày "+ Model.ThuVien.getTodayNgayThangNam()+"\n" +
                     "Người tạo bảng : Lê Ngọc Long";
        
        System.out.println(bf+kt);
        Model.ThuVien.xuatFilePDF2(fileName, bf+kt,tenCot,af,ChiTietMuonTraTable, title,PageSize.A4);}
    }

}
