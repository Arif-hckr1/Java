package HappyFamily4;

public final class Woman extends Human {
    public Woman(String name, String surname, int year, int iq, String[][] schedule) {
        super(name, surname, year, iq, schedule);
    }

    public void makeup() {
        System.out.println("I am doing my makeup");
    }

    @Override
    public void greetPet(Pet pet) {
        System.out.println("Hi, " + pet.getNickname() + "! You're so cute!");
    }
}
