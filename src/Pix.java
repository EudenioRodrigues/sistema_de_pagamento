public class Pix extends InfoPagamentos{
    private String banco;

    public Pix(Cliente cliente,String banco, String dataPagamento, double valor) {
        super(cliente, dataPagamento, valor);
        setBanco(banco);
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        if (banco != null && !banco.trim().isEmpty()) {
            this.banco = banco;
        } else {
            System.out.println("O nome do banco não pode ser nulo ou vazio.");
        }
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento via PIX no valor de R$" + valor);
        System.out.println("Banco: " + banco);
    }

    @Override
    public void gerarRecibo() {
        System.out.println("=== RECIBO DE PAGAMENTO VIA PIX ===");
        System.out.println("Banco: " + banco);
        System.out.println("Cliente: " + getCliente().getNome());
        System.out.println("Valor: R$" + getValor());
        System.out.println("===================================");
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Pagamento via PIX cancelado.");
    }
}
