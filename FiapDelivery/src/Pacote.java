/**
 * Representa um pacote a ser entregue.
 */
public class Pacote {

    private String codigo;
    private double pesoKg;
    private StatusPacote status;

    /**
     * Cria um pacote com status inicial {@link StatusPacote#PENDENTE}.
     *
     * @param codigo código de rastreio (não pode ser vazio)
     * @param pesoKg peso em kg (deve ser maior que zero)
     */
    public Pacote(String codigo, double pesoKg) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("O código do pacote não pode ser vazio.");
        }
        if (pesoKg <= 0) {
            throw new IllegalArgumentException("O peso deve ser maior que zero.");
        }
        this.codigo = codigo.trim();
        this.pesoKg = pesoKg;
        this.status = StatusPacote.PENDENTE;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public StatusPacote getStatus() {
        return status;
    }

    /**
     * Atualiza o status do pacote (substitui o antigo método {@code muda}).
     *
     * @param novoStatus novo estado do pacote (não pode ser nulo)
     */
    public void atualizarStatus(StatusPacote novoStatus) {
        if (novoStatus == null) {
            throw new IllegalArgumentException("O status não pode ser nulo.");
        }
        this.status = novoStatus;
    }

    @Override
    public String toString() {
        return "Pacote [codigo=" + codigo + ", peso=" + pesoKg + " kg, status=" + status + "]";
    }
}
