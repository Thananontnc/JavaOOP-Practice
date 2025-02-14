package Q2_6710990;

//6710990
//Prathomporn Bunjua

public class Main {
    public static void main(String[] args) {
        resident ppl = new resident();
        ppl.paytax();
        ppl.drivingpermit();
        System.out.println("----------");
        resident ppl2 = new local();
        ppl2.paytax();
        ppl2.drivingpermit();
        System.out.println("----------");
        resident ppl3 = new foreigner();
        ppl3.paytax();
        ppl3.drivingpermit();
        foreigner.applyVisa();

    }
    
}

//6710990
//Prathomporn Bunjua
