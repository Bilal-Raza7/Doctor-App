package model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

public class AuthenticationToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tokenId;
    private String tokenValue;
    private LocalDateTime tokenCreationDateTime;

    //mapping
    @OneToOne
    @JoinColumn(name = "fk_patient_Id")
    Patient patient;


    //create a parameterized constructor which takes patient as an argument
    public AuthenticationToken(Patient patient)
    {
        this.patient = patient;
        this.tokenValue = UUID.randomUUID().toString();
        this.tokenCreationDateTime = LocalDateTime.now();
    }

    public String getTokenValue() {
        return "";
    }

    public Object getPatient() {

    }
}
