package FactoryPattern_SingletonPattern;
public class NotificationService {
    public static void main(String[] args){
        /*
        // Factory Design Pattern
        NotificationFactory notificationFactory = new NotificationFactory();

        Notification sms = notificationFactory.createNotification("SMS");
        sms.notifyUser("SMS Notifciation using Factory!");

        Notification email = notificationFactory.createNotification("EMAIL");
        email.notifyUser("Email Notification using Factory!");

        Notification push = notificationFactory.createNotification("PUSH");
        push.notifyUser("Push Notification using Factory!");
        */

        // Singleton Design Pattern
        NotificationFactory singletonNotificationFactory = NotificationFactory.getInstance();

        Notification sms = singletonNotificationFactory.createNotification("SMS");
        sms.notifyUser("SMS Notification using Singleton!");

        Notification email = singletonNotificationFactory.createNotification("EMAIL");
        email.notifyUser("Email Notification using Singleton!");

        Notification push = singletonNotificationFactory.createNotification("PUSH");
        push.notifyUser("Push Notification using Singleton!");
    }
}