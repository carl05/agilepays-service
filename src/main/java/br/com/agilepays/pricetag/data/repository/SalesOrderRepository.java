package br.com.agilepays.pricetag.data.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.agilepays.data.entity.SalesOrder;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "salesOrders", itemResourceRel = "salesOrder", path = "salesOrder")
public interface SalesOrderRepository extends PagingAndSortingRepository<SalesOrder, Long> {
	List<SalesOrder> findByOrderNumber(@Param("name") Integer name);
	List<SalesOrder> findByCostumerName(@Param("name") String customerName);
}
