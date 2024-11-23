package com.api.clinica.Repositori;

import com.api.clinica.Entidad.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepositorio extends JpaRepository<Doctor, Long> {
}
