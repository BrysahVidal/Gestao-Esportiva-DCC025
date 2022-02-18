/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc025.gestaoesportiva.model;

/**
 *
 * @author brysa
 */
public class Placar {
    private int timeCasa;
    private int timeVisitante;

    public Placar() {
    }

    public Placar(int timeCasa, int timeVisitante )  {   
            this.timeCasa = timeCasa;
            this.timeVisitante = timeVisitante;
               
    }

  
    @Override
    public String toString() {
        if(timeCasa == -1  && timeVisitante == -1)return "A Definir";
        else return  timeCasa + " x " + timeVisitante ;
    }

    

    
    public int getTimeCasa() {
        return timeCasa;
    }

    public void setTimeCasa(int timeCasa) throws Exception{
        if(timeCasa < 0)
        {
            throw new Exception("Placar Invalido");
        }
        else{
        
        this.timeCasa = timeCasa;
        }
    }

    public int getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(int timeVisitante) throws Exception{
         if(timeCasa < 0)
        {
            throw new Exception("Placar Invalido");
        }
        else{
        
         this.timeVisitante = timeVisitante;
        }
        
    }

 
    
}
