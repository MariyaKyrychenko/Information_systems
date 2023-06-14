public class PostgreSQLSingleton {

   private static PostgreSQLSingleton instance = new PostgreSQLSingleton();

   private PostgreSQLSingleton(){}

   public static PostgreSQLSingleton getInstance(){
      return instance;
   }

   public void showMessage(){
      System.out.println("Database: PostgreSQL");
   }
}