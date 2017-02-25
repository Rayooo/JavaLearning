import com.qst.chapter05.pojos.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


/**
 * Created by Ray on 2017/2/25.
 */
public class UserDemo {
    public static void main(String[] args){
        //
        User user = new User("Ra222","23",1);

//        Configuration configuration = new Configuration();
//        configuration.configure("./hibernate.cfg.xml");
//        StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder();
//
//        standardServiceRegistryBuilder.applySettings(configuration.getProperties());

//        SessionFactory sessionFactory = configuration.buildSessionFactory(standardServiceRegistryBuilder.build());
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();

    }
}
