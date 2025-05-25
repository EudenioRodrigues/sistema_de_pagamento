public class Boleto extends InfoPagamentos {
    private String codigoBarras;

    public Boleto(String codigoBarras, Cliente cliente, String dataPagamento, double valor) {
        super(cliente, dataPagamento, valor);
        setCodigoBarras(codigoBarras);
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        if (codigoBarras != null && codigoBarras.matches("\\d{44}")) {
            this.codigoBarras = codigoBarras;
        } else {
            System.out.println("Código de barras inválido. Deve conter exatamente 44 dígitos numéricos.");
        }
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento via BOLETO no valor de R$" + valor);
        System.out.println("Código de Barras: " + codigoBarras);
    }
    
    @Override
    public void gerarRecibo() {
        System.out.println("=== RECIBO DE PAGAMENTO VIA BOLETO ===");
        System.out.println("Código de Barras: " + codigoBarras);
        System.out.println("Cliente: " + getCliente().getNome());
        System.out.println("Valor: R$" + getValor());
        System.out.println("======================================");
    }
    
    @Override
    public void cancelarPagamento() {
        System.out.println("Pagamento via BOLETO cancelado.");
    }
}