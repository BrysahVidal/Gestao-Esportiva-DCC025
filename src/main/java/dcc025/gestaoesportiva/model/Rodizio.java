/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc025.gestaoesportiva.model;

import dcc025.gestaoesportiva.control.DefinePodio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author brysa
 */
public class Rodizio extends Campeonato{
    private List<Jogo> jogosApurados  =new ArrayList<>();
     @Override
    public void defineJogosDisputa(int n_times)  {
         String nomes_time []={} ;
            List <Jogo> aux = new ArrayList<>();
           for(int i = 0 ; i < n_times ; i++)
           {              
            for(int j = 0 ; j < n_times ; j++)
            {
                if(i != j)
               {
                   Time t1 = Time.getTimes().get(i);
               System.out.println(t1.getNome());
               Time t2 = Time.getTimes().get(j);
               System.out.println(t2.getNome());
               
               Data data = new Data();
               Horario h = new Horario();
               Placar p;
                    p = new Placar(-1,-1);
                    ConfrontoNormal jogos = new ConfrontoNormal(t1,t2,data,h,p);
                    aux = t1.getJogos_realizados();
                    aux.add(jogos);
                    t1.setJogos_realizados(aux);
                    aux = t2.getJogos_realizados();
                    aux.add(jogos);
                    t2.setJogos_realizados(aux);
               }              
           }
            }
          
           
    }
   
   
    @Override
    public void encerraRodada()throws Exception{

        if(Jogo.getJogos().size()== jogosApurados.size() )
        {   
            DefinePodio df = new DefinePodio(this);
        }
       
    }

    @Override
    public void computaResultados(Jogo j) throws Exception {
       int visitante = j.getPlacar().getTimeVisitante();
       int casa = j.getPlacar().getTimeCasa();
          if( casa > visitante)
            {
                Pontuacao aux = new Pontuacao();
                int cont = 0;
                
                aux = j.gettCasa().getPontuacao();
                cont = aux.getPontos() +3;
                aux.setPontos(cont);                
                cont = aux.getVitorias() + 1;
                aux.setVitorias(cont);
                j.gettCasa().setPontuacao(aux);
                
                Pontuacao aux2 = new Pontuacao();
                cont = 0;
                aux2 = j.gettVisitante().getPontuacao();
                cont = aux2.getDerrotas() + 1;
                aux2.setDerrotas(cont);
                j.gettVisitante().setPontuacao(aux2);
                jogosApurados.add(j);
            }
            else if( casa < visitante)
            {
                Pontuacao aux = new Pontuacao();
                int cont = 0;
                aux  = j.gettCasa().getPontuacao();
                cont = aux.getDerrotas() + 1;
                aux.setDerrotas(cont);
                j.gettCasa().setPontuacao(aux);
                
                Pontuacao aux2 = new Pontuacao();
                cont = 0;
                aux2  = j.gettVisitante().getPontuacao();
                
                cont = aux.getPontos() +3;
                aux2.setPontos(cont);
                
                cont = aux2.getVitorias() + 1;
                aux2.setVitorias(cont);
                j.gettVisitante().setPontuacao(aux2);
                
                jogosApurados.add(j);
            }
          else 
            {
                Pontuacao aux = new Pontuacao();
                int cont = 0;
                aux  = j.gettCasa().getPontuacao();
                cont = aux.getPontos() + 1;
                aux.setPontos(cont);
                j.gettCasa().setPontuacao(aux);
                
                
                Pontuacao aux2 = new Pontuacao();
                cont = 0;
                aux2  = j.gettVisitante().getPontuacao();             
                cont = aux2.getPontos() + 1;
                aux2.setPontos(cont);
                j.gettVisitante().setPontuacao(aux2);
                
                jogosApurados.add(j);
                
            }
          Collections.sort(Time.getTimes(), new Comparator<Time>() {  
            @Override  
            public int compare( Time o1, Time o2) {  
                return o1.getPontuacaoString().compareTo(o2.getPontuacaoString());
                 
            }
                    
         });
          Collections.reverse(Time.getTimes());
    }
    
}
