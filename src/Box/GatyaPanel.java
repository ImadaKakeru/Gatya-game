package Box;

import javax.swing.*;
import java.awt.*;

public class GatyaPanel extends JFrame {
    private JTextField output,explain;
    //    private JTextField explain;
    private JButton oneGatya;
    private JButton tenGatya;
    private JPanel Frame;

    public GatyaPanel(){
        this.Frame = new JPanel();
        this.explain = new JTextField();
        this.output = new JTextField();
        this.oneGatya = new JButton("ガチャ");
        this.tenGatya = new JButton("10連ガチャ");
        output.setMaximumSize(new Dimension(100, 40));
        output.setFont(new Font("Monospaced", Font.BOLD, 27));
        output.setDisabledTextColor(new Color(0, 0, 0));
        output.setMargin(new Insets(0, 5, 0, 0));
        output.setText("Lets play Gatya !!!");
        output.setColumns(20);

        explain.setMaximumSize(new Dimension(100,40));
        explain.setFont(new Font("Monospaced",Font.BOLD,27));
        explain.setDisabledTextColor(new Color(255,0,0));
        explain.setText("This monster is:");
        explain.setColumns(60);

        oneGatya.setFont(new Font("Monospaced", Font.BOLD,22));
        tenGatya.setFont(new Font("Monospaced", Font.BOLD,22));

        Frame.add(output);
        Frame.add(explain);
        Frame.add(oneGatya);
        Frame.add(tenGatya);

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

    public JPanel getFrame() {
        return Frame;
    }

    public void setFrame(JPanel frame) {
        Frame = frame;
    }
}
