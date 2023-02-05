package org.springframework.samples.petclinic;

import org.springframework.data.repository.query.Param;

public interface SpecialtyRepository {
	void save(Specialty specialty);
	Specialty findById(@Param("id") Integer id);
}
