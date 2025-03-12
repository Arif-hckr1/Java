package HappyFamily4;

public class RoboCat extends Pet {
    public RoboCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        setSpecies(Species.ROBOCAT);
    }

    @Override
    public void respond() {
        System.out.println("Beep boop!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }
}
