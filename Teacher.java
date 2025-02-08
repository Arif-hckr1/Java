public class Teacher{
    private String name;
    private String surname;
    private int age;
    private String specialty;
    private int yearsofexperience;

    public Teacher(String name, String surname, int age, String specialty, int yearsofexperience){
        this.name = name;
        this.surname  = surname;
        this.age= age;
        this.specialty = specialty;
        this.yearsofexperience = yearsofexperience;
    }

    public String getName() { return name; }
    public String getSurname() { return surname; }
    public int getAge() { return age; }
    public String getSpecialty() { return specialty; }
    public int getYearsofExperienece() {return yearsofexperience; }

    public void checkQuestions(){
        System.out.println(name + " is checking questions.");
    }
    public void teachLesson(){
        System.out.println(name + " is teaching a lesson on "+ specialty + ".");
    }
    public void giveHomework(){
        System.out.println(name + " is giving homework.");
    }
}
