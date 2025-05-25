public interface Pagamento {
    public void processarPagamento(double valor);  
    public void gerarRecibo();
    public void cancelarPagamento();
}
