package uniderp.poo.escola;

import java.time.LocalDate;

public class passageiro extends pessoa {
    private int codigo;
    private String nome;
    private String email;
    private String numeroCartao;
    private String documento;
    private String registro;
    private LocalDate dataNascimento;
    private String usuario;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public passageiro(int codigo, String nome, String email, String telefone, LocalDate dataNascimento, String usuario,
            String senha) {
        super(codigo, nome, email, telefone, dataNascimento, usuario, senha);
    }

    public passageiro(String nome, String email, String numeroCartao, String documento, String registro,
            LocalDate dataNascimento, String usuario) {
        this.nome = nome;
        this.email = email;
        this.numeroCartao = numeroCartao;
        this.documento = documento;
        this.registro = registro;
        this.dataNascimento = dataNascimento;
        this.usuario = usuario;
    }

}
