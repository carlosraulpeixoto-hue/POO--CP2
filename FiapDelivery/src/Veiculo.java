/**
 * Representa um veículo genérico da frota do FiapDelivery.
 * Classe base (abstrata) que concentra os atributos comuns a todos os veículos,
 * evitando duplicação de código entre Caminhão, Moto e futuros tipos.
 */
public abstract class Veiculo {

    private String placa;
    private double capacidadeKg;

    /**
     * Cria um veículo validando seus dados.
     *
     * @param placa        placa do veículo (não pode ser nula ou vazia)
     * @param capacidadeKg capacidade máxima de carga em kg (deve ser maior que zero)
     * @throws IllegalArgumentException se algum dado for inválido
     */
    protected Veiculo(String placa, double capacidadeKg) {
        setPlaca(placa);
        setCapacidadeKg(capacidadeKg);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("A placa não pode ser vazia.");
        }
        this.placa = placa.trim().toUpperCase();
    }

    public double getCapacidadeKg() {
        return capacidadeKg;
    }

    public void setCapacidadeKg(double capacidadeKg) {
        if (capacidadeKg <= 0) {
            throw new IllegalArgumentException("A capacidade deve ser maior que zero. Valor recebido: " + capacidadeKg);
        }
        this.capacidadeKg = capacidadeKg;
    }

    /**
     * Verifica se o veículo suporta determinado peso.
     *
     * @param pesoKg peso a ser transportado, em kg
     * @return {@code true} se o peso couber na capacidade do veículo
     */
    public boolean suportaPeso(double pesoKg) {
        return pesoKg <= capacidadeKg;
    }

    /**
     * Descreve o tipo do veículo (ex.: "Caminhão", "Moto").
     * Cada subclasse implementa à sua maneira (polimorfismo).
     */
    public abstract String getTipo();

    @Override
    public String toString() {
        return getTipo() + " [placa=" + placa + ", capacidade=" + capacidadeKg + " kg]";
    }
}
