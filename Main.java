package HappyFamily2;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class Main{
    
    public static void main(String[] args) {
        // hem pet hemde family class ucun finalize yazmisam onlarda deletechild i isledende meselen silinen objectler barede melumat cixarir.
        //Human classda ise dediyiniz unsupportedoperationexception vermisem, burda gorunur ki gc cagirilsa da islemeye qoymur onu.
        //bu hisseni silib gotursek butun kod normal isleyir.
        for (int i = 0; i < 10_000_000; i++) {
            new Human("Person " + i);
            if (i % 10_000 == 0) {
                System.gc();
            }
        }//yuxaridaki kodu dirnaga alib sonra yoxlamaq olar

        Human Nergiz=new Human("Nergiz","Huseynova",1985,46,new String[][]{{"Walking"},{"Swimming"},{"Fishing"},{"Cinema"},{"Gym"},{"Sleeping"},{"Reading"}});
        Human Ferhad = new Human("Ferhad","Huseynov",1977,80,new String[][]{{"Swimming"},{"Fishing"},{"Cinema"},{"Gym"},{"Sleeping"},{"Reading"},{"Walking"}});
        Human Nihad = new Human("Nihad","Huseynov",2005);


        // sertde sadece main hissede yazin demisiz deye elave bir method funksiya filan yaratmadan sadece test ucun 1-ni example yazdim:
        System.out.println("Schedule of Ferhad: \n");
        for (Human.DayOfWeek day : Human.DayOfWeek.values()) {
            System.out.println(day + ": " + Ferhad.getSchedule()[day.ordinal()][0]);
        }

        System.out.println("\n");

        Human Ferid = new Human("Ferid","Elekberli",1976,76,new String[][]{{"Fishing"},{"Cinema"},{"Gym"},{"Sleeping"},{"Reading"},{"Walking"},{"Swimming"}});
        Human Huseyn= new Human("Huseyn","Elekberli",2004);
        Human Zehra = new Human("Zehra","Elekberli",1884,78,new String[][]{{"Cinema"},{"Gym"},{"Sleeping"},{"Reading"},{"Walking"},{"Swimming"},{"Fishing"}});
        Human Fatima = new Human("Fatima","Elekberli",2003);

        Pet pet2 = new Pet("Jake",3, Pet.Species.DOG,34,new String[]{"eat","drink","sleep"});
        Pet pet1 = new Pet("Lola",3, Pet.Species.CAT,45,new String[]{"drink","sleep","eat"});
        Human children1[] = {Nihad};
        Human children2[] = {Fatima,Huseyn};
        Family family1= new Family(Nergiz,Ferhad,children1);
        Family family2= new Family(Ferid,Zehra,children2);
        System.out.println(family1);
        family1.countFamily();
        System.out.println(family2);
        family2.countFamily();
        family2.deleteChild(1);
        family2.deleteChild(Fatima);
        System.out.println(family1);
        family1.countFamily();
        System.out.println(family2);
        family2.countFamily();


    }

}
