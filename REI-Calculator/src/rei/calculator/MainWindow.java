/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rei.calculator;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
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
        main_panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel_property = new javax.swing.JPanel();
        jPanel_property_active = new javax.swing.JPanel();
        jLabel_property = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_purchase = new javax.swing.JPanel();
        jPanel_purchase_active = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel_income = new javax.swing.JPanel();
        jPanel_income_active = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel_expense = new javax.swing.JPanel();
        jPanel_expense_active = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel_assumption = new javax.swing.JPanel();
        jPanel_assumption_active = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel_report = new javax.swing.JPanel();
        jPanel_report_active = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel_tabPanel = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jTextField6 = new javax.swing.JTextField();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMene_new = new javax.swing.JMenuItem();
        jMenu_load = new javax.swing.JMenuItem();
        jMenu_save = new javax.swing.JMenuItem();
        jMenu_saveas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu_import = new javax.swing.JMenuItem();
        jMenu_export = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenu_execute = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu_print = new javax.swing.JMenuItem();
        jMenu_email = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu_close = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu_clearall = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu_settings = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu_about_REI = new javax.swing.JMenuItem();
        jMenu_about_SFI = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenu_help = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 31, 1100, 520));
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 600));

        jToolBar1.setBackground(new java.awt.Color(204, 204, 255));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setAlignmentX(0.0F);

        new_button.setBorderPainted(false);
        new_button.setContentAreaFilled(false);
        new_button.setFocusPainted(false);
        new_button.setFocusable(false);
        new_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        new_button.setPreferredSize(new java.awt.Dimension(40, 40));
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

        main_panel.setBackground(new java.awt.Color(30, 30, 30));
        main_panel.setPreferredSize(new java.awt.Dimension(1263, 490));

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(40, 40, 40));

        jPanel_property.setBackground(new java.awt.Color(20, 20, 20));
        jPanel_property.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_propertyMouseClicked(evt);
            }
        });

        jPanel_property_active.setBackground(new java.awt.Color(30, 30, 30));

        javax.swing.GroupLayout jPanel_property_activeLayout = new javax.swing.GroupLayout(jPanel_property_active);
        jPanel_property_active.setLayout(jPanel_property_activeLayout);
        jPanel_property_activeLayout.setHorizontalGroup(
            jPanel_property_activeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_property_activeLayout.setVerticalGroup(
            jPanel_property_activeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel_property.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_property.setForeground(new java.awt.Color(204, 204, 204));
        jLabel_property.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_property.setText("Property");

        javax.swing.GroupLayout jPanel_propertyLayout = new javax.swing.GroupLayout(jPanel_property);
        jPanel_property.setLayout(jPanel_propertyLayout);
        jPanel_propertyLayout.setHorizontalGroup(
            jPanel_propertyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_property_active, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_property, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addGroup(jPanel_propertyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_propertyLayout.setVerticalGroup(
            jPanel_propertyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_propertyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_property)
                .addGap(18, 18, 18)
                .addComponent(jPanel_property_active, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel_purchase.setBackground(new java.awt.Color(20, 20, 20));
        jPanel_purchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_purchaseMouseClicked(evt);
            }
        });

        jPanel_purchase_active.setBackground(new java.awt.Color(30, 30, 30));

        javax.swing.GroupLayout jPanel_purchase_activeLayout = new javax.swing.GroupLayout(jPanel_purchase_active);
        jPanel_purchase_active.setLayout(jPanel_purchase_activeLayout);
        jPanel_purchase_activeLayout.setHorizontalGroup(
            jPanel_purchase_activeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_purchase_activeLayout.setVerticalGroup(
            jPanel_purchase_activeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Purchase");

        javax.swing.GroupLayout jPanel_purchaseLayout = new javax.swing.GroupLayout(jPanel_purchase);
        jPanel_purchase.setLayout(jPanel_purchaseLayout);
        jPanel_purchaseLayout.setHorizontalGroup(
            jPanel_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_purchase_active, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addGroup(jPanel_purchaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_purchaseLayout.setVerticalGroup(
            jPanel_purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_purchaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jPanel_purchase_active, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel_income.setBackground(new java.awt.Color(20, 20, 20));
        jPanel_income.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_incomeMouseClicked(evt);
            }
        });

        jPanel_income_active.setBackground(new java.awt.Color(30, 30, 30));

        javax.swing.GroupLayout jPanel_income_activeLayout = new javax.swing.GroupLayout(jPanel_income_active);
        jPanel_income_active.setLayout(jPanel_income_activeLayout);
        jPanel_income_activeLayout.setHorizontalGroup(
            jPanel_income_activeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_income_activeLayout.setVerticalGroup(
            jPanel_income_activeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Income");

        javax.swing.GroupLayout jPanel_incomeLayout = new javax.swing.GroupLayout(jPanel_income);
        jPanel_income.setLayout(jPanel_incomeLayout);
        jPanel_incomeLayout.setHorizontalGroup(
            jPanel_incomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_income_active, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_incomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_incomeLayout.setVerticalGroup(
            jPanel_incomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_incomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jPanel_income_active, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel_expense.setBackground(new java.awt.Color(20, 20, 20));
        jPanel_expense.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_expenseMouseClicked(evt);
            }
        });

        jPanel_expense_active.setBackground(new java.awt.Color(30, 30, 30));

        javax.swing.GroupLayout jPanel_expense_activeLayout = new javax.swing.GroupLayout(jPanel_expense_active);
        jPanel_expense_active.setLayout(jPanel_expense_activeLayout);
        jPanel_expense_activeLayout.setHorizontalGroup(
            jPanel_expense_activeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_expense_activeLayout.setVerticalGroup(
            jPanel_expense_activeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Expense");

        javax.swing.GroupLayout jPanel_expenseLayout = new javax.swing.GroupLayout(jPanel_expense);
        jPanel_expense.setLayout(jPanel_expenseLayout);
        jPanel_expenseLayout.setHorizontalGroup(
            jPanel_expenseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_expense_active, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_expenseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_expenseLayout.setVerticalGroup(
            jPanel_expenseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_expenseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jPanel_expense_active, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel_assumption.setBackground(new java.awt.Color(20, 20, 20));
        jPanel_assumption.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_assumptionMouseClicked(evt);
            }
        });

        jPanel_assumption_active.setBackground(new java.awt.Color(30, 30, 30));

        javax.swing.GroupLayout jPanel_assumption_activeLayout = new javax.swing.GroupLayout(jPanel_assumption_active);
        jPanel_assumption_active.setLayout(jPanel_assumption_activeLayout);
        jPanel_assumption_activeLayout.setHorizontalGroup(
            jPanel_assumption_activeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_assumption_activeLayout.setVerticalGroup(
            jPanel_assumption_activeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Assumptions");

        javax.swing.GroupLayout jPanel_assumptionLayout = new javax.swing.GroupLayout(jPanel_assumption);
        jPanel_assumption.setLayout(jPanel_assumptionLayout);
        jPanel_assumptionLayout.setHorizontalGroup(
            jPanel_assumptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_assumption_active, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_assumptionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_assumptionLayout.setVerticalGroup(
            jPanel_assumptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_assumptionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jPanel_assumption_active, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel_report.setBackground(new java.awt.Color(20, 20, 20));
        jPanel_report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_reportMouseClicked(evt);
            }
        });

        jPanel_report_active.setBackground(new java.awt.Color(30, 30, 30));

        javax.swing.GroupLayout jPanel_report_activeLayout = new javax.swing.GroupLayout(jPanel_report_active);
        jPanel_report_active.setLayout(jPanel_report_activeLayout);
        jPanel_report_activeLayout.setHorizontalGroup(
            jPanel_report_activeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_report_activeLayout.setVerticalGroup(
            jPanel_report_activeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Report");

        javax.swing.GroupLayout jPanel_reportLayout = new javax.swing.GroupLayout(jPanel_report);
        jPanel_report.setLayout(jPanel_reportLayout);
        jPanel_reportLayout.setHorizontalGroup(
            jPanel_reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_report_active, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addGroup(jPanel_reportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_reportLayout.setVerticalGroup(
            jPanel_reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_reportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jPanel_report_active, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel_property, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_purchase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_income, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_expense, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_assumption, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_property, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_purchase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_income, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_expense, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_assumption, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_report, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel_tabPanel.setBackground(new java.awt.Color(20, 20, 20));
        jPanel_tabPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 1, true));
        jPanel_tabPanel.setPreferredSize(new java.awt.Dimension(934, 428));

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Purchase Price ($)");

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Financing Rehab");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Rehab Budget ($)");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("ARV ($)");

        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Closing Costs ($)");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Purchase");

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Finance");

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YES", "NO" }));

        jSpinner1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jSpinner2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jSpinner3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Downpayment (%)");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Downpayment ($)");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Loan Amount ($)");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Annual Interest Rate");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Term (Years)");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Emergency Funds ($)");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Purchase & Finance Information");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("Asking Price ($)");

        javax.swing.GroupLayout jPanel_tabPanelLayout = new javax.swing.GroupLayout(jPanel_tabPanel);
        jPanel_tabPanel.setLayout(jPanel_tabPanelLayout);
        jPanel_tabPanelLayout.setHorizontalGroup(
            jPanel_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_tabPanelLayout.createSequentialGroup()
                .addGroup(jPanel_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_tabPanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_tabPanelLayout.createSequentialGroup()
                                .addGroup(jPanel_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel18)))
                    .addGroup(jPanel_tabPanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2)))
                .addGap(60, 60, 60)
                .addGroup(jPanel_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_tabPanelLayout.createSequentialGroup()
                        .addGroup(jPanel_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSpinner2)
                            .addComponent(jSpinner3)))
                    .addComponent(jLabel19))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel_tabPanelLayout.setVerticalGroup(
            jPanel_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_tabPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addGroup(jPanel_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(21, 21, 21)
                .addGroup(jPanel_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_tabPanelLayout.createSequentialGroup()
                        .addGroup(jPanel_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_tabPanelLayout.createSequentialGroup()
                        .addGroup(jPanel_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_tabPanelLayout.createSequentialGroup()
                        .addGroup(jPanel_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_tabPanelLayout.createSequentialGroup()
                        .addGroup(jPanel_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGap(0, 304, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel_tabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_tabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(134, 20));

        jMenu1.setText("File");

        jMene_new.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMene_new.setIcon(new javax.swing.ImageIcon("E:\\PNG Icons\\Paint 3D\\new.png")); // NOI18N
        jMene_new.setText("New File");
        jMene_new.setActionCommand("");
        jMene_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMene_newActionPerformed(evt);
            }
        });
        jMenu1.add(jMene_new);

        jMenu_load.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenu_load.setIcon(new javax.swing.ImageIcon("E:\\PNG Icons\\Paint 3D\\open.png")); // NOI18N
        jMenu_load.setText("Load / Open");
        jMenu_load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_loadActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu_load);

        jMenu_save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenu_save.setIcon(new javax.swing.ImageIcon("E:\\PNG Icons\\Paint 3D\\save.png")); // NOI18N
        jMenu_save.setText("Save");
        jMenu_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_saveActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu_save);

        jMenu_saveas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenu_saveas.setIcon(new javax.swing.ImageIcon("E:\\PNG Icons\\Paint 3D\\saveas.png")); // NOI18N
        jMenu_saveas.setText("Save As");
        jMenu1.add(jMenu_saveas);
        jMenu1.add(jSeparator1);

        jMenu_import.setText("Import");
        jMenu_import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_importActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu_import);

        jMenu_export.setText("Export As");
        jMenu1.add(jMenu_export);
        jMenu1.add(jSeparator4);

        jMenu_execute.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        jMenu_execute.setIcon(new javax.swing.ImageIcon("E:\\PNG Icons\\Paint 3D\\execute.png")); // NOI18N
        jMenu_execute.setText("Execute");
        jMenu1.add(jMenu_execute);
        jMenu1.add(jSeparator2);

        jMenu_print.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenu_print.setIcon(new javax.swing.ImageIcon("E:\\PNG Icons\\Paint 3D\\print.png")); // NOI18N
        jMenu_print.setText("Print");
        jMenu1.add(jMenu_print);

        jMenu_email.setIcon(new javax.swing.ImageIcon("E:\\PNG Icons\\Paint 3D\\email.png")); // NOI18N
        jMenu_email.setText("Email / Send");
        jMenu1.add(jMenu_email);
        jMenu1.add(jSeparator3);

        jMenu_close.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenu_close.setIcon(new javax.swing.ImageIcon("E:\\PNG Icons\\Paint 3D\\close.png")); // NOI18N
        jMenu_close.setText("Close");
        jMenu_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_closeActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu_close);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenu_clearall.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        jMenu_clearall.setIcon(new javax.swing.ImageIcon("E:\\PNG Icons\\Paint 3D\\clearAll.png")); // NOI18N
        jMenu_clearall.setText("ClearAll / Reset");
        jMenu2.add(jMenu_clearall);

        jMenuItem11.setText("Import Images");
        jMenu2.add(jMenuItem11);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Tools");

        jMenu_settings.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenu_settings.setIcon(new javax.swing.ImageIcon("E:\\PNG Icons\\Paint 3D\\settings.png")); // NOI18N
        jMenu_settings.setText("Settings");
        jMenu3.add(jMenu_settings);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("About");

        jMenu_about_REI.setText("REI Calculator v2.0");
        jMenu4.add(jMenu_about_REI);

        jMenu_about_SFI.setIcon(new javax.swing.ImageIcon("E:\\PNG Icons\\Paint 3D\\SFI.png")); // NOI18N
        jMenu_about_SFI.setText("SFI");
        jMenu4.add(jMenu_about_SFI);
        jMenu4.add(jSeparator5);

        jMenu_help.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenu_help.setIcon(new javax.swing.ImageIcon("E:\\PNG Icons\\Paint 3D\\help.png")); // NOI18N
        jMenu_help.setText("Help");
        jMenu4.add(jMenu_help);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMene_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMene_newActionPerformed
        // TODO add your handling code here:
        int confirm_new = JOptionPane.showConfirmDialog(this,"Want to initiate a new transaction?","New Transaction",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(confirm_new == JOptionPane.YES_OPTION){
            System.out.println("YES New");
        }
        else{
            System.out.println("NO New");
        }
    }//GEN-LAST:event_jMene_newActionPerformed

    private void jMenu_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu_saveActionPerformed

    private void jMenu_importActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_importActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu_importActionPerformed

    private void jMenu_loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_loadActionPerformed
        // TODO add your handling code here:
        String filepath = load_file();
        System.out.println(filepath);
    }//GEN-LAST:event_jMenu_loadActionPerformed

    private void jMenu_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_closeActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenu_closeActionPerformed

    
    private void setTabColors(java.awt.event.MouseEvent evt){
        this.jPanel_property.setBackground(new Color(20,20,20));
        this.jPanel_property_active.setBackground(new Color(30,30,30));
        
        this.jPanel_purchase.setBackground(new Color(20,20,20));
        this.jPanel_purchase_active.setBackground(new Color(30,30,30));
        
        this.jPanel_expense.setBackground(new Color(20,20,20));
        this.jPanel_expense_active.setBackground(new Color(30,30,30));
        
        this.jPanel_income.setBackground(new Color(20,20,20));
        this.jPanel_income_active.setBackground(new Color(30,30,30));
        
        this.jPanel_assumption.setBackground(new Color(20,20,20));
        this.jPanel_assumption_active.setBackground(new Color(30,30,30));
        
        this.jPanel_report.setBackground(new Color(20,20,20));
        this.jPanel_report_active.setBackground(new Color(30,30,30));
        
        JPanel p = (JPanel)evt.getSource();
        p.setBackground(new Color(50,50,50));
        JPanel active = (JPanel)p.getComponent(0);
        active.setBackground(new Color(0,153,0));
    }
    private void new_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_buttonActionPerformed

    private void jPanel_propertyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_propertyMouseClicked
        // TODO add your handling code here:
        setTabColors(evt);
