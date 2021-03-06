package rei.calculator;

import com.sun.prism.paint.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileSystemView;
import java.lang.Object;
import java.net.URL;
import java.util.Iterator;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.event.ListDataListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shakeel Ahmed
 */
public class PropertyPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    private static JList<Object> image_list;
    private static ArrayList<File> IMAGES = new ArrayList<>();
    public PropertyPanel() {
        initComponents();
        this.image_list = new JList<>();
        this.image_list.setListData(new Object[0]);
        this.image_list.updateUI();
        
        // Remove Image Button 
        URL icon = getClass().getResource("/rei/calculator/src/trashAll (2).png");
        ImageIcon imgicon = new ImageIcon(icon);
        Image img = imgicon.getImage();
        Image img_scaled = img.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        this.jButton_removeAll.setIcon(imgicon); // NOI18N
        img_scaled = img.getScaledInstance(23, 23, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        this.jButton_removeAll.setPressedIcon(imgicon);// NOI18N
        
        // Remove Image Button 
        icon = getClass().getResource("/rei/calculator/src/trash (4).png");
        imgicon = new ImageIcon(icon);
        img = imgicon.getImage();
        img_scaled = img.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        this.jButton_removeImg.setIcon(imgicon); // NOI18N
        img_scaled = img.getScaledInstance(23, 23, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        this.jButton_removeImg.setPressedIcon(imgicon);// NOI18N

        // Remove Image Button 
        icon = getClass().getResource("/rei/calculator/src/pic (4).png");
        imgicon = new ImageIcon(icon);
        img = imgicon.getImage();
        img_scaled = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        this.jButton_loadimages.setIcon(imgicon); // NOI18N
        img_scaled = img.getScaledInstance(27, 27, Image.SCALE_SMOOTH);
        imgicon = new ImageIcon(img_scaled);
        this.jButton_loadimages.setPressedIcon(imgicon);// NOI18N

        this.remove(this.jButton_removeImg);
        this.remove(this.jButton_removeAll);
        this.repaint();
        
        this.jButton_removeImg.setBounds(777, 500, 32, 32);
        this.jButton_removeAll.setBounds(817, 327, 32, 32);
        
        this.image_list = new JList();
        this.image_list.setCellRenderer(new ImageListCellRenderer());
        this.image_list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.image_list.setLayoutOrientation(JList.VERTICAL);
        this.image_list.setFixedCellHeight(25);
        this.image_list.setFont(new java.awt.Font("Leelawadee UI", 0, 14));
        this.image_list.setBorder(new LineBorder(new java.awt.Color(225,227,228), 1, true));
            
        // put our JList in a JScrollPane
        JScrollPane menuScrollPane = new JScrollPane(this.image_list);
        menuScrollPane.setMinimumSize(new Dimension(44, 112));
        this.list_panel.add(menuScrollPane).setBounds(0, 0, 222, 238);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_property_address = new javax.swing.JTextField();
        jTextField_city = new javax.swing.JTextField();
        jTextField_zip_code = new javax.swing.JTextField();
        jTextField_taxes = new javax.swing.JTextField();
        jTextField_insurance = new javax.swing.JTextField();
        jComboBox_state = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        list_panel = new javax.swing.JPanel();
        jButton_removeAll = new javax.swing.JButton();
        jButton_removeImg = new javax.swing.JButton();
        jButton_loadimages = new javax.swing.JButton();

        setBackground(new java.awt.Color(246, 245, 245));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        setPreferredSize(new java.awt.Dimension(934, 524));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        jLabel1.setText("Property Credentials");

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        jLabel2.setText("Property Address");

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        jLabel3.setText("City");

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        jLabel4.setText("State");

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        jLabel5.setText("ZIP Code");

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        jLabel6.setText("Prior Year's Taxes USD");

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        jLabel7.setText("Landload Insurance USD");

        jTextField_property_address.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N

        jTextField_city.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N

        jTextField_zip_code.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N

        jTextField_taxes.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N

        jTextField_insurance.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N

        jComboBox_state.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        jComboBox_state.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AK", "AL", "AR", "AS", "AZ", "CA", "CO", "CT", "DC", "DE", "FL", "GA", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA", "ME", "MD", "MI", "MN", "MO", "MS", "MT", "NC", "ND", "NE", "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "PR", "RI", "SC", "SD", "TN", "TX", "UT", "VA", "VI", "VT", "WA", "WI", "WV", "WY" }));
        jComboBox_state.setPreferredSize(new java.awt.Dimension(52, 30));

        jLabel8.setBackground(new java.awt.Color(225, 227, 228));
        jLabel8.setForeground(new java.awt.Color(196, 199, 200));
        jLabel8.setText("________________________________________________________________________________________________________________________________");

        list_panel.setBackground(new java.awt.Color(246, 245, 245));

        jButton_removeAll.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        jButton_removeAll.setToolTipText("Clear List");
        jButton_removeAll.setBorderPainted(false);
        jButton_removeAll.setContentAreaFilled(false);
        jButton_removeAll.setDefaultCapable(false);
        jButton_removeAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_removeAllActionPerformed(evt);
            }
        });

        jButton_removeImg.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        jButton_removeImg.setToolTipText("Remove Selected Image");
        jButton_removeImg.setBorderPainted(false);
        jButton_removeImg.setContentAreaFilled(false);
        jButton_removeImg.setDefaultCapable(false);
        jButton_removeImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_removeImgActionPerformed(evt);
            }
        });

        jButton_loadimages.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        jButton_loadimages.setToolTipText("Add Images");
        jButton_loadimages.setBorderPainted(false);
        jButton_loadimages.setContentAreaFilled(false);
        jButton_loadimages.setDefaultCapable(false);
        jButton_loadimages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loadimagesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout list_panelLayout = new javax.swing.GroupLayout(list_panel);
        list_panel.setLayout(list_panelLayout);
        list_panelLayout.setHorizontalGroup(
            list_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, list_panelLayout.createSequentialGroup()
                .addComponent(jButton_loadimages, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jButton_removeImg, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton_removeAll, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        list_panelLayout.setVerticalGroup(
            list_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, list_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(list_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_removeAll, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jButton_removeImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_loadimages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_zip_code, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jTextField_taxes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jTextField_property_address, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jTextField_city, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jTextField_insurance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jComboBox_state, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(95, 95, 95)
                        .addComponent(list_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel8)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_property_address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_city, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_state, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField_zip_code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField_taxes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField_insurance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(list_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(122, 122, 122))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_removeImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_removeImgActionPerformed
        // TODO add your handling code here:
            this.removeImage();
    }//GEN-LAST:event_jButton_removeImgActionPerformed

    private void jButton_removeAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_removeAllActionPerformed
        // TODO add your handling code here:
        int cofirm = JOptionPane.showConfirmDialog(null, "Remove all images form list?", "Clear List", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(cofirm == JOptionPane.YES_OPTION)
            this.removeAllImage();
    }//GEN-LAST:event_jButton_removeAllActionPerformed

    private void jButton_loadimagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loadimagesActionPerformed
        // TODO add your handling code here:
        this.LoadImages();
    }//GEN-LAST:event_jButton_loadimagesActionPerformed

    private void removeAllImage(){
        this.image_list.setListData(new Object[0]);
        this.image_list.updateUI();
        this.IMAGES = new ArrayList<>();
    }
    
    private void removeImage(){
        if(!this.image_list.isSelectionEmpty()){
            int index = this.image_list.getSelectedIndex();
            this.IMAGES.remove(index);
            this.updateList();
        }
        else JOptionPane.showMessageDialog(null, "No image selected.", "Invalid Selected", JOptionPane.ERROR_MESSAGE);
    }
    
    private void LoadImages(){
        this.updateImages();
        this.updateList();
    }
    
    private void updateImages(){
        FileDialog f = MainWindow.loadFiles();
        for(File file : f.getFiles()){
            if(!IMAGES.contains(file)){
                IMAGES.add(file);
            }
        }
    }
    
    private void updateList(){
        ArrayList<Object> objects = new ArrayList<>();            
        for(File f : IMAGES){
            ImageIcon icon = new ImageIcon(f.getAbsolutePath());

            Image img = icon.getImage();
            Image img_scaled = img.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            icon = new ImageIcon(img_scaled);

            JLabel label = new JLabel(f.getName(), icon, JLabel.LEFT);
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            panel.setAlignmentX(Component.LEFT_ALIGNMENT);
            panel.add(label);
            objects.add(panel);
        }
        this.image_list.setListData(objects.toArray(new Object[objects.size()]));
        this.image_list.updateUI();
    }

    private static float getTFValue_Dollar(JTextField src){
        if(!src.getText().equalsIgnoreCase(""))
            return Format.parse(src.getText());
        else return 0.00f;
    }    

    
    public static JList<Object> getImageList() {
        return image_list;
    }

    public static ArrayList<File> getImages() {
        return IMAGES;
    }

    public static String getState() {
        return jComboBox_state.getItemAt(jComboBox_state.getSelectedIndex());
    }

    public static String getCity() {
        return jTextField_city.getText();
    }

    public static float getInsurance() {
        return getTFValue_Dollar(jTextField_insurance);
    }

    public static String getjPropertyAddress() {
        return jTextField_property_address.getText();
    }

    public static float getTaxes() {
        return getTFValue_Dollar(jTextField_taxes);
    }

    public static String getZipCode() {
        return jTextField_zip_code.getText();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_loadimages;
    private javax.swing.JButton jButton_removeAll;
    private javax.swing.JButton jButton_removeImg;
    private static javax.swing.JComboBox<String> jComboBox_state;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private static javax.swing.JTextField jTextField_city;
    private static javax.swing.JTextField jTextField_insurance;
    private static javax.swing.JTextField jTextField_property_address;
    private static javax.swing.JTextField jTextField_taxes;
    private static javax.swing.JTextField jTextField_zip_code;
    private javax.swing.JPanel list_panel;
    // End of variables declaration//GEN-END:variables
}
