package br.com.tt.comunicador.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Mensagem {

    private String texto;
    private LocalDateTime dataHora;

    public Mensagem(String texto){

        this.texto = texto;
        this.dataHora = LocalDateTime.now();

    }


}





