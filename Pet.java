package HappyFamily2;

import java.util.Arrays;
import java.util.Objects;


public class Pet {
    enum Species{
        CAT(false,4,true),DOG(false,4,true),LION(false,4,true),EAGLE(true,2,true);

        private boolean canFly;
        private boolean hasFur;
        private int numberOfLegs;

        Species(boolean canFly,int numberOfLegs, boolean hasFur){
            this.canFly=canFly;
            this.numberOfLegs=numberOfLegs;
            this.hasFur=hasFur;
        }
        public boolean getcanFly(){return canFly;}
        public int getnumberOfLegs(){return numberOfLegs;}
        public boolean gethasFur(){return hasFur;}

    }
    private String nickname;
    private int age;
    private Species species;
    private int trickLevel;
    private String[] habits;

    public Pet(String nickname, int age,Species species, int trickLevel, String[] habits) {
        this.nickname = nickname;
        this.age = age;
        this.species = species;
        this.trickLevel = trickLevel;
        this.habits = habits;

    }
    public Pet(Species species, String nickname){
        this.nickname = nickname;
        this.species= species;
    }

    public Pet(){}

    @Override
    protected void finalize() {
        System.out.println("The object or objects are being deleted");
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pet pet= (Pet) obj;
        return nickname.equals(pet.nickname)&&age==pet.age&&species.equals(pet.species)&&trickLevel==pet.trickLevel;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSpecies(Species species) {
        this.species = species;
    }
    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }
    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public String getNickname() {return nickname;}
    public int getAge() {return age;}
    public Species getSpecies() {return species;}
    public int getTrickLevel() {return trickLevel;}
    public String[] getHabits() {return habits;}


    public void eating(){System.out.println("I am eating");}
    public void responding(){System.out.println("Hello, owner. I am " + nickname+ ". I miss you!");}
    public void faul(){System.out.println("I need to cover it up");}

    public String toString(){
        System.out.println("Type: -> " + species +"\n"+ "Can the pet fly: -> " + species.getcanFly() +"\n" + "Does the pet have fur: -> " + species.gethasFur() +"\n"+ "How many legs does the pet have: -> " + species.getnumberOfLegs());
        return "{nickname= '" + nickname + "', age= " + age + ", tricklevel = " + trickLevel + ", habits = " + Arrays.toString(habits) + "}";
    }

}
