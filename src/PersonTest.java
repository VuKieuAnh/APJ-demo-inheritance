import person.Employee;
import person.Leader;
import person.Manager;

public class PersonTest {
    public static void main(String[] args) {
        Employee doan = new Employee();
        Manager tho = new Manager();

        Employee linh = new Manager();
        Leader theAnh = new Leader();

        Employee[] lopC12 = {doan, theAnh, linh, tho}   ;

        for (Employee c12Item:lopC12
             ) {
            c12Item.showSalry();

        }



    }

}
