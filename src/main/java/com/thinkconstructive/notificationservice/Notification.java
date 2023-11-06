package com.thinkconstructive.notificationservice;

public class Notification {

    private String notificationId;

    private String notificationDetails;

    public Notification() {
    }

    public Notification(String notificationId, String notificationDetails) {
        this.notificationId = notificationId;
        this.notificationDetails = notificationDetails;
    }

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public String getNotificationDetails() {
        return notificationDetails;
    }

    public void setNotificationDetails(String notificationDetails) {
        this.notificationDetails = notificationDetails;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "notificationId='" + notificationId + '\'' +
                ", notificationDetails='" + notificationDetails + '\'' +
                '}';
    }
}
