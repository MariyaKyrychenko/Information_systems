public class MongoDBSingleton {

   private static MongoDBSingleton instance = new MongoDBSingleton();

   private MongoDBSingleton(){}

   public static MongoDBSingleton getInstance(){
      return instance;
   }

   public void showMessage(){
      System.out.println("Database: MongoDB");
   }
}