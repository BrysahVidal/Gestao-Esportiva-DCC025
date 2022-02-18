/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc025.gestaoesportiva.model;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author brysa
 */
public abstract class Jogo {
    private  int id ;
    private static int total_id = 0;
    private Time tCasa;
    private Time tVisitante;
    private Data data;
    private Horario horario;
    
    private List <Jogador> escalacao_casa = new ArrayList<>();
    private List <Jogador> escalacao_visitante = new ArrayList<>();    
    private static List <Jogo> jogos = new ArrayList<>();
    
    public Jogo() {
    }

    public Jogo(Time tCasa, Time tVisitante, Data data, Horario horario) {
        this.tCasa = tCasa;
        this.tVisitante = tVisitante;
        this.data = data;
        this.horario = horario;
        total_id++;
        this.id = total_id;
        jogos.add(this);
    }

    public static List<Jogo> getJogos() {
        return jogos;
    }

    public static void setJogos(List<Jogo> jogos) {
        Jogo.jogos = jogos;
    }

    

   

    public List<Jogador> getEscalacao_casa() {
        return escalacao_casa;
    }

    public void setEscalacao_casa(List<Jogador> escalacao_casa) {
        this.escalacao_casa = escalacao_casa;
    }

    public List<Jogador> getEscalacao_visitante() {
        return escalacao_visitante;
    }

    public void setEscalacao_visitante(List<Jogador> escalacao_visitante) {
        this.escalacao_visitante = escalacao_visitante;
    }
    
    
    public abstract void setPlacar(Placar placar)throws Exception;
    public abstract Placar getPlacar( ) ;
    
    public Time gettCasa() {
        return tCasa;
    }

    public void settCasa(Time tCasa) {
        this.tCasa = tCasa;
    }

    public Time gettVisitante() {
        return tVisitante;
    }

    public void settVisitante(Time tVisitante) {
        this.tVisitante = tVisitante;
    }

    public Data getData() {
        return data;
    }

    public void setData(String data) throws Exception{
           if(data.matches("^[0-9]+/[0-9]+/[0-9]+$"))
           {               
           String [] div  = data.split("/");
           this.data.setDia(Integer.parseInt(div[0]) );
           this.data.setMes(Integer.parseInt(div[1]));
           this.data.setAno(Integer.parseInt(div[2]));

          }
       else{
          throw new Exception("Formato de data invalido: DD/MM/AAAA");
       }
      
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(String horario)throws Exception {
        if(horario.matches("^[0-2][0-3]:[0-5][0-9]$"))
           {               
           String [] div  = horario.split(":");
           this.horario.setHora(Integer.parseInt(div[0]) );
           this.horario.setMinuto(Integer.parseInt(div[1]));

          }
       else{
          throw new Exception("Formato de hora invalido: HH:MM");
       }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
      public abstract Jogo buscaJogo(int id_jogo);

    @Override
    public String toString() {
        return "Jogo{" + "id=" + id + ", tCasa=" + tCasa + ", tVisitante=" + tVisitante + ", data=" + data + ", horario=" + horario ;
    }

   
    
}
