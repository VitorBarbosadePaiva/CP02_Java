package br.com.fiap.model; 

public class Rota {
    
    private Pacote pacote; 
    private Veiculo veiculo;

  
    public Rota(Pacote pacote, Veiculo veiculo) {
        this.pacote = pacote;
        this.veiculo = veiculo;
    }


    public void executarEntrega() {
        System.out.println("Levando pacote " + pacote.getCodigo() + 
                           " no veiculo de placa: " + veiculo.getPlaca());
    }

    
    public Pacote getPacote() { return pacote; }
    public void setPacote(Pacote pacote) { this.pacote = pacote; }
    public Veiculo getVeiculo() { return veiculo; }
    public void setVeiculo(Veiculo veiculo) { this.veiculo = veiculo; }
}