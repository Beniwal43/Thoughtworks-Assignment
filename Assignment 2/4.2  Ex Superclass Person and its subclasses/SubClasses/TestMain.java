package SubClasses;

public class TestMain {
    public static void main(String[] args) {
        // Test Student class
        Student s1 = new Student("Chetan", "India", "BTECH", 2021, 300);
        System.out.println(s1);
        s1.setAddress("Haryana");
        System.out.println(s1);
        s1.setFee(300);
        s1.setProgram("BECSE");
        s1.setYear(2022);
        System.out.println("Name is " + s1.getName());
        System.out.println("Address is " + s1.getAddress());
        System.out.println("Fee is " + s1.getFee());
        System.out.println("Program is " + s1.getProgram());
        System.out.println("Year is " + s1.getYear());
        
        // Test Staff class
        Staff sf1 = new Staff("Beniwal", "India", "CU", 250);
        System.out.println(sf1);
        sf1.setAddress("Karnal");
        System.out.println(sf1);
        sf1.setPay(300);
        sf1.setSchool("Chandigarh University");
        System.out.println("Name is " + sf1.getName());
        System.out.println("Address is " + sf1.getAddress());
        System.out.println("Pay is " + sf1.getPay());
        System.out.println("School is " + sf1.getSchool());
    }
}
