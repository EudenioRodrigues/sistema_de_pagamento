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
    }

    @Override
    public void gerarRecibo() {
        System.out.println("Gerando recibo para pagamento via Boleto.");
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Cancelando pagamento via Boleto.");
    }
}