package BottunHandle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import PanelChange.*;
public class ChangePanel implements ActionListener {

    private PanelSetting ps;

    public ChangePanel(PanelSetting ps) {
        this.ps = ps;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String cmd = e.getActionCommand();
        ps.getLayout().show(ps.getCardPanel(),cmd);
    }

}
