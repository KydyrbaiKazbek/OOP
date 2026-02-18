package prac3.problem1;

import java.util.Date;

class Cat extends Animal {
    final private Diet diet = Diet.CARNIVORES;

    public Cat(){
        super();
    }
    public Cat(Date date_of_birth, Gender gender, String current_owner){
        super(date_of_birth, gender, current_owner);
    }
    public Cat(String name, Date date_of_birth, Gender gender, String current_owner){
        super(date_of_birth, gender, current_owner);
        super.setName(name);
    }

    @Override
    public String toString(){
        return super.toString()+", type: cat, diet: "+diet;
    }
}