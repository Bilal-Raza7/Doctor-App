package repository;



import model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepo extends JpaRepository<Admin,Long> {
}
