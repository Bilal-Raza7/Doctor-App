package repository;

import model.Appointment;
import model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppointmentRepo extends JpaRepository<Appointment,Long> {

    Appointment findFirstByPatient(Patient patient);
}