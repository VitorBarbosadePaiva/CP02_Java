package br.com.fiap.model;

public class Pacote {
    private String codigo;
    private double peso;
    private String status;

    public Pacote(String codigo, double peso, String status) {
        this.codigo = codigo;
        this.peso = peso;
        this.status = status;
    }
    
    public String getCodigo() { return codigo; }
}