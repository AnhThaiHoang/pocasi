/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocasi;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Image;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;



public class Okno extends JFrame{
   private JFrame frame;
   private JPanel backgroundImageOnPanel;
   private PanelTime panelTime;
   private PanelSearch panelSearch;
   private PanelWBC panelWBC;
   private PanelWF panelWF;
   private Handler handler;

    public Okno() {
     frame = new JFrame(); 
     frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
     frame.setUndecorated(true);
     frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
     frame.setVisible(true);
     frame.setLocationRelativeTo(null);
     frame.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
     
     handler = new Handler(this);
     panelTime = new PanelTime(handler);
     panelSearch = new PanelSearch(handler);
     panelWBC = new PanelWBC(handler);
     panelWF = new PanelWF(handler);
     panelTime.start();
     

     backgroundImageOnPanel = new JPanel();
     backgroundImageOnPanel.setOpaque(false);
     backgroundImageOnPanel.setLayout(new GridBagLayout());
     frame.setContentPane(backgroundImageOnPanel);
     
     frame.add(panelTime.getPanelTime());
     frame.add(panelSearch.getPanelSearch());
     frame.add(panelWBC.getPanelBackground());
     frame.add(panelWF.getPanelWF());
     }     

    public PanelTime getPanelTime() {
        return panelTime;
    }

    public PanelSearch getPanelSearch() {
        return panelSearch;
    }

    public PanelWBC getPanelWBC() {
        return panelWBC;
    }

    public PanelWF getPanelWF() {
        return panelWF;
    }

    public JFrame getFrame() {
        return frame;
    }
}

