public abstract class InfoPagamentos implements Pagamento {
    protected Cliente cliente;
    protected String dataPagamento;
    protected double valor;

    public InfoPagamentos(Cliente cliente, String dataPagamento, double valor) {
        setCliente(cliente);
        setDataPagamento(dataPagamento);
        setValor(valor);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if (cliente != null) {
            this.cliente = cliente;
        } else {
            System.out.println("O cliente não pode ser nulo.");
        }
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        if (dataPagamento != null && dataPagamento.matches("\\d{2}/\\d{2}/\\d{4}")) {
            this.dataPagamento = dataPagamento;
        } else {
            System.out.println("Data de pagamento inválida. Use o formato DD/MM/AAAA.");
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor > 0) {
            this.valor = valor;
        } else {
            System.out.println("O valor do pagamento deve ser maior que zero.");
        }
    }

    @Override
    public abstract void gerarRecibo();
    @Override
    public abstract void cancelarPagamento();
    @Override
    public abstract void processarPagamento(double valor);

    
}
