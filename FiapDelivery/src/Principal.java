/**
 * Ponto de entrada do sistema FiapDelivery.
 */
public class Principal {

    public static void main(String[] args) {
        // 1) Dados inválidos agora são barrados pelo construtor (antes aceitava -500.0)
        try {
            new Caminhao("ABC1234", -500.0, 3);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }

        // 2) Entrega com caminhão
        Caminhao caminhao = new Caminhao("ABC1234", 5000.0, 3);
        Pacote pacote1 = new Pacote("BR999", 10.5);
        Rota rotaCaminhao = new Rota(pacote1, caminhao);
        rotaCaminhao.iniciarEntrega();

        // 3) Entrega com moto (antes era impossível!)
        Moto moto = new Moto("MOT5678", 30.0, true);
        Pacote pacote2 = new Pacote("BR1000", 5.0);
        Rota rotaMoto = new Rota(pacote2, moto);
        rotaMoto.iniciarEntrega();

        System.out.println(pacote1);
        System.out.println(pacote2);
    }
}
