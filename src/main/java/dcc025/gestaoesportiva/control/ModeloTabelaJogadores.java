/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc025.gestaoesportiva.control;
import javax.swing.table.AbstractTableModel;
import dcc025.gestaoesportiva.model.Jogador;
import dcc025.gestaoesportiva.model.Time;
import java.util.List;


/**
 *
 * @author brysa
 */
public class ModeloTabelaJogadores extends AbstractTableModel{
    
   private final String[] colunas = {"Nome","Posicao","Numero","ID"};
   private List <Jogador> lista = Jogador.getJogadores();
   private Jogador j = new Jogador();
   private Time time = new Time();
   
     public ModeloTabelaJogadores(Time time ) {
         this.time = time;
    }
     
   @Override
    public int getRowCount() {
        return time.getLista_jogadores().size();
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
          j = time.getLista_jogadores().get(rowIndex);
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
    
    private int indexOf(Jogador p) {
        return p.getId();
    }
    
    public void addRow(Jogador p) {
        this.fireTableRowsInserted(this.indexOf(p), this.indexOf(p));
    }
    public void removeRow(int indice_linha)
    {
        j = time.getLista_jogadores().get(indice_linha);
        time.getLista_jogadores().remove(indice_linha);
        super.fireTableRowsDeleted(indice_linha, indice_linha);
    }
    
}
