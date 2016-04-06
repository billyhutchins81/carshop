
package car.shop;

/**
 *This class contains the main method for CarShop. The user enters a user id
 * which will be stored as the first element of the command-line array, a service which will be 
 * stored as the second element of the array and a second service which will be stored 
 * as the third element of the array. The program checks if the user enters a valid id
 * and computes the total price and time for all services.
 * 
 * Programmer name: Billy Hutchins
 * Date: 05-30-2015
 */
public class CarShop {

    /**
     * A method to get user id and services to be processed
     * @exception Please enter valid service exception if user enters invalid service
     * @exception Pls enter only user ID, first service and second service if user enters 
     * invalid number of entries
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            String str1 = "oil change";
            String str2 = "tune up";
            String str3 = "wheel alignment";

            if ((!args[1].equalsIgnoreCase(str1) & !(args[1].toLowerCase().charAt(0) == 'o')
                    & !args[1].equalsIgnoreCase(str2) & !(args[1].toLowerCase().charAt(0) == 't')
                    & !args[1].equalsIgnoreCase(str3) & !(args[1].toLowerCase().charAt(0) == 'w'))
                    || (!args[2].equalsIgnoreCase(str1) & !(args[2].toLowerCase().charAt(0) == 'o')
                    & !args[2].equalsIgnoreCase(str2) & !(args[2].toLowerCase().charAt(0) == 't')
                    & !args[2].equalsIgnoreCase(str3) & !(args[2].toLowerCase().charAt(0) == 'w'))) {

                throw new Exception("Please enter valid service");
            }

            if (args.length > 3) {
                throw new Exception("Pls enter only user ID, first service and second service");

            }

            int customerID = Integer.parseInt(args[0]);
            String service1 = args[1];
            String service2 = args[2];

            System.out.println(CheckService.checkID(customerID));
            System.out.println(CheckService.checkService(service1));
            System.out.println(CheckService.checkService(service2));

            Shop one = new Shop();
            Shop two = new Shop();

            one.process(service1);
            two.process(service2);

            int totalPrice = one.getPrice() + two.getPrice();
            int totalTime = one.getTime() + two.getTime();
            System.out.println(DisplayOrder.displayPrice(totalPrice));
            System.out.println(DisplayOrder.displayTime(totalTime));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
