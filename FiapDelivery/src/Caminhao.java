/**
 * Veículo de carga pesada, caracterizado pela quantidade de eixos.
 */
public class Caminhao extends Veiculo {

    private int quantidadeEixos;

    /**
     * @param placa           placa do caminhão
     * @param capacidadeKg    capacidade máxima em kg
     * @param quantidadeEixos número de eixos (mínimo 2)
     */
    public Caminhao(String placa, double capacidadeKg, int quantidadeEixos) {
        super(placa, capacidadeKg);
        setQuantidadeEixos(quantidadeEixos);
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        if (quantidadeEixos < 2) {
            throw new IllegalArgumentException("Um caminhão deve ter ao menos 2 eixos.");
        }
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public String getTipo() {
        return "Caminhão";
    }
}
