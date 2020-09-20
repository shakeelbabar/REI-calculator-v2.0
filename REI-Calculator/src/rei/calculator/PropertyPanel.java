package rei.calculator;

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
    public PropertyPanel() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_imagelist = new javax.swing.JList<>();
        jButton_loadimages = new javax.swing.JButton();
        jComboBox_state = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 245, 245));
        setPreferredSize(new java.awt.Dimension(934, 428));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel1.setText("Property Credentials");

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel2.setText("Property Address");

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel3.setText("City");

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel4.setText("State");

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel5.setText("ZIP Code");

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel6.setText("Prior Year's Taxes USD");

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel7.setText("Landload Insurance USD");

        jTextField_property_address.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N

        jTextField_city.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N

        jTextField_zip_code.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N

        jTextField_taxes.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N

        jTextField_insurance.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N

        jList_imagelist.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jList_imagelist.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList_imagelist);

        jButton_loadimages.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jButton_loadimages.setText("Attach Images");
        jButton_loadimages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loadimagesActionPerformed(evt);
            }
        });

        jComboBox_state.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jComboBox_state.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AK", "AL", "AR", "AS", "AZ", "CA", "CO", "CT", "DC", "DE", "FL", "GA", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA", "ME", "MD", "MI", "MN", "MO", "MS", "MT", "NC", "ND", "NE", "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "PR", "RI", "SC", "SD", "TN", "TX", "UT", "VA", "VI", "VT", "WA", "WI", "WV", "WY" }));
        jComboBox_state.setPreferredSize(new java.awt.Dimension(52, 30));

        jLabel8.setBackground(new java.awt.Color(225, 227, 228));
        jLabel8.setForeground(new java.awt.Color(196, 199, 200));
        jLabel8.setText("________________________________________________________________________________________________________________________________");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(jComboBox_state, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jButton_loadimages, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel8)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(21, 21, 21)
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
                            .addComponent(jTextField_taxes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_insurance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_loadimages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_loadimagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loadimagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_loadimagesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_loadimages;
    private javax.swing.JComboBox<String> jComboBox_state;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList_imagelist;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_city;
    private javax.swing.JTextField jTextField_insurance;
    private javax.swing.JTextField jTextField_property_address;
    private javax.swing.JTextField jTextField_taxes;
    private javax.swing.JTextField jTextField_zip_code;
    // End of variables declaration//GEN-END:variables
}
