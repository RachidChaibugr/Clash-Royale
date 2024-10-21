/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

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
    private TipoCarta tipo;

    public TipoCarta getTipo() {
        return tipo;
    }

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
        this.tipo= TipoCarta.TROPA;
    }
    
    public Tropa(){
        this(PUNTOS_SALUD,DANIO,VELOCIDAD_MOVIMIENTO,RANGO_ATAQUE,VELOCIDAD_ATAQUE);
    }
    
    public Tropa(Tropa otro){
        this(otro.puntosSalud, otro.danio, otro.velocidadMovimiento, otro.rangoAtaque, otro.velocidadAtaque);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tropa{");
        sb.append("puntosSalud=").append(puntosSalud);
        sb.append(", danio=").append(danio);
        sb.append(", velocidadMovimiento=").append(velocidadMovimiento);
        sb.append(", rangoAtaque=").append(rangoAtaque);
        sb.append(", velocidadAtaque=").append(velocidadAtaque);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
}
