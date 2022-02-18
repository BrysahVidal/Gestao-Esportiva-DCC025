/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc025.gestaoesportiva.control;

import dcc025.gestaoesportiva.model.Placar;
import dcc025.gestaoesportiva.model.Pontuacao;
import dcc025.gestaoesportiva.model.Time;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author brysa
 */
public class ModeloTabelaPontos extends AbstractTableModel{
    private final String[] colunas = {"Posicao","Nome","Pontos","Vitorias","Derrotas"};
    private Time time;
    
     public ModeloTabelaPontos() {
    }
    
    @Override
    public int getRowCount() {
        return Time.getTimes().size();
    }
    
    @Override
    public String getColumnName(int coluna) {
        return colunas[coluna];
    }

    @Override
    public int getColumnCount() {
       return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
          time = Time.getTimes().get(rowIndex);
         switch (columnIndex) {
            case 0:
                return (rowIndex + 1);
            case 1: 
                return time.getNome();
            case 2: 
                return time.getPontuacao().getPontos();
            case 3: 
                return time.getPontuacao().getVitorias();
            case 4: 
                return time.getPontuacao().getDerrotas();
            default:
                return null;
        }        
    }
    
    private int indexOf(Time p) {
        return p.getId();
    }
    
    public void addRow(Time p) {
        this.fireTableRowsInserted(this.indexOf(p), this.indexOf(p));
    }
    public void removeRow(int indice_linha)
    {
        super.fireTableRowsDeleted(indice_linha, indice_linha);
    }
    
    
}
