package model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.enums.Qualification;
import model.enums.Specialization;

import java.util.List;

@Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    @JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,scope=Doctor.class,property="doctorId")
    public class Doctor {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long doctorId;
        private String doctorName;
        @Enumerated(EnumType.STRING)
        private Specialization specialization;
        @Pattern(regexp = "^[0-9]{10}$")
        private String doctorContactNumber;
        @Enumerated(EnumType.STRING)
        private Qualification qualification;
        @Min(value = 200)
        @Max(value = 2000)
        private Double doctorConsultationFee;

        @OneToMany(mappedBy = "doctor")
        List<Appointment> appointments;
    }

