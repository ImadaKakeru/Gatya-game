package Box;

import javax.swing.*;

import java.awt.*;

public class MainPanel extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField output,explain;
//    private JTextField explain;
    private JButton oneGatya;
    private JButton tenGatya;
    private JPanel mainPanel;

    public MainPanel(){
        super("Gatya form");
        //mainPanelを作成、これが電卓の土台
        this.mainPanel = new JPanel();
        this.output = new JTextField();
//        this.explain = new JTextField();
//        this.oneGatya = new JButton("ガチャ");
//        this.tenGatya = new JButton("10連ガチャ");

        output.setMaximumSize(new Dimension(100, 40));
        output.setFont(new Font("Monospaced", Font.BOLD, 27));
        output.setDisabledTextColor(new Color(0, 0, 0));
        output.setMargin(new Insets(0, 5, 0, 0));
        output.setText("Welcome");
        output.setColumns(20);

//        explain.setMaximumSize(new Dimension(100,40));
//        explain.setFont(new Font("Monospaced",Font.BOLD,27));
//        explain.setDisabledTextColor(new Color(255,0,0));
//        explain.setText("This monster is:");
//        explain.setColumns(60);

        //oneGatya.setFont(new Font("Monospaced", Font.BOLD,22));
        //tenGatya.setFont(new Font("Monospaced", Font.BOLD,22));


        mainPanel.add(output);
        //mainPanel.add(explain);
        //mainPanel.add(oneGatya);
        //mainPanel.add(tenGatya);

        this.add(mainPanel);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setVisible(true);
        //this.setSize(1000, 1000);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public JTextField getOutput() {
        return output;
    }

    public void setOutput(JTextField output) {
        this.output = output;
    }

    public JTextField getExplain() {
        return explain;
    }

    public void setExplain(JTextField explain) {
        this.explain = explain;
    }
}
