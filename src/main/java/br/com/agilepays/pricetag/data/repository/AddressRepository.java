package br.com.agilepays.pricetag.data.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.agilepays.data.entity.Address;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "adresses", itemResourceRel = "adress", path = "address")
public interface AddressRepository extends PagingAndSortingRepository<Address, Long> {
	List<Address> findByPlaceName(@Param("name") String name);
}
