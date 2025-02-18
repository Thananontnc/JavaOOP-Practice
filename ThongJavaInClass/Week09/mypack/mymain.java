package Week09.mypack;

class mystudent{
    String name;
    int studentId;
    mystudent(String name, int studentId){
        this.name = name;
        this.studentId = studentId;
    }
}

class StudentIdCard {
    int card_Number;
    mystudent owner;
    StudentIdCard(int cardNumber, mystudent owner) {
        this.card_Number = cardNumber;
        this.owner = owner;
    }
}

public class mymain {
    public static void main(String[] args) {
        mystudent mystd = new mystudent("John", 123);
        StudentIdCard myid = new StudentIdCard(123, mystd);
        System.out.println(mystd.name);
        System.out.println(mystd.studentId);
    }
    
}

