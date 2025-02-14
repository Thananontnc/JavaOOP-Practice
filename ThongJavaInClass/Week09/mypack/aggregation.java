package Week09.mypack;

class university {
    university(String uni){
        System.out.println(uni);
    }
}
class campus {
    campus(String name){
        System.out.println(name);
    }
}
class faculty{
    public faculty(String name, university uni, campus loc) {
        System.out.println(name);
    }
}


public class aggregation{
    public static void main(String[] args) {
        university myuni = new university("ABAC");
        campus location = new campus("Bangna");

        faculty myfaFaculty = new faculty("VMES", myuni, location);
        faculty myFaculty2 = new faculty("BBA", myuni, location);
        faculty myFaculty3 = new faculty("Com-Art", myuni, location);

        // university myuni2 = new university("AIT");
        // faculty mFaculty4 = new faculty("IT", myuni2);
    }
}