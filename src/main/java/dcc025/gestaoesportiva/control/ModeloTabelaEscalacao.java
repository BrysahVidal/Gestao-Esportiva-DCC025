/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc025.gestaoesportiva.control;

import dcc025.gestaoesportiva.model.ConfrontoNormal;
import dcc025.gestaoesportiva.model.Jogador;
import dcc025.gestaoesportiva.model.Jogo;
import dcc025.gestaoesportiva.model.Time;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author brysa
 */
public class ModeloTabelaEscalacao extends AbstractTableModel{
     private final String[] colunas = {"Nome","Posicao","Numero","ID"};
   private List <Jogador> lista ;
   private Jogador j = new Jogador(); 
   private Jogo jogo =  new ConfrontoNormal();
   private Time time = new Time();
   
     public ModeloTabelaEscalacao(Jogo jogo , Time time) {
         this.jogo = jogo;
         this.time = time;
    }
     
   @Override
    public int getRowCount() {
        if(jogo.gettCasa().getNome().equals(time.getNome()))
        {
            lista = jogo.getEscalacao_casa();
            return lista.size();
        }
        else 
        {
            lista =  jogo.getEscalacao_visitante(); 
            return lista.size();
        }         
        
    }
    
    public String getColumnName(int coluna) {
        return colunas[coluna];
    }

   @Override
    public int getColumnCount() {
       return colunas.length;
    }

  
   @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         if(jogo.gettCasa().getNome().equals(time.getNome()))
        {
            j = jogo.getEscalacao_casa().get(rowIndex);            
         switch (columnIndex) {
            case 0:
                return j.getNome();
            case 1: 
                return j.getPosicao();
            case 2: 
                return j.getNumero();  
            case 3: 
                return j.getId();
            default:
                return null;
        }
        }
        else 
        {
            j = jogo.getEscalacao_visitante().get(rowIndex);            
         switch (columnIndex) {
            case 0:
                return j.getNome();
            case 1: 
                return j.getPosicao();
            case 2: 
                return j.getNumero();  
            case 3: 
                return j.getId();
            default:
                return null;
        }
        }
          
               
    }
    
    private int indexOf(Jogador p) {
        return p.getId();
    }
    
    public void addRow(Jogador p) {
        this.fireTableRowsInserted(this.indexOf(p), this.indexOf(p));
    }
    
    
}
