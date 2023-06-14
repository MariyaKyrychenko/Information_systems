public class Notification {
    private boolean famous_people;
    private boolean news;
    private boolean arts;
    private boolean technologies;

    public Notification(boolean famous_people, boolean news, boolean arts, boolean technologies) {
        this.famous_people = famous_people;
        this.news = news;
        this.arts = arts;
        this.technologies = technologies;
    }

    public Notification saveNotification(){
        Notification saveNotification = new Notification(famous_people, news, arts, technologies);
        return saveNotification;
    }

    public Notification loadNotification(Notification notification){
        this.famous_people = notification.famous_people;
        this.news = notification.news;
        this.arts = notification.arts;
        this.technologies = notification.technologies;
        return notification;
    }

    public boolean getFamousPeople() {
        return famous_people;
    }

    public void setFamousPeople(boolean famous_people) {
        this.famous_people = famous_people;
    }

    public boolean getNews() {
        return news;
    }

    public void setNews(boolean news) {
        this.news = news;
    }

    public boolean getArts() {
        return arts;
    }

    public void setArts(boolean arts) {
        this.arts = arts;
    }

    public boolean getTechnologies() {
        return technologies;
    }

    public void setTechnologies(boolean technologies) {
        this.technologies = technologies;
    }

    @Override
    public String toString() {
        return "Notification {" +
                "Famous people = " + famous_people +
                ", News = " + news +
                ", Arts = " + arts +
                ", Technologies = " + technologies +
                '}';
    }
}