package com.usatoday.usaToday.Services;

import com.usatoday.usaToday.Dao.MyTopicsDao;
import com.usatoday.usaToday.Entity.MyTopics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MyTopicsServiceImpl implements MyTopicsService {

    @Autowired
    MyTopicsDao myTopicsDao;

    @Override
    @Transactional
    public void saveId(int id) {
        myTopicsDao.save(new MyTopics(0, id));
    }

    @Override
    @Transactional
    public void deleteId(int id) {
        myTopicsDao.deleteSubCatId(id);
    }
}
