package com.thoughtworks.justiceleague.domain.ticket;

import com.thoughtworks.justiceleague.domain.shared.ValueObject;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parking_lot")
@NoArgsConstructor
public class ParkingLot implements ValueObject<ParkingLot> {
    @Id
    private Long parkingLotId;

    public ParkingLot(Long parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public Long getParkingLotId() {
        return parkingLotId;
    }

    @Override
    public String toString() {
        return "ParkingLot{" + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        ParkingLot other = (ParkingLot) obj;
        return sameValueAs(other);
    }

    @Override
    public boolean sameValueAs(ParkingLot other) {
        return parkingLotId.equals(other.getParkingLotId());
    }
}
