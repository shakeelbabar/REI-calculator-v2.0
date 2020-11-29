/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rei.calculator;

import java.text.ParseException;
import java.util.Formatter;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shakeel Ahmed
 */
public class Format {
    
    public static NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
    public static Formatter fmt = new Formatter();
    public Format(){
//        this.formatter = NumberFormat.getCurrencyInstance(Locale.US);
    }
    
    public static float parse(String value){
        if(value.contains("$")){
            try {
                return formatter.parse(value).floatValue();
            } catch (ParseException ex) {
                Logger.getLogger(PurchasePanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return Float.parseFloat(value);
    }

    public static float parse_perc(String value){
        if(value.contains("%"))
            return Float.valueOf(value.replace("%", ""));        
        return Float.parseFloat(value);
    }
    
    public static String formatToCurrency(String value){
        if(!value.contains("$"))
            return formatter.format(Double.parseDouble(value));
        else {
            return value;
        }
    }
    
    public static String formatToPercent(String value){
        if(!value.contains("%")){
            value = formatTo2Float(Float.valueOf(value));
            return value+"%";
        }
        else 
            return value;            
    }
    
    public static String formatTo2Float(float value){
        fmt = new Formatter();
        fmt.format("%.2f", value);
        return fmt.toString();
    }
    
    public static String format(double value){
        return formatter.format(value);
    }
}
