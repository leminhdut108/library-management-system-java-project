/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author hctha_000
 */
public class LibrarianForm extends javax.swing.JFrame {

    boolean checkCSDL = true;
    public LibrarianForm() {
        initComponents();
        setTitle("Librarian - Phần mềm quản lí thư viện");
    }
public void showWindows(){
		//this.setSize(600,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ButtonQuanLiSach = new javax.swing.JButton();
        ButtonQuanLiMuonTra = new javax.swing.JButton();
        ButtonQuanLiDocGia = new javax.swing.JButton();
        Button_Log_Out = new javax.swing.JButton();
        ButtonThongKe = new javax.swing.JButton();
        Button_Log_Out1 = new javax.swing.JButton();
        Button_Log_Out2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setLocation(new java.awt.Point(300, 200));

        ButtonQuanLiSach.setText("Quản Lí Sách");
        ButtonQuanLiSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonQuanLiSachActionPerformed(evt);
            }
        });

        ButtonQuanLiMuonTra.setText("Quản Lí Mượn Trả");
        ButtonQuanLiMuonTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonQuanLiMuonTraActionPerformed(evt);
            }
        });

        ButtonQuanLiDocGia.setText("Quản Lí Độc Giả");
        ButtonQuanLiDocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonQuanLiDocGiaActionPerformed(evt);
            }
        });

        Button_Log_Out.setText("Đăng xuất");
        Button_Log_Out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Log_OutActionPerformed(evt);
            }
        });

        ButtonThongKe.setText("Thống Kê");
        ButtonThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonThongKeActionPerformed(evt);
            }
        });

        Button_Log_Out1.setText("Xóa CSDL");
        Button_Log_Out1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Log_Out1ActionPerformed(evt);
            }
        });

        Button_Log_Out2.setText("Cài đặt CSDL");
        Button_Log_Out2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Log_Out2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonQuanLiDocGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonQuanLiMuonTra, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(ButtonQuanLiSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Button_Log_Out1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button_Log_Out, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Log_Out2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Button_Log_Out1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button_Log_Out2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button_Log_Out, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonQuanLiSach, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonQuanLiMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(ButtonQuanLiDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(ButtonThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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

    private void Button_Log_OutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Log_OutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        LoginForm newlogin = new LoginForm();
        newlogin.showWindows();
    }//GEN-LAST:event_Button_Log_OutActionPerformed

    private void ButtonQuanLiSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonQuanLiSachActionPerformed
        // TODO add your handling code here:
        if(checkCSDL){
        this.dispose();
        QuanLiSach newSachForm = new QuanLiSach();
        newSachForm.showWindows();
        }else{
        JOptionPane.showMessageDialog(null, "Không có CSDL");
        }
    }//GEN-LAST:event_ButtonQuanLiSachActionPerformed

    private void ButtonQuanLiMuonTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonQuanLiMuonTraActionPerformed
        if(checkCSDL){ this.dispose();
        QuanLiMuonTra newMuonTraForm = new QuanLiMuonTra();
        newMuonTraForm.showWindows();}else{
        JOptionPane.showMessageDialog(null, "Không có CSDL");
        }
    }//GEN-LAST:event_ButtonQuanLiMuonTraActionPerformed

    private void ButtonQuanLiDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonQuanLiDocGiaActionPerformed
        if(checkCSDL){ this.dispose();
        QuanLiDocGia newDocGiaForm = new QuanLiDocGia();
        newDocGiaForm.showWindows();}else{
        JOptionPane.showMessageDialog(null, "Không có CSDL");
        }
    }//GEN-LAST:event_ButtonQuanLiDocGiaActionPerformed

    private void ButtonThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonThongKeActionPerformed
        if(checkCSDL){ 
        this.dispose();
        ThongKe newThongKe = new ThongKe();
        }else{
        JOptionPane.showMessageDialog(null, "Không có CSDL");
        }
    }//GEN-LAST:event_ButtonThongKeActionPerformed

    private void Button_Log_Out1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Log_Out1ActionPerformed
        checkCSDL = Model.ThuVien.initData(false,"Xóa CSDL thành công!","C:\\Users\\hctha_000\\Documents\\NetBeansProjects\\QuanLiThuVien\\src\\Model\\XoaCSDLQuanLiThuVien.sql");
        
    }//GEN-LAST:event_Button_Log_Out1ActionPerformed

    private void Button_Log_Out2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Log_Out2ActionPerformed
        checkCSDL = Model.ThuVien.initData(true,"Cài đặt CSDL thành công","C:\\Users\\hctha_000\\Documents\\NetBeansProjects\\QuanLiThuVien\\src\\Model\\QuanLiThuVien.sql");
        
    }//GEN-LAST:event_Button_Log_Out2ActionPerformed

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
            java.util.logging.Logger.getLogger(LibrarianForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibrarianForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonQuanLiDocGia;
    private javax.swing.JButton ButtonQuanLiMuonTra;
    private javax.swing.JButton ButtonQuanLiSach;
    private javax.swing.JButton ButtonThongKe;
    private javax.swing.JButton Button_Log_Out;
    private javax.swing.JButton Button_Log_Out1;
    private javax.swing.JButton Button_Log_Out2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
