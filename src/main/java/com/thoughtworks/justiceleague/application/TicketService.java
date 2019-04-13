package com.thoughtworks.justiceleague.application;

import com.thoughtworks.justiceleague.domain.ticket.LicensePlateId;
import com.thoughtworks.justiceleague.domain.ticket.Ticket;

public interface TicketService {
    Ticket create(Long parkingLotId, LicensePlateId licensePlateId);
}