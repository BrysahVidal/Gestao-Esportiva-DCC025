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
public class Jogador {
    private  int id ;
    private static int total_id = 0;
    private String nome;
    private String posicao;
    private String numero;
    private static List<Jogador> jogadores = new ArrayList<>();
    private String time_associado;

    public Jogador() {
    }

    public Jogador(String nome, String posicao, String numero, String time_associado) {
        this.nome = nome;
        this.posicao = posicao;
        this.numero = numero;
        this.time_associado = time_associado;
        total_id++;
        this.id = total_id;
        jogadores.add(this);
    }

    public static int getTotal_id() {
        return total_id;
    }

    public static void setTotal_id() {
        total_id++;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public static List<Jogador> getJogadores() {
        return jogadores;
    }

    public static void setJogadores(List<Jogador> jogadores) {
        Jogador.jogadores = jogadores;
    }

    public String getTime_associado() {
        return time_associado;
    }

    public void setTime_associado(String time_associado) {
        this.time_associado = time_associado;
    }
    
    public static void adicionaLista(Jogador user) {
        jogadores.add(user);
    }

    public int getId() {
        return id;
    }
    public int setId() {
        return  this.id = total_id;
    }
    public Jogador buscaJogadores(int id_jogador)
    {
        for(Jogador j : getJogadores())
        {
            if(j.getId() == id_jogador)
            {
                return j;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Jogador{" + "id=" + id + ", nome=" + nome + ", posicao=" + posicao + ", numero=" + numero + ", time_associado=" + time_associado + '}';
    }
   
    
}
