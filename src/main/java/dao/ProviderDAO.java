package dao;

import model.Provider;

import java.sql.SQLException;
import java.util.Collection;

public interface ProviderDAO {
    public void addProvider(Provider provider) throws SQLException, Exception;
    public void updateProvider(Provider provider) throws SQLException, Exception;
    public Provider getProviderById(Long id) throws SQLException, Exception;
    public Collection<Provider> getAllProviders() throws SQLException, Exception;
    public void deleteProvider(Provider provider) throws SQLException, Exception;
}