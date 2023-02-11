import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
//    var myDoctor = new Doctor();
        Doctor myDoctor = new Doctor("jesus", "pediatria");
        Doctor myDoctor2 = new Doctor();
        Doctor myDoctor3 = new Doctor("juan", "cardiologo");
        myDoctor.name = "jesus gedler";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.baby);
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");
        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
//  la sobrecarga permite nombrar varias funciones con el mismo nombre en los cuales se le puede cambiar los parametros, los tipos y el retorno para variar la logica de negocio
//        showMenu();
        Patient patient = new Patient("alejandra","aeljandra@gmail.com");
        patient.setWeight(54.5);
        System.out.println(patient.getWeight() );

    }
}








