package dao;

import model.Provider;

import java.util.Collection;

public interface ProviderDAO {
    void addProvider(Provider provider);
    void updateProvider(Provider provider);
    Provider getProviderById(Long id);
    Collection<Provider> getAllProviders();
    void deleteProvider(Provider provider);
}
