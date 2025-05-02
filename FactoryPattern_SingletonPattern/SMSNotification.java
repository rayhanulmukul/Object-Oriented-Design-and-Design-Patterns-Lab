package FactoryPattern_SingletonPattern;
public class SMSNotification implements Notification{
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}
