package br.com.agilepays.pricetag.data.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.agilepays.data.entity.CategoryCarteItem;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "categoryCarteItems", itemResourceRel = "categoryCarteItem", path = "categoryCarteItem")
public interface CategoryCarteItemRepository extends PagingAndSortingRepository<CategoryCarteItem, Long> {
	List<CategoryCarteItem> findByName(@Param("name") String name);
}
