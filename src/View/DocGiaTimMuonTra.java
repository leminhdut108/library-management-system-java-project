/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DBConnection;

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
public class DocGiaTimMuonTra extends javax.swing.JFrame {

    public static String MADOCGIA ;
    DefaultTableModel dm;
    public DocGiaTimMuonTra(String madocgia) {
        initComponents();
        setTitle("Mượn Trả - Phần mềm quản lí thư viện");
        setExtendedState(MAXIMIZED_BOTH);
        this.setVisible(true);
        this.MADOCGIA = madocgia;
        RefreshMuonTraTable();
        jLabel1.setText("Độc Giả : " + getTenDocGia(this.MADOCGIA));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ChiTietMuonTraTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        MuonTraTable = new javax.swing.JTable();
        buttonLogout = new javax.swing.JButton();
        buttonTurnBack = new javax.swing.JButton();
        buttonLogout1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ChiTietMuonTraTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Mượn Trả", "Mã Quyển", "Tiền Phạt/Ngày", "Ngày Trả Dự Kiến", "Ngày Trả"
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

        buttonLogout1.setText("Refresh");
        buttonLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogout1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(buttonTurnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(buttonLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonTurnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(74, 74, 74))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MuonTraTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MuonTraTableMouseReleased
        showChiTietMuonTraTable();
    }//GEN-LAST:event_MuonTraTableMouseReleased

    private void MuonTraTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MuonTraTableKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            showChiTietMuonTraTable();
        }
    }//GEN-LAST:event_MuonTraTableKeyReleased

    private void buttonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        LoginForm newlogin = new LoginForm();
        newlogin.showWindows();
    }//GEN-LAST:event_buttonLogoutActionPerformed

    private void buttonTurnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTurnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        DocGiaForm newDocGiaForm = new DocGiaForm(this.MADOCGIA);
        newDocGiaForm.showWindows();
    }//GEN-LAST:event_buttonTurnBackActionPerformed

    private void buttonLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogout1ActionPerformed
        resetTable(MuonTraTable);
        resetTable(ChiTietMuonTraTable);
        RefreshMuonTraTable();
    }//GEN-LAST:event_buttonLogout1ActionPerformed

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
            java.util.logging.Logger.getLogger(DocGiaTimMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DocGiaTimMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DocGiaTimMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DocGiaTimMuonTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DocGiaTimMuonTra(MADOCGIA).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ChiTietMuonTraTable;
    private javax.swing.JTable MuonTraTable;
    private javax.swing.JButton buttonLogout;
    private javax.swing.JButton buttonLogout1;
    private javax.swing.JButton buttonTurnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    public void showWindows(){
		//this.setSize(600,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

    private void showChiTietMuonTraTable() {
        try{
        int i = MuonTraTable.getSelectedRow();
        if(i >= 0){
            
        TableModel model = (TableModel) MuonTraTable.getModel();
        String MaMuonTra = (model.getValueAt(i, 0).toString());
        //jComboBox_MaMuonTra.setSelectedItem(MaMuonTra);
        //jComboBox_MaDocGia.setSelectedItem((model.getValueAt(i, 1).toString()));
        
        
        
            resetTable(ChiTietMuonTraTable);
            String sqlQuerty = "SELECT * FROM ChiTietMuonTra  WHERE MaMuonTra = '" +MaMuonTra + "';";
            DBConnection dbShowChiTietMuonTraTable = new DBConnection();
            dbShowChiTietMuonTraTable.getConnection();
            dbShowChiTietMuonTraTable.excuteQuery(sqlQuerty);
            System.out.println(sqlQuerty);
            while (dbShowChiTietMuonTraTable.result.next()) {

                String[] rowData = {dbShowChiTietMuonTraTable.result.getString("MaMuonTra"), dbShowChiTietMuonTraTable.result.getString("MaQuyen"), dbShowChiTietMuonTraTable.result.getString("TienPhatTrenNgay"), dbShowChiTietMuonTraTable.result.getString("NgayTraDuKien"), dbShowChiTietMuonTraTable.result.getString("NgayTra")};
                dm.addRow(rowData);

            }
            dbShowChiTietMuonTraTable.freeConnection();
        
        
        
        }
        
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
            JOptionPane.showMessageDialog(null, "Đã có lỗi xảy ra +showChiTietMuonTraTable", "ERROR", 2);
        }
    }

    private void resetTable(JTable table) {
        dm = (DefaultTableModel) table.getModel();
        int rowCount = dm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
    }

    private void RefreshMuonTraTable(){
        try {
            dm = (DefaultTableModel)MuonTraTable.getModel();
            resetTable(MuonTraTable);
            String sqlQuerty = "SELECT * FROM MuonTra WHERE MaDocGia = '" + this.MADOCGIA + "';";
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
    private String getTenDocGia(String MaDocGia) {
        if (!MaDocGia.trim().equals("")) {
            try {
                String sqlSearch = "SELECT * FROM DocGia WHERE MaDocGia = '" + MaDocGia + "';";
                DBConnection db = new DBConnection();
                db.getConnection();
                System.out.println(sqlSearch);
                db.excuteQuery(sqlSearch);
                db.result.next();
                return db.result.getString("TenDocGia");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error");
            }
        }
        return "NONAME";
    }

    
}
