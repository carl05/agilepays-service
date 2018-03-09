package br.com.agilepays.pricetag.data.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.agilepays.data.entity.User;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "users", itemResourceRel = "user", path = "user")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
	List<User> findByName(@Param("name") String name);
}
