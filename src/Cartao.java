public class Cartao extends InfoPagamentos {
    private String numeroCartao;
    private String nomeTitular;
    private String validade;
    private String cvv;

    public Cartao(String numeroCartao, String nomeTitular, String validade, String cvv, Cliente cliente, String dataPagamento, double valor) {
        super(cliente, dataPagamento, valor);
        setNumeroCartao(numeroCartao);
        setNomeTitular(nomeTitular);
        setValidade(validade);
        setCvv(cvv);
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        if (numeroCartao != null && numeroCartao.matches("\\d{16}")) {
            this.numeroCartao = numeroCartao;
        } else {
            System.out.println("Número do cartão inválido. Deve conter 16 dígitos.");
        }
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        if (nomeTitular != null && !nomeTitular.trim().isEmpty()) {
            this.nomeTitular = nomeTitular;
        } else {
            System.out.println("Nome do titular não pode ser vazio.");
        }
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        if (validade != null && validade.matches("(0[1-9]|1[0-2])/\\d{2}")) {
            this.validade = validade;
        } else {
            System.out.println("Validade inválida. Use o formato MM/AA.");
        }
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        if (cvv != null && cvv.matches("\\d{3}")) {
            this.cvv = cvv;
        } else {
            System.out.println("CVV inválido. Deve conter 3 dígitos.");
        }
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento via CARTÃO no valor de R$" + valor);
    }

    @Override
    public void gerarRecibo() {
        System.out.println("Gerando recibo para pagamento via Cartão.");
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Cancelando pagamento via Cartão.");
    }
}
