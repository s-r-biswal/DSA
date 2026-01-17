package design.patterns.SOLID.DI;

public class EmailNotificationService implements NotificationMiddleware {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMSEmailNotificationService.sendNotification");
    }
}
