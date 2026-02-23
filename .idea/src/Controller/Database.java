
public class Database {
    private String url;
    private String pass;
    private Statement stmt;
    private ResultSet rs;


    public Database(String url, String pass) {
    }

    public static Connection getConnection() {
        return DriverManager.getConnection();
    }
}