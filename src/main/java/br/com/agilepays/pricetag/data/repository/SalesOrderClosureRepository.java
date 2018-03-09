package br.com.agilepays.pricetag.data.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.agilepays.data.entity.PaymentRegistry;
import br.com.agilepays.data.entity.SalesOrderClosure;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "salesOrderClosures", itemResourceRel = "salesOrderClosure", path = "salesOrderClosure")
public interface SalesOrderClosureRepository extends PagingAndSortingRepository<SalesOrderClosure, Long> {
	List<SalesOrderClosure> findByPayment(@Param("paymentRegistry") PaymentRegistry paymentRegistry);
}
