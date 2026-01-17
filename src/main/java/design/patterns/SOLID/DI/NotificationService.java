package design.patterns.SOLID.DI;

public class NotificationService {

    private NotificationMiddleware notificationMiddleware;

    public NotificationService(NotificationMiddleware notificationMiddleware) {
        this.notificationMiddleware = notificationMiddleware;
    }

    public void notify(String message) {
        notificationMiddleware.sendNotification(message);
    }
}
