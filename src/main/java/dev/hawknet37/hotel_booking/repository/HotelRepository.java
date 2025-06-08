package dev.hawknet37.hotel_booking.repository;

import dev.hawknet37.hotel_booking.entity.HotelEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HotelRepository extends JpaRepository<HotelEntity, Long> {
    @EntityGraph(attributePaths = {"location"})
    Optional<HotelEntity> findByHotelId(Long hotelId);

    boolean existsByHotelName(String hotelName);
}
