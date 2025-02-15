package HappyFamily2;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class Main{
    public static void main(String[] args) {
        Human Nergiz=new Human("Nergiz","Huseynova",1985,46,new String[][]{{"Walking"},{"Swimming"},{"Fishing"},{"Cinema"},{"Gym"},{"Sleeping"},{"Reading"}});
        Human Ferhad = new Human("Ferhad","Huseynov",1977,80,new String[][]{{"Swimming"},{"Fishing"},{"Cinema"},{"Gym"},{"Sleeping"},{"Reading"},{"Walking"}});
        Human Nihad = new Human("Nihad","Huseynov",2005);

        Human Ferid = new Human("Ferid","Elekberli",1976,76,new String[][]{{"Fishing"},{"Cinema"},{"Gym"},{"Sleeping"},{"Reading"},{"Walking"},{"Swimming"}});
        Human Huseyn= new Human("Huseyn","Elekberli",2004);
        Human Zehra = new Human("Zehra","Elekberli",1884,78,new String[][]{{"Cinema"},{"Gym"},{"Sleeping"},{"Reading"},{"Walking"},{"Swimming"},{"Fishing"}});
        Human Fatima = new Human("Fatima","Elekberli",2003);

        Pet pet2 = new Pet("Jake",3,"dog",34,new String[]{"eat","drink","sleep"});
        Pet pet1 = new Pet("Lola",3,"cat",45,new String[]{"drink","sleep","eat"});

        Human children1[] = {Nihad};
        Human children2[] = {Fatima,Huseyn};
        Family family1= new Family(Nergiz,Ferhad,children1);
        Family family2= new Family(Ferid,Zehra,children2);
        System.out.println(family1);
        family1.countFamily();
        System.out.println(family2);
        family2.countFamily();
        family1.addChild();
        family2.deleteChild();
        System.out.println(family1);
        family1.countFamily();
        System.out.println(family2);
        family2.countFamily();


    }

}
