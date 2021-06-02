/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Millanda_Midterm2;

/**
 *
 * @author 2ndyrGroupA
 */
public class DiscountRate {
    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold    = 0.15;
    private static double serviceDiscountSilver  = 0.1;

    private static double productDiscountPremium = 0.1;
    private static double productDiscountGold    = 0.1;
    private static double productDiscountSilver  = 0.1;
    
    public static double getServiceDiscountRate(String type) {
        switch(type.toUpperCase()) {
            case "PREMIUM": return serviceDiscountPremium;
            case "GOLD":    return serviceDiscountGold;
            case "SILVER":  return serviceDiscountSilver;
        }
         return 0.0;
}
    public static double getProductDiscountRate(String type) {
        switch(type.toUpperCase()) {
            case "PREMIUM": return productDiscountPremium;
            case "GOLD":    return productDiscountGold;
            case "SILVER":  return productDiscountSilver;
        }
        return 0.0;
    }
}