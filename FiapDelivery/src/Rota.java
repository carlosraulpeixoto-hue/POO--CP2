/**
 * Associa um {@link Pacote} a um {@link Veiculo}.
 * Como depende da classe base, aceita qualquer tipo de veículo
 * (Caminhão, Moto ou futuros), sem precisar alterar esta classe.
 */
public class Rota {

    private final Pacote pacote;
    private final Veiculo veiculo;

    /**
     * @param pacote  pacote a ser transportado
     * @param veiculo veículo responsável pelo transporte
     * @throws IllegalArgumentException se algum for nulo ou se o veículo não suportar o peso
     */
    public Rota(Pacote pacote, Veiculo veiculo) {
        if (pacote == null || veiculo == null) {
            throw new IllegalArgumentException("Pacote e veículo são obrigatórios.");
        }
        if (!veiculo.suportaPeso(pacote.getPesoKg())) {
            throw new IllegalArgumentException("O veículo " + veiculo.getPlaca()
                    + " não suporta o peso do pacote " + pacote.getCodigo() + ".");
        }
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    public Pacote getPacote() {
        return pacote;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    /**
     * Inicia a entrega: marca o pacote como em trânsito e exibe a mensagem.
     */
    public void iniciarEntrega() {
        pacote.atualizarStatus(StatusPacote.EM_TRANSITO);
        System.out.println("Levando pacote " + pacote.getCodigo()
                + " no veículo " + veiculo.getPlaca() + " (" + veiculo.getTipo() + ")");
    }
}
