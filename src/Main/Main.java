package Main;
import  Level1.*;
import  Level2.*;
import Box.*;
import PanelChange.*;

import javax.swing.*;

public class Main extends JFrame{
    public static void main(String[] args) {
        MainPanel w = new MainPanel();
        GatyaPanel g = new GatyaPanel();
        FightPanel f = new FightPanel();
        JPanel c = new JPanel();
        PanelSetting panels = new PanelSetting(w.getMainPanel(), g.getFrame(), f.getFrame());
//        PanelSetting panels = new PanelSetting(w.getMainPanel(), g.getFrame(), c);

        panels.setTitle("Title Window");
        panels.setSize(1000,1000);
        panels.setLocationRelativeTo(null);
        panels.setDefaultCloseOperation(EXIT_ON_CLOSE);
        panels.setVisible(true);
    }
}