package com.api.clinica.Entidad;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Genera getters, setters, equals, hascCode y toString
@NoArgsConstructor // genera un constructor vacio
@AllArgsConstructor // genera constructor con todos los atributos

@Entity
@Table(name = "Medico")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdMedico;
    private String Nombre;
    private String Apellidios;
    private int IdEspecialidad;
    private String HoraAtencion;
    private String Estado;
}
