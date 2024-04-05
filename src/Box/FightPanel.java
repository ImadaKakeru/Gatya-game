package Box;

import javax.swing.*;
import java.awt.*;

public class FightPanel {
    private JTextField output;
    //    private JTextField explain;
    private JButton Attack;
    private JButton Block;
    private JButton PowerUp;
    private JPanel Frame;

    public FightPanel(){
        this.Frame = new JPanel();
        this.output = new JTextField();
        this.Attack = new JButton("攻撃");
        this.Block = new JButton("防御");
        this.PowerUp = new JButton("進化");

        output.setMaximumSize(new Dimension(100, 40));
        output.setFont(new Font("Monospaced", Font.BOLD, 27));
        output.setDisabledTextColor(new Color(0, 0, 0));
        output.setMargin(new Insets(0, 5, 0, 0));
        output.setText("Fighting Mode");
        output.setColumns(20);

        Attack.setFont(new Font("Monospaced", Font.BOLD,22));
        Block.setFont(new Font("Monospaced", Font.BOLD,22));
        PowerUp.setFont(new Font("Monospaced", Font.BOLD,22));

        Frame.add(Attack);
        Frame.add(Block);
        Frame.add(PowerUp);

    }

    public JTextField getOutput() {
        return output;
    }

//    public JTextField getExplain() {
//        return explain;
//    }

    public JPanel getFrame() {
        return Frame;
    }

    public void setOutput(JTextField output) {
        this.output = output;
    }

//    public void setExplain(JTextField explain) {
//        this.explain = explain;
//    }

    public void setFrame(JPanel frame) {
        Frame = frame;
    }
}
