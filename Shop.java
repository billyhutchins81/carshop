
package car.shop;

/**
 *This class contains the Shop object. When created the user enters
 * services which will be processed by the Shop. It will calculate the 
 * total price and the total time for the user.
 * Programmer name: Billy Hutchins
 * Date: 05-30-2015
 */
public class Shop {
    /** service price**/
    private int price;
    /** service time**/
    private int time;

    /**
     * @return the price of the service 
     */
    public int getPrice() {
        return price;
    }
    /**
     * 
     * @return the time for the service
     */
    public int getTime() {
        return time;
    }
    /**
     * processes the service the user enters by 
     * calling the calculatePrice and calculatetime method
     * @param service service user enters 
     */
    public void process(String service) {
        this.calculatePrice(service);
        this.calculateTime(service);

    }
    /**
     * Calculates the price for the service the user enters
     * @param service service user enters
     */
    private void calculatePrice(String service) {

        String str1 = "oil change";
        String str2 = "tune up";
        String str3 = "wheel alignment";
        if (service.equalsIgnoreCase(str1) || service.toLowerCase().charAt(0) == 'o') {
            this.price = 40;
        } else {
            if (service.equalsIgnoreCase(str2) || service.toLowerCase().charAt(0) == 't') {
                this.price = 50;
            } else {
                if (service.equalsIgnoreCase(str3) || service.toLowerCase().charAt(0) == 'w') {
                    this.price = 60;
                }

            }
        }

    }
    /**
     * Calculates the time for the service the user enters
     * @param service service the user enters 
     */
    private void calculateTime(String service) {

        String str1 = "oil change";
        String str2 = "tune up";
        String str3 = "wheel alignment";
        if (service.equalsIgnoreCase(str1) || service.toLowerCase().charAt(0) == 'o') {
            this.time = 20;
        } else {
            if (service.equalsIgnoreCase(str2) || service.toLowerCase().charAt(0) == 't') {
                this.time = 30;
            } else {
                if (service.equalsIgnoreCase(str3) || service.toLowerCase().charAt(0) == 'w') {
                    this.time = 40;

                }
            }
        }
    }
}
