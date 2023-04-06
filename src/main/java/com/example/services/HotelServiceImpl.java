package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.HotelDao;
import com.example.entities.Hotel;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelDao hotelDao;

    @Override
    public List<Hotel> findAll() {
        return hotelDao.findAll();
    }

    @Override
    public Hotel findById(long id) {
        return hotelDao.findById(id).get();
    }

    @Override
    public void save(Hotel hotel) {
        hotelDao.save(hotel);
    }

    @Override
    public void delete(Hotel hotel) {
        hotelDao.delete(hotel);
    }
    
}
