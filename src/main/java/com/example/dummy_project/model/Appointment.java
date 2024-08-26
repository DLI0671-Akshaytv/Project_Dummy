package com.example.dummy_project.model;

public class Appointment {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String date;
    private String time;
    private String message;

    public Appointment() {
    }

    public Appointment(Long id, String name, String email, String phone, String date, String time, String message) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.date = date;
        this.time = time;
        this.message = message;
    }

}
