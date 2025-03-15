package lesson12;

public final class Student implements Comparable<Student> {

    public final Long id;
    public final String name;
    public final int grade;
    public final int birthdate;
    public final boolean isFemale;

    public Player(Long id, String name, int grade, int birthdate, boolean isFemale) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.birthdate = birthdate;
        this.isFemale = isFemale;
    }

    @Override
    public String toString() {
        return "{\"id:%d\",\"name\":\"%s\", \"grade\":\"%d\",  \"birthdate\":\"%d\", \"isFemale\":\"%s\"}"
                .formatted(id, name, grade, birthdate, isFemale);
    }

    @Override
    public int compareTo(Student that) {
        return Long.compare(this.id, that.id);
    }
}
