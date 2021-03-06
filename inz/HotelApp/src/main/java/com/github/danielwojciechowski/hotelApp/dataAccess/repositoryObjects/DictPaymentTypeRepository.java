package com.github.danielwojciechowski.hotelApp.dataAccess.repositoryObjects;

import com.github.danielwojciechowski.hotelApp.dataAccess.pojo.DictPaymentType;
import com.github.danielwojciechowski.hotelApp.dataAccess.pojo.StayPackage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DictPaymentTypeRepository extends CrudRepository<DictPaymentType, Long> {

}
