/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubicua;

import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Don Portatil
 */
public class Tramo {
    ArrayList<JPanel> carreteras;
    int tiempo;
    
    public Tramo(ArrayList<JPanel> carreteras, int tiempo){
        this.tiempo = tiempo;
        this.carreteras = new ArrayList();
        for(JPanel x : carreteras){
            this.carreteras.add(x);
        }
    }
}
