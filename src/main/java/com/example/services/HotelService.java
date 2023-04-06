package com.example.services;

import java.util.List;

import com.example.entities.Hotel;

public interface HotelService {

    public List<Hotel> findAll();
    public Hotel findById(long id);
    public void save(Hotel hotel);
    public void delete(Hotel hotel);
}
