package org.example;

public class Dog extends Animal{
    private boolean hunt;

    public Dog(String name, int age, boolean isHunting) {
        super(name, age);
        this.hunt = isHunting;
    }


    @Override
    public void makeSound() {
        System.out.printf("%s says: Bau-bau", name);
    }

    public void run(){
        System.out.printf("%s is running", name);
    }

    @Override
    public String toString() {
        return "Dog " + name;
    }
}