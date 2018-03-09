package br.com.agilepays;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import br.com.agilepays.data.entity.*;

@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Address.class);
        config.exposeIdsFor(Carte.class);
        config.exposeIdsFor(CarteItem.class);
        config.exposeIdsFor(CategoryCarteItem.class);
        config.exposeIdsFor(Company.class);
        config.exposeIdsFor(Contact.class);
        config.exposeIdsFor(Desk.class);
        config.exposeIdsFor(Establishment.class);
        config.exposeIdsFor(PaymentRegistry.class);
        config.exposeIdsFor(Profile.class);
        config.exposeIdsFor(SalesOrder.class);
        config.exposeIdsFor(SalesOrderClosure.class);
        config.exposeIdsFor(SalesOrderItem.class);
        config.exposeIdsFor(User.class);
    }
}
