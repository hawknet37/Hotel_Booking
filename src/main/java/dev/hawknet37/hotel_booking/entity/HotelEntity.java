package dev.hawknet37.hotel_booking.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "hotel")
@Data
public class HotelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotel_id")
    private Long hotelId;

    @Size(min = 2, message = "Name cannot be left blank")
    @Column(name = "name")
    private String hotelName;

    @Column(name = "rate")
    private int rate;

    @Column(name = "status")
    private boolean status;

    @Column(name = "version")
    private int version;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "update_at")
    private LocalDate updateAt;

    @Column(name = "update_by")
    private String updateBy;

//    @JsonIgnore
    @OneToOne(mappedBy = "hotel")
    LocationEntity location;
}
