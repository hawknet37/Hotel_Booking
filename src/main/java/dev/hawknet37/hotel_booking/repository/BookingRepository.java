package dev.hawknet37.hotel_booking.repository;

import dev.hawknet37.hotel_booking.entity.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<BookingEntity, Long> {
    BookingEntity findByBookingId(Long bookingId);
}
