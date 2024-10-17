package org.launchcode.codingevents.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Objects;

public class Event {

    private int id;
    private static int nextId = 1;

    @NotBlank(message = "Name cannot be blank")
    @Size(min = 4,max = 30,message = "Name can be 4-30 characters long")
    private String name;

    @Size(max = 300,message = "Description cannot be longer than 300 characters")
    private String desc;

    @NotBlank
    @Email(message = "Enter a valid Email id")
    private String email;

    public Event(String name,String desc,String email) {
        this.name = name;
        this.desc = desc;
        this.email = email;
        this.id = nextId;
        nextId++;
    }

    public Event(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}