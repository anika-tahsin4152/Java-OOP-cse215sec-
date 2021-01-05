/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hridi
 */
public class Patient {

    private String name;
    private int age;
    private String disease;

    public Patient(String name, int age, String disease) throws InvalidNameException {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot ...");
        }
        this.age = age;
    }

    public void setName(String name) throws InvalidNameException {
        if (name.length() < 3) {
            throw new InvalidNameException(name + " is too short...");
        }
        this.name = name;
    }

    public String setDisease() {
        return disease;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    @Override
    public String toString() {
        return "Patient{" + "name=" + name + ", age=" + age + ", disease=" + disease + '}';
    }

}
