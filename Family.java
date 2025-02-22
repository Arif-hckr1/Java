package HappyFamily2;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Objects;


public class Family {
    Human mother;
    Human father;
    Human[] children;
    Pet pet;

    public Family (Human mother, Human father, Human[] children, Pet pet){
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    static{
        System.out.println("A family class is being loaded");
    }
    {
        System.out.println("A new family object is created");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("The object or objects are being deleted");
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Əgər referenslər eynidirsə, true qaytar
        if (obj == null || getClass() != obj.getClass()) return false;
        Family family= (Family) obj;
        return mother.equals(family.mother)&&father.equals(family.father)&&children.equals(family.children)&&pet.equals(family.pet);
    }


    public Family(Human mother, Human father, Human[] children){
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    public void deleteChild(Human child) {
            int done=0;
            int lengthofarray = children.length;
            for(int index = 0; index< lengthofarray; index++) {
                if (children[index].getName().equals(child.getName())) {
                    Human temporary = children[index];
                    children[index] = children[children.length - 1];
                    children[children.length - 1] = temporary;
                    children=Arrays.copyOf(children, children.length - 1);
                    done=1;
                    if(index==children.length-1){break;}
                }
            }if(done==1){System.out.println("The object or objects are being removed");}else{System.out.println("The array remains unchanged"); }
    }

    public void deleteChild(int index) {
        int done=0;
        for(int i = 0; i< children.length; i++) {
            if (i==index) {
                Human temporary = children[index];
                children[index] = children[children.length - 1];
                children[children.length - 1] = temporary;
                children=Arrays.copyOf(children, children.length - 1);
                int lengthofarray = children.length;
                for(int j = 0; j < lengthofarray; j++) {
                    if(children[j].equals(temporary)){
                        Human temporary2 = children[j];
                        children[j] = children[children.length - 1];
                        children[children.length - 1] = temporary2;
                        children=Arrays.copyOf(children, children.length - 1);
                        if(j==children.length-1){break;}
                    }
                }
                done=1;
                break;
            }
        }if(done==1){System.out.println("The object or objects are being removed");}else{System.out.println("The array remains unchanged"); }
    }


    public void addChild() {
        Scanner sc = new Scanner(System.in);
        String newname="";
        String newsurname="";
        int newiq=-1;
        int newyear=-1;
        while(true) {
            System.out.println("Enter the name of the new child: ");
            if (!sc.hasNextInt()) {
                newname = sc.nextLine();
                if(newname.length()==0){System.out.println("Invalid input. Try again!");break;}
            }else{System.out.println("Invalid input. Try again!");break;}
            System.out.println("Enter the surname of the new child: ");
            if (!sc.hasNextInt()) {
                newsurname = sc.nextLine();
                if(newname.length()==0){System.out.println("Invalid input. Try again!");break;}
            }else{System.out.println("Invalid input. Try again!");break;}
            System.out.println("Enter the year of the new child: ");
            if (sc.hasNextInt()) {
                newyear = sc.nextInt();
                if(newyear==-1){System.out.println("Invalid input. Try again!");break;}
            }else{System.out.println("Invalid input. Try again!");break;}
            System.out.println("Enter the iq of the new child: ");
            if (sc.hasNextInt()) {
                newiq = sc.nextInt();
                if(newiq==-1){System.out.println("Invalid input. Try again!");break;}
                children=Arrays.copyOf(children, children.length +1);
                Human newchild = new Human(newname,newsurname,newiq,newyear);
                children[children.length - 1] = newchild;
                break;
            }else{System.out.println("Invalid input. Try again!");break;}
        }


    }

    public void addChild(String newname,String newsurname,int newiq,int newyear) {
        children=Arrays.copyOf(children, children.length +1);
        Human newchild = new Human(newname,newsurname,newiq,newyear);
        children[children.length - 1] = newchild;
    }

    public void countFamily(){
        int count=2;
        count+=children.length;
        System.out.print("\nThe number of the people in the family is: " + count + "\n");
    }

    public String toString(){
        System.out.println("\nFamily: ");
        int i=children.length-1;
        int t=1;
        System.out.println("Children: ") ;
        while (i>=0) {
            System.out.println( t+":" + children[i].toString());
            i--;
            t++;
        }
        System.out.println("\nParents: ");
        return "Mother: "+ mother.toString() + "\n" + "Father: "+ father.toString();
    }


    // Metodlarin bezisi ucun yazdim yenede , birde mainde funksiyalari cagiranda da test etmis oluruq
    @Test
    void test1(){
        Human child1 = new Human("Ferid");
        Human child2 = new Human("Kamal");

        Human children[]={child1,child2};
        Human mother = new Human();
        Human father = new Human();
        Family family1= new Family(mother, father, children);


        family1.deleteChild(1);
        assertEquals(1, family1.children.length, "Child count should be reduced by 1");
    }

    @Test
    void test3(){
        Human child1 = new Human("Ferid");
        Human child2 = new Human("Kamal");
        Human children[]={child1,child2};
        Human mother = new Human();
        Human father = new Human();
        Family family1= new Family(mother, father, children);
        family1.addChild("Nihad","Aliyev",34,20);
        assertEquals("Nihad", children[2].getName(), "One more child should be added to the list and his name should be Nihad");
    }

    @Test
    void test2(){
        Human child1 = new Human("Ferid");
        Human child2 = new Human("Kamal");

        Human children[]={child1,child2};
        Human mother = new Human();
        Human father = new Human();
        Family family1= new Family(mother, father, children);


        family1.deleteChild(child1);
        assertEquals("Kamal", children[0].getName(), "Only second Ferid should be removed");

    }

    @Test
    void test4(){
        Human child1 = new Human("Ferid","Aliyev",36,45);

        assertEquals("Human{name= Ferid, surname= Aliyev, year= 36, iq= 45}",child1.toString(),"Expected output should be like the provided one");

    }


}

