package HappyFamily2;
import java.util.HashMap;
import java.util.Objects;


public class Human{
    enum DayOfWeek{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
    }

    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;

    public Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;

    }

    public Human(){}
    public Human(String name){}

    @Override
    protected void finalize() {
        throw new UnsupportedOperationException("finalise() is not allowed in this class");

    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setYear(int year){
        this.year = year;
    }

    public Human(String name,String surname,int year,int iq){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq=iq;
    }

    public int hashcode(){
        return Objects.hash(name, surname, year, iq);
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass()!=obj.getClass()) return false;
        Human child = (Human)obj;
        return year == child.getYear()&&name.equals(child.getName())&&surname.equals(child.getSurname())&&iq==child.getIq();
    }

    public Human(String name, String surname, int year){
        this.name = name;
        this.surname = surname;
        this.year=year;
    }


    public String getName() {return name;}
    public String getSurname() {return surname;}
    public int getYear() {return year;}
    public int getIq() {return iq;}
    public String[][] getSchedule() {return schedule;}

    public String toString(){
        return "Human{name= '"+name+"', surname= "+surname+", year= "+year+", iq= "+iq+ "}";
    }

}
