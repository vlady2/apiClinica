package com.api.clinica.Service;

import com.api.clinica.Entidad.Doctor;
import com.api.clinica.Repositori.DoctorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepositorio docRepository;

    public List<Doctor> obtenerTodos() {
        return docRepository.findAll();
    }

    public Doctor guardar(Doctor doctor) {
        return docRepository.save(doctor);
    }

    public void eliminar(Long id) {
        docRepository.deleteById(id);
    }
}
