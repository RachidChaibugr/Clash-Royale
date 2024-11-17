/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.MainView;


/**
 *
 * @author Rachi
 */
public class Controller {
    private MainView view;

    public Controller(MainView view) {
        this.view = view;
        view.setVisible(true);
        initController();
    }
    
    private void initController(){
        view.getjButton1().addActionListener(e -> iniciarBatalla());
    }
    
    private void iniciarBatalla(){
        view.cambiarImagenFondo("/img/arena.jpg");
        view.getjButton1().setVisible(false);
    }
    
    
}
