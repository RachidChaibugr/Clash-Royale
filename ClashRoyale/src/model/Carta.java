/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

/**
 *
 * @author Rachi
 */
public interface Carta {
    public TipoCarta getTipo();
    public int getPuntosSalud();
    public void setPuntosSalud(int puntosSalud);
    public int getDanio();
    public void setDanio(int danio);
    public int getRangoAtaque();
    public void setRangoAtaque(int rangoAtaque);
    public int getVelocidadAtaque();
    public void setVelocidadAtaque(int velocidadAtaque);
}
