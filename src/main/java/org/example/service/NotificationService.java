package org.example.service;

import org.example.model.Notification;
import org.example.repository.NotificationRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NotificationService {

    private final NotificationRepository repository;

    public NotificationService(NotificationRepository repository) {
        this.repository = repository;
    }

    public List<Notification> findAll() {
        return repository.findAll();
    }

    public Notification save(Notification notification) {
        return repository.save(notification);
    }

    public Notification findById(String id) {
        return repository.findById(id).orElse(null);
    }
}


