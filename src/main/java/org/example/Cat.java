package org.example;

public class Cat extends Animal {
    private boolean useCatTray ;

    public Cat(String name, int age, boolean useCatTray) {
        super(name, age);
        this.useCatTray = useCatTray;
    }


    @Override
    public void makeSound() {
        System.out.printf("%s says: mau-mau \n", name);
    }

    public void sleep() {
        System.out.printf("%s is sleaping\n", name);
    }
    public void Test(int i, String s) {}
}