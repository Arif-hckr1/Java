package HappyFamily4;

public class Main {
    public static void main(String[] args) {
        Human mother = new Woman("Nergiz", "Huseynova", 1985, 46, new String[][]{{"Walking"}, {"Swimming"}, {"Fishing"}, {"Cinema"}, {"Gym"}, {"Sleeping"}, {"Reading"}});
        Human father = new Man("Ferhad", "Huseynov", 1977, 80, new String[][]{{"Swimming"}, {"Fishing"}, {"Cinema"}, {"Gym"}, {"Sleeping"}, {"Reading"}, {"Walking"}});
        Human[] children = new Human[0];
        Family family = new Family(mother, father, children);

        Pet pet = new Dog("Jake", 3, 34, new String[]{"eat", "drink", "sleep"});
        family.bornChild();
        family.bornChild();
        family.countFamily();

        System.out.println(family);
    }
}
