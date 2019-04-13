package com.thoughtworks.justiceleague.infrastructure;

import com.thoughtworks.justiceleague.domain.ticket.ParkingLot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingLotJpaRepository extends JpaRepository<ParkingLot, Long> {
}
