package br.com.agilepays.pricetag.data.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.agilepays.data.entity.Profile;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "profiles", itemResourceRel = "profile", path = "perfil")
public interface ProfileRepository extends PagingAndSortingRepository<Profile, Long> {
	List<Profile> findByName(@Param("name") String name);
}
