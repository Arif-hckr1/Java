package HappyFamily4;

public final class Man extends Human {
    public Man(String name, String surname, int year, int iq, String[][] schedule) {
        super(name, surname, year, iq, schedule);
    }

    public void repairCar() {
        System.out.println("I am repairing the car");
    }

    @Override
    public void greetPet(Pet pet) {
        System.out.println("Hey, " + pet.getNickname() + "! How's it going?");
    }
}
