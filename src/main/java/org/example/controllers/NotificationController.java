package org.example.controllers;


import org.example.model.Notification;
import org.example.model.enums.Channels;
import org.example.service.interfaces.NotificationService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class NotificationController {

    private final NotificationService service;

    public NotificationController(NotificationService service) {
        this.service = service;
    }

    @GetMapping("/notifications/channels")
    public List<Channels> getChannels() {
        return List.of(Channels.values());
    }

    @PostMapping("/notifications")
    public Notification createNotification(@RequestBody Notification notification) {

        return service.save(notification);
    }

    @GetMapping("/notifications")
    public List<Notification> getAllNotifications() {
        return service.findAll();
    }

    @GetMapping("/notifications/{id}")
    public Notification getNotificationById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping("/notification/schedule")
    public Notification scheduleNotification(@RequestBody Notification notification) {
        // Aquí puedes implementar lógica para programar envío
        return service.save(notification);
    }
}
