/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc025.gestaoesportiva.model;

/**
 *
 * @author brysa
 */
public abstract class Campeonato  implements Disputa{
    private String nome;
   private String campeao;

    public String getCampeao() {
        return campeao;
    }

    public void setCampeao(String campeao) {
        this.campeao = campeao;
    }
    public Campeonato(String nome) {
        this.nome = nome;
        this.campeao = "A definir";
    }

    public Campeonato() {
    }


    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void defineJogosDisputa(int n_times)  {
    }
    @Override
    public void encerraRodada()throws Exception{
    }
    @Override
    public void computaResultados(Jogo j)throws Exception{
    }
}
