/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clashroyale;

/**
 *
 * @author Rachi
 */
public class Tropa {
    public static final int PUNTOS_SALUD = 1;
    public static final int DANIO = 1;
    public static final int VELOCIDAD_MOVIMIENTO = 1;
    public static final int RANGO_ATAQUE = 1;
    public static final int VELOCIDAD_ATAQUE = 1;
    
    private int puntosSalud;
    private int danio;
    private int velocidadMovimiento;
    private int rangoAtaque;
    private int velocidadAtaque;

    public int getPuntosSalud() {
        return puntosSalud;
    }

    public void setPuntosSalud(int puntosSalud) {
        this.puntosSalud = puntosSalud;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public int getVelocidadMovimiento() {
        return velocidadMovimiento;
    }

    public void setVelocidadMovimiento(int velocidadMovimiento) {
        this.velocidadMovimiento = velocidadMovimiento;
    }

    public int getRangoAtaque() {
        return rangoAtaque;
    }

    public void setRangoAtaque(int rangoAtaque) {
        this.rangoAtaque = rangoAtaque;
    }

    public int getVelocidadAtaque() {
        return velocidadAtaque;
    }

    public void setVelocidadAtaque(int velocidadAtaque) {
        this.velocidadAtaque = velocidadAtaque;
    }

    public Tropa(int puntosSalud, int danio, int velocidadMovimiento, int rangoAtaque, int velocidadAtaque) {
        this.puntosSalud = puntosSalud;
        this.danio = danio;
        this.velocidadMovimiento = velocidadMovimiento;
        this.rangoAtaque = rangoAtaque;
        this.velocidadAtaque = velocidadAtaque;
    }
    
    public Tropa(){
        this(PUNTOS_SALUD,DANIO,VELOCIDAD_MOVIMIENTO,RANGO_ATAQUE,VELOCIDAD_ATAQUE);
    }
    
    public Tropa(Tropa otro){
        this(otro.puntosSalud, otro.danio, otro.velocidadMovimiento, otro.rangoAtaque, otro.velocidadAtaque);
    }

    @Override
    public String toString() {
        return "Tropa{" + "puntosSalud=" + puntosSalud + ", danio=" + danio + ", velocidadMovimiento=" + velocidadMovimiento + ", rangoAtaque=" + rangoAtaque + ", velocidadAtaque=" + velocidadAtaque + '}';
    }
    
    
    
}
