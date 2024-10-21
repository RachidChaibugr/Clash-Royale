/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyale;

import model.Estructura;
import model.Tropa;

/**
 *
 * @author Rachi
 */
public class ClashRoyale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estructura t1 = new Estructura();
        Estructura t2 = new Estructura(2,2,2,2,2);
        Estructura t3 = new Estructura(t2);
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        
        System.out.println("Puntos de salud:" + t1.getPuntosSalud());
        System.out.println("Danio:" + t1.getDanio());
        System.out.println("Perdida de salud:" + t1.getPerdidaVida());
        System.out.println("Rango de ataque:" + t1.getRangoAtaque());
        System.out.println("Velocidad de ataque:" + t1.getVelocidadAtaque());
        
        t1.setPuntosSalud(3);
        System.out.println("Puntos de salud:" + t1.getPuntosSalud());
        
        t1.setDanio(3);
        System.out.println("Danio:" + t1.getDanio());
        
        t1.setPerdidaVida(3);
        System.out.println("Perdida de salud:" + t1.getPerdidaVida());
        
        t1.setRangoAtaque(3);
        System.out.println("Rango de ataque:" + t1.getRangoAtaque());

        t1.setVelocidadAtaque(3);
        System.out.println("Velocidad de ataque:" + t1.getVelocidadAtaque());

    }
    
}
