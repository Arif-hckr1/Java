abstract class Creature {
    String type;
    public Creature(String type) {
        this.type = type;
    }

    abstract void makeNoise();
    public void eatFood() {
        System.out.println(type + " is eating food.");
    }
}
class Lion extends Creature {
    public Lion(String type) {
        super(type);
    }
    @Override
    void makeNoise() {
        System.out.println(type + " roars: Raaawr!");
    }
}
class Elephant extends Creature {
    public Elephant(String type) {
        super(type);
    }
    @Override
    void makeNoise() {
        System.out.println(type + " trumpets: Prrrrr!");
    }
}
public class Zoo {
    public static void main(String[] args) {
        Lion lion = new Lion("African Lion");
        Elephant elephant = new Elephant("Indian Elephant");

        lion.makeNoise();
        lion.eatFood();

        elephant.makeNoise();
        elephant.eatFood();
    }
}
