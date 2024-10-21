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
    
    private Queue<Object> mazo = new LinkedList<>();
    

    public Mazo() {
        this.mezclado = false;
    }

    public Queue<Object> getMazo() {
        return mazo;
    }

    public boolean aniadirCarta(Object carta){
        if(mazo.size() < MAX_CARTAS && !mazo.contains(carta)){
            mazo.add(carta);
            mezclado = false;
            return true;
        }
        return false;
    }
    
    public boolean eliminarCarta(Object carta){
        if(mazo.contains(carta)){
            mazo.remove(carta);
            mezclado = false;
            return true;
        }
        return false;
    }
    
    public Object sacarCarta(){
        if(!mezclado){
            List<Object> aux = new ArrayList<>(mazo);
            Collections.shuffle(aux);
            mazo.clear();
            for(Object carta : aux){
                mazo.add(carta);
            }
            mezclado = true;
        }
        Object carta = mazo.poll();
        mazo.add(carta);
        return carta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mazo{");
        sb.append("mezclado=").append(mezclado);
        sb.append(", mazo=");
        for(Object carta : mazo){
            sb.append(carta.toString());
        }
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}
