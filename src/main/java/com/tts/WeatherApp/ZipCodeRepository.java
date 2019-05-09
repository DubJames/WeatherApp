package com.tts.WeatherApp;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ZipCodeRepository extends CrudRepository<ZipCode, Long> {
	 ZipCode findByZipCode(String zipCode);
	 
}
