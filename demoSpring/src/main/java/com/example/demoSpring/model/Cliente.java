package com.example.demoSpring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "clientes")
@Data
@NoArgsConstructor
public class Cliente extends Persona {
    private String clienteid;
    private String contrasena;
    private boolean estado;
}
