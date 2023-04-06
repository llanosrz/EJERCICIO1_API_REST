package com.example.services;

import java.util.List;

import com.example.entities.Mascota;

public interface MascotaService {
    
    public List<Mascota> findAll();
    public Mascota findById(long id);
    public void save(Mascota mascota);
    public void delete(Mascota mascota);

}
