package entity;

public class Books {

    private int id_book;
    private String title;
    private String year;
    private double price;
    private int id_author;


    public Books(){}

    public Books(int id_book, String title, String year, double price, int id_author){
        this.id_book = id_book;
        this.title = title;
        this.year = year;
        this.price = price;
        this.id_author = id_author;
    }

    public int getId_book() {
        return id_book;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public int getId_author() {
        return id_author;
    }

    @Override
    public String toString() {
        return "Books {" +
                "Id book: " + this.id_book +
                " title: '" + this.title +
                " year: '" + this.year +
                " price: " + this.price +
                " id_author: " + this.id_author +
                '}';
    }
}
