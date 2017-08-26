package com.zoo.animals;

public class Tiger extends Animal {

    public Tiger() {
        this("defaultTigerName", 3);

        // instancja klasy bazowej - super
        // super(70);
        //super();
        System.out.println("Hello from Tiger constructor");
    }

    public Tiger(String name, Integer hungerLevel) {
        super(hungerLevel);
        setName(name);
        System.out.println("Hello from Tiger hunger name constructor");
    }

    public Tiger(String name) {
        super();
        setName(name);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("I'm Tiger - I'm moving very fast");

    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Wrrrrrrrrrrrr !!!!!");

    }
}
