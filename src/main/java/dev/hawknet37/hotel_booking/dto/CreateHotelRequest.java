package dev.hawknet37.hotel_booking.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class CreateHotelRequest {
    private String hotelName;
    private int rate;
    private boolean status;
    private int version;
    private LocalDate createdAt;
    private String createdBy;
    private LocalDate updateAt;
    private String updateBy;
}
