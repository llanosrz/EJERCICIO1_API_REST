package com.example.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "clientes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "El nombre no puede estar vacio.")
    @Size(min = 4, max = 25, message = "El nombre debe estar entre 4 y 25 caracteres.")
    
    private String nombre;
    private String apellidos;
    
    @PastOrPresent
    private LocalDate fechaAlta;

    private String imagenCliente;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    
    private Hotel hotel;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE ,mappedBy = "cliente")
    
    private List<Mascota> mascotas;

}
