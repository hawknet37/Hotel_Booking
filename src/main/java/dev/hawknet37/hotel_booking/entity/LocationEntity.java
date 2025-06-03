package dev.hawknet37.hotel_booking.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Location")
@Data
public class LocationEntity {
    @Id
    @GeneratedValue
    @Column(name = "location_id")
    private Long locationId;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "province")
    private String province;

    @Column(name = "nation")
    private String nation;

    @Column(name = "postal_code")
    private String zip;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hotel_id", referencedColumnName = "hotel_id")
    @JsonIgnore
    HotelEntity hotel;
}
