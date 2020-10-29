package rei.calculator;

public class REI_Calculations {

    public double loan_payment(final double rate, final int term, final double present_value) {
        // Calculates the loan payment
        final double monthly_rate = rate / 12.0d;
        final int term_months     = term * 12;
        final double payment      = present_value * (monthly_rate * Math.pow(1 + monthly_rate, term_months)) 
            / (Math.pow(1 + monthly_rate, term_months)-1);
        return payment;
    }

    public double calculate_dollar_amount(final double base_amount, final double percentage) {
        // This funcition will be used for the "_auto" tags on the Expenses sheet and the downpayment calculation
        final double doll_amount = base_amount * percentage;
        return doll_amount;
    }

    public double full_loan_amount(double purchase_price_input, String fin_rehab_logical,
        double rehab_budget_input, double dp_dollar_auto) {
        
            // this is to calculate the loan amount auto on the purchase tab
        if (fin_rehab_logical == "No") {
            rehab_budget_input = 0;
        }
        return (purchase_price_input + rehab_budget_input) - dp_dollar_auto;
    }

    public double monthly_rent(int num_units_input, double ave_rent_input){
        double tot_rent_month_auto = num_units_input * ave_rent_input;
        return tot_rent_month_auto;
    }

    public double total_monthly_income(double tot_rent_month_auto, double other_income_month_input) {
        double tot_income_month_auto =tot_rent_month_auto + other_income_month_input;
        return tot_income_month_auto;
    }

    public double future_value(double rate, int term, double payment, double present_value){
        // Calculates the future value of the loan
        double fut_value = present_value * Math.pow(1 + rate, term) - 
            payment * ((Math.pow(1 + rate, term) - 1) / (rate));
        return fut_value; 
    }

    public double[] fixed_expenses_monthly(double electric, double WandS, double PMI, 
        double garbage, double HOA, double insurance, double taxes, double other) {
            // Simple function to sum all the fixed monthly expense
            // Returns the monthly and yearly totals

            double fixed_monthly    = electric + WandS + PMI + garbage + HOA + 
                insurance + taxes + other;
            double fixed_yearly     = fixed_monthly * 12d;
            double[] fixed = {fixed_monthly, fixed_yearly};
            return fixed; 
        }
    public double[] variable_expenses_monthly(double vacancy, double rep_and_main, 
        double cap_ex, double management){
        // Defines the monthly variable costs
        // Calculates the total monthly costs
        // Calculates the yearly costs
        double var_monthly  = vacancy + rep_and_main + cap_ex + management;
        double var_yearly   = var_monthly * 12d;
        double[] variable   = {var_monthly, var_yearly};
        return variable;
    }
    
    public double cash_flow_monthly(double total_income_monthly, double payment, 
        double fixed_monthly, double var_monthly){
        // Calculates monthly cash flows
        double cf_monthly = total_income_monthly - (payment + fixed_monthly + var_monthly);
        return cf_monthly;
    }
    public double NOI_yearly(double total_income_monthly, double fixed_yearly, 
        double variable_yearly){
        // Calculates NOI
        double NOI = (total_income_monthly) - fixed_yearly - variable_yearly;
        return NOI;
    }
    public double NIAF_yearly(double NOI, double payment){
        //Calculates the net income after financing (NIAF)
        double payment_yearly = payment * 12d;
        double NIAF = NOI - payment_yearly;
        return NIAF;
    }
    public double cum_NIAF(double tot_NIAF, double NIAF){
        tot_NIAF += NIAF;
        return tot_NIAF;
    }
    public double cash_to_close(double downpayment, double closing_costs, 
        double emergency_fund, double rehab_budget, String finance_rehab_logical){
        //Calculates the cash needed to close the deal
        if (finance_rehab_logical == "Yes") {
            rehab_budget = 0d;
        }
        double cash_2_close = downpayment + closing_costs + emergency_fund + rehab_budget;
        return cash_2_close;
    }
    public double cash_on_cash_return(double NIAF, double cash_2_close){
        // Calculates the cash on cash return
        double CoCR = NIAF / cash_2_close;
        return CoCR * 100d;
    }
    public double cap_rate(double NOI, double purchase_price, double rehab_budget, double closing_costs){
        // Calculates the cap rate on the property
        // Cap Rate is the NOI over the total amount of investment
        double capRate = NOI / (purchase_price + rehab_budget + closing_costs);
        return capRate * 100d; 
    }
    public double gross_rent_mult(double purchase_price, double rehab_budget, double total_income_monthly){
        // Calculates the gross rent multiplier (GRM)
        // Gross rent multiplier = (total purchase price + rehab) / annual rent
        double GRM = (purchase_price + rehab_budget) / (total_income_monthly * 12d);
        return GRM;
    }
    public double one_perc_rule(double purchase_price, double rehab_budget, double total_income_monthly){
        // Calculates the percentage of rent against the purchase price + rehab
        double percentage = (total_income_monthly / (purchase_price + rehab_budget));
        return percentage * 100d;
    }
    public double fifty_perc_rule(double fixed_monthly, double var_monthly, double total_income_monthly){
        // Calculates the percentage of expenses to rent
        double percentage = (fixed_monthly + var_monthly) / (total_income_monthly);
        return percentage * 100d;
    }
    public double future_equity(double fut_value_property, double fut_value_loan){
        // Calculates the future equity stake in property
        double tot_equity = fut_value_property - fut_value_loan;
        return tot_equity;
    }
    public double tot_profit_sold(double fut_value_property, double selling_costs_perc,
        double fut_value_loan, double cash_2_close, double cum_NIAF){
        // Calculates the total profit if property was sold in a given year
        double total_profit_sold = fut_value_property * (1d - selling_costs_perc)
            -fut_value_loan - cash_2_close + cum_NIAF;
        return total_profit_sold;
    }
    public double growth_rate(double future_value, double present_value, int term_years){
        double CAGR = (Math.pow((future_value/present_value), 1d/term_years)-1) * 100d;
        return CAGR;
    }
    public double return_on_investment(double final_tot_equity, double cum_NIAF, double cash_2_close){
        // Calculates the return on investment (ROI)
        double ROI = ((final_tot_equity + cum_NIAF) / cash_2_close) - 1d;
        return ROI;
    }
}