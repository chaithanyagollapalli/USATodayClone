package com.usatoday.usaToday.Dao;

import com.usatoday.usaToday.Entity.SubCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubCategoryDao extends CrudRepository<SubCategory, Integer> {
}
