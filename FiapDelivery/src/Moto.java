/**
 * Veículo de entregas rápidas, podendo ou não possuir baú.
 */
public class Moto extends Veiculo {

    private boolean possuiBau;

    /**
     * @param placa        placa da moto
     * @param capacidadeKg capacidade máxima em kg
     * @param possuiBau    indica se a moto tem baú
     */
    public Moto(String placa, double capacidadeKg, boolean possuiBau) {
        super(placa, capacidadeKg);
        this.possuiBau = possuiBau;
    }

    public boolean isPossuiBau() {
        return possuiBau;
    }

    public void setPossuiBau(boolean possuiBau) {
        this.possuiBau = possuiBau;
    }

    @Override
    public String getTipo() {
        return "Moto";
    }
}
