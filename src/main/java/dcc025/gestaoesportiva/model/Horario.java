/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc025.gestaoesportiva.model;

/**
 *
 * @author brysa
 */
public class Horario {
    private int hora;
    private int minuto;

    public Horario() {
    }

    public Horario(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    @Override
    public String toString() {
        if(hora == 0  && minuto == 0)return "A Definir";
        else return   hora + ":" + minuto ;
    }
    
    
}
