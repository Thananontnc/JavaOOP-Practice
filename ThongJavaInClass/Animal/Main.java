package Animal;

public class Main {
    public static void speak(Animal obj) {
        obj.details();
        obj.makeSound();
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        speak(myCat);
        System.out.println("");
        speak(myDog);
    }
    
}
