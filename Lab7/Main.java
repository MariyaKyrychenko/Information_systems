public class Main {
    
   public static void main(String[] args){  
     
      MongoDBSingleton mongoDB = MongoDBSingleton.getInstance();
      PostgreSQLSingleton postgreSQL = PostgreSQLSingleton.getInstance();

      postgreSQL.showMessage();
      // mongoDB.showMessage();
   }
}