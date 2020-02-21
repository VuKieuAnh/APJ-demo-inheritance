package book;

public class TestBook {
    public static void main(String[] args) {
        ProgrammingBook b1 = new ProgrammingBook("C12", "Hoc lap trinh", 120000, "Viet Dung", "Java");
        b1.saleOff(50);
        System.out.println(b1.price);

    }
}
