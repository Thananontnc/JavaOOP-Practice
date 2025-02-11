public class Dog {

    public String name;
    public String breed;
    public int age;

    public Dog() {
        this.name = "Unknown";
        this.breed = "Unknown";
        this.age = 0;
    }
    public Dog(String name) {
        this.name = name;
        this.breed = "Unknown";
        this.age = 0;
    }
    public Dog(String name , String breed) {
        this.name = name;
        this.breed = breed;
        this.age = 0;
    }
    public Dog(String name , String breed,int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void bark() {
        System.out.println("Woof! Woof!");
    }

    public void showInfo () {
        System.out.println(this.name +" is a "+this.breed+" and is "+ this.age +  " years old.");
        bark();
    }
}
