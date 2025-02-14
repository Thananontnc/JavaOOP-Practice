package Week09.mypack;

class animal{
    animal(String tp){
        System.out.println(tp);
    }
}

class zoo{
    String animalName;
    zoo(String name, animal animalType){
        this.animalName = name;
    }

    public void showAnimalName(){
        System.out.println(this.animalName);
    }

}

public class aggregation2 {
    public static void main(String[] args) {
        animal category = new animal("-- Predators --");
        zoo myvisit = new zoo("Tiger", category);
        myvisit.showAnimalName();
    }
}

