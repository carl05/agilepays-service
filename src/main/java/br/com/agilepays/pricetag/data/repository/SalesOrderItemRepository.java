package br.com.agilepays.pricetag.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.agilepays.data.entity.SalesOrderItem;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "salesOrderItems", itemResourceRel = "salesOrderItem", path = "salesOrderItem")
public interface SalesOrderItemRepository extends PagingAndSortingRepository<SalesOrderItem, Long> {
}
