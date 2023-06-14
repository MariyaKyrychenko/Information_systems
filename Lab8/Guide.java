public class Guide {

    private Builder builder;

    public Guide(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.databaseTitle(title);
        builder.select(new String[]{
                "Item_1",
                "Item_2",
        });
        
        builder.where(new String[]{
                "Condition_1",
                "Consition_2",
        });
        
        builder.limit(5);

        builder.getSQL(new String[]{
                "Request_1",
                "Request_2",
                "Request_3",
        });
    }
}