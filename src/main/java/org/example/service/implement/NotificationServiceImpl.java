package org.example.service.implement;

import org.example.model.Notification;
import org.example.repository.NotificationRepository;
import org.example.service.interfaces.NotificationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Override
    public Notification findById(String id) {

        return null;
    }

    @Override
    public Notification save(Notification notification) {
        return null;
    }

    @Override
    public List<Notification> findAll() {
        return null;
    }
    public void NotificationService(NotificationRepository notificationRepository){


    }
}
