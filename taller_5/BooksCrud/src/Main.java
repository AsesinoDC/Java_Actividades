import persistence.ConnectDB;

public class Main {
    public static void main(String[] args) {
        ConnectDB.openConnection();
        ConnectDB.closeConnection();
    }
}