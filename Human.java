import java.util.Random;
public class Human{
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

    public Human(String name, String surname, int year, int iq, Pet pet, Human father, Human mother, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.father = father;
        this.mother = mother;
        this.schedule = schedule;

    }

    public Human(){}

    public Human(String name,String surname,int year, Human father, Human mother){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String surname, int year){
        this.name = name;
        this.surname = surname;
        this.year=year;
    }


    public String getName() {return name;}
    public String getSurname() {return surname;}
    public int getYear() {return year;}
    public int getIq() {return iq;}
    public Pet getPet() {return pet;}
    public Human getMother() {return father;}
    public Human getFather() {return father;}
    public String[][] getSchedule() {return schedule;}

    public void greetpet(){System.out.println("Hello, "+pet.getNickname());}

    String issly(Pet pet){
        if(pet.getTrickLevel()>50){
            return "very sly" ;
        }else{return "almost not sly";}
    }
    public void describepet(){System.out.println("I have an "+pet.getSpecies()+" which is "+pet.getAge()+ " years old, he is " + issly(pet));}

    public boolean feedPet(boolean isittimeforfeeding){
        Random rand=new Random();
        int number = rand.nextInt(101);
        if(isittimeforfeeding || pet.getTrickLevel()>number){
            System.out.println("Hm... I will feed " + pet.getNickname());
            return true;
        }else{
            System.out.println("I think " + pet.getNickname() +" is not hungry");
            return false;
        }
    }

    public String toString(){
        return "Human{name= '"+name+"', surname= "+surname+", year= "+year+", iq= "+iq+", mother= "+mother.name+" "+mother.surname+", father= "+father.name+" "+father.surname+", pet= "+pet + "}";
    }

}
