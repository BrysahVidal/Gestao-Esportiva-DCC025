/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc025.gestaoesportiva.control;

import dcc025.gestaoesportiva.model.ConfrontoNormal;
import dcc025.gestaoesportiva.model.Jogo;
import dcc025.gestaoesportiva.model.Time;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author brysa
 */
public class ModeloTabelaTimeJogos extends AbstractTableModel{
    private final String[] colunas = {"Placar","Data","Horario","Casa","Visitante","ID"};
    private Jogo jogo = new ConfrontoNormal();
    private Time time = new Time();

    public ModeloTabelaTimeJogos(Time time) {
        this.time = time;
    }
    
    @Override
    public int getRowCount() {
        return time.getJogos_realizados().size();
    }
     @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1: 
                return String.class;
            case 2: 
                return String.class;
            case 3: 
                return String.class;
            case 4: 
                return String.class;
             case 5: 
                return Integer.class;
            default:
                return null;
        }  
    }
     @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

        jogo = time.getJogos_realizados().get(rowIndex);

        switch (columnIndex) {
            case 1:
            {
                try {
                    jogo.setData(String.valueOf(aValue));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                   }
            }
                 break;
            case 2:
            {
                try {
                        jogo.setHorario(String.valueOf(aValue));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                   }
            }
                 break;

        } 
        fireTableDataChanged();
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
        
          jogo = time.getJogos_realizados().get(rowIndex);
         switch (columnIndex) {
             case 0:
                return jogo.getPlacar();
            case 1:
                return jogo.getData();
            case 2: 
                return jogo.getHorario();
            case 3: 
                return jogo.gettCasa().getNome();
            case 4: 
                return jogo.gettVisitante().getNome();
            case 5: 
                return jogo.getId();
            default:
                return null;
        }        
    }
   
    
    private int indexOf(Jogo p) {
        return p.getId();
    }
    
    public void addRow(Jogo p) {
        this.fireTableRowsInserted(this.indexOf(p), this.indexOf(p));
    }
    public void removeRow(int indice_linha)
    {
        super.fireTableRowsDeleted(indice_linha, indice_linha);
    }
    
}
