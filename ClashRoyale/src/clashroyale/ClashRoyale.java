/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyale;

/**
 *
 * @author Rachi
 */
public class ClashRoyale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tropa t1 = new Tropa();
        Tropa t2 = new Tropa(2,2,2,2,2);
        Tropa t3 = new Tropa(t2);
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        
        System.out.println("Puntos de salud:" + t1.getPuntosSalud());
        System.out.println("Danio:" + t1.getDanio());
        System.out.println("Velocidad de movimiento:" + t1.getVelocidadMovimiento());
        System.out.println("Rango de ataque:" + t1.getRangoAtaque());
        System.out.println("Velocidad de ataque:" + t1.getVelocidadAtaque());
        
        

    }
    
}
