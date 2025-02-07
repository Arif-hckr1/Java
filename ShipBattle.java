import java.util.Scanner;
import java.util.Random;

public class ShipBattle{
    public static void main (String[] args) {
        String[][] field = new String[6][6];
        field[0][0] = "0";
        for (int i = 1; i < 6; i++) {
            field[i][0] = Integer.toString(i);
        }
        for (int i = 1; i < 6; i++) {
            field[0][i] = Integer.toString(i);
        }
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                field[i][j] = "-";
            }
        }
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int mainline = rand.nextInt(6);
        int mainbar = rand.nextInt(6);
        int line;
        int bar;
        System.out.println("All set. Get ready to rumble!");
        System.out.println("The Grid is shown and the target is chosen by the system....");
        DisplayField(field);
        while (true) {

            System.out.println("Enter the line for fire(from 1 to 5): ");
            if (sc.hasNextInt()){
                int a=sc.nextInt();
                if(a>0 && a<6){
                    line = a;sc.nextLine();}else{System.out.println("Invalid input, Please Try Again! ");continue;}
            }else{System.out.println("Invalid input, Please Try Again! ");sc.nextLine();continue;}

            System.out.println("Enter the shooting bar (from 1 to 5): ");
            if (sc.hasNextInt()){
                int b=sc.nextInt();
                if(b>0 && b<6){
                    bar = b;sc.nextLine();}else{System.out.println("Invalid input, Please Try Again! ");continue;}
            }else{System.out.println("Invalid input, Please Try Again! ");sc.nextLine();continue;}

            if (line == mainline && bar == mainbar) {
                System.out.println("You won!");
                field[line][bar] = "x";
                // AreaShooting feature
                if (line-1>0 && line+1<6){field[line-1][bar] = "x";field[line+1][bar] = "x";}
                else if(bar+1<6 && bar-1>0){field[line][bar-1]="x";field[line][bar+1]="x";}
                else if (line==1 && bar==1){field[1][2]="x";field[2][1]="x";}
                else if (line==1 && bar==5){field[1][4]="x";field[2][5]="x";}
                else if (line==5 && bar==1){field[4][1]="x";field[5][2]="x";}
                else if (line==5 && bar==5){field[5][4]="x";field[4][5]="x";}


                DisplayField(field);
                mainline = rand.nextInt(6);
                mainbar = rand.nextInt(6);
                System.out.println("New game starts...");
                System.out.println("All set. Get ready to rumble!");
                System.out.println("The Grid is shown and the target is chosen by the system....");
                for (int i = 1; i < 6; i++) {
                    for (int j = 1; j < 6; j++) {
                        field[i][j] = "-";
                    }
                }
                DisplayField(field);

            } else {
                field[line][bar] = "*";
                DisplayField(field);
            }
        }

    }


    public static void DisplayField(String[][] field){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                System.out.print(field[i][j] + " | ");
            }
            System.out.println();
        }
    }

}
