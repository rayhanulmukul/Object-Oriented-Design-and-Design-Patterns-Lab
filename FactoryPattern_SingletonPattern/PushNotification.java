package FactoryPattern_SingletonPattern;
public class PushNotification implements Notification {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending Push notification: " + message);
    }
    
}
