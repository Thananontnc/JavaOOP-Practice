package Shape;

public class Shape {
    private String name;

    public Shape() {
        this.name = "Unknow Shape";
    }

    public Shape(String name) {
        this.name = name;
    }

    public void details() {
        System.out.println("Shape Name: " + name);
    }
    
    protected double area(){
        return 0;
        }

    }
