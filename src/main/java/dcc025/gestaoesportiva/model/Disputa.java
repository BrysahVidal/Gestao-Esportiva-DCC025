/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dcc025.gestaoesportiva.model;

/**
 *
 * @author brysa
 */
public interface Disputa {
    void defineJogosDisputa(int n_times) ;
    void encerraRodada()throws Exception;
    void computaResultados(Jogo j)throws Exception;
}
