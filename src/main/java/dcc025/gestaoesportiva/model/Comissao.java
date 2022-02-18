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
public class Comissao extends Usuario{

    private static List <Usuario> lista_comissao = new ArrayList<>();

    public static List <Usuario> getLista() {
        return lista_comissao;
    }

    public static void setLista(List <Usuario> aLista_comissao) {
        lista_comissao = aLista_comissao;
    }
    
    public static void adicionaLista(Comissao user) {
        lista_comissao.add(user);
    }
   
}
