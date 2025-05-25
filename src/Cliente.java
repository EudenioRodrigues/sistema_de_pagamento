public class Cliente {
    private int id;
    private String cpf;
    private String nome;
    private String email;
    private String telefone;

    public Cliente(String nome, String email, String telefone, String cpf, int id) {
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
        setCpf(cpf);
        setId(id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("O nome não pode ser nulo ou vazio.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            this.email = email;
        } else {
            System.out.println("E-mail inválido.");
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone != null && telefone.matches("\\+?\\d{10,13}")) {
            this.telefone = telefone;
        } else {
            System.out.println("Telefone inválido. Deve conter entre 10 e 13 dígitos.");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("O ID deve ser maior que zero.");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null && cpf.matches("\\d{11}")) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido. Deve conter 11 dígitos.");
        }
    }
}
