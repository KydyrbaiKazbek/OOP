package prac3.problem1;

import java.util.ArrayList;
import java.util.Date;

public class Animal {
    private final Date date_of_birth;
    private static int new_ID = 1000000;
    private final int ID = new_ID;
    private Gender gender;
    private String current_owner;
    private ArrayList<String> owners = new ArrayList<>();
    private String name;

    {
        new_ID++;
    }

    public Animal(){
        date_of_birth = new Date();
        gender = null;
        current_owner = "Vet Clinic";
        owners.add(current_owner);
        name = null;
    }
    public Animal(Date date_of_birth, Gender gender, String current_owner){
        this.date_of_birth = date_of_birth;
        this.gender = gender;
        this.current_owner = current_owner;
        this.owners.add(current_owner);
        this.name = null;
    }

    public void setName(String name) {
        if (!(name.isBlank()) && validateName(name)) {
            this.name = Character.toUpperCase(name.charAt(0)) + name.substring(1).toLowerCase();
        }else{System.err.println("Invalid name. Name was not set.");}
    }

    public static Boolean validateName(String name){
        for (char c : name.toCharArray()){
            if (!Character.isLetter(c)) return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return String.format("Animal's name is %s. ID: %d, Gender: %s", name, ID,gender);
    }
}