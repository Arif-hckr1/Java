import java.util.Arrays;
public class Main2{
    public static void main(String[] args) {
        String[] habits = {"eat","drink","sleep"};
        String[][] schedule = {{"Walking"},{"Swimming"},{"Fishing"},{"Cinema"},{"Gym"},{"Sleeping"},{"Reading"}};
        Pet pet = new Pet("Rock",5,"dog",75,habits);
        Pet pet2 = new Pet("Jake",8,"dog",65,habits);
        Human mother=new Human("Jane","Karleone",1953);
        Human father=new Human("Vito","Karleone",1950);
        Human son=new Human("Michel","Karleone",1977,90,pet,father,mother,schedule);
        Human mother2=new Human("Victoria","Bradford",1985);
        Human father2= new Human("Karl","Bradford",1977);
        Human son2= new Human("Nolan","Bradford",2004,85,pet2,father2,mother2,schedule);
        System.out.println(pet);
        System.out.println(son);
        pet.eating();
        pet.responding();
        pet.faul();
        son.greetpet();
        son.describepet();
        son.feedPet(true);
        son.feedPet(false);
    }
}
