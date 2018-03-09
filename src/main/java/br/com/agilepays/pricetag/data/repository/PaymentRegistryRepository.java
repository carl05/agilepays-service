package br.com.agilepays.pricetag.data.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.agilepays.data.entity.PaymentRegistry;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "paymentRegistry", path = "paymentRegistry")
public interface PaymentRegistryRepository extends PagingAndSortingRepository<PaymentRegistry, Long> {
	List<PaymentRegistry> findByState(@Param("name") String name);
	List<PaymentRegistry> findByIntent(@Param("name") String name);
}
