public class Main {
    public static void main(String[] args){
        Teacher teacher1 = new Teacher("Arif","Hajiyev",20,"Cyber Security",2);

        System.out.println("Teacher: " + teacher1.getName() + " " + teacher1.getSurname());
        System.out.println("Age: " + teacher1.getAge());
        System.out.println("Specialty: " + teacher1.getSpecialty());
        System.out.println("Years of Experience: "+ teacher1.getYearsofExperienece());

        teacher1.checkQuestions();
        teacher1.teachLesson();
        teacher1.giveHomework();
    }
}
