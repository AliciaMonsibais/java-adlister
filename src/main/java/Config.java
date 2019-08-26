public class Config {
    private static String url = "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false";
    private static String username = "root";
    private static String password = "codeup";

    public static String getUrl() {
        return url;
    }

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }
}
