import com.qst.chapter05.pojos.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by Ray on 2017/2/25.
 */
public class UserHQLDemo {
    public static void main(String[] args){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from User");
        List<User> list = query.list();
        for (User i : list){
            System.out.println(i.getId() + i.getUserName() + i.getUserPwd() + i.getRole());
        }

        transaction.commit();
        session.close();

    }
}
