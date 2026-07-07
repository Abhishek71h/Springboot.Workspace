package com.core.service;

public class UserServiceImpl implements UserService{

//  Here notificationService is injected using Setter injection
    private NotificationService notificationService;

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void registerUser(String name) {
        System.out.println("User Registered: " + name);
        notificationService.sendNotification("Welcome " + name);
    }
}