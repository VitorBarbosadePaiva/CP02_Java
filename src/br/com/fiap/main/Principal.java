package br.com.fiap.main;

import br.com.fiap.model.Caminhao; 
import br.com.fiap.model.Pacote;
import br.com.fiap.model.Rota;

public class Principal {
    public static void main(String[] args) {
        
        Caminhao c1 = new Caminhao("ABC1234", 1500.0, 3);
        Pacote p1 = new Pacote("BR999", 18.5, "Pendente");
        Rota rota = new Rota(p1, c1);
        rota.executarEntrega();
    }
}