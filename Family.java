package HappyFamily2;
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

    public Family(Human mother, Human father, Human[] children){
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    public void deleteChild() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the child which you want to delete: ");
        if (!sc.hasNextInt()) {
            String newname = sc.nextLine();
            int done=0;
            for(int index = 0; index< children.length; index++) {
                if (children[index].getName().equals(newname)){
                    Human temporary = children[index];
                    children[index] = children[children.length - 1];
                    children[children.length - 1] = temporary;
                    children=Arrays.copyOf(children, children.length - 1);
                    for (int i=0; i<children.length; i++){
                        if (children[i].equals(temporary)){
                            Human temporary2 = children[i];
                            children[i] = children[children.length - 1];
                            children[children.length - 1] = temporary2;
                            children=Arrays.copyOf(children, children.length - 1);
                        }
                    }
                    done=1;

                }
            }if(done==1){System.out.println("true");}else{System.out.println("false"); }
        }else{System.out.println("Invalid input! Try again!");}
    }


    public void addChild() {
        Scanner sc = new Scanner(System.in);
        String newname="";
        String newsurname="";
        int newiq=0;
        int newyear=0;
        while(true) {
            System.out.println("Enter the name of the new child: ");
            if (!sc.hasNextInt()) {
                newname = sc.nextLine();
            }else{System.out.println("Invalid input. Try again!");break;}
            System.out.println("Enter the surname of the new child: ");
            if (!sc.hasNextInt()) {
                newsurname = sc.nextLine();
            }else{System.out.println("Invalid input. Try again!");break;}
            System.out.println("Enter the year of the new child: ");
            if (sc.hasNextInt()) {
                newyear = sc.nextInt();
            }else{System.out.println("Invalid input. Try again!");break;}
            System.out.println("Enter the iq of the new child: ");
            if (sc.hasNextInt()) {
                newiq = sc.nextInt();
                children=Arrays.copyOf(children, children.length +1);
                Human newchild = new Human(newname,newsurname,newiq,newyear);
                children[children.length - 1] = newchild;
                break;
            }else{System.out.println("Invalid input. Try again!");break;}
        }

        Human nextchild = new Human(newname,newsurname,newyear,newiq);

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
            System.out.println( t+":" + children[i].toString() + "");
            i--;
            t++;
        }
        System.out.println("\nParents: ");
        return "Mother: "+ mother.toString() + "\n" + "Father: "+ father.toString();
    }



}

