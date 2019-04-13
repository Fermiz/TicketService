package com.thoughtworks.justiceleague.infrastructure.impl;

import com.thoughtworks.justiceleague.domain.ticket.ParkingLot;
import com.thoughtworks.justiceleague.domain.ticket.ParkingLotRepository;
import com.thoughtworks.justiceleague.infrastructure.ParkingLotJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ParkingLotRepositoryJpaImpl implements ParkingLotRepository {

    private final ParkingLotJpaRepository repository;

    @Autowired
    public ParkingLotRepositoryJpaImpl(ParkingLotJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public ParkingLot find(Long parkingLotId) {
        return repository.findById(parkingLotId).orElse(null);
    }

    @Override
    public void save(ParkingLot parkingLot) {
        repository.saveAndFlush(parkingLot);
    }
}
