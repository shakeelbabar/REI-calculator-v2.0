package rei.calculator;

public class REI_Calculations {

    
    public static float loan_payment(final float rate, final int term, final float present_value) {
        // Calculates the loan payment
        final float monthly_rate = rate / 12.0f;
        final int term_months     = term * 12;
        final float payment      = (float) (present_value * (monthly_rate * (float)Math.pow(1 + monthly_rate, term_months)) / (Math.pow(1 + monthly_rate, term_months)-1));
        return payment;
    }

    public static float calculate_dollar_amount(final float base_amount, final float percentage) {
        // This funcition will be used for the "_auto" tags on the Expenses sheet and the downpayment calculation
        final float doll_amount = base_amount * percentage;
        return doll_amount;
    }

    public static float full_loan_amount(float purchase_price_input,
        float rehab_budget_input, float dp_dollar_auto) {        
            // this is to calculate the loan amount auto on the purchase tab
        return (purchase_price_input + rehab_budget_input) - dp_dollar_auto;
    }

    public static float monthly_rent(int num_units_input, float ave_rent_input){
        float tot_rent_month_auto = num_units_input * ave_rent_input;
        return tot_rent_month_auto;
    }

    public static float total_monthly_income(float tot_rent_month_auto, float other_income_month_input) {
        float tot_income_month_auto =tot_rent_month_auto + other_income_month_input;
        return tot_income_month_auto;
    }

    public static float future_value(float rate, int term, float payment, float present_value){
        // Calculates the future value of the loan
        float fut_value = (float) (present_value * Math.pow(1 + rate, term) - 
                payment * ((Math.pow(1 + rate, term) - 1) / (rate)));
        return fut_value; 
    }

    public static float[] fixed_expenses_monthly(float electric, float WandS, float PMI, 
        float garbage, float HOA, float insurance, float taxes, float other) {
            // Simple function to sum all the fixed monthly expense
            // Returns the monthly and yearly totals

            float fixed_monthly    = electric + WandS + PMI + garbage + HOA + 
                insurance + taxes + other;
            float fixed_yearly     = fixed_monthly * 12f;
            float[] fixed = {fixed_monthly, fixed_yearly};
            return fixed; 
        }
    public static float[] variable_expenses_monthly(float vacancy, float rep_and_main, 
        float cap_ex, float management){
        // Defines the monthly variable costs
        // Calculates the total monthly costs
        // Calculates the yearly costs
        float var_monthly  = vacancy + rep_and_main + cap_ex + management;
        float var_yearly   = var_monthly * 12f;
        float[] variable   = {var_monthly, var_yearly};
        return variable;
    }
    
    public static float cash_flow_monthly(float total_income_monthly, float payment, 
        float fixed_monthly, float var_monthly){
        // Calculates monthly cash flows
        float cf_monthly = total_income_monthly - (payment + fixed_monthly + var_monthly);
        return cf_monthly;
    }
    public static float NOI_yearly(float total_income_monthly, float fixed_yearly, 
        float variable_yearly){
        // Calculates NOI
        float NOI = (total_income_monthly) - fixed_yearly - variable_yearly;
        return NOI;
    }
    public static float NIAF_yearly(float NOI, float payment){
        //Calculates the net income after financing (NIAF)
        float payment_yearly = payment * 12f;
        float NIAF = NOI - payment_yearly;
        return NIAF;
    }
    public static float cum_NIAF(float tot_NIAF, float NIAF){
        tot_NIAF += NIAF;
        return tot_NIAF;
    }
    public static float cash_to_close(float downpayment, float closing_costs, 
        float emergency_fund, float rehab_budget, String finance_rehab_logical){
        //Calculates the cash needed to close the deal
        if (finance_rehab_logical == "Yes" || finance_rehab_logical == "YES") {
            rehab_budget = 0f;
        }
        float cash_2_close = downpayment + closing_costs + emergency_fund + rehab_budget;
        return cash_2_close;
    }
    public static float cash_on_cash_return(float NIAF, float cash_2_close){
        // Calculates the cash on cash return
        float CoCR = NIAF / cash_2_close;
        return CoCR * 100f;
    }
    public static float cap_rate(float NOI, float purchase_price, float rehab_budget, float closing_costs){
        // Calculates the cap rate on the property
        // Cap Rate is the NOI over the total amount of investment
        float capRate = NOI / (purchase_price + rehab_budget + closing_costs);
        return capRate * 100f; 
    }
    public static float gross_rent_mult(float purchase_price, float rehab_budget, float total_income_monthly){
        // Calculates the gross rent multiplier (GRM)
        // Gross rent multiplier = (total purchase price + rehab) / annual rent
        float GRM = (purchase_price + rehab_budget) / (total_income_monthly * 12f);
        return GRM;
    }
    public static float one_perc_rule(float purchase_price, float rehab_budget, float total_income_monthly){
        // Calculates the percentage of rent against the purchase price + rehab
        float percentage = (total_income_monthly / (purchase_price + rehab_budget));
        return percentage * 100f;
    }
    public static float fifty_perc_rule(float fixed_monthly, float var_monthly, float total_income_monthly){
        // Calculates the percentage of expenses to rent
        float percentage = (fixed_monthly + var_monthly) / (total_income_monthly);
        return percentage * 100f;
    }
    public static float future_equity(float fut_value_property, float fut_value_loan){
        // Calculates the future equity stake in property
        float tot_equity = fut_value_property - fut_value_loan;
        return tot_equity;
    }
    public static float tot_profit_sold(float fut_value_property, float selling_costs_perc,
        float fut_value_loan, float cash_2_close, float cum_NIAF){
        // Calculates the total profit if property was sold in a given year
        float total_profit_sold = (float) (fut_value_property * (1d - selling_costs_perc)
                - fut_value_loan - cash_2_close + cum_NIAF);
        return total_profit_sold;
    }
    public static float growth_rate(float future_value, float present_value, int term_years){
        float CAGR = (float) ((Math.pow((future_value/present_value), 1d/term_years)-1) * 100d);
        return CAGR;
    }
    public static float return_on_investment(float final_tot_equity, float cum_NIAF, float cash_2_close){
        // Calculates the return on investment (ROI)
        float ROI = ((final_tot_equity + cum_NIAF) / cash_2_close) - 1f;
        return ROI;
    }
}