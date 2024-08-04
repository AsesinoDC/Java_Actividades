package entity;

public class Authors {

    private int id_author;
    private String name;
    private String nationality;


    public Authors(){}

    public Authors(int id_author, String name, String nationality){
        this.id_author = id_author;
        this.name = name;
        this.nationality = nationality;
    }

    public int getId_author() {
        return id_author;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString(){
        return "Authors{" +
                " Id author: " + this.id_author +
                " Name: " + this.name +
                " Nationality: " + this.nationality +
                "}";
    }
}
