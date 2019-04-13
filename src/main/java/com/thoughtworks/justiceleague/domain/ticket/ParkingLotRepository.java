package com.thoughtworks.justiceleague.domain.ticket;

public interface ParkingLotRepository {
    ParkingLot find(Long parkingLotId);
    void save(ParkingLot parkingLot);
}
