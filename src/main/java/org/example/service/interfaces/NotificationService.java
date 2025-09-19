package org.example.service.interfaces;

import org.example.model.Notification;
import org.example.model.enums.Channels;
import java.util.List;


public interface NotificationService {

    List<Notification> getNotifications();

    Notification getNotificationFindById(String id);

    List<Channels> getChannels();

    String createNotification(Notification notification);

    String scheduleNotification(Notification notification);


}


