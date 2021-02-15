package myApplication.dao;


import myApplication.entity.Car;
import myApplication.entity.CarColor;
import myApplication.entity.CarLabel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarPropertiesDAOImpl implements CarPropertiesDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<CarLabel> getAllCarLabels() {
        Session session = sessionFactory.getCurrentSession();
        Query<CarLabel> query = session.createQuery("from CarLabel ", CarLabel.class);
        return query.getResultList();
    }

    @Override
    public List<CarColor> getAllCarColors() {
        Session session = sessionFactory.getCurrentSession();
        Query<CarColor> query = session.createQuery("from CarColor", CarColor.class);
        return query.getResultList();
    }

    @Override
    public void saveCar(Car car) {
        Session session = sessionFactory.getCurrentSession();
        session.save(car);
    }
}
