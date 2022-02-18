/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc025.gestaoesportiva.control;

import dcc025.gestaoesportiva.model.Comissao;
import dcc025.gestaoesportiva.model.Tecnico;
import dcc025.gestaoesportiva.model.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brysa
 */
public class VerificaUsuario {

    private String classe;
    
    public VerificaUsuario(String login , String senha) throws Exception{
        this.classe = "";
        for(Usuario t : Tecnico.getLista())
        {
            if(t.getLogin().equals(login) && t.getSenha().equals(senha))
            {
                this.classe = "Tecnico";
            }
        }
        for(Usuario c : Comissao.getLista())
        {
            if(c.getLogin().equals(login) && c.getSenha().equals(senha))
            {
                this.classe = "Comissao";
            }
        }
        if(this.classe.equals(""))
        {
            throw new Exception ("Usuario ou senha incompativeis");
        }
        
    }

    public String getClasse() {
        return classe;
    }
    
    
    
}
