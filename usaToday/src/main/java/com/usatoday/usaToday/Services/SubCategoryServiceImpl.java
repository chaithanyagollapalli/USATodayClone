package com.usatoday.usaToday.Services;

import com.usatoday.usaToday.Dao.SubCategoryDao;
import com.usatoday.usaToday.Entity.SubCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {

    @Autowired
    private SubCategoryDao subCategoryDao;

    @Override
    @Transactional
    public Iterable<SubCategory> findAllSubCategory() {
        return subCategoryDao.findAll();
    }
}
