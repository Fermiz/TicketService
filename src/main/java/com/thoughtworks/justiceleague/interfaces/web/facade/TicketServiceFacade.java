package com.thoughtworks.justiceleague.interfaces.web.facade;

import com.thoughtworks.justiceleague.domain.ticket.Ticket;

public interface TicketServiceFacade {
    Ticket create(Long parkingLotId, String licensePlateId);
}
