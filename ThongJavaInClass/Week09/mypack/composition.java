package Week09.mypack;


class Engine {
    Engine(){
        System.out.println("For moving.");
    }
}

class AirBag{
    AirBag(){
        System.out.println("For protecting.");
    }
}

class EvCar{
    EvCar(){
        Engine carEngine = new Engine();
        AirBag myAirBag = new AirBag();
        seatBelt mySeatBelt = new seatBelt();
    }
}

class seatBelt{
    seatBelt(){
        System.out.println("For safety.");
    }
}

public class composition {
    public static void main(String[] args) {
        EvCar myCar = new EvCar();
    }
    
}
