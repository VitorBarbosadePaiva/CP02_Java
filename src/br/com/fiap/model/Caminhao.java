package br.com.fiap.model;

public class Caminhao extends Veiculo {
    private int quantidadeEixos;

    public Caminhao(String placa, double capacidade, int quantidadeEixos) {
        super(placa, capacidade);
        this.quantidadeEixos = quantidadeEixos;
    }
}