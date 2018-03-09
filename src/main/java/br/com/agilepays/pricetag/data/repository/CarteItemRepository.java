package br.com.agilepays.pricetag.data.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.agilepays.data.entity.CarteItem;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "carteItems", itemResourceRel = "carteItem", path = "carteItem")
public interface CarteItemRepository extends PagingAndSortingRepository<CarteItem, Long> {
	List<CarteItem> findByName(@Param("name") String name);
}
