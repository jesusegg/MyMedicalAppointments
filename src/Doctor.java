import static java.lang.Math.*;
import java.util.ArrayList;
import java.util.Date;
public class Doctor {
    //funcion constructora de la clase de llama igual y recibe los parametros
   Doctor(){
       System.out.println("creando doctor");
   }
    Doctor(String name, String specility){
    id++;
    this.name=name;
    this.specialty=specility;
    }
    //atributos
    static int id = 0; //autoincrementado

    String name;
    String specialty;
    static String baby = "patnyjow";
    //comportamientos
    public void showName(){
        System.out.println(name);
      //  var n = PI;
    }
    public void showId(){
        System.out.println("ID doctor: " + id);
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
