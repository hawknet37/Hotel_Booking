package dev.hawknet37.hotel_booking.dto;

import lombok.Data;

@Data
public class UpdateHotelRequest {
    private String hotelName;
    private int rate;
}
