package HappyFamily4;

import java.util.Arrays;
import java.util.Objects;

public abstract class Pet {
    enum Species {
        CAT(false, 4, true), DOG(false, 4, true), LION(false, 4, true), EAGLE(true, 2, true), FISH(false, 0, false), ROBOCAT(false, 4, true), UNKNOWN(false, 0, false);

        private boolean canFly;
        private boolean hasFur;
        private int numberOfLegs;

        Species(boolean canFly, int numberOfLegs, boolean hasFur) {
            this.canFly = canFly;
            this.numberOfLegs = numberOfLegs;
            this.hasFur = hasFur;
        }

        public boolean getCanFly() { return canFly; }
        public int getNumberOfLegs() { return numberOfLegs; }
        public boolean getHasFur() { return hasFur; }
    }

    private String nickname;
    private int age;
    private Species species;
    private int trickLevel;
    private String[] habits;

    public Pet(String nickname, int age, int trickLevel, String[] habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
        this.species = Species.UNKNOWN;
    }

    public Pet(String nickname) {
        this.nickname = nickname;
        this.species = Species.UNKNOWN;
    }

    public Pet() {
        this.species = Species.UNKNOWN;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public Species getSpecies() {
        return species;
    }

    public void eating() {
        System.out.println("I am eating");
    }

    public abstract void respond();

    @Override
    public String toString() {
        return "{nickname= '" + nickname + "', age= " + age + ", tricklevel = " + trickLevel + ", habits = " + Arrays.toString(habits) + "}";
    }
}
