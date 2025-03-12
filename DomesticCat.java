package HappyFamily4;

public class DomesticCat extends Pet {
    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        setSpecies(Species.CAT);
    }

    @Override
    public void respond() {
        System.out.println("Meow!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }
}
