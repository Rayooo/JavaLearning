import com.qst.chapter05.pojos.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Created by Ray on 2017/2/25.
 */
public class UserCriteriaDemo {
    public static void main(String[] args){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(User.class);
        List<User> list = criteria.list();
        for(User i : list){
            System.out.println(i.getId()+i.getUserName()+i.getUserPwd());
        }
        transaction.commit();
        session.close();

    }
}
