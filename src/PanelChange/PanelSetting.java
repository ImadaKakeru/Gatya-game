package PanelChange;
import BottunHandle.*;
import javax.swing.*;
import java.awt.*;

public class PanelSetting extends JFrame {
    private JPanel cardPanel,mainFrame,GatyaFrame,FightFrame,btnPanel;
//    private JPanel mainFrame;
//    private JPanel GatyaFrame;
//    private JPanel FightFrame;
    private CardLayout layout;
    private JButton btnGatya, btnMain,btnFight;
//    private JButton btnMain;
//    private JButton btnFight;

    public PanelSetting(JPanel mainFrame, JPanel GatyaFrame, JPanel FightFrame) {
        ChangePanel cp = new ChangePanel(this);
        this.cardPanel = new JPanel();
        this.layout = new CardLayout();

        this.btnPanel = new JPanel();
        this.btnMain = new JButton("タイトルへ");
        this.btnGatya = new JButton("ガチャへ");
        this.btnFight = new JButton("戦闘へ");

        // ここの関数では、メインフレームから、別のフレームに映るだけの処理に限定する。一方的な矢印方向を考慮
        this.mainFrame = mainFrame;
        this.GatyaFrame = GatyaFrame;
        this.FightFrame = FightFrame;
        cardPanel.setLayout(layout);
        mainFrame.add(btnMain);
        mainFrame.add(btnGatya);
        mainFrame.add(btnFight);

        cardPanel.add(mainFrame, "mainFrame");
        cardPanel.add(GatyaFrame, "GatyaFrame");
        cardPanel.add(FightFrame, "FightFrame");

        btnPanel.add(btnMain);
        btnPanel.add(btnGatya);
        btnPanel.add(btnFight);

        btnGatya.addActionListener(cp);
        btnGatya.setActionCommand("GatyaFrame");

        btnMain.addActionListener(cp);
        btnMain.setActionCommand("mainFrame");

        btnFight.addActionListener(cp);
        btnFight.setActionCommand("FightFrame");


        // cardPanelとカード移動用ボタンをJFrameに配置
        Container contentPane = getContentPane();
        contentPane.add(cardPanel, BorderLayout.CENTER);
        contentPane.add(btnPanel, BorderLayout.PAGE_END);


    }
    public PanelSetting(){

    }
    public JPanel getCardPanel() {
        return cardPanel;
    }

    public void setCardPanel(JPanel cardPanel) {
        this.cardPanel = cardPanel;
    }

    public JPanel getMainFrame() {
        return mainFrame;
    }

    public void setMainFrame(JPanel mainFrame) {
        this.mainFrame = mainFrame;
    }

    @Override
    public CardLayout getLayout() {
        return layout;
    }

    public void setLayout(CardLayout layout) {
        this.layout = layout;
    }
}
