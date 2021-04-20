package notification.console;

import notification.Notification;
import notification.NotificationSender;

public class ConsoleNotificationSender implements NotificationSender {

    public boolean send(Notification notification) {
        return false;
    }
}
