

import java.util.Random;
import java.util.List;
import java.util.Arrays;

enum Species {
    FISH, DOG, DOMESTIC_CAT, ROBO_CAT, UNKNOWN;
}

abstract class Pet {
    protected Species species;
    
    public Pet(Species species) {
        this.species = (species != null) ? species : Species.UNKNOWN;
    }
    
    public void eat() {
        System.out.println("I am eating...");
    }
    
    public abstract void respond();
}

interface Foulable {
    void foul();
}

class Fish extends Pet {
    public Fish() {
        super(Species.FISH);
    }
    
    @Override
    public void respond() {
        System.out.println("Blub blub! I am a fish!");
    }
}

class Dog extends Pet implements Foulable {
    public Dog() {
        super(Species.DOG);
    }
    
    @Override
    public void respond() {
        System.out.println("Woof! I am your dog!");
    }
    
    @Override
    public void foul() {
        System.out.println("I need to be trained!");
    }
}

class DomesticCat extends Pet implements Foulable {
    public DomesticCat() {
        super(Species.DOMESTIC_CAT);
    }
    
    @Override
    public void respond() {
        System.out.println("Meow! I am your cat!");
    }
    
    @Override
    public void foul() {
        System.out.println("Oops, I made a mess...");
    }
}

class RoboCat extends Pet {
    public RoboCat() {
        super(Species.ROBO_CAT);
    }
    
    @Override
    public void respond() {
        System.out.println("Beep Boop! I am a RoboCat!");
    }
}

abstract class Human {
    protected String name;
    protected String surname;
    
    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    
    public abstract void greetPet();
}

final class Man extends Human {
    public Man(String name, String surname) {
        super(name, surname);
    }
    
    @Override
    public void greetPet() {
        System.out.println("Hey buddy! Good to see you!");
    }
    
    public void repairCar() {
        System.out.println("I'm repairing my car.");
    }
}

final class Woman extends Human {
    public Woman(String name, String surname) {
        super(name, surname);
    }
    
    @Override
    public void greetPet() {
        System.out.println("Hello my dear pet!");
    }
    
    public void makeup() {
        System.out.println("I'm doing my makeup.");
    }
}
interface HumanCreator {
    Human bornChild();
}
class Family implements HumanCreator {
    private Human father;
    private Human mother;
    private static final List<String> names = List.of("Alice", "Bob", "Charlie", "Diana");
    
    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
    }
    
    @Override
    public Human bornChild() {
        Random random = new Random();
        String childName = names.get(random.nextInt(names.size()));
        String surname = father.surname;
        
        if (random.nextBoolean()) {
            return new Man(childName, surname);
        } else {
            return new Woman(childName, surname);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.respond();
        dog.foul();
        
        Woman woman = new Woman("Rena", "Taghiyeva");
        Man man = new Man("Kamal", "Taghiyev");
        
        woman.greetPet();
        woman.makeup();
        
        man.greetPet();
        man.repairCar();
        
        Family family = new Family(man, woman);
        Human child = family.bornChild();
        System.out.println("New child born: " + child.name + " " + child.surname);
        
        Pet unknownPet = new Pet(null) {
            @Override
            public void respond() {
                System.out.println("I am an unknown creature!");
            }
        };
        System.out.println("Unknown pet species: " + unknownPet.species);
    }
}
