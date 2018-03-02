package domain;

import DAO.UserDao;
import entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class RegisterCheck {
    @Autowired
    UserDao userDao;
    public boolean checkAndSave(UserEntity userEntity){
        if(userDao.findByName(userEntity))
            return false;
        userDao.save(userEntity);
        return true;
    }
}
