package com.usatoday.usaToday.Dao;

import com.usatoday.usaToday.Entity.MyTopics;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MyTopicsDao extends CrudRepository<MyTopics, Integer> {

    @Modifying
    @Query("delete from MyTopics where subCatId = :id")
    void deleteSubCatId(@Param("id") int id);
}
