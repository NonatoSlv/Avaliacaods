class Pessoa {

    private String nome;
    private char sexo;

    public Pessoa(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String sexoDescricao() {
        if (sexo == 'M') {
            return "Masculino";
        } else if (sexo == 'F') {
            return "Feminino";
        } else {
            return "Sexo inválido.";
        }
    }

    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome + " Sexo: " + sexoDescricao());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}