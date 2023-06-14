public abstract class Builder {
    public abstract void databaseTitle(String title);
    public abstract void select(String[] select);
    public abstract void where(String[] where);
    public abstract void limit(int limit);
    public abstract void getSQL(String[] getSQL);
}