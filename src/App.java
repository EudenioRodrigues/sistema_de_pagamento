import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Verstappen da Silva", "verstappen01@gmail.com", "12345678900", "12345678912", 1);
        Cliente cliente2 = new Cliente("Hamilton da Silva", "hamilton02@gmail.com", "98765432100", "98745561230", 2);
        Cliente cliente3 = new Cliente("Fernando Alonso", "alonso03@gmail.com", "12378945600", "78912345600", 3);

        InfoPagamentos pagamentoBoleto = new Boleto("12345678901234567890123456789012345678901234", cliente1, "01/01/2023", 100.0);
        InfoPagamentos pagamentoCartao = new Cartao("1234567812345678", cliente2.getNome(), "12/25", "123", cliente2, "01/01/2023", 200.0);
        InfoPagamentos pagamentoPix = new Pix(cliente3, "Inter", "24/05/2025", 300.0);

        ArrayList<InfoPagamentos> pagamentos = new ArrayList<>();
        pagamentos.add(pagamentoBoleto);
        pagamentos.add(pagamentoCartao);
        pagamentos.add(pagamentoPix);

        for (InfoPagamentos pagamento : pagamentos) {
            System.out.println("Cliente: " + pagamento.getCliente().getNome());
            System.out.println("Data do Pagamento: " + pagamento.getDataPagamento());
            System.out.println("Valor: R$" + pagamento.getValor());
            pagamento.processarPagamento(pagamento.getValor());
            pagamento.gerarRecibo();
            pagamento.cancelarPagamento();
            System.out.println();
        }


    }
}   