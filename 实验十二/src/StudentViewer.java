import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Arrays;

/**
 * Created by Ray on 2016/12/12.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 12
 */
public class StudentViewer extends JFrame {
    public StudentViewer(){

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(300,100);
        getContentPane().setLayout(new BorderLayout());

        JTextField textField = new JTextField();
        getContentPane().add(textField,BorderLayout.CENTER);

        JButton queryButton = new JButton("查询");
        JButton cancelButton = new JButton("退出");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(queryButton);
        buttonPanel.add(cancelButton);
        getContentPane().add(buttonPanel,BorderLayout.SOUTH);

        cancelButton.addActionListener(e -> {
            System.exit(0);
        });

        queryButton.addActionListener(e -> {
            String text = textField.getText();
            TestAccessDB testAccessDB = new TestAccessDB();
            testAccessDB.initTableData(text);
            String[] nameCols = testAccessDB.getNameCols();
            String[][] tableData = testAccessDB.getTableData();
            System.out.println(Arrays.toString(nameCols));
            System.out.println(Arrays.deepToString(tableData));

            new TableFormatter(tableData,nameCols);

        });

        setVisible(true);

    }

}
