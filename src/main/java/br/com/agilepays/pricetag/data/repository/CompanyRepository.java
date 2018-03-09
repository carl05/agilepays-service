package br.com.agilepays.pricetag.data.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.agilepays.data.entity.Company;
import br.com.agilepays.data.projections.InLineCompanyProjection;

@CrossOrigin
@RepositoryRestResource(excerptProjection = InLineCompanyProjection.class, collectionResourceRel = "companys", itemResourceRel = "company", path = "company")
public interface CompanyRepository extends PagingAndSortingRepository<Company, Long> {
	List<Company> findByName(@Param("name") String name);
}
