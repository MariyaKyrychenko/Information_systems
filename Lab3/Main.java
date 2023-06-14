public class Main {

    public static void main(String[] args) {
        //Паттерн предусматривает сохранение во внешний источник, с чем успешно справляется Serializable в Java так что пример бестолковый
        Notification notification = new Notification(true, false, false, true);
        System.out.println("---------Initial data---------");
        System.out.println(notification);
        System.out.println("---------Change---------");
        notification.setNews(true);
        notification.setTechnologies(true);
        System.out.println(notification);
        Notification save = notification.saveNotification();
        System.out.println("----------------------");
        System.out.println("---------Save---------");
        System.out.println("----------------------");
        System.out.println("---------New changes---------");
        notification.setNews(false);
        notification.setTechnologies(false);
        System.out.println(notification);
        System.out.println("---------Load saved data---------");
        notification = notification.loadNotification(save);
        System.out.println(notification);
        
    }
}