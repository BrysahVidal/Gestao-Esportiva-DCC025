/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc025.gestaoesportiva.control;

import dcc025.gestaoesportiva.model.Jogador;
import dcc025.gestaoesportiva.model.Time;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brysa
 */
public class AdicionaJogadores {
    public AdicionaJogadores(FileInputStream arquivo,Time t ) throws IOException {
        
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
                
               if(linha.matches("^[0-9]+:[a-zA-Z]+,[a-zA-Z]+$"))
               {
                String[] detalhes  = linha.split(":");
                Jogador j = new Jogador() ;
                j.setNumero(detalhes[0]);
                String [] res = detalhes[1].split(",");
                j.setPosicao(res[1]);
                j.setNome(res[0]);
                j.setTime_associado(t.getNome());
                j.adicionaLista(j);
                j.setTotal_id();
                j.setId();
                List <Jogador> aux = new ArrayList<>();
                aux = t.getLista_jogadores();
                aux.add(j);
                t.setLista_jogadores(aux);
              
               }
        }
        
        while(linha != null);
        
        
        
        
        
        
    }

    
    
}
