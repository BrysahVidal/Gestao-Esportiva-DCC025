/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc025.gestaoesportiva.model;
import dcc025.gestaoesportiva.control.AdicionaTimes;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author brysa
 */
public class MataMata extends Campeonato {
        
        
        @Override
        public void defineJogosDisputa(int n_times) {
        
            String nomes_time []={} ;
            List <Jogo> aux = new ArrayList<>();
           for(int i = 0 ; i <= n_times/2 ; i++)
           {
               
               if(i % 2 == 0)
               {
                   Time t1 = Time.getTimes().get(i);
               Time t2 = Time.getTimes().get(i+1);
               
               Data data = new Data();
               Horario h = new Horario();
               Placar p;
                    p = new Placar(-1,-1);
                    ConfrontoDireto jogos = new ConfrontoDireto(t1,t2,data,h,p);
                    aux = t1.getJogos_realizados();
                    aux.add(jogos);
                    t1.setJogos_realizados(aux);
                    aux = t2.getJogos_realizados();
                    aux.add(jogos);
                    t2.setJogos_realizados(aux);
               }
                
               
              
           }
           
        
           
        
    }

    @Override
    public void encerraRodada() throws Exception{
        List <Time> t = new ArrayList<>();
        t = Time.getTimes();
 
        for(Jogo j : Jogo.getJogos())
        {
            if(j.getPlacar().getTimeCasa() == -1)
            {
                throw new Exception("Apure todos os jogos antes de encerrar a rodada");
            }
        }
        for(int i = 0 ; i < Time.getTimes().size() ; i++)
        {
            if(t.get(i).getPontuacao().getDerrotas() > 0)
            {
                Time.getTimes().remove(i);
            }
        }
        if(Time.getTimes().size() == 1)
        {
            setCampeao(Time.getTimes().get(0).getNome() );
        }
        
    }
    
     @Override
    public void computaResultados(Jogo j)throws Exception{
        
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
            }
            else 
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
                
            }
         
    }

   
}
    


