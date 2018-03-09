package br.com.agilepays.pricetag.data.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.agilepays.data.entity.Establishment;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "establishments", itemResourceRel = "establishment", path = "establishment")
public interface EstablishmentRepository extends PagingAndSortingRepository<Establishment, Long> {
	List<Establishment> findByName(@Param("name") String name);
}
