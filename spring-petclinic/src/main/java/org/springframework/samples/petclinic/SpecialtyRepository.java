package org.springframework.samples.petclinic;

import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.vet.Specialty;

public interface SpecialtyRepository extends Repository<Specialty, Integer> {

	void save(Specialty specialty);

	Specialty findById(@Param("id") Integer id);

}
