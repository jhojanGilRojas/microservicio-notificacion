package org.example.controllers;


import lombok.RequiredArgsConstructor;
import org.example.dto.MessageDTO;
import org.example.model.Notification;
import org.example.model.enums.Channels;
import org.example.service.interfaces.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService service;



    @GetMapping("/notifications/channels")
    public List<Channels> getChannels() {
        return List.of(Channels.values());
    }

    @PostMapping("/notifications")
    public ResponseEntity<MessageDTO> createNotification(@RequestBody Notification notification) {

        return ResponseEntity.ok(new MessageDTO<>(false,"Notification create successfully"));
    }

    @GetMapping("/notifications")
    //Aqui debo paginar
    public List<Notification> getAllNotifications() {
        return service.findAll();
    }

    @GetMapping("/notifications/{id}")
    public Notification getNotificationById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping("/notification/schedule")
    public ResponseEntity<MessageDTO> scheduleNotification(@RequestBody Notification notification) {
        // Aquí puedes implementar lógica para programar envío debo realizarlo por mail y por SMS
        return ResponseEntity.ok(new MessageDTO<>(false,"Send notification"));
    }
}
