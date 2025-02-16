package Week09.mypack;

class ironman{
    ironman(){
        System.out.println("- Tony Stark ");
    }
}

class captainAmerica{
    captainAmerica(){
        System.out.println("- Steve Roger");
    }
}

class Avenger{
    public void AvengerInitiative(){
        ironman hero1 = new ironman();
        captainAmerica hero2 = new captainAmerica();
    }
}

public class mymain2 {
    public static void main(String[] args) {
        Avenger NickFury = new Avenger();
        NickFury.AvengerInitiative();
    }  
      
}
    