package dev.hawknet37.hotel_booking.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CreateBookingRequest {
    private int user_id;
    private int hotel_id;
    private int room_type_id;
    private Date checkin_date;
    private Date checkout_date;
    private String payment_method;
    private String contactName;
    private String contactPhone;
    private String contactEmail;
    private int quantity;
}
