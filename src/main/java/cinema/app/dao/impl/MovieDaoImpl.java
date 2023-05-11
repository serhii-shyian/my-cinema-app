package cinema.app.dao.impl;

import cinema.app.dao.AbstractDao;
import cinema.app.dao.MovieDao;
import cinema.app.model.Movie;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDaoImpl extends AbstractDao<Movie> implements MovieDao {
    public MovieDaoImpl(SessionFactory factory) {
        super(factory, Movie.class);
    }
}
