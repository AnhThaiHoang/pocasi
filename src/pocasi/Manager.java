/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocasi;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

/**
 *
 * @author bohou
 */
public class Manager extends javax.swing.JFrame {

    public boolean AktivHodiny;
    public boolean AktivHWeatherByCity;
    public boolean AktivWeatherForecast;
    public boolean AktivSearch;
    private static Okno o;
    private boolean firstTime = true;
    private PanelBarva panelBarva;

    
    /**
     * Creates new form Manager
     */
    public Manager() {
        initComponents();
        setLocationRelativeTo(null);
        panelBarva = new PanelBarva();
        panelBarva.setBounds(100,420,180, 50);
        panelBarva.setOpaque(false);
        panelBarva.setVisible(true);
        panelBarva.setBorder(new MatteBorder(1, 1, 1, 1, Color.BLACK));
        add(panelBarva);
        
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        horniTlacitka = new javax.swing.JPanel();
        mainButton = new javax.swing.JButton();
        timeButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        wbcButton = new javax.swing.JButton();
        wfButton = new javax.swing.JButton();
        okTlacitko = new javax.swing.JButton();
        panelProOstatniPanely = new javax.swing.JPanel();
        nastaveniMainPanel = new javax.swing.JPanel();
        hodiny = new javax.swing.JCheckBox();
        Search = new javax.swing.JCheckBox();
        WeatherForCast = new javax.swing.JCheckBox();
        WeatherByCity = new javax.swing.JCheckBox();
        nastaveniTimePanel = new javax.swing.JPanel();
        timeSlider = new javax.swing.JSlider();
        timeLabel1 = new javax.swing.JLabel();
        timeLabel2 = new javax.swing.JLabel();
        timeLabel3 = new javax.swing.JLabel();
        timeLabel4 = new javax.swing.JLabel();
        timeLabel5 = new javax.swing.JLabel();
        timeLabel6 = new javax.swing.JLabel();
        timeSpinnerR = new javax.swing.JSpinner();
        timeSpinnerG = new javax.swing.JSpinner();
        timeSpinnerB = new javax.swing.JSpinner();
        timePreview = new javax.swing.JButton();
        nastaveniSearchPanel = new javax.swing.JPanel();
        searchSlider = new javax.swing.JSlider();
        searchLabel1 = new javax.swing.JLabel();
        searchLabel2 = new javax.swing.JLabel();
        searchLabel3 = new javax.swing.JLabel();
        searchLabel4 = new javax.swing.JLabel();
        searchLabel5 = new javax.swing.JLabel();
        searchLabel6 = new javax.swing.JLabel();
        searchSpinnerR = new javax.swing.JSpinner();
        searchSpinnerG = new javax.swing.JSpinner();
        searchSpinnerB = new javax.swing.JSpinner();
        searchPreview = new javax.swing.JButton();
        nastatveniWBCPanel = new javax.swing.JPanel();
        wbcSlider = new javax.swing.JSlider();
        wbcLabel1 = new javax.swing.JLabel();
        wbcLabel2 = new javax.swing.JLabel();
        wbcLabel3 = new javax.swing.JLabel();
        wbcLabel4 = new javax.swing.JLabel();
        wbcLabel5 = new javax.swing.JLabel();
        wbcLabel6 = new javax.swing.JLabel();
        wbcSpinnerR = new javax.swing.JSpinner();
        wbcSpinnerG = new javax.swing.JSpinner();
        wbcSpinnerB = new javax.swing.JSpinner();
        wbcPreview = new javax.swing.JButton();
        nastaveniWFPanel = new javax.swing.JPanel();
        wfSlider = new javax.swing.JSlider();
        wfLabel1 = new javax.swing.JLabel();
        wfLabel2 = new javax.swing.JLabel();
        wfLabel3 = new javax.swing.JLabel();
        wfLabel4 = new javax.swing.JLabel();
        wfLabel5 = new javax.swing.JLabel();
        wfLabel6 = new javax.swing.JLabel();
        wfSpinnerR = new javax.swing.JSpinner();
        wfSpinnerG = new javax.swing.JSpinner();
        wfSpinnerB = new javax.swing.JSpinner();
        wfPreview = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(680, 500));
        setMinimumSize(new java.awt.Dimension(680, 500));
        setResizable(false);

