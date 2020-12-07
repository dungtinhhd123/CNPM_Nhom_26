/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnpmproject;

/**
 *
 * @author keplegarry
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jPanelTop = new javax.swing.JPanel();
        jLabelTop = new javax.swing.JLabel();
        jPanelLeft = new javax.swing.JPanel();
        jPanelTrangChu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelQuanLyCSVC = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelLich = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanelDonDangKy = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanelDangXuat = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanelCentre = new javax.swing.JPanel();
        jPanelTrangChuCentre = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanelQuanLyCSVCCentre = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanelLichCentre = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanelDonDangKyCentre = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setLayout(new java.awt.BorderLayout());

        jPanelTop.setBackground(new java.awt.Color(102, 102, 102));

        jLabelTop.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabelTop.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTop.setText("Quản lý sử dụng nhà văn hóa");

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTopLayout.createSequentialGroup()
                .addContainerGap(238, Short.MAX_VALUE)
                .addComponent(jLabelTop)
                .addGap(221, 221, 221))
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelTop)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel.add(jPanelTop, java.awt.BorderLayout.PAGE_START);

        jPanelLeft.setBackground(new java.awt.Color(102, 102, 102));

        jPanelTrangChu.setBackground(new java.awt.Color(153, 153, 153));
        jPanelTrangChu.setPreferredSize(new java.awt.Dimension(185, 60));
        jPanelTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelLeftMouseClickedEvt(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Trang Chủ");

        javax.swing.GroupLayout jPanelTrangChuLayout = new javax.swing.GroupLayout(jPanelTrangChu);
        jPanelTrangChu.setLayout(jPanelTrangChuLayout);
        jPanelTrangChuLayout.setHorizontalGroup(
            jPanelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTrangChuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanelTrangChuLayout.setVerticalGroup(
            jPanelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTrangChuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelQuanLyCSVC.setBackground(new java.awt.Color(153, 153, 153));
        jPanelQuanLyCSVC.setPreferredSize(new java.awt.Dimension(185, 60));
        jPanelQuanLyCSVC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelLeftMouseClickedEvt(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quản lý CSVC");

        javax.swing.GroupLayout jPanelQuanLyCSVCLayout = new javax.swing.GroupLayout(jPanelQuanLyCSVC);
        jPanelQuanLyCSVC.setLayout(jPanelQuanLyCSVCLayout);
        jPanelQuanLyCSVCLayout.setHorizontalGroup(
            jPanelQuanLyCSVCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuanLyCSVCLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanelQuanLyCSVCLayout.setVerticalGroup(
            jPanelQuanLyCSVCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuanLyCSVCLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanelLich.setBackground(new java.awt.Color(153, 153, 153));
        jPanelLich.setPreferredSize(new java.awt.Dimension(118, 60));
        jPanelLich.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelLeftMouseClickedEvt(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Lịch");

        javax.swing.GroupLayout jPanelLichLayout = new javax.swing.GroupLayout(jPanelLich);
        jPanelLich.setLayout(jPanelLichLayout);
        jPanelLichLayout.setHorizontalGroup(
            jPanelLichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLichLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLichLayout.setVerticalGroup(
            jPanelLichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLichLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(21, 21, 21))
        );

        jPanelDonDangKy.setBackground(new java.awt.Color(153, 153, 153));
        jPanelDonDangKy.setPreferredSize(new java.awt.Dimension(153, 60));
        jPanelDonDangKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelLeftMouseClickedEvt(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Đơn đăng ký");

        javax.swing.GroupLayout jPanelDonDangKyLayout = new javax.swing.GroupLayout(jPanelDonDangKy);
        jPanelDonDangKy.setLayout(jPanelDonDangKyLayout);
        jPanelDonDangKyLayout.setHorizontalGroup(
            jPanelDonDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDonDangKyLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDonDangKyLayout.setVerticalGroup(
            jPanelDonDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDonDangKyLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(21, 21, 21))
        );

        jPanelDangXuat.setBackground(new java.awt.Color(153, 153, 153));
        jPanelDangXuat.setPreferredSize(new java.awt.Dimension(151, 60));
        jPanelDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelLeftMouseClickedEvt(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Đăng xuất");

        javax.swing.GroupLayout jPanelDangXuatLayout = new javax.swing.GroupLayout(jPanelDangXuat);
        jPanelDangXuat.setLayout(jPanelDangXuatLayout);
        jPanelDangXuatLayout.setHorizontalGroup(
            jPanelDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDangXuatLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDangXuatLayout.setVerticalGroup(
            jPanelDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDangXuatLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelLeftLayout = new javax.swing.GroupLayout(jPanelLeft);
        jPanelLeft.setLayout(jPanelLeftLayout);
        jPanelLeftLayout.setHorizontalGroup(
            jPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelQuanLyCSVC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelLich, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
            .addComponent(jPanelDonDangKy, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
            .addComponent(jPanelDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
        );
        jPanelLeftLayout.setVerticalGroup(
            jPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLeftLayout.createSequentialGroup()
                .addComponent(jPanelTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelQuanLyCSVC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelLich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelDonDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jPanelDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel.add(jPanelLeft, java.awt.BorderLayout.LINE_START);

        jPanelCentre.setLayout(new java.awt.CardLayout());

        jLabel6.setText("Trang chủ");

        javax.swing.GroupLayout jPanelTrangChuCentreLayout = new javax.swing.GroupLayout(jPanelTrangChuCentre);
        jPanelTrangChuCentre.setLayout(jPanelTrangChuCentreLayout);
        jPanelTrangChuCentreLayout.setHorizontalGroup(
            jPanelTrangChuCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTrangChuCentreLayout.createSequentialGroup()
                .addContainerGap(324, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(333, 333, 333))
        );
        jPanelTrangChuCentreLayout.setVerticalGroup(
            jPanelTrangChuCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTrangChuCentreLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel6)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        jPanelCentre.add(jPanelTrangChuCentre, "card2");

        jLabel7.setText("QuanLyCSVC");

        javax.swing.GroupLayout jPanelQuanLyCSVCCentreLayout = new javax.swing.GroupLayout(jPanelQuanLyCSVCCentre);
        jPanelQuanLyCSVCCentre.setLayout(jPanelQuanLyCSVCCentreLayout);
        jPanelQuanLyCSVCCentreLayout.setHorizontalGroup(
            jPanelQuanLyCSVCCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuanLyCSVCCentreLayout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(jLabel7)
                .addContainerGap(310, Short.MAX_VALUE))
        );
        jPanelQuanLyCSVCCentreLayout.setVerticalGroup(
            jPanelQuanLyCSVCCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuanLyCSVCCentreLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel7)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        jPanelCentre.add(jPanelQuanLyCSVCCentre, "card3");

        jLabel8.setText("Lich");

        javax.swing.GroupLayout jPanelLichCentreLayout = new javax.swing.GroupLayout(jPanelLichCentre);
        jPanelLichCentre.setLayout(jPanelLichCentreLayout);
        jPanelLichCentreLayout.setHorizontalGroup(
            jPanelLichCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLichCentreLayout.createSequentialGroup()
                .addContainerGap(361, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(332, 332, 332))
        );
        jPanelLichCentreLayout.setVerticalGroup(
            jPanelLichCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLichCentreLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel8)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        jPanelCentre.add(jPanelLichCentre, "card4");

        jLabel9.setText("DonDangKy");

        javax.swing.GroupLayout jPanelDonDangKyCentreLayout = new javax.swing.GroupLayout(jPanelDonDangKyCentre);
        jPanelDonDangKyCentre.setLayout(jPanelDonDangKyCentreLayout);
        jPanelDonDangKyCentreLayout.setHorizontalGroup(
            jPanelDonDangKyCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDonDangKyCentreLayout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(jLabel9)
                .addContainerGap(339, Short.MAX_VALUE))
        );
        jPanelDonDangKyCentreLayout.setVerticalGroup(
            jPanelDonDangKyCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDonDangKyCentreLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel9)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        jPanelCentre.add(jPanelDonDangKyCentre, "card5");

        jPanel.add(jPanelCentre, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelLeftMouseClickedEvt(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLeftMouseClickedEvt
        if(evt.getSource() == jPanelTrangChu){
            jPanelTrangChuCentre.setVisible(true);
            jPanelQuanLyCSVCCentre.setVisible(false);
            jPanelLichCentre.setVisible(false);
            jPanelDonDangKyCentre.setVisible(false);
        }
        if(evt.getSource() == jPanelQuanLyCSVC){
            jPanelTrangChuCentre.setVisible(false);
            jPanelQuanLyCSVCCentre.setVisible(true);
            jPanelLichCentre.setVisible(false);
            jPanelDonDangKyCentre.setVisible(false);
        }
        if(evt.getSource() == jPanelLich){
            jPanelTrangChuCentre.setVisible(false);
            jPanelQuanLyCSVCCentre.setVisible(false);
            jPanelLichCentre.setVisible(true);
            jPanelDonDangKyCentre.setVisible(false);
        }
        if(evt.getSource() == jPanelDonDangKy){
            jPanelTrangChuCentre.setVisible(false);
            jPanelQuanLyCSVCCentre.setVisible(false);
            jPanelLichCentre.setVisible(false);
            jPanelDonDangKyCentre.setVisible(true);
        }
    }//GEN-LAST:event_jPanelLeftMouseClickedEvt

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTop;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanelCentre;
    private javax.swing.JPanel jPanelDangXuat;
    private javax.swing.JPanel jPanelDonDangKy;
    private javax.swing.JPanel jPanelDonDangKyCentre;
    private javax.swing.JPanel jPanelLeft;
    private javax.swing.JPanel jPanelLich;
    private javax.swing.JPanel jPanelLichCentre;
    private javax.swing.JPanel jPanelQuanLyCSVC;
    private javax.swing.JPanel jPanelQuanLyCSVCCentre;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JPanel jPanelTrangChu;
    private javax.swing.JPanel jPanelTrangChuCentre;
    // End of variables declaration//GEN-END:variables
}