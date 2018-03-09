package br.com.agilepays.pricetag.data.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.agilepays.data.entity.Contact;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "contacts", itemResourceRel = "contact", path = "contact")
public interface ContactRepository extends PagingAndSortingRepository<Contact, Long> {
	List<Contact> findByEmailPrimary(@Param("name") String name);
}
