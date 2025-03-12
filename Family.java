package HappyFamily4;

import java.util.Arrays;
import java.util.Random;

public class Family implements HumanCreator {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public Family(Human mother, Human father, Human[] children) {
        this(mother, father, children, null);
    }

    @Override
    public Human bornChild() {
        Random random = new Random();
        String[] boyNames = {"John", "Michael", "David"};
        String[] girlNames = {"Emma", "Olivia", "Ava"};
        String name = random.nextBoolean() ? boyNames[random.nextInt(boyNames.length)] : girlNames[random.nextInt(girlNames.length)];
        int iq = (mother.getIq() + father.getIq()) / 2;
        Human child = random.nextBoolean() ? new Man(name, father.getSurname(), 2023, iq, null) : new Woman(name, father.getSurname(), 2023, iq, null);
        addChild(child);
        return child;
    }

    public void addChild(Human child) {
        children = Arrays.copyOf(children, children.length + 1);
        children[children.length - 1] = child;
    }

    public void countFamily() {
        int count = 2 + children.length;
        System.out.println("The number of the people in the family is: " + count);
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }
}
