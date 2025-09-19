package org.example.service.implement;

import lombok.RequiredArgsConstructor;
import org.example.model.Notification;
import org.example.model.enums.Channels;
import org.example.service.interfaces.NotificationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NotificationServiceImpl implements NotificationService {


    @Override
    public Notification getNotificationFindById(String id) {
     Notification notification = new Notification();
        return notification;
    }
    @Override
    public List<Notification> getNotifications() {
        return null;
    }
    @Override
    public List<Channels> getChannels(){
        return null;
    }
    @Override
    public String createNotification(Notification notification){
        return "";
    }
    @Override
    public String scheduleNotification(Notification notification){
        return "";
    }

}
