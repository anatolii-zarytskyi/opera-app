package opera.academy.spring.dao.impl;

import opera.academy.spring.dao.AbstractDao;
import opera.academy.spring.dao.TicketDao;
import opera.academy.spring.model.Ticket;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory factory) {
        super(factory, Ticket.class);
    }
}
