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
public class Time {
    private  int id ;
    private static int total_id = 0;
    private String nome;
    private Tecnico tecnico;
    private  Pontuacao pontuacao;
    private static List<Time> times = new ArrayList<>();
    private List<Jogo> jogos_realizados = new ArrayList<>();
    private List<Jogador> lista_jogadores = new ArrayList<>();

    public Time(String nome, Tecnico tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.pontuacao = new Pontuacao(this,0,0,0,-1);
        total_id++;
        this.id = total_id;
        times.add(this);
        
    }
     public int getId() {
        return id;
    }

    public List<Jogador> getLista_jogadores() {
        return lista_jogadores;
    }

    public void setLista_jogadores(List<Jogador> lista_jogadores) {
        this.lista_jogadores = lista_jogadores;
    }
   
     public static List<Time> getTimes() {
        return times;
    }

    public static void setTimes(List<Time> times) {
        Time.times = times;
    }


    public Time() {
    }

    public List<Jogo> getJogos_realizados() {
        return jogos_realizados;
    }

    public void setJogos_realizados(List<Jogo> jogos_realizados) {
        this.jogos_realizados = jogos_realizados;
    }

    public Pontuacao getPontuacao() {
        return pontuacao;
    }
    public String getPontuacaoString() {
        String a = this.pontuacao.toString();
        return a;
    }

    public void setPontuacao(Pontuacao pontuacao) {
        this.pontuacao = pontuacao;
    }

    

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Time buscaTime(String nome_time)
    {
        for(Time i : Time.getTimes())
        {
            if(i.nome.equals(nome_time))
            {
                return i;
            }
        }
        return null;
    }
    
    
    
}
