package com.psa.location_web_app1.repositories;

import org.springframework.data.repository.CrudRepository;

import com.psa.location_web_app1.entities.Location;

public interface LocationRepository extends CrudRepository<Location, Long> {

}
