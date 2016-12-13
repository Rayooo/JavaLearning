import javax.swing.*;
import java.awt.*;

/**
 * Created by Ray on 2016/12/13.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 12
 */
public class TableFormatter extends JFrame {
    public TableFormatter(Object[][] data, Object[] colNames) {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JTable table = new JTable(data, colNames);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
        setSize(400, 150);
        setVisible(true);
    }

}
