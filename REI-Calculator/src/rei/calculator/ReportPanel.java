package rei.calculator;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.UIManager;

import org.python.util.PythonInterpreter;
import org.python.core.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shakeel Ahmed
 */
public class ReportPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    final JProgressBar jProgressBar;
    public ReportPanel() {
//        UIManager.put("jProgressBar1.background", Color.ORANGE);
//        UIManager.put("jProgressBar1.selectionBackground", Color.RED);
//        UIManager.put("jProgressBar1.selectionForeground", Color.GREEN);
//        UIManager.put("jProgressBar.foreground", Color.BLUE);
        initComponents();
        jProgressBar = new JProgressBar();
//        this.add(this.jProgressBar).setBounds(200, 200, 100, 25);
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
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        progress_perc = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 245, 245));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        setPreferredSize(new java.awt.Dimension(934, 524));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        jLabel1.setText("Report Generation");

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel2.setText("Select the items to be included in the report.");

        jCheckBox1.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        jCheckBox1.setText("Generate Additional Graphs");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        jCheckBox2.setText("Generate Full Proforma");
        jCheckBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jCheckBox3.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        jCheckBox3.setText("Generate Amortization Schedule");
        jCheckBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jCheckBox4.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        jCheckBox4.setText("Attach Loaded Images");
        jCheckBox4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jProgressBar1.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(240, 240, 240));
        jProgressBar1.setValue(70);
        jProgressBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setBackground(new java.awt.Color(0, 102, 0));
        jButton1.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Generate Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        progress_perc.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        progress_perc.setText("jLabel3");

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
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(progress_perc))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox4)
                        .addGap(43, 43, 43)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(progress_perc)))
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ExecutorService service = Executors.newSingleThreadExecutor();
        ((JButton)evt.getSource()).setEnabled(false);
//        this.jProgressBar1.setStringPainted(true);
//        this.jProgressBar1.setBorderPainted(true);
//        this.jProgressBar1.setBackground(Color.BLUE);
//        this.jProgressBar1.setForeground(Color.BLUE);
        //starts long running task off of EDT.
        service.submit(new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    //the portion of work.
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e1) {
                        //this might be a good spot to quit working.
                        e1.printStackTrace();
                    }
                    //update the progress bar on the EDT.
                    final int j = i;
                    EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            jProgressBar1.setValue(j);
                            progress_perc.setText(j+"%");
                        }
                    });
                }
                //work finished.
                EventQueue.invokeLater(new Runnable() {
                  public void run() {
                    jProgressBar1.setValue(100);
                    progress_perc.setText("100%");
                    ((JButton)evt.getSource()).setEnabled(true);
                  }
                });
            }
        });
        
        try{
            PythonInterpreter.initialize(System.getProperties(), System.getProperties(), new String[0]);
            PythonInterpreter interp = new PythonInterpreter();
            interp.execfile("./src/rei/calculator/new_main.py");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void runCalculations(){
        
        /**
         *  Initially we just need to calculate the 12 key figures.
         *  Will then build a loop for the Pro forma statement.
         *  
         **/
        
        // Begin by calculating the monthly payment of the loan
        float payment = REI_Calculations.loan_payment(PurchasePanel.getAnnualInterestRate(), 
                                                    PurchasePanel.getTerm(),
                                                    PurchasePanel.getLoanAmount());

        /**
         * 
         * Each item that is to be showcased will have a number before it.
         * only 8 are being calculated here.  There are an additional 4
         *    - Purchase Price (taken from GUI input)
         *    - Monthly Income (taken from GUI input)
         *    - Monthly Expense ( sum(fixed_monthly, var_monthly) )
         * The desired order for the 12 are to be as follows:
         * cash_2_close  Purch. Price   Monthly Income
         * Monthly Exp.  Monthly CF     50% Rule
         * NOI           NIAF           CoCR
         * Cap Rate      1% Rule        Gross Rent Mult.     
         * 
         */

        /**
         * Calculate the fixed and variable expenses
         */
        float fixed_monthly = ExpensePanel.getTotalFixedExpense();
        float variable_monthly = ExpensePanel.getTotalVariableExpense();
      
        /**
         * 1 Calculate NOI
         */
        float NOI = REI_Calculations.NOI_yearly(IncomePanel.getTotalMonthlyIncome(), 
                                               fixed_monthly*12.0f,
                                               variable_monthly*12.0f);
       
        /**
         * 2,3 Calculate Monthly and yearly NIAF or monthly cash flows
         */
        float cf_monthly = REI_Calculations.cash_flow_monthly(IncomePanel.getTotalMonthlyIncome(),
                                                              payment,
                                                              fixed_monthly,
                                                              variable_monthly);
        float NIAF = REI_Calculations.NIAF_yearly(NOI, payment);

        /**
         * 4 Calculate the cash to close
         */
        float cash_2_close = REI_Calculations.cash_to_close(PurchasePanel.getDownpaymentValue(),
                                                            PurchasePanel.getClosingCost(),
                                                            PurchasePanel.getEmergencyFunds(),
                                                            PurchasePanel.getRehabBudget(),
                                                            PurchasePanel.getRehabCheck());

        /**
         * 5 Calculate Cash on Cash Return (CoCR)
         */
        float CoCR = REI_Calculations.cash_on_cash_return(NIAF, cash_2_close);

        /**
         * 6 Calculate the cap rate
         */
        float capRate = REI_Calculations.cap_rate(NOI,
                                                  PurchasePanel.getPurchasePrice(),
                                                  PurchasePanel.getRehabBudget(),
                                                  PurchasePanel.getClosingCost());
        
        /**
         * 7 Calculate Gross Rent Multiplier
         */
        float GRM = REI_Calculations.gross_rent_mult(PurchasePanel.getPurchasePrice(),
                                                     PurchasePanel.getRehabBudget(),
                                                     IncomePanel.getTotalMonthlyIncome());
        
        /**
         * 8,9 Calculate the 1 and 50 percent rules
         */
        float one_perc = REI_Calculations.one_perc_rule(PurchasePanel.getPurchasePrice(),
                                                        PurchasePanel.getRehabBudget(),
                                                        IncomePanel.getTotalMonthlyIncome());
        float fifty_perc = REI_Calculations.fifty_perc_rule(fixed_monthly,
                                                            variable_monthly,
                                                            IncomePanel.getTotalMonthlyIncome());

        String[][] general_analysis_and_results = {
            {
                Format.FullFormat(cash_2_close),
                Format.FullFormat(PurchasePanel.getPurchasePrice()),
                Format.FullFormat(IncomePanel.getOtherIncome())
            },
            {
                Format.FullFormat(variable_monthly + fixed_monthly),
                Format.FullFormat(cf_monthly),
                Format.FullFormat(one_perc)
            },
            {
                Format.FullFormat(NOI),
                Format.FullFormat(NIAF),
                Format.FullFormat(CoCR)
            },
            {
                Format.FullFormat(capRate),
                Format.FullFormat(fifty_perc),
                Format.FullFormat(GRM)
            }
        };

        /**
         *  Will need to store this data now as some of it may be overwritten
         *  during the pro forma construction
         * 
         *  Now we begin the loop for ten years.  I will define a var here
         *  because in the future I may make this adjustable for the number
         *  of years to do the pro forma for
         * 
         *  Pro forma begins
         *  Set initial values
         */
        int cum_NIAF = 0;
        int cum_CoCR = 0;
        int length_yrs = 10;
        for(int i = 0; i <= length_yrs; i++){
            
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel progress_perc;
    // End of variables declaration//GEN-END:variables
}
