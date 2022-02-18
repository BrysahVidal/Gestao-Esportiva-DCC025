/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc025.gestaoesportiva.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brysa
 */
public class ConfrontoDireto extends Jogo {

    private Placar placar;

    public ConfrontoDireto(Time tCasa, Time tVisitante, Data data, Horario horario, Placar placar) {
        super(tCasa, tVisitante, data, horario);
        this.placar = placar;
    }

    @Override
    public void setPlacar(Placar placar) throws Exception {
        if (placar.getTimeCasa() == placar.getTimeVisitante()) {
            throw new Exception("Não é permitido empates");
        } else {
            this.placar = placar;
        }
    }

    @Override
    public Placar getPlacar() {
        return this.placar;
    }


    @Override
    public Jogo buscaJogo(int id_jogo) {

        for (Jogo j : this.getJogos()) {
            if (j.getId() == id_jogo) {
                return j;
            }
        }
        return null;
    }

}
