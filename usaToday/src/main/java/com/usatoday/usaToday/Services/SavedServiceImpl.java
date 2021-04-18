package com.usatoday.usaToday.Services;

import com.usatoday.usaToday.Dao.SavedDao;
import com.usatoday.usaToday.Entity.Saved;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SavedServiceImpl implements SavedService {

    @Autowired
    private SavedDao savedDao;

    @Override
    @Transactional
    public void saveNews(int id) {
        savedDao.save(new Saved(0, id));
    }

    @Override
    public void deleteById(int id) {
        savedDao.removeNews(id);
    }

    @Override
    public void deleteAll() {
        savedDao.deleteAll();
    }
}
