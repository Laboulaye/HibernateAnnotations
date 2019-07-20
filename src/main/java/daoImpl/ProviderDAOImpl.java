package daoImpl;

import dao.ProviderDAO;
import model.Provider;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ProviderDAOImpl implements ProviderDAO {
    private Session session;


    public ProviderDAOImpl() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public void addProvider(Provider provider) {
        session.beginTransaction();
        session.save(provider);
        session.getTransaction().commit();
    }

    @Override
    public void updateProvider(Provider provider) {
        session.beginTransaction();
        session.update(provider);
        session.getTransaction().commit();
    }

    @Override
    public Provider getProviderById(Long id) {
        Provider provider = session.load(Provider.class, id);
        return provider;
    }

    @Override
    public Collection<Provider> getAllProviders() {
        List<Provider> providers = new ArrayList<>();
        providers = session.createCriteria(Provider.class).list();
        return providers;
    }

    @Override
    public void deleteProvider(Provider provider) {
        session.beginTransaction();
        session.delete(provider);
        session.getTransaction().commit();
    }
}