        mainButton.setText("main");
        mainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainButtonActionPerformed(evt);
            }
        });
        horniTlacitka.add(mainButton);

        timeButton.setText("Time");
        timeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeButtonActionPerformed(evt);
            }
        });
        horniTlacitka.add(timeButton);

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        horniTlacitka.add(searchButton);

        wbcButton.setText("WBC");
        wbcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wbcButtonActionPerformed(evt);
            }
        });
        horniTlacitka.add(wbcButton);

        wfButton.setText("WF");
        wfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wfButtonActionPerformed(evt);
            }
        });
        horniTlacitka.add(wfButton);

        okTlacitko.setText("ok");
        okTlacitko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okTlacitkoActionPerformed(evt);
            }
        });

        panelProOstatniPanely.setLayout(new java.awt.CardLayout());

        hodiny.setText("Hodiny");
        hodiny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hodinyActionPerformed(evt);
            }
        });

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        WeatherForCast.setText("Weather For Cast");
        WeatherForCast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WeatherForCastActionPerformed(evt);
            }
        });

        WeatherByCity.setText("Weather By City");
        WeatherByCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WeatherByCityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nastaveniMainPanelLayout = new javax.swing.GroupLayout(nastaveniMainPanel);
        nastaveniMainPanel.setLayout(nastaveniMainPanelLayout);
        nastaveniMainPanelLayout.setHorizontalGroup(
            nastaveniMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nastaveniMainPanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(nastaveniMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hodiny, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WeatherForCast)
                    .addComponent(WeatherByCity))
                .addContainerGap(471, Short.MAX_VALUE))
        );
        nastaveniMainPanelLayout.setVerticalGroup(
            nastaveniMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nastaveniMainPanelLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(hodiny)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(WeatherByCity)
                .addGap(5, 5, 5)
                .addComponent(WeatherForCast)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Search)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        panelProOstatniPanely.add(nastaveniMainPanel, "card2");

        nastaveniTimePanel.setLayout(null);

        timeSlider.setMaximum(255);
        timeSlider.setMinimum(1);
        timeSlider.setValue(100);
        timeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                timeSliderStateChanged(evt);
            }
        });
        nastaveniTimePanel.add(timeSlider);
        timeSlider.setBounds(140, 300, 200, 26);

        timeLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        timeLabel1.setText("Time");
        nastaveniTimePanel.add(timeLabel1);
        timeLabel1.setBounds(30, 20, 330, 50);

        timeLabel2.setText("Red");
        nastaveniTimePanel.add(timeLabel2);
        timeLabel2.setBounds(40, 100, 30, 30);

        timeLabel3.setText("Green");
        nastaveniTimePanel.add(timeLabel3);
        timeLabel3.setBounds(30, 160, 40, 30);

        timeLabel4.setText("Blue");
        nastaveniTimePanel.add(timeLabel4);
        timeLabel4.setBounds(40, 230, 30, 30);

        timeLabel5.setText("transparency");
        nastaveniTimePanel.add(timeLabel5);
        timeLabel5.setBounds(20, 300, 90, 20);

        timeLabel6.setBackground(new java.awt.Color(153, 153, 153));
        timeLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        timeLabel6.setText("100");
        timeLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nastaveniTimePanel.add(timeLabel6);
        timeLabel6.setBounds(350, 300, 40, 30);

        timeSpinnerR.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        nastaveniTimePanel.add(timeSpinnerR);
        timeSpinnerR.setBounds(140, 90, 70, 30);

        timeSpinnerG.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        nastaveniTimePanel.add(timeSpinnerG);
        timeSpinnerG.setBounds(140, 160, 70, 30);

        timeSpinnerB.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        nastaveniTimePanel.add(timeSpinnerB);
        timeSpinnerB.setBounds(140, 230, 70, 30);

        timePreview.setText("preview");
        timePreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timePreviewActionPerformed(evt);
            }
        });
        nastaveniTimePanel.add(timePreview);
        timePreview.setBounds(470, 210, 100, 40);

        panelProOstatniPanely.add(nastaveniTimePanel, "card3");

        nastaveniSearchPanel.setLayout(null);

        searchSlider.setMaximum(255);
        searchSlider.setMinimum(1);
        searchSlider.setValue(100);
        searchSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                searchSliderStateChanged(evt);
            }
        });
        nastaveniSearchPanel.add(searchSlider);
        searchSlider.setBounds(140, 300, 200, 26);

        searchLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchLabel1.setText("Search");
        nastaveniSearchPanel.add(searchLabel1);
        searchLabel1.setBounds(30, 20, 330, 50);

        searchLabel2.setText("Red");
        nastaveniSearchPanel.add(searchLabel2);
        searchLabel2.setBounds(40, 100, 30, 30);

        searchLabel3.setText("Green");
        nastaveniSearchPanel.add(searchLabel3);
        searchLabel3.setBounds(30, 160, 40, 30);

        searchLabel4.setText("Blue");
        nastaveniSearchPanel.add(searchLabel4);
        searchLabel4.setBounds(40, 230, 30, 30);

        searchLabel5.setText("transparency");
        nastaveniSearchPanel.add(searchLabel5);
        searchLabel5.setBounds(20, 300, 90, 20);

        searchLabel6.setBackground(new java.awt.Color(153, 153, 153));
        searchLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        searchLabel6.setText("100");
        searchLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nastaveniSearchPanel.add(searchLabel6);
        searchLabel6.setBounds(350, 300, 40, 30);

        searchSpinnerR.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        nastaveniSearchPanel.add(searchSpinnerR);
        searchSpinnerR.setBounds(140, 90, 70, 30);

        searchSpinnerG.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        nastaveniSearchPanel.add(searchSpinnerG);
        searchSpinnerG.setBounds(140, 160, 70, 30);

        searchSpinnerB.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        nastaveniSearchPanel.add(searchSpinnerB);
        searchSpinnerB.setBounds(140, 230, 70, 30);

        searchPreview.setText("preview");
        searchPreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPreviewActionPerformed(evt);
            }
        });
        nastaveniSearchPanel.add(searchPreview);
        searchPreview.setBounds(470, 210, 100, 40);

        panelProOstatniPanely.add(nastaveniSearchPanel, "card3");

        nastatveniWBCPanel.setLayout(null);

        wbcSlider.setMaximum(255);
        wbcSlider.setMinimum(1);
        wbcSlider.setValue(100);
        wbcSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                wbcSliderStateChanged(evt);
            }
        });
        nastatveniWBCPanel.add(wbcSlider);
        wbcSlider.setBounds(140, 300, 200, 26);

        wbcLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        wbcLabel1.setText("Weather By City");
        nastatveniWBCPanel.add(wbcLabel1);
        wbcLabel1.setBounds(30, 20, 330, 50);

        wbcLabel2.setText("Red");
        nastatveniWBCPanel.add(wbcLabel2);
        wbcLabel2.setBounds(40, 100, 30, 30);

        wbcLabel3.setText("Green");
        nastatveniWBCPanel.add(wbcLabel3);
        wbcLabel3.setBounds(30, 160, 40, 30);

        wbcLabel4.setText("Blue");
        nastatveniWBCPanel.add(wbcLabel4);
        wbcLabel4.setBounds(40, 230, 30, 30);

        wbcLabel5.setText("transparency");
        nastatveniWBCPanel.add(wbcLabel5);
        wbcLabel5.setBounds(20, 300, 90, 20);

        wbcLabel6.setBackground(new java.awt.Color(153, 153, 153));
        wbcLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        wbcLabel6.setText("100");
        wbcLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nastatveniWBCPanel.add(wbcLabel6);
        wbcLabel6.setBounds(350, 300, 40, 30);

        wbcSpinnerR.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        nastatveniWBCPanel.add(wbcSpinnerR);
        wbcSpinnerR.setBounds(140, 90, 70, 30);

        wbcSpinnerG.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        nastatveniWBCPanel.add(wbcSpinnerG);
        wbcSpinnerG.setBounds(140, 160, 70, 30);

        wbcSpinnerB.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        nastatveniWBCPanel.add(wbcSpinnerB);
        wbcSpinnerB.setBounds(140, 230, 70, 30);

        wbcPreview.setText("preview");
        wbcPreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wbcPreviewActionPerformed(evt);
            }
        });
        nastatveniWBCPanel.add(wbcPreview);
        wbcPreview.setBounds(470, 210, 100, 40);

        panelProOstatniPanely.add(nastatveniWBCPanel, "card3");

        nastaveniWFPanel.setLayout(null);

        wfSlider.setMaximum(255);
        wfSlider.setMinimum(1);
        wfSlider.setValue(100);
        wfSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                wfSliderStateChanged(evt);
            }
        });
        nastaveniWFPanel.add(wfSlider);
        wfSlider.setBounds(140, 300, 200, 26);

        wfLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        wfLabel1.setText("Weather Forecast");
        nastaveniWFPanel.add(wfLabel1);
        wfLabel1.setBounds(30, 20, 330, 50);

        wfLabel2.setText("Red");
        nastaveniWFPanel.add(wfLabel2);
        wfLabel2.setBounds(40, 100, 30, 30);

        wfLabel3.setText("Green");
        nastaveniWFPanel.add(wfLabel3);
        wfLabel3.setBounds(30, 160, 40, 30);

        wfLabel4.setText("Blue");
        nastaveniWFPanel.add(wfLabel4);
        wfLabel4.setBounds(40, 230, 30, 30);

        wfLabel5.setText("transparency");
        nastaveniWFPanel.add(wfLabel5);
        wfLabel5.setBounds(20, 300, 90, 20);

        wfLabel6.setBackground(new java.awt.Color(153, 153, 153));
        wfLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        wfLabel6.setText("100");
        wfLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nastaveniWFPanel.add(wfLabel6);
        wfLabel6.setBounds(350, 300, 40, 30);

        wfSpinnerR.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        nastaveniWFPanel.add(wfSpinnerR);
        wfSpinnerR.setBounds(140, 90, 70, 30);

        wfSpinnerG.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        nastaveniWFPanel.add(wfSpinnerG);
        wfSpinnerG.setBounds(140, 160, 70, 30);

        wfSpinnerB.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        nastaveniWFPanel.add(wfSpinnerB);
        wfSpinnerB.setBounds(140, 230, 70, 30);

        wfPreview.setText("preview");
        wfPreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wfPreviewActionPerformed(evt);
            }
        });
        nastaveniWFPanel.add(wfPreview);
        wfPreview.setBounds(470, 210, 100, 40);

        panelProOstatniPanely.add(nastaveniWFPanel, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(horniTlacitka, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelProOstatniPanely, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(okTlacitko, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(horniTlacitka, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelProOstatniPanely, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(okTlacitko, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hodinyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hodinyActionPerformed
        // TODO add your handling code here:
        AktivHodiny = hodiny.isSelected();
      
    }//GEN-LAST:event_hodinyActionPerformed

    private void okTlacitkoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okTlacitkoActionPerformed
    if(firstTime){
         o = new Okno();
         firstTime = false;
    }
    else{
        o.revalidate();
        o.repaint();
    }
    
    o.getPanelTime().getPanelBackground().setBackground(new Color((Integer)timeSpinnerR.getValue(),(Integer)timeSpinnerG.getValue(),(Integer)timeSpinnerB.getValue(),timeSlider.getValue()));
    o.getPanelSearch().getPanelBackground().setBackground(new Color((Integer)searchSpinnerR.getValue(),(Integer)searchSpinnerG.getValue(),(Integer)searchSpinnerB.getValue(),searchSlider.getValue()));
    o.getPanelWBC().getPanelBackground().setBackground(new Color((Integer)wbcSpinnerR.getValue(),(Integer)wbcSpinnerG.getValue(),(Integer)wbcSpinnerB.getValue(),wbcSlider.getValue()));
    o.getPanelWF().getPanelBackground().setBackground(new Color((Integer)wfSpinnerR.getValue(),(Integer)wfSpinnerG.getValue(),(Integer)wfSpinnerB.getValue(),wfSlider.getValue()));
    
    
    System.out.println(AktivHodiny);
    System.out.println(AktivHWeatherByCity);
    System.out.println(AktivWeatherForecast);
    System.out.println(AktivSearch);
    
    addPanels();
  
  
    }//GEN-LAST:event_okTlacitkoActionPerformed

    private void WeatherByCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WeatherByCityActionPerformed
        // TODO add your handling code here:
        AktivHWeatherByCity = WeatherByCity.isSelected();
    }//GEN-LAST:event_WeatherByCityActionPerformed

    private void WeatherForCastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WeatherForCastActionPerformed
        // TODO add your handling code here:
        AktivWeatherForecast = WeatherForCast.isSelected();
    }//GEN-LAST:event_WeatherForCastActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        AktivSearch = Search.isSelected();
    }//GEN-LAST:event_SearchActionPerformed

    private void mainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainButtonActionPerformed
       panelProOstatniPanely.removeAll();
       panelProOstatniPanely.repaint();
       panelProOstatniPanely.revalidate();
        
       panelProOstatniPanely.add(nastaveniMainPanel);
       panelProOstatniPanely.repaint();
       panelProOstatniPanely.revalidate();
    }//GEN-LAST:event_mainButtonActionPerformed

    private void timeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeButtonActionPerformed
       panelProOstatniPanely.removeAll();
       panelProOstatniPanely.repaint();
       panelProOstatniPanely.revalidate();
        
       panelProOstatniPanely.add(nastaveniTimePanel);
       panelProOstatniPanely.repaint();
       panelProOstatniPanely.revalidate();
    }//GEN-LAST:event_timeButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        panelProOstatniPanely.removeAll();
       panelProOstatniPanely.repaint();
       panelProOstatniPanely.revalidate();
        
       panelProOstatniPanely.add(nastaveniSearchPanel);
       panelProOstatniPanely.repaint();
       panelProOstatniPanely.revalidate();
    }//GEN-LAST:event_searchButtonActionPerformed

    private void wbcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wbcButtonActionPerformed
        // TODO add your handling code here:
       panelProOstatniPanely.removeAll();
       panelProOstatniPanely.repaint();
       panelProOstatniPanely.revalidate();
        
       panelProOstatniPanely.add(nastatveniWBCPanel);
       panelProOstatniPanely.repaint();
       panelProOstatniPanely.revalidate();
    }//GEN-LAST:event_wbcButtonActionPerformed

    private void wfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wfButtonActionPerformed
        // TODO add your handling code here:
       panelProOstatniPanely.removeAll();
       panelProOstatniPanely.repaint();
       panelProOstatniPanely.revalidate();
        
       panelProOstatniPanely.add(nastaveniWFPanel);
       panelProOstatniPanely.repaint();
       panelProOstatniPanely.revalidate();
    }//GEN-LAST:event_wfButtonActionPerformed

    private void timeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_timeSliderStateChanged
        // TODO add your handling code here:
        timeLabel6.setText(Integer.toString(timeSlider.getValue()));
    }//GEN-LAST:event_timeSliderStateChanged

    private void searchSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_searchSliderStateChanged
        // TODO add your handling code here:
        searchLabel6.setText(Integer.toString(searchSlider.getValue()));
    }//GEN-LAST:event_searchSliderStateChanged

    private void wbcSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_wbcSliderStateChanged
        // TODO add your handling code here:
        wbcLabel6.setText(Integer.toString(wbcSlider.getValue()));
    }//GEN-LAST:event_wbcSliderStateChanged

    private void wfSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_wfSliderStateChanged
        // TODO add your handling code here:
        wfLabel6.setText(Integer.toString(wfSlider.getValue()));
    }//GEN-LAST:event_wfSliderStateChanged

    private void timePreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timePreviewActionPerformed
        // TODO add your handling code here:
        panelBarva.setBackground(new Color((Integer)timeSpinnerR.getValue(),(Integer)timeSpinnerG.getValue(),(Integer)timeSpinnerB.getValue(),timeSlider.getValue()));
    }//GEN-LAST:event_timePreviewActionPerformed

    private void searchPreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPreviewActionPerformed
        // TODO add your handling code here:
        panelBarva.setBackground(new Color((Integer)searchSpinnerR.getValue(),(Integer)searchSpinnerG.getValue(),(Integer)searchSpinnerB.getValue(),searchSlider.getValue()));
    }//GEN-LAST:event_searchPreviewActionPerformed

    private void wbcPreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wbcPreviewActionPerformed
        // TODO add your handling code here:
        panelBarva.setBackground(new Color((Integer)wbcSpinnerR.getValue(),(Integer)wbcSpinnerG.getValue(),(Integer)wbcSpinnerB.getValue(),wbcSlider.getValue()));
    }//GEN-LAST:event_wbcPreviewActionPerformed

    private void wfPreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wfPreviewActionPerformed
        // TODO add your handling code here:
        panelBarva.setBackground(new Color((Integer)wfSpinnerR.getValue(),(Integer)wfSpinnerG.getValue(),(Integer)wfSpinnerB.getValue(),wfSlider.getValue()));
    }//GEN-LAST:event_wfPreviewActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Manager().setVisible(true);
               
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Search;
    private javax.swing.JCheckBox WeatherByCity;
    private javax.swing.JCheckBox WeatherForCast;
    private javax.swing.JCheckBox hodiny;
    private javax.swing.JPanel horniTlacitka;
    private javax.swing.JButton mainButton;
    private javax.swing.JPanel nastatveniWBCPanel;
    private javax.swing.JPanel nastaveniMainPanel;
    private javax.swing.JPanel nastaveniSearchPanel;
    private javax.swing.JPanel nastaveniTimePanel;
    private javax.swing.JPanel nastaveniWFPanel;
    private javax.swing.JButton okTlacitko;
    private javax.swing.JPanel panelProOstatniPanely;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel searchLabel1;
    private javax.swing.JLabel searchLabel2;
    private javax.swing.JLabel searchLabel3;
    private javax.swing.JLabel searchLabel4;
    private javax.swing.JLabel searchLabel5;
    private javax.swing.JLabel searchLabel6;
    private javax.swing.JButton searchPreview;
    private javax.swing.JSlider searchSlider;
    private javax.swing.JSpinner searchSpinnerB;
    private javax.swing.JSpinner searchSpinnerG;
    private javax.swing.JSpinner searchSpinnerR;
    private javax.swing.JButton timeButton;
    private javax.swing.JLabel timeLabel1;
    private javax.swing.JLabel timeLabel2;
    private javax.swing.JLabel timeLabel3;
    private javax.swing.JLabel timeLabel4;
    private javax.swing.JLabel timeLabel5;
    private javax.swing.JLabel timeLabel6;
    private javax.swing.JButton timePreview;
    private javax.swing.JSlider timeSlider;
    private javax.swing.JSpinner timeSpinnerB;
    private javax.swing.JSpinner timeSpinnerG;
    private javax.swing.JSpinner timeSpinnerR;
    private javax.swing.JButton wbcButton;
    private javax.swing.JLabel wbcLabel1;
    private javax.swing.JLabel wbcLabel2;
    private javax.swing.JLabel wbcLabel3;
    private javax.swing.JLabel wbcLabel4;
    private javax.swing.JLabel wbcLabel5;
    private javax.swing.JLabel wbcLabel6;
    private javax.swing.JButton wbcPreview;
    private javax.swing.JSlider wbcSlider;
    private javax.swing.JSpinner wbcSpinnerB;
    private javax.swing.JSpinner wbcSpinnerG;
    private javax.swing.JSpinner wbcSpinnerR;
    private javax.swing.JButton wfButton;
    private javax.swing.JLabel wfLabel1;
    private javax.swing.JLabel wfLabel2;
    private javax.swing.JLabel wfLabel3;
    private javax.swing.JLabel wfLabel4;
    private javax.swing.JLabel wfLabel5;
    private javax.swing.JLabel wfLabel6;
    private javax.swing.JButton wfPreview;
    private javax.swing.JSlider wfSlider;
    private javax.swing.JSpinner wfSpinnerB;
    private javax.swing.JSpinner wfSpinnerG;
    private javax.swing.JSpinner wfSpinnerR;
    // End of variables declaration//GEN-END:variables

    
    public void addPanels(){
     if(AktivHodiny){
     o.getPanelTime().getPanelBackground().setVisible(true);
     }
     else{
     o.getPanelTime().getPanelBackground().setVisible(false);
     }
     //--------------------------------------------
    if(AktivSearch){
     o.getPanelSearch().getPanelBackground().setVisible(true);
     }
     else{
     o.getPanelSearch().getPanelBackground().setVisible(false);
     }
     //--------------------------------------
     if(AktivHWeatherByCity){
     o.getPanelWBC().getPanelBackground().setVisible(true);
     }
     else{
     o.getPanelWBC().getPanelBackground().setVisible(false);
     }
     //-----------------------------------------
    if(AktivWeatherForecast){
     o.getPanelWF().getPanelBackground().setVisible(true);
     }
     else{
     o.getPanelWF().getPanelBackground().setVisible(false);
     }
    }
       
}

class PanelBarva extends JPanel{
       @Override
    protected void paintComponent(Graphics g)
    {
        g.setColor( getBackground() );
        g.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g);
    }



}
