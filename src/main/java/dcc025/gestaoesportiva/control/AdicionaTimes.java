/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc025.gestaoesportiva.control;
import dcc025.gestaoesportiva.model.Tecnico;
import dcc025.gestaoesportiva.model.Time;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author brysa
 */
public class AdicionaTimes {
    public AdicionaTimes(FileInputStream arquivo ) throws IOException, Exception {
        InputStreamReader input = new InputStreamReader(arquivo);
        BufferedReader leitor = new BufferedReader(input);
        String linha = "";
        int cont = 0; 
        do{
                linha = leitor.readLine();
                if(linha == null)
                {
                    break;
                }
                
               if(linha.matches("^[a-zA-Z]+,[a-zA-Z]+$"))
               {
                   String[] detalhes_time  = linha.split(",");
                Tecnico tecnico = new Tecnico() ;
                tecnico.setTime_associado(detalhes_time[0]);
                tecnico.setNome(detalhes_time[1]);
                tecnico.setLogin(detalhes_time[1]);
                tecnico.setSenha(detalhes_time[0]);
                tecnico.adicionaLista(tecnico);
                Time time = new Time(detalhes_time[0],tecnico);
                cont++;
              
               }
        }
        
        while(linha != null);
        int n = cont;
        int base = 2;
        double logaritmo = Math.log(n)/Math.log(base);
          if(logaritmo != Math.floor(logaritmo) || n == 1)
        {
            Time.setTimes(null);
            throw new Exception ("Para iniciar um campeonato desse tipo é necessario que o numero total de equipes seja uma potencia de 2");
        }
        
        /* Tecnico te = new Tecnico() ;
        for(Tecnico t : te.getLista())
        {
        System.out.println(t.getLogin());
        System.out.println(t.getNome());
        System.out.println(t.getSenha());
        System.out.println(t.getTime_associado());
        }
        Time ti = new Time() ;
        for(Time ta : ti.getTimes())
        {
        System.out.println(ta.getDerrotas());
        System.out.println(ta.getJogos_realizados());
        System.out.println(ta.getNome());
        System.out.println(ta.getPontos());
        System.out.println(ta.getTecnico());
        System.out.println(ta.getVitorias());
        }*/
        
        
        
    }

    
   
    
}
