package service;

import model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IDoctorRepo;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    IDoctorRepo doctorRepo;


    public void addDoctor(Doctor doc) {
        doctorRepo.save(doc);
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepo.findAll();
    }
}
