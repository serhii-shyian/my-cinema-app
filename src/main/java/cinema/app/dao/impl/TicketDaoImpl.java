package cinema.app.dao.impl;

import cinema.app.dao.AbstractDao;
import cinema.app.dao.TicketDao;
import cinema.app.model.Ticket;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory factory) {
        super(factory, Ticket.class);
    }
}
