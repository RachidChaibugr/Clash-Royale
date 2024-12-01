package model;

import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


/**
 *
 * @author Rachi
 */
public class Mazo {
    public static final int MAX_CARTAS = 8;
    public static final int CARTAS_MANO = 4;
    
    private boolean mezclado;
    
    private Queue<Carta> mazo = new LinkedList<>();
    

    public Mazo() {
        this.mezclado = false;
    }

    public Queue<Carta> getMazo() {
        return mazo;
    }

    public boolean aniadirCarta(Carta carta){
        if(mazo.size() < MAX_CARTAS && !mazo.contains(carta)){
            mazo.add(carta);
            mezclado = false;
            return true;
        }
        return false;
    }
    
    public boolean eliminarCarta(Carta carta){
        if(mazo.contains(carta)){
            mazo.remove(carta);
            mezclado = false;
            return true;
        }
        return false;
    }
    
    public Carta sacarCarta(){
        if(!mezclado){
            List<Carta> aux = new ArrayList<>(mazo);
            Collections.shuffle(aux);
            mazo.clear();
            for(Carta carta : aux){
                mazo.add(carta);
            }
            mezclado = true;
        }
        Carta carta = mazo.poll();
        mazo.add(carta);
        return carta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mazo{");
        sb.append("mezclado=").append(mezclado);
        sb.append(", mazo=\n");
        for(Carta carta : mazo){
            sb.append(carta.toString()).append("\n");
        }
        sb.append('}');
        return sb.toString();
    }
    
    public Carta getCartaMayorVida(){
        Carta mayorSalud = null;
        int maxVida = Integer.MIN_VALUE;
        
        for(Carta carta : mazo){
            if(carta.getPuntosSalud() < maxVida){
                maxVida = carta.getPuntosSalud();
                mayorSalud = carta;
            }
        }
        return mayorSalud;
    }
    
    public List<Estructura> getEstructuras(){
        List<Estructura> estructuras = new ArrayList<>();
        for(Carta carta : mazo){
            if(carta.getTipo() == TipoCarta.ESTRUCTURA){
                estructuras.add((Estructura) carta);
            }
        }
        return estructuras;
    }
    
    
    
}