//        PurchasePanel purchase = new PurchasePanel();
        PropertyPanel property = new PropertyPanel();
        this.jPanel_tabPanel.removeAll();
        this.jPanel_tabPanel.repaint();
        this.jPanel_tabPanel.add(property).setBounds(0, 0, this.jPanel_tabPanel.getWidth(), this.jPanel_tabPanel.getHeight());
    }//GEN-LAST:event_jPanel_propertyMouseClicked

    private void jPanel_purchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_purchaseMouseClicked
        // TODO add your handling code here:
        setTabColors(evt);
        PurchasePanel purchase = new PurchasePanel();
        this.jPanel_tabPanel.removeAll();
        this.jPanel_tabPanel.repaint();
        this.jPanel_tabPanel.add(purchase).setBounds(0, 0, this.jPanel_tabPanel.getWidth(), this.jPanel_tabPanel.getHeight());
//        this.jPanel_tabPanel.repaint();
    }//GEN-LAST:event_jPanel_purchaseMouseClicked

    private void jPanel_incomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_incomeMouseClicked
        // TODO add your handling code here:
        setTabColors(evt);
        IncomePanel income = new IncomePanel();
        this.jPanel_tabPanel.removeAll();
        this.jPanel_tabPanel.repaint();
        this.jPanel_tabPanel.add(income).setBounds(0, 0, this.jPanel_tabPanel.getWidth(), this.jPanel_tabPanel.getHeight());
    }//GEN-LAST:event_jPanel_incomeMouseClicked

    private void jPanel_expenseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_expenseMouseClicked
        // TODO add your handling code here:
        setTabColors(evt);
        ExpensePanel expense = new ExpensePanel();
        this.jPanel_tabPanel.removeAll();
        this.jPanel_tabPanel.repaint();
        this.jPanel_tabPanel.add(expense).setBounds(0, 0, this.jPanel_tabPanel.getWidth(), this.jPanel_tabPanel.getHeight());
    }//GEN-LAST:event_jPanel_expenseMouseClicked

    private void jPanel_assumptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_assumptionMouseClicked
        // TODO add your handling code here:
        setTabColors(evt);
        AssumptionPanel assumption = new AssumptionPanel();
        this.jPanel_tabPanel.removeAll();
        this.jPanel_tabPanel.repaint();
        this.jPanel_tabPanel.add(assumption).setBounds(0, 0, this.jPanel_tabPanel.getWidth(), this.jPanel_tabPanel.getHeight());
    }//GEN-LAST:event_jPanel_assumptionMouseClicked

    private void jPanel_reportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_reportMouseClicked
        // TODO add your handling code here:
        setTabColors(evt);
        ReportPanel report = new ReportPanel();
        this.jPanel_tabPanel.removeAll();
        this.jPanel_tabPanel.repaint();
        this.jPanel_tabPanel.add(report).setBounds(0, 0, this.jPanel_tabPanel.getWidth(), this.jPanel_tabPanel.getHeight());
    }//GEN-LAST:event_jPanel_reportMouseClicked

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed
    
    
    private String load_file(){
        FileDialog f = new FileDialog(this, "Open File", FileDialog.LOAD);
        f.setVisible(rootPaneCheckingEnabled);
        return f.getDirectory()+"*"+f.getFile();
    }
    
    
    
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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_property;
    private javax.swing.JMenuItem jMene_new;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenu_about_REI;
    private javax.swing.JMenuItem jMenu_about_SFI;
    private javax.swing.JMenuItem jMenu_clearall;
    private javax.swing.JMenuItem jMenu_close;
    private javax.swing.JMenuItem jMenu_email;
    private javax.swing.JMenuItem jMenu_execute;
    private javax.swing.JMenuItem jMenu_export;
    private javax.swing.JMenuItem jMenu_help;
    private javax.swing.JMenuItem jMenu_import;
    private javax.swing.JMenuItem jMenu_load;
    private javax.swing.JMenuItem jMenu_print;
    private javax.swing.JMenuItem jMenu_save;
    private javax.swing.JMenuItem jMenu_saveas;
    private javax.swing.JMenuItem jMenu_settings;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_assumption;
    private javax.swing.JPanel jPanel_assumption_active;
    private javax.swing.JPanel jPanel_expense;
    private javax.swing.JPanel jPanel_expense_active;
    private javax.swing.JPanel jPanel_income;
    private javax.swing.JPanel jPanel_income_active;
    private javax.swing.JPanel jPanel_property;
    private javax.swing.JPanel jPanel_property_active;
    private javax.swing.JPanel jPanel_purchase;
    private javax.swing.JPanel jPanel_purchase_active;
    private javax.swing.JPanel jPanel_report;
    private javax.swing.JPanel jPanel_report_active;
    private javax.swing.JPanel jPanel_tabPanel;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel main_panel;
    private javax.swing.JButton new_button;
    private javax.swing.JButton open_button;
    private javax.swing.JButton saveAs_button;
    private javax.swing.JButton save_button;
    private javax.swing.JButton settings_button;
    // End of variables declaration//GEN-END:variables
}
