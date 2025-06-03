package dev.hawknet37.hotel_booking.controller;


import dev.hawknet37.hotel_booking.dto.CreateBookingRequest;
import dev.hawknet37.hotel_booking.dto.UpdateBookingRequest;
import dev.hawknet37.hotel_booking.entity.BookingEntity;
import dev.hawknet37.hotel_booking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bookings")
public class BookingController {
    @Autowired
    BookingService bookingService;

    @GetMapping("/{bookingId}")
    BookingEntity getBookingById(@PathVariable Long bookingId){
        return bookingService.getBookingByBookingId(bookingId);
    }

    @GetMapping
    List<BookingEntity> getBookingById(){
        return bookingService.getAllBookings();
    }

    @PostMapping
    BookingEntity createBooking(@RequestBody CreateBookingRequest booking){
        return bookingService.createBooking(booking);
    }

    @DeleteMapping("/{bookingId}")
    String deleteBookingById(@PathVariable Long bookingId){
        return bookingService.deleteBookingById(bookingId);
    }

    @PatchMapping("/{bookingId}")
    BookingEntity updateBookingById(@PathVariable Long bookingId, @RequestBody UpdateBookingRequest booking){
        return bookingService.updateBookingById(bookingId, booking);
    }
}
