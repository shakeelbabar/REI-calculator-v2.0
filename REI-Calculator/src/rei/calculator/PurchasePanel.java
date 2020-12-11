package rei.calculator;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Formatter;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.text.Keymap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shakeel Ahmed
 */
public class PurchasePanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    NumberFormat formatter;
    public PurchasePanel() {
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
        asking_price = new javax.swing.JTextField();
        purchase_price = new javax.swing.JTextField();
        rehab_budget = new javax.swing.JTextField();
        arv = new javax.swing.JTextField();
        closing_cost = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        downpayment_dollar = new javax.swing.JTextField();
        loan_amount = new javax.swing.JTextField();
        emergency_funds = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        rehab_check = new javax.swing.JComboBox<>();
        term_years = new javax.swing.JSpinner();
        downpayment_pecentage = new javax.swing.JSpinner();
        annual_interest_rate = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 245, 245));
        setPreferredSize(new java.awt.Dimension(934, 524));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        jLabel1.setText("Purchase & Finance Information");

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        jLabel2.setText("Asking Price ($)");

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        jLabel3.setText("Purchase Price ($)");

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        jLabel4.setText("Financing Rehab");

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        jLabel5.setText("Rehab Budget ($)");

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        jLabel6.setText("ARV ($)");

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        jLabel7.setText("Closing Costs ($)");

        asking_price.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        asking_price.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                asking_priceCaretUpdate(evt);
            }
        });
        asking_price.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PurchasePanel.this.focusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PurchasePanel.this.focusLost(evt);
            }
        });
        asking_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                validateKey(evt);
            }
        });

        purchase_price.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        purchase_price.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                purchase_priceCaretUpdate(evt);
            }
        });
        purchase_price.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PurchasePanel.this.focusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PurchasePanel.this.focusLost(evt);
            }
        });
        purchase_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                validateKey(evt);
            }
        });

        rehab_budget.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        rehab_budget.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                rehab_budgetCaretUpdate(evt);
            }
        });
        rehab_budget.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PurchasePanel.this.focusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PurchasePanel.this.focusLost(evt);
            }
        });
        rehab_budget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rehab_budgetActionPerformed(evt);
            }
        });
        rehab_budget.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                validateKey(evt);
            }
        });

        arv.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        arv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PurchasePanel.this.focusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PurchasePanel.this.focusLost(evt);
            }
        });
        arv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                validateKey(evt);
            }
        });

        closing_cost.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        closing_cost.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PurchasePanel.this.focusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PurchasePanel.this.focusLost(evt);
            }
        });
        closing_cost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                validateKey(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        jLabel8.setText("Downpayment (%)");

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        jLabel9.setText("Downpayment ($)");

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        jLabel10.setText("Loan Amount ($)");

        jLabel11.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        jLabel11.setText("Annual Interest Rate");

        jLabel12.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        jLabel12.setText("Term (Years)");

        jLabel13.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        jLabel13.setText("Emergency Funds ($)");

        downpayment_dollar.setEditable(false);
        downpayment_dollar.setBackground(new java.awt.Color(204, 255, 204));
        downpayment_dollar.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N

        loan_amount.setEditable(false);
        loan_amount.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N

        emergency_funds.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        emergency_funds.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PurchasePanel.this.focusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PurchasePanel.this.focusLost(evt);
            }
        });
        emergency_funds.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                validateKey(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel14.setText("Purchase");

        jLabel15.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel15.setText("Finance");

        rehab_check.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        rehab_check.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YES", "NO" }));
        rehab_check.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rehab_checkItemStateChanged(evt);
            }
        });

        term_years.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        term_years.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        downpayment_pecentage.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        downpayment_pecentage.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        downpayment_pecentage.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                downpayment_pecentageStateChanged(evt);
            }
        });

        annual_interest_rate.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        annual_interest_rate.setModel(new javax.swing.SpinnerNumberModel(4.5d, 0.0d, null, 0.01d));
        annual_interest_rate.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                annual_interest_rateStateChanged(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(225, 227, 228));
        jLabel16.setForeground(new java.awt.Color(196, 199, 200));
        jLabel16.setText("________________________________________________________________________________________________________________________________");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rehab_budget, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(arv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(asking_price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(purchase_price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(closing_cost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(rehab_check, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel14))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(downpayment_dollar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(loan_amount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(emergency_funds, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(term_years, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(downpayment_pecentage)
                                    .addComponent(annual_interest_rate)))
                            .addComponent(jLabel15)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(downpayment_pecentage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(downpayment_dollar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(loan_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(asking_price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(purchase_price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rehab_check, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(annual_interest_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(term_years, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(emergency_funds, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rehab_budget, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(arv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(closing_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 52, 52))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rehab_budgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rehab_budgetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rehab_budgetActionPerformed

    private void asking_priceCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_asking_priceCaretUpdate
        JTextField source = (JTextField) evt.getSource();
        if(!source.getText().equalsIgnoreCase("")){
//            source.setText(String.valueOf(parse(source.getText())));
        }
//            double num = 0;
//            if(source.getText().contains("$")){
//                try {
//                    num = formatter.parse(source.getText()).doubleValue();
//                } catch (ParseException ex) {
//                    Logger.getLogger(PurchasePanel.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//            else num= Double.parseDouble(source.getText()); 
////            try {
////                num = formatter.parse(source.getText()).doubleValue();
////            } catch (ParseException ex) {
////                Logger.getLogger(PurchasePanel.class.getName()).log(Level.SEVERE, null, ex);
////            }
//            this.purchase_price.setText(Format.format(num));
//            this.rehab_budget.setText(Format.format(num));
    }//GEN-LAST:event_asking_priceCaretUpdate
    
    
    
    public float get_PurchaseValue(){
        float pur_val = 0;
        if(!this.purchase_price.getText().equalsIgnoreCase("")){
            return Format.parse(this.purchase_price.getText());
        }
        return pur_val;
    }
    
    public void setDownpayment(){
        float per = Float.parseFloat(String.valueOf(this.downpayment_pecentage.getValue()));
        float calculate_dollar_amount = REI_Calculations.calculate_dollar_amount(get_PurchaseValue(),(per)/100);
        this.downpayment_dollar.setText(Format.format(calculate_dollar_amount));
    }
    
    public void setLoanAmount() {
        setDownpayment();
        if(!this.rehab_budget.getText().equalsIgnoreCase("")){
            float rb =0, dp = 0;
            if(this.rehab_check.getItemAt(this.rehab_check.getSelectedIndex()).equalsIgnoreCase("NO"))
                rb = 0;
            else rb = Format.parse(this.rehab_budget.getText());
            dp = Format.parse(this.downpayment_dollar.getText());
            float loan_amount = REI_Calculations.full_loan_amount(get_PurchaseValue(), rb, dp);
            this.loan_amount.setText(Format.format(loan_amount));
        }
//        int per = (int) this.downpayment_pecentage.getValue();
//        double calculate_dollar_amount = REI_Calculations.calculate_dollar_amount(pur_val,((double)per)/100);
//        this.downpayment_dollar.setText(Format.format(calculate_dollar_amount));
    }

    private void purchase_priceCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_purchase_priceCaretUpdate
        // TODO add your handling code here:
        setDownpayment();
        setLoanAmount();
    }//GEN-LAST:event_purchase_priceCaretUpdate

    private void downpayment_pecentageStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_downpayment_pecentageStateChanged
        // TODO add your handling code here:
        setDownpayment();
        setLoanAmount();
    }//GEN-LAST:event_downpayment_pecentageStateChanged

    private void rehab_checkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rehab_checkItemStateChanged
        setLoanAmount();
    }//GEN-LAST:event_rehab_checkItemStateChanged

    private void focusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusGained
        // TODO add your handling code here:
        JTextField source = (JTextField) evt.getSource();
        if(!source.getText().equalsIgnoreCase("")){
            System.out.println(source.getText() + "gained Code: "+evt.hashCode());
            source.setText(Format.formatTo2Float(Format.parse(source.getText())));
        }
    }//GEN-LAST:event_focusGained

    private void focusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusLost
        // TODO add your handling code here:
        JTextField source = (JTextField) evt.getSource();
        if(!source.getText().equalsIgnoreCase("")){
            System.out.println(source.getText() + "lost Code: "+evt.hashCode());
            source.setText(Format.format(Double.parseDouble(source.getText())));
        }
    }//GEN-LAST:event_focusLost

    private void rehab_budgetCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_rehab_budgetCaretUpdate
        setDownpayment();
        setLoanAmount();
    }//GEN-LAST:event_rehab_budgetCaretUpdate

    private void validateKey(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validateKey
        // TODO add your handling code here:
        JTextField source = (JTextField) evt.getSource();
        if ((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') || evt.getKeyCode() == 8 || evt.getKeyChar() == '-'|| (evt.getKeyCode() >=37 && evt.getKeyCode() <=40)) {
            source.setEditable(true);
        } else {
            source.setEditable(false);
        }
    }//GEN-LAST:event_validateKey

    private void annual_interest_rateStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_annual_interest_rateStateChanged
//        System.out.println("Rate: "+this.annual_interest_rate.getValue().toString());
    }//GEN-LAST:event_annual_interest_rateStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner annual_interest_rate;
    private javax.swing.JTextField arv;
    private javax.swing.JTextField asking_price;
    private javax.swing.JTextField closing_cost;
    private javax.swing.JTextField downpayment_dollar;
    private javax.swing.JSpinner downpayment_pecentage;
    private javax.swing.JTextField emergency_funds;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField loan_amount;
    private javax.swing.JTextField purchase_price;
    private javax.swing.JTextField rehab_budget;
    private javax.swing.JComboBox<String> rehab_check;
    private javax.swing.JSpinner term_years;
    // End of variables declaration//GEN-END:variables
}
