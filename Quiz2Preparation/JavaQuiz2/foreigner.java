/* 
 * Name: Thananon Chounudom
 * ID: 6711424
 */


public class foreigner extends resident {
    private double tax = 0.07;

    public static void applyVisa() {
        System.out.println("Foreigners must apply VISA.");
    }

    @Override
    public void paytax() {
        System.out.println("Foreigner must pay tax:"+ this.tax);
    }

    @Override
    public void  drivingpermit() {
        System.out.println("Foreigner are allowed for driving.");
    }
}


/* 
 * Name: Thananon Chounudom
 * ID: 6711424
 */
