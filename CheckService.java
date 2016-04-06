
package car.shop;

/**
 *This class contains the methods which checks if the user 
 * enters a valid ID and service.
 * Programmer name: Billy Hutchins
 * Date: 05-30-2015
 */
public class CheckService {
    /**
     *Checks if the user entered a valid id 
     * @param id id which the user enters
     * @return true if id is valid false otherwise 
     */
    public static boolean checkID(int id) {
        int[] validID = {101, 104, 108, 109, 111};
        for (int i = 0; i < validID.length; i++) {
            if (id == validID[i]) {
                return true;
            }
        }
        return false;
    }
    /**
     * Checks if the user entered a valid service. The user can
     * enter even just the first letter of service and is not case sensitive.
     * @param order service which the user enters
     * @return correct service name if user enters a valid entry.
     * returns Invalid service otherwise
     */
    public static String checkService(String order) {
        String service;
        if (order.charAt(0) == 'O' || order.charAt(0) == 'o') {
            service = "oil change";
        } else {
            if (order.charAt(0) == 'T' || order.charAt(0) == 't') {
                service = "tune up";
            } else {
                if (order.charAt(0) == 'W' || order.charAt(0) == 'w') {
                    service = "wheel alignment";
                } else {
                    service = "Invalid service";
                }

            }

        }
        return service;

    }

}
