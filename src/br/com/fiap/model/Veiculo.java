package br.com.fiap.model; // Definição do package

public abstract class Veiculo {
    private String placa; // Corrigido de 'pl' [cite: 20, 34]
    private double capacidade; // Corrigido de 'cap' [cite: 20, 36]

    public Veiculo(String placa, double capacidade) {
        this.placa = placa;
        this.capacidade = capacidade;
    }

    // Getters e Setters para Encapsulamento [cite: 12, 21]
    public String getPlaca() { return placa; }
    public double getCapacidade() { return capacidade; }
}