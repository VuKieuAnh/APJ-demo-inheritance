package book;

public class ProgrammingBook extends Book implements TinhGiaKM {
    String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ProgrammingBook(String language) {
        this.language = language;
    }

    public ProgrammingBook(String bookCode, String name, float price, String author, String language) {
        super(bookCode, name, price, author);
        this.language = language;
    }

    @Override
    public void saleOff(int Percent) {
        super.price = super.price*Percent/100;
    }
}
