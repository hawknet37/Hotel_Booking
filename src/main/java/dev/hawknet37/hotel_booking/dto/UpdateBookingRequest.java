package dev.hawknet37.hotel_booking.dto;

import lombok.Data;

@Data
public class UpdateBookingRequest {
    private String contactName;
    private String contactPhone;
    private String contactEmail;
    private int quantity;
}
