/* 
 * Name: Thananon Chounudom
 * ID: 6711424
 */

public class resident {

    public resident(){
        System.out.println("Resident in Bangkok.");
    }

    public void paytax() {
        System.out.println("All resident must pay TAX.");
    }

    public void drivingpermit() {
        System.out.println("All residents are allowed for driving.");
    }


    public static void main(String[] args) {
        resident ppl = new resident();
        ppl.paytax();
        ppl.drivingpermit();
        System.out.println("-----------");
        resident ppl2 = new local();
        ppl2.paytax();
        ppl2.drivingpermit();
        System.out.println("-----------");
        resident ppl3 = new foreigner();
        ppl3.paytax();
        ppl3.drivingpermit();
        foreigner.applyVisa();
    }
}

/* 
 * Name: Thananon Chounudom
 * ID: 6711424
 */