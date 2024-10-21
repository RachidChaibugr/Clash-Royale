/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyale;

import model.Estructura;
import model.Tropa;
import model.Mazo;

/**
 *
 * @author Rachi
 */
public class ClashRoyale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estructura e1 = new Estructura();
        Estructura e2 = new Estructura(2,2,2,2,2);
        Estructura e3 = new Estructura(e2);
        
        Tropa t1 = new Tropa();
        Tropa t2 = new Tropa(2,2,2,2,2);
        Tropa t3 = new Tropa(t2);
        /*
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        
        System.out.println("Puntos de salud:" + e1.getPuntosSalud());
        System.out.println("Danio:" + e1.getDanio());
        System.out.println("Perdida de salud:" + e1.getPerdidaVida());
        System.out.println("Rango de ataque:" + e1.getRangoAtaque());
        System.out.println("Velocidad de ataque:" + e1.getVelocidadAtaque());
        
        e1.setPuntosSalud(3);
        System.out.println("Puntos de salud:" + e1.getPuntosSalud());
        
        e1.setDanio(3);
        System.out.println("Danio:" + e1.getDanio());
        
        e1.setPerdidaVida(3);
        System.out.println("Perdida de salud:" + e1.getPerdidaVida());
        
        e1.setRangoAtaque(3);
        System.out.println("Rango de ataque:" + e1.getRangoAtaque());

        e1.setVelocidadAtaque(3);
        System.out.println("Velocidad de ataque:" + e1.getVelocidadAtaque());

        */
        
        Mazo mazo = new Mazo();
        
        System.out.println("¿Puede añadirse la carta e1?:" + mazo.aniadirCarta(e1));
        System.out.println("¿Puede añadirse la carta e2?:" + mazo.aniadirCarta(e2));
        System.out.println("¿Puede añadirse la carta e3?:" + mazo.aniadirCarta(e3));

        System.out.println("¿Puede añadirse la carta t1?:" + mazo.aniadirCarta(t1));
        System.out.println("¿Puede añadirse la carta t2?:" + mazo.aniadirCarta(t2));
        System.out.println("¿Puede añadirse la carta t3?:" + mazo.aniadirCarta(t3));
        
        System.out.println("¿Puede volver a añadirse la carta e1?:" + mazo.aniadirCarta(e1));

        System.out.println("¿Puede eliminarse la carta e1?:" + mazo.eliminarCarta(e1));
        
        System.out.println("¿Puede sacarse una carta del mazo?:" + mazo.sacarCarta());
        System.out.println("¿Puede sacarse una carta del mazo?:" + mazo.sacarCarta());
        System.out.println("¿Puede sacarse una carta del mazo?:" + mazo.sacarCarta());
        System.out.println("¿Puede sacarse una carta del mazo?:" + mazo.sacarCarta());
        System.out.println("¿Puede sacarse una carta del mazo?:" + mazo.sacarCarta());
        System.out.println("¿Puede sacarse una carta del mazo?:" + mazo.sacarCarta());
        
        System.out.println("Mazo:" + mazo.toString());


    }
    
}
