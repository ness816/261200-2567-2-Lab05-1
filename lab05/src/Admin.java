import java.time.LocalDate;

public class Admin extends User {

    public Admin(String name, int year, int month, int date) {
        super(name, year, month, date);// ใช้ constructor ของ User
    }

    public Admin(){
        super();// ใช้ default constructor ของ User
    }

    void displayInfo() {

        System.out.println("Name : " + this.name);
        System.out.println("dob : " + this.dob);
        System.out.println("User type: admin.");
    }


    void displayInfo(boolean full){

        if(full)
        {
            System.out.println("Name : " + this.name);
            System.out.println("dob : " + this.dob);
            System.out.println("User type: admin.");
            System.out.println("date : " + LocalDate.now());
        }
        else {
            System.out.println("Name : " + this.name);
        }


    }


}
