package com.api.clinica.Controller;

import com.api.clinica.Entidad.Doctor;
import com.api.clinica.Repositori.DoctorRepositorio;
import com.api.clinica.Service.DoctorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/medicos")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @Autowired
    private DoctorRepositorio doctorRepositorio;

    @GetMapping
    public List<Doctor> listarDoctor() {
        return doctorService.obtenerTodos();
    }

    @PostMapping
    public Doctor crearDoctor(@RequestBody Doctor doc) {
        return doctorService.guardar(doc);
    }

    @DeleteMapping("/{id}")
    public String eliminarUsuario(@PathVariable Long id) {
        doctorRepositorio.findById(id)
                .map(Doctor -> {
                    doctorRepositorio.delete(Doctor);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());

        return "El usuario " + id + " no existe.";
    }
}
