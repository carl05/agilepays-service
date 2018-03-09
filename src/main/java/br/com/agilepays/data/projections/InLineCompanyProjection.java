package br.com.agilepays.data.projections;

import java.util.List;

import org.springframework.data.rest.core.config.Projection;

import br.com.agilepays.data.entity.Company;
import br.com.agilepays.data.entity.Establishment;
import br.com.agilepays.data.entity.User;

@Projection(name = "inlineCompany", types = { Company.class })
public interface InLineCompanyProjection {
	String getName();

	List<Establishment> getEstablishments();

	User getUser();
	void setUser(User user);

}
