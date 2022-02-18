/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc025.gestaoesportiva.model;

/**
 *
 * @author brysa
 */
public class Pontuacao {
    private Time time;
    private   int posicao; 
    private   int vitorias;
    private   int derrotas;
    private   int empate;
    private   int pontos;

    public Pontuacao(Time time, int vitorias, int derrotas, int pontos,int posicao) {
        this.time = time;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.pontos = pontos;
        this.posicao = posicao;      
    }

    

    public Pontuacao() {
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }


    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
    
    
    


    @Override
    public String toString() {
        return pontos + "";
    }
    
    
}
