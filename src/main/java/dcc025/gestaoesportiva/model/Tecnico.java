/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc025.gestaoesportiva.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brysa
 */
public class Tecnico  extends Usuario{
    private String time_associado;
     private static List <Tecnico> lista_tecnico = new ArrayList<>();

    public static List <Tecnico> getLista() {
        return lista_tecnico;
    }

    public static void setLista(List <Tecnico> aLista_comissao) {
        lista_tecnico = aLista_comissao;
    }
    
    public static void adicionaLista(Tecnico user) {
        lista_tecnico.add(user);
    }
 
    public String getTime_associado() {
        return time_associado;
    }

    public void setTime_associado(String time_associado) {
        this.time_associado = time_associado;
    }
    
    @Override
    public String toString() {
        return "" + time_associado;
    }
    
}
