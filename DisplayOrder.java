
package car.shop;

import java.text.DecimalFormat;

/**
 *This class contains the methods to convert the price
 * and time values into it's correct formats.
 * Programmer name: Billy Hutchins
 * Date: 05-30-2015
 */
public class DisplayOrder {
    /**
     * 
     * @param totalTime time of the service the user enters
     * @return time of service converted into hours and minutes format
     */
    public static String displayTime(int totalTime) {
        int hours = totalTime / 60;
        int minutes = totalTime % 60;
        return ("Total time: " + hours + ":" + minutes);
    }
    /**
     * 
     * @param totalPrice price of the service the user enters
     * @return price of service converted into currency format
     */
    public static String displayPrice(double totalPrice) {
        DecimalFormat amount = new DecimalFormat("$0.00");
        return ("Total price: " + amount.format(totalPrice));
    }

}
