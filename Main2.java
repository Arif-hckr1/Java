import java.util.Arrays;
public class Main2{
    public static void main(String[] args) {
        String[] habits = {"eat","drink","sleep"};
        String[][] schedule = {{"Walking"},{"Swimming"},{"Fishing"},{"Cinema"},{"Gym"},{"Sleeping"},{"Reading"}};
        Pet pet = new Pet("Rock",5,"dog",75,habits);
        Human mother=new Human("Jane","Karleone",1953);
        Human father=new Human("Vito","Karleone",1950);
        Human son=new Human("Michel","Karleone",1977,90,pet,father,mother,schedule);
        System.out.println(pet);
        System.out.println(son);
        pet.eating();
        pet.responding();
        pet.faul();
    }
}
