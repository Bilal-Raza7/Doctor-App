package repository;

import model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDoctorRepo  extends JpaRepository<Doctor,Long> {
}
