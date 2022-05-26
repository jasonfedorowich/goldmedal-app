package com.codecademy.goldmedal.respository;

import com.codecademy.goldmedal.model.Country;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CountryRepository extends CrudRepository<Country, Long> {
    Optional<Country> findByName(String name);
    List<Country> findAll(Sort sort);
}
