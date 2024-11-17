/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyale;

import controller.Controller;
import view.MainView;

/**
 *
 * @author Rachi
 */
public class ClashRoyale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MainView view = new MainView();
        
        Controller controller = new Controller(view);


    }
    
}
