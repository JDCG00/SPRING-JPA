/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.samples.petclinic;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.samples.petclinic.vet.Vet;
import org.springframework.samples.petclinic.vet.VetRepository;

/**
 * PetClinic Spring Boot Application.
 *
 * @author Dave Syer
 *
 */

/**
 * TODO [x] Crear un objeto Vet sin Speciality [x] Persistir el objeto Vet en BBDD [x]
 * Consultar por ID y comprobar que se ha creado correctamente [x] Editar el elemento
 * recién creado para añadir una Speciality concreta [x] Listar todos los veterinarios
 * existentes
 */
@Slf4j
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "ProductStore API", version = "2.0", description = "ProductStore Information"))
public class PetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetClinicApplication.class, args);
	}

	@Bean
	public CommandLineRunner demoVetRepository(VetRepository vetRepository, SpecialtyRepository specialtyRepository) {
		return (args) -> {
			Vet vet = new Vet();
			//Añadir un veterinario con nombre y apellidos
			// vet.setFirstName("Juan");
			// vet.setLastName("Rojas");
			// vetRepository.save(vet);
			log.info("Lista de todos los veterinarios");
			for (Vet all_vets: vetRepository.findAll()){
				log.info("Vet: " + all_vets);
			}

		};
	}

}
