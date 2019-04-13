package com.thoughtworks.justiceleague.infrastructure;

import com.thoughtworks.justiceleague.domain.ticket.Ticket;
import com.thoughtworks.justiceleague.domain.ticket.TicketId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketJpaRepository extends JpaRepository<Ticket, TicketId> {
}
