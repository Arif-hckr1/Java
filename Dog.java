package HappyFamily4;

public class Dog extends Pet {
    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        setSpecies(Species.DOG);
    }

    @Override
    public void respond() {
        System.out.println("Woof!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }
}
