/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc025.gestaoesportiva.control;

import dcc025.gestaoesportiva.model.Campeonato;
import dcc025.gestaoesportiva.model.ConfrontoDireto;
import dcc025.gestaoesportiva.model.Data;
import dcc025.gestaoesportiva.model.Horario;
import dcc025.gestaoesportiva.model.Jogo;
import dcc025.gestaoesportiva.model.Placar;
import dcc025.gestaoesportiva.model.Pontuacao;
import dcc025.gestaoesportiva.model.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author brysa
 */
public class DefinePodio {
    private Campeonato campeonato;
    public DefinePodio(Campeonato campeonato) {
        this.campeonato = campeonato;
        int primeiro = Time.getTimes().get(0).getPontuacao().getPontos();
        int cont = 0;
       for(Time t : Time.getTimes())
       {
           if(t.getPontuacao().getPontos() == primeiro)
           {
               if(t.getPontuacao().getVitorias() > primeiro)
               {
                   campeonato.setCampeao(t.getNome());
               }else if (t.getPontuacao().getVitorias() < primeiro)
               {
                   campeonato.setCampeao(Time.getTimes().get(0).getNome());
               }
               else{
                    List <Jogo> aux = new ArrayList<>();
                    Data data = new Data();
                    Horario h = new Horario();
                    Placar p;
                    p = new Placar(-1,-1);
                    ConfrontoDireto confronto_direto = new ConfrontoDireto(t,Time.getTimes().get(0),data,h,p);
                    aux = t.getJogos_realizados();
                    aux.add(confronto_direto);
                    t.setJogos_realizados(aux);
                    aux = Time.getTimes().get(0).getJogos_realizados();
                    aux.add(confronto_direto);
                    Time.getTimes().get(0).setJogos_realizados(aux);
                    JOptionPane.showMessageDialog(null,"Confronto direto adicionado");
               }
                       
               
           }
       }
        
    }
    
    
}
