import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Ray on 2016/12/12.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 12
 */
public class DbConnection {
    private Connection connection = null;

    public DbConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/javaClass?useUnicode=true&characterEncoding=utf-8","root","root");
        System.out.println("连接数据库成功");

    }

    public void closeConnection() throws SQLException {
        if(connection != null){
            connection.close();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
/*数据库创建语句

CREATE DATABASE javaClass CHARACTER SET utf8 COLLATE utf8_general_ci;

USE javaClass;

CREATE TABLE studentInfo(
  ID INT PRIMARY KEY AUTO_INCREMENT,
  stuId VARCHAR(20) NOT NULL UNIQUE,
  name VARCHAR(20) NOT NULL,
  gender VARCHAR(10),
  bornDate DATETIME,
  chinese INT,
  math INT,
  english INT
)


* */