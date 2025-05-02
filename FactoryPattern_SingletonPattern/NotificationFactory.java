package FactoryPattern_SingletonPattern;
public class NotificationFactory {

    // Singleton instance
    private static NotificationFactory instance = new NotificationFactory();
    private NotificationFactory(){
        // private constructor to prevent instantiation
    }
    public static NotificationFactory getInstance(){
        return instance;
    }
    
    // Factory Design Pattern
    public Notification createNotification(String type){
        if(type.equalsIgnoreCase("SMS")){
            return new SMSNotification();
        } 
        else if(type.equalsIgnoreCase("EMAIL")){
            return new EmailNotification();
        } 
        else if(type.equalsIgnoreCase("PUSH")){
            return new PushNotification();
        }
        return null;
    }
}
