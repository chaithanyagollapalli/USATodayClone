package com.usatoday.usaToday.Dao;

import com.usatoday.usaToday.Entity.Saved;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SavedDao extends CrudRepository<Saved, Integer> {

    @Modifying
    @Query("delete from Saved where newsId = :id")
    void removeNews(@Param("id") int id);

}
