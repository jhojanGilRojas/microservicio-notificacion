package org.example.service.interfaces;

import org.example.model.Notification;
import org.example.repository.NotificationRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface NotificationService {

    List<Notification> findAll();

    String save(Notification notification);

    Notification findById(String id);


}


