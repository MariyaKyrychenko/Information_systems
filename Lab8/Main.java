public class Main {
    public static void main(String[] args) {

        if (args[0].equals("MySQL")) {
            MySQL mySQL = new MySQL();
            Guide guide = new Guide(mySQL);
            guide.construct();
            String get_select = mySQL.select();
            print(select);
            String get_where = mySQL.where();
            print(where);
            String get_limit = mySQL.limit();
            print(limit);
            String get_SQL = mySQL.getSQL();
            print(getSQL);
        } 
        
        else if (args[0].equals("PostgreSQL")) {
            PostgreSQL postgreSQL = new PostgreSQL();
            Guide guide = new Guide(postgreSQL);
            guide.construct();
            String get_select = postgreSQL.select();
            print(select);
            String get_where = postgreSQL.where();
            print(where);
            String get_limit = postgreSQL.limit();
            print(limit);
            String get_SQL = postgreSQL.getSQL();
            print(getSQL);
        } 
        
        else {
            System.exit(0);
        }
    }
}