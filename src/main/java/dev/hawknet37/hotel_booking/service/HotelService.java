package dev.hawknet37.hotel_booking.service;

import dev.hawknet37.hotel_booking.dto.CreateHotelRequest;
import dev.hawknet37.hotel_booking.dto.UpdateHotelRequest;
import dev.hawknet37.hotel_booking.entity.HotelEntity;
import dev.hawknet37.hotel_booking.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class HotelService {
    @Autowired
    HotelRepository hotelRepository;

    public HotelEntity getHotelById(Long hotelId){
        return hotelRepository.findByHotelId(hotelId);
    }

    public List<HotelEntity> getAllHotels(){
        return hotelRepository.findAll();
    }

    public HotelEntity createHotel(CreateHotelRequest request){
        HotelEntity hotel = new HotelEntity();
        hotel.setHotelName(request.getHotelName());
        hotel.setRate(request.getRate());
        hotel = hotelRepository.save(hotel);
        return hotel;
    }

//    public HotelEntity updateHotelById(Long hotelId, UpdateHotelRequest request){
//        HotelEntity hotel = hotelRepository.findByHotelId(hotelId);
//
//        if(hotel == null)
//            return null;
//        hotel.setHotelName(request.getHotelName());
//        hotel.setRate(request.getRate());
//        hotel = hotelRepository.save(hotel);
//        return hotel;
//    }
//
//    public String deleteOrDisableHotel(boolean isStatus, Long hotelId){
//        HotelEntity hotel = hotelRepository.findByHotelId(hotelId);
//
//        if(hotel == null)
//            return null;
//
//        if(isStatus){
//            hotelRepository.delete(hotel);
//            return "Delete successful";
//        }
//        else{
//            hotel.setStatus(false);
//            hotel = hotelRepository.save(hotel);
//            return "Disable successful";
//        }
//    }
}
