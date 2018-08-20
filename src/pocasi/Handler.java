/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pocasi;

import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author bohou
 */
public class Handler {
   private static Okno okno;
    
    public Handler(Okno okno){
           this.okno = okno;
    }

    public Okno getOkno() {
        return okno;
    }
    

    public void setOkno(Okno okno) {
        this.okno = okno;
    }

    public WeatherByCity getWeatherByCity(){
        return okno.getPanelSearch().getWeatherByCity();
    }
    
    public String getWeatherByCityIcon(){
        return okno.getPanelSearch().getWeatherByCity().getWeatherIcon();
    }
    
    public WeatherForecast getWeatherForecast(){
        return okno.getPanelSearch().getWeatherForecast();
    }
    
    public String getWeatherForecastIcon(int x){
        return okno.getPanelSearch().getWeatherForecast().getArrayValue(x,3);
    }
    
    public JLabel getLabel(){
        return okno.getPanelWBC().getLabel();
    }
    
    public JTextArea getTextArea(){
        return okno.getPanelWBC().getTextarea();
    }
    
    public JLabel getLabel1(){
        return okno.getPanelWF().getLabel1();
    }
    
    public JLabel getLabel2(){
        return okno.getPanelWF().getLabel2();
    }
    
    public JLabel getLabel3(){
        return okno.getPanelWF().getLabel3();
    }
}
