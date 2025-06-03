package dev.hawknet37.hotel_booking.controller;

import dev.hawknet37.hotel_booking.dto.CreateHotelRequest;
import dev.hawknet37.hotel_booking.dto.UpdateHotelRequest;
import dev.hawknet37.hotel_booking.entity.HotelEntity;
import dev.hawknet37.hotel_booking.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/hotels")
public class HotelController {
    @Autowired
    HotelService hotelService;

    @GetMapping("/{hotelId}")
    HotelEntity getHotelById(@PathVariable Long hotelId){
        return hotelService.getHotelById(hotelId);
    }

    @GetMapping
    List<HotelEntity>getAllHotels(){
        return hotelService.getAllHotels();
    }

    @PostMapping
    HotelEntity createHotel(@RequestBody CreateHotelRequest hotel){
        return hotelService.createHotel(hotel);
    }

//    @PatchMapping("/{hotelId}")
//    HotelEntity updateHotelById(@PathVariable Long hotelId, @RequestBody UpdateHotelRequest hotel){
//        return hotelService.updateHotelById(hotelId, hotel) ;
//    }
//
//    @DeleteMapping
//    String deleteOrDisableHotel(@RequestParam(required = false) boolean isStatus, @RequestParam(required = false) Long hotelId){
//        return hotelService.deleteOrDisableHotel(isStatus, hotelId);
//    }
}
