import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Ray on 2016/11/28.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 10
 */
public class RoseShop extends JFrame {
    private JCheckBox roseCheckBox;
    private JCheckBox caseCheckBox;
    private JCheckBox cardCheckBox;

    private JRadioButton tenYuanButton;
    private JRadioButton fiveYuanButton;

    public static void main(String[] args){
        new RoseShop();
    }

    private RoseShop(){
        setTitle("Rose Shop");
        setSize(1200,700);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout(10,10));

        getContentPane().add(buildTitlePanel(),BorderLayout.NORTH);
        getContentPane().add(buildDeliverPanel(),BorderLayout.WEST);
        getContentPane().add(buildProductPanel(),BorderLayout.CENTER);
        getContentPane().add(buildPricePanel(),BorderLayout.EAST);
        getContentPane().add(buildSubmitPanel(),BorderLayout.SOUTH);

        setVisible(true);
    }

    private JPanel buildTitlePanel(){
        JPanel titlePanel = new JPanel();
        JLabel label = new JLabel("我们为你提供最优质的服务",SwingConstants.CENTER);
        label.setFont(new Font("", Font.PLAIN, 25));
        titlePanel.add(label);
        return titlePanel;
    }

    private JPanel buildDeliverPanel(){
        JPanel deliverPanel = new JPanel();
        deliverPanel.setLayout(new GridLayout(4,1));
        deliverPanel.setPreferredSize(new Dimension(300,300));
        deliverPanel.setBorder(BorderFactory.createLineBorder(Color.red,4));

        JLabel label = new JLabel("选择你的邮递方式", SwingConstants.CENTER);
        deliverPanel.add(label).setLocation(1,1);

        tenYuanButton = new JRadioButton("快递  10元");
        tenYuanButton.setForeground(Color.blue);
        fiveYuanButton = new JRadioButton("普邮  5元");
        fiveYuanButton.setForeground(Color.blue);
        JRadioButton selfButton = new JRadioButton("自提  0元");
        selfButton.setForeground(Color.blue);
        tenYuanButton.setSelected(true);

        ButtonGroup group = new ButtonGroup();
        group.add(tenYuanButton);
        group.add(fiveYuanButton);
        group.add(selfButton);


        JPanel tenYuanPanel = new JPanel();
        tenYuanPanel.add(tenYuanButton);
        JPanel fiveYuanPanel = new JPanel();
        fiveYuanPanel.add(fiveYuanButton);
        JPanel selfPanel = new JPanel();
        selfPanel.add(selfButton);

        deliverPanel.add(tenYuanPanel).setLocation(1,2);
        deliverPanel.add(fiveYuanPanel).setLocation(1,3);
        deliverPanel.add(selfPanel).setLocation(1,4);

        return deliverPanel;
    }

    private JPanel buildProductPanel(){
        JPanel productPanel = new JPanel();
        productPanel.setLayout(new GridLayout(4,1));
        productPanel.setPreferredSize(new Dimension(300,300));
        productPanel.setBorder(BorderFactory.createLineBorder(Color.black,4));
        productPanel.setBackground(Color.yellow);

        JLabel label = new JLabel("请选择你需要的商品", SwingConstants.CENTER);
        productPanel.add(label).setLocation(1,1);

        roseCheckBox = new JCheckBox("11朵玫瑰------------>");
        JPanel rosePanel = new JPanel();
        rosePanel.setBackground(Color.yellow);
        rosePanel.add(roseCheckBox);
        productPanel.add(rosePanel).setLocation(1,2);

        caseCheckBox = new JCheckBox("精美包装盒------------>");
        JPanel casePanel = new JPanel();
        casePanel.setBackground(Color.yellow);
        casePanel.add(caseCheckBox);
        productPanel.add(casePanel).setLocation(1,3);

        cardCheckBox = new JCheckBox("贺卡----------------->");
        JPanel cardPanel = new JPanel();
        cardPanel.setBackground(Color.yellow);
        cardPanel.add(cardCheckBox);
        productPanel.add(cardPanel).setLocation(1,4);

        return productPanel;
    }

    private JPanel buildPricePanel(){
        JPanel pricePanel = new JPanel();
        pricePanel.setLayout(new GridLayout(4,1));
        pricePanel.setPreferredSize(new Dimension(300,300));
        pricePanel.setBackground(Color.green);

        JLabel label1 = new JLabel("商品价格", SwingConstants.CENTER);
        pricePanel.add(label1).setLocation(1,1);

        JLabel label2 = new JLabel("108元");
        JPanel label2Panel = new JPanel();
        label2Panel.setBackground(Color.green);
        label2Panel.add(label2);
        pricePanel.add(label2Panel).setLocation(1,2);

        JLabel label3 = new JLabel("28元", SwingConstants.CENTER);
        JPanel label3Panel = new JPanel();
        label3Panel.setBackground(Color.green);
        label3Panel.add(label3);
        pricePanel.add(label3Panel).setLocation(1,3);

        JLabel label4 = new JLabel("8元", SwingConstants.CENTER);
        JPanel label4Panel = new JPanel();
        label4Panel.setBackground(Color.green);
        label4Panel.add(label4);
        pricePanel.add(label4Panel).setLocation(1,4);

        return pricePanel;
    }

    private JPanel buildSubmitPanel(){
        JPanel submitPanel = new JPanel();

        JButton calculateButton = new JButton("计算");
        calculateButton.addActionListener(new CalButtonListener());
        JButton resetButton = new JButton("重置");
        resetButton.addActionListener(new ResetButtonListener());

        submitPanel.add(calculateButton);
        submitPanel.add(resetButton);
        return submitPanel;
    }

    private class CalButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            double totalPrice = 0;

            totalPrice += roseCheckBox.isSelected()? 108:0;
            totalPrice += caseCheckBox.isSelected()? 28:0;
            totalPrice += cardCheckBox.isSelected()? 8:0;
            totalPrice += tenYuanButton.isSelected()? 10:0;
            totalPrice += fiveYuanButton.isSelected()? 5:0;

            JOptionPane.showMessageDialog(null, "总价为："+totalPrice);
        }
    }

    private class ResetButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            roseCheckBox.setSelected(false);
            caseCheckBox.setSelected(false);
            cardCheckBox.setSelected(false);
            tenYuanButton.setSelected(true);
        }
    }


}
