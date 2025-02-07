import java.util.Arrays;
public class Pet {
    private String nickname;
    private int age;
    private String species;
    private int trickLevel;
    private String[] habits;

    public Pet(String nickname, int age,String species, int trickLevel, String[] habits) {
        this.nickname = nickname;
        this.age = age;
        this.species = species;
        this.trickLevel = trickLevel;
        this.habits = habits;

    }
    public Pet(String species, String nickname){
        this.nickname = nickname;
        this.species= species;
    }
    public Pet(){}

    public String getNickname() {return nickname;}
    public int getAge() {return age;}
    public String getSpecies() {return species;}
    public int getTrickLevel() {return trickLevel;}
    public String[] getHabits() {return habits;}

    public void eating(){System.out.println("I am eating");}
    public void responding(){System.out.println("Hello, owner. I am " + nickname+ ". I miss you!");}
    public void faul(){System.out.println("I need to cover it up");}

    public String toString(){
        return species + "{nickname= '" + nickname + "', age= " + age + ", tricklevel = " + trickLevel + ", habits = " + Arrays.toString(habits) + "}";
    }

}
