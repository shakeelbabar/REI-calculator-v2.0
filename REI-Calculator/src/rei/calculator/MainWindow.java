/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rei.calculator;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author Shakeel Ahmed
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        setToolBarIcons();
    }
    
    public void setToolBarIcons(){
        
        // New Button 
        URL icon = getClass().getResource("/rei/calculator/new1.png");
        ImageIcon imgicon = new ImageIcon(icon);
        Image img = imgicon.getImage();
        Image img_scaled = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        new_button.setIcon(imgicon); // NOI18N
        img_scaled = img.getScaledInstance(27, 27, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        new_button.setPressedIcon(imgicon);// NOI18N
        
        // Open Button
        icon = getClass().getResource("/rei/calculator/open.png");
        imgicon = new ImageIcon(icon);
        img = imgicon.getImage();
        img_scaled = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        open_button.setIcon(imgicon); // NOI18N
        img_scaled = img.getScaledInstance(27, 27, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        open_button.setPressedIcon(imgicon);// NOI18N

        // Open Button
        icon = getClass().getResource("/rei/calculator/save.png");
        imgicon = new ImageIcon(icon);
        img = imgicon.getImage();
        img_scaled = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        save_button.setIcon(imgicon); // NOI18N
        img_scaled = img.getScaledInstance(27, 27, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        save_button.setPressedIcon(imgicon);// NOI18N

        // Open Button
        icon = getClass().getResource("/rei/calculator/saveas.png");
        imgicon = new ImageIcon(icon);
        img = imgicon.getImage();
        img_scaled = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        saveAs_button.setIcon(imgicon); // NOI18N
        img_scaled = img.getScaledInstance(27, 27, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        saveAs_button.setPressedIcon(imgicon);// NOI18N

        // Open Button
        icon = getClass().getResource("/rei/calculator/settings.png");
        imgicon = new ImageIcon(icon);
        img = imgicon.getImage();
        img_scaled = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        settings_button.setIcon(imgicon); // NOI18N
        img_scaled = img.getScaledInstance(27, 27, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        settings_button.setPressedIcon(imgicon);// NOI18N

        // Open Button
        icon = getClass().getResource("/rei/calculator/execute.png");
        imgicon = new ImageIcon(icon);
        img = imgicon.getImage();
        img_scaled = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        execute_button.setIcon(imgicon); // NOI18N
        img_scaled = img.getScaledInstance(27, 27, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        execute_button.setPressedIcon(imgicon);// NOI18N

        // Open Button
        icon = getClass().getResource("/rei/calculator/email.png");
        imgicon = new ImageIcon(icon);
        img = imgicon.getImage();
        img_scaled = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        email_button.setIcon(imgicon); // NOI18N
        img_scaled = img.getScaledInstance(27, 27, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        email_button.setPressedIcon(imgicon);// NOI18N

        // Open Button
        icon = getClass().getResource("/rei/calculator/clearall.png");
        imgicon = new ImageIcon(icon);
        img = imgicon.getImage();
        img_scaled = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        clearAll_button.setIcon(imgicon); // NOI18N
        img_scaled = img.getScaledInstance(27, 27, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        clearAll_button.setPressedIcon(imgicon);// NOI18N

        // Open Button
        icon = getClass().getResource("/rei/calculator/close.png");
        imgicon = new ImageIcon(icon);
        img = imgicon.getImage();
        img_scaled = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        close_button.setIcon(imgicon); // NOI18N
        img_scaled = img.getScaledInstance(27, 27, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        close_button.setPressedIcon(imgicon);// NOI18N

        // Open Button
        icon = getClass().getResource("/rei/calculator/help.png");
        imgicon = new ImageIcon(icon);
        img = imgicon.getImage();
        img_scaled = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        help_button.setIcon(imgicon); // NOI18N
        img_scaled = img.getScaledInstance(27, 27, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        help_button.setPressedIcon(imgicon);// NOI18N

        // Open Button
        icon = getClass().getResource("/rei/calculator/SFI.png");
        imgicon = new ImageIcon(icon);
        img = imgicon.getImage();
        img_scaled = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        SFI_button.setIcon(imgicon); // NOI18N
        img_scaled = img.getScaledInstance(27, 27, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        SFI_button.setPressedIcon(imgicon);// NOI18N
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        new_button = new javax.swing.JButton();
        open_button = new javax.swing.JButton();
        save_button = new javax.swing.JButton();
        saveAs_button = new javax.swing.JButton();
        settings_button = new javax.swing.JButton();
        execute_button = new javax.swing.JButton();
        email_button = new javax.swing.JButton();
        clearAll_button = new javax.swing.JButton();
        close_button = new javax.swing.JButton();
        help_button = new javax.swing.JButton();
        SFI_button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 31, 1100, 520));
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 550));

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setAlignmentX(0.0F);

        new_button.setBorderPainted(false);
        new_button.setContentAreaFilled(false);
        new_button.setFocusPainted(false);
        new_button.setFocusable(false);
        new_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        new_button.setPreferredSize(new java.awt.Dimension(40, 40));
        new_button.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/rei/calculator/new1.png"))); // NOI18N
        new_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        new_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_buttonActionPerformed(evt);
            }
        });
        jToolBar1.add(new_button);

        open_button.setBorderPainted(false);
        open_button.setContentAreaFilled(false);
        open_button.setFocusPainted(false);
        open_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        open_button.setPreferredSize(new java.awt.Dimension(40, 40));
        open_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(open_button);

        save_button.setToolTipText("");
        save_button.setBorderPainted(false);
        save_button.setContentAreaFilled(false);
        save_button.setFocusPainted(false);
        save_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        save_button.setPreferredSize(new java.awt.Dimension(40, 40));
        save_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(save_button);

        saveAs_button.setBorderPainted(false);
        saveAs_button.setContentAreaFilled(false);
        saveAs_button.setFocusPainted(false);
        saveAs_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveAs_button.setPreferredSize(new java.awt.Dimension(40, 40));
        saveAs_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(saveAs_button);

        settings_button.setBorderPainted(false);
        settings_button.setContentAreaFilled(false);
        settings_button.setFocusPainted(false);
        settings_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        settings_button.setPreferredSize(new java.awt.Dimension(40, 40));
        settings_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(settings_button);

        execute_button.setBorderPainted(false);
        execute_button.setContentAreaFilled(false);
        execute_button.setFocusPainted(false);
        execute_button.setFocusable(false);
        execute_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        execute_button.setPreferredSize(new java.awt.Dimension(40, 40));
        execute_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(execute_button);

        email_button.setBorderPainted(false);
        email_button.setContentAreaFilled(false);
        email_button.setFocusPainted(false);
        email_button.setFocusable(false);
        email_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        email_button.setPreferredSize(new java.awt.Dimension(40, 40));
        email_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(email_button);

        clearAll_button.setBorderPainted(false);
        clearAll_button.setContentAreaFilled(false);
        clearAll_button.setFocusPainted(false);
        clearAll_button.setFocusable(false);
        clearAll_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clearAll_button.setPreferredSize(new java.awt.Dimension(40, 40));
        clearAll_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(clearAll_button);

        close_button.setBorderPainted(false);
        close_button.setContentAreaFilled(false);
        close_button.setFocusPainted(false);
        close_button.setFocusable(false);
        close_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        close_button.setPreferredSize(new java.awt.Dimension(40, 40));
        close_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(close_button);

        help_button.setBorderPainted(false);
        help_button.setContentAreaFilled(false);
        help_button.setFocusPainted(false);
        help_button.setFocusable(false);
        help_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        help_button.setPreferredSize(new java.awt.Dimension(40, 40));
        help_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(help_button);

        SFI_button.setBorderPainted(false);
        SFI_button.setContentAreaFilled(false);
        SFI_button.setFocusPainted(false);
        SFI_button.setFocusable(false);
        SFI_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SFI_button.setPreferredSize(new java.awt.Dimension(40, 40));
        SFI_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(SFI_button);

        jPanel2.setBackground(new java.awt.Color(30, 30, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void new_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SFI_button;
    private javax.swing.JButton clearAll_button;
    private javax.swing.JButton close_button;
    private javax.swing.JButton email_button;
    private javax.swing.JButton execute_button;
    private javax.swing.JButton help_button;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton new_button;
    private javax.swing.JButton open_button;
    private javax.swing.JButton saveAs_button;
    private javax.swing.JButton save_button;
    private javax.swing.JButton settings_button;
    // End of variables declaration//GEN-END:variables
}
