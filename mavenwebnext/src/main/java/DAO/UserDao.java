package DAO;

import domain.User;
import entity.UserEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.resource.transaction.spi.TransactionStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.transaction.Synchronization;
import java.util.List;

@Transactional
public class UserDao extends HibernateDaoSupport {
    @Autowired
    private SessionFactory sessionFactory;

    public boolean findByName(UserEntity userEntity){
        String hql="from UserEntity where name = "+userEntity.getName();
        UserEntity userEntity1=(UserEntity) getHibernateTemplate().get("entity.UserEntity",userEntity.getName());
        if (userEntity1!=null)
            return true;
        return false;
    }

    public void save(UserEntity userEntity){
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(userEntity);
        transaction.commit();
        session.close();
    }

}
