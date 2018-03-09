package br.com.agilepays.pricetag.data.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.agilepays.data.entity.Carte;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "cartes",itemResourceRel = "carte", path = "carte")
public interface CarteRepository extends PagingAndSortingRepository<Carte, Long> {
	List<Carte> findByName(@Param("name") String name);
}
