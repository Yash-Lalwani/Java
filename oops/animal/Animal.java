package animal;

abstract class Animal {
    protected String name;
    
    Animal (String name) {
        this.name = name;
    }

    // abstract Method no implementation
    abstract void makeSound();
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    } 
    @Override
    void makeSound() {
        System.out.println("The dog " + name + " says : Woof!");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    } 
    @Override
    void makeSound() {
        System.out.println("The cat " + name + " says : Meow!");
    }
}