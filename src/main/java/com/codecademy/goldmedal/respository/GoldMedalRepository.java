package com.codecademy.goldmedal.respository;

import com.codecademy.goldmedal.model.GoldMedal;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GoldMedalRepository extends CrudRepository<GoldMedal, Long> {
//    List<GoldMedal> findAllOrderByEventAsc();
//
//    List<GoldMedal> findAllByOrderByYearAsc();
//    List<GoldMedal> findAllByOrderBySeasonAsc();
//
//    List<GoldMedal> findAllByOrderByCityAsc();
//
//    List<GoldMedal> findAllByOrderByNameAsc();


    Integer countByCountry(String country);

    List<GoldMedal> findAllByCountryAndSeasonOrderByYearAsc(String country, String season);

    Integer countDistinctEventsBySeason(String season);

    Integer countByCountryAndGender(String country, String gender);

    List<GoldMedal> findAllByCountry(String country, Sort sort);
}
