package dev.hawknet37.hotel_booking.service;


import dev.hawknet37.hotel_booking.dto.CreateBookingRequest;
import dev.hawknet37.hotel_booking.dto.UpdateBookingRequest;
import dev.hawknet37.hotel_booking.entity.BookingEntity;
import dev.hawknet37.hotel_booking.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    @Autowired
    BookingRepository bookingRepository;

    public BookingEntity getBookingByBookingId(Long bookingId){
        return bookingRepository.findByBookingId(bookingId);
    }

    public List<BookingEntity> getAllBookings(){
        return bookingRepository.findAll();
    }

    public BookingEntity createBooking(CreateBookingRequest request){
        BookingEntity booking = new BookingEntity();
        booking.setContactName(request.getContactName());
        booking.setContactPhone(request.getContactPhone());
        booking.setContactEmail(request.getContactEmail());

        bookingRepository.save(booking);
        return booking;
    }

    public String deleteBookingById(Long bookingId){
        BookingEntity booking = bookingRepository.findByBookingId(bookingId);

        if(booking == null){
            return null;
        }

        bookingRepository.delete(booking);
        return "Delete successful";
    }

    public BookingEntity updateBookingById(Long bookingId, UpdateBookingRequest request){
        BookingEntity booking = bookingRepository.findByBookingId(bookingId);

        if(booking == null){
            return null;
        }

        booking.setContactEmail(request.getContactEmail());
        booking.setContactName(request.getContactName());
        booking.setContactPhone(request.getContactPhone());
        booking.setQuantity(request.getQuantity());

        bookingRepository.save(booking);
        return booking;
    }
}
