/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaleatorios;

/**
 *
 * @author POCYX
 */
public class Jugador {

    private int mondadientes;
    private int puntos;
    private int id;
    private boolean on;
    private String nombre;
    
    public Jugador(){
        this.mondadientes = 5;
    }
    
    /**
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre this
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     *
     * @return on
     */
    public boolean getOn() {
        return on;
    }

    /**
     *
     * @param on this
     */
    public void setOn(boolean on) {
        this.on = on;
    }

    /**
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id this
     */
    public void setId(int id) {
        this.id = id;
    }   

    /**
     *
     * @return puntos
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     *
     * @param puntos this
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }    

    /**
     *
     * @return mondadientes
     */
    public int getMondadientes() {
        return mondadientes;
    }

    /**
     *
     * @param mondadientes this
     */
    public void setMondadientes(int mondadientes) {
        this.mondadientes = mondadientes;
    }
 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("\nPLAYER: ");
        sb.append(id);
        
        sb.append("\nNombre: ");
        sb.append(nombre);

        //sb.append("\nMondadientes: ");
        //sb.append(mondadientes);    
        
        sb.append("\nPuntos: \n");
        sb.append(puntos+"\n");
        
        return sb.toString();
    }   

    
}
