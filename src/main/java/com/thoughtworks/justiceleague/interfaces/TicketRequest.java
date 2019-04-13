package com.thoughtworks.justiceleague.interfaces;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TicketRequest {
    private Long parkingLotId;
    private String licensePlateId;
}

