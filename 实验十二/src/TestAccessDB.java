import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Ray on 2016/12/12.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 12
 */
public class TestAccessDB {

    private String[][] tableData;
    private String[] nameCols;

    public void test(){
        DbConnection dbConnection = null;
        try {
            dbConnection = new DbConnection();
            Statement statement = dbConnection.getConnection().createStatement();
            String sql = "SELECT * FROM studentInfo";
            ResultSet resultSet = statement.executeQuery(sql);
            ResultSetMetaData rsmd = resultSet.getMetaData();

            int count = 0;
            int columnsNumber = rsmd.getColumnCount();      //列数
            if (resultSet.last()) {
                count = resultSet.getRow();         //行数
                System.out.println("结果集一共有"+count+"行," + columnsNumber + "列");
                resultSet.beforeFirst();
            }

            System.out.println("列标题为:");
            nameCols = new String[columnsNumber];
            for (int i = 0; i < columnsNumber; i++ ) {
                String name = rsmd.getColumnName(i + 1);
                nameCols[i] = name;
                System.out.print(name + "\t");
            }
            tableData = new String[count][columnsNumber];
            System.out.print("\n" + "结果集中的所有数据为：\n");
            for (int i = 0; resultSet.next(); ++i) {
                String id = Integer.toString(resultSet.getInt("ID"));
                tableData[i][0] = id;
                System.out.print(id + "\t");

                String stuId = resultSet.getString("stuId");
                tableData[i][1] = stuId;
                System.out.print( stuId + "\t");

                String name = resultSet.getString("name");
                tableData[i][2] = name;
                System.out.print(name + "\t");

                String gender = resultSet.getString("gender");
                tableData[i][3] = gender;
                System.out.print(gender + "\t");

                String bornData = String.valueOf(resultSet.getDate("bornDate"));
                tableData[i][4] = bornData;
                System.out.print(bornData + "\t");

                String chinese = resultSet.getString("chinese");
                tableData[i][5] = chinese;
                System.out.print(chinese + "\t");

                String math = resultSet.getString("math");
                tableData[i][6] = math;
                System.out.print(math + "\t");

                String english = resultSet.getString("english");
                tableData[i][7] = english;
                System.out.print(english + "\t");

                System.out.print("\n");
            }

            dbConnection.closeConnection();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void initTableData(String sql){
        DbConnection dbConnection = null;
        try {
            dbConnection = new DbConnection();
            Statement statement = dbConnection.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            ResultSetMetaData rsmd = resultSet.getMetaData();
            int count = 0;
            int columnsNumber = rsmd.getColumnCount();      //列数
            if (resultSet.last()) {
                count = resultSet.getRow();         //行数
                resultSet.beforeFirst();
            }
            nameCols = new String[columnsNumber];
            for (int i = 0; i < columnsNumber; i++ ) {
                String name = rsmd.getColumnName(i + 1);
                nameCols[i] = name;
            }

            tableData = new String[count][columnsNumber];

            for (int i = 0; resultSet.next(); ++i) {
               for(int j = 0;j < nameCols.length; ++j){
                   String result = resultSet.getString(nameCols[j]);
                   tableData[i][j] = result;
               }
            }

            dbConnection.closeConnection();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


    }

    public String[][] getTableData() {
        return tableData;
    }

    public String[] getNameCols() {
        return nameCols;
    }

}
