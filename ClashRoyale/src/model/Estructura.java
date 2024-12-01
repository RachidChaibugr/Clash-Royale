/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Rachi
 */
public class Estructura implements Carta{
    public static final int PUNTOS_SALUD = 1;
    public static final int DANIO = 1;
    public static final int PERDIDA_VIDA = 1;
    public static final int RANGO_ATAQUE = 1;
    public static final int VELOCIDAD_ATAQUE = 1;
    
    private int puntosSalud;
    private int danio;
    private int perdidaVida;
    private int rangoAtaque;
    private int velocidadAtaque;
    private final TipoCarta tipo = TipoCarta.ESTRUCTURA;

    public Estructura(int puntosSalud, int danio, int perdidaVida, int rangoAtaque, int velocidadAtaque) {
        this.puntosSalud = puntosSalud;
        this.danio = danio;
        this.perdidaVida = perdidaVida;
        this.rangoAtaque = rangoAtaque;
        this.velocidadAtaque = velocidadAtaque;
        this.tipo = TipoCarta.ESTRUCTURA;
    }

    public Estructura() {
        this(PUNTOS_SALUD,DANIO,PERDIDA_VIDA,RANGO_ATAQUE,VELOCIDAD_ATAQUE);
    }
    
    public Estructura(Estructura otro){
        this(otro.puntosSalud, otro.danio, otro.perdidaVida, otro.rangoAtaque, otro.velocidadAtaque);
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

    public int getPerdidaVida() {
        return perdidaVida;
    }

    public void setPerdidaVida(int perdidaVida) {
        this.perdidaVida = perdidaVida;
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

    public TipoCarta getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estructura{");
        sb.append("puntosSalud=").append(puntosSalud);
        sb.append(", danio=").append(danio);
        sb.append(", perdidaVida=").append(perdidaVida);
        sb.append(", rangoAtaque=").append(rangoAtaque);
        sb.append(", velocidadAtaque=").append(velocidadAtaque);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
    
}
