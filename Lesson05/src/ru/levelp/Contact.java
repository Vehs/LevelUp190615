package ru.levelp;

/**
 * Created by vladimir on 07.07.15.
 */
/*
private - позволяет скрыть доступ к полю/методу из другого класса
public - обратно private
"default"
protected - применяется в наследовании
 */
public class Contact {
    private static int count = 0;
    private String name;
    private String phone;
    private String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        count++;
    }

    public void print() {
        System.out.println(name + " " + phone + " " + email);
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public static int getCount() {
        return count;
    }

    public void setName(String name) {
//        if (name == null)
//            return;
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
