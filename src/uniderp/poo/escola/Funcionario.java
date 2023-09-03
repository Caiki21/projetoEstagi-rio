package uniderp.poo.escola;

import java.time.LocalDate;

public class Funcionario extends pessoa {
    private int codigo;
    private String nome;
    private String telefone;
    private String contaCorrente;
    private String registro;
    private String cracha;
    private String usuario;
    private String senha;

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getCracha() {
        return cracha;
    }

    public void setCracha(String cracha) {
        this.cracha = cracha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Funcionario(int codigo, String nome, String email, String telefone, LocalDate dataNascimento, String usuario,
            String senha) {
        super(codigo, nome, email, telefone, dataNascimento, usuario, senha);
    }

    public Funcionario(int codigo, String nome, String email, String telefone, LocalDate dataNascimento, String usuario,
            String senha, int codigo2, String nome2, String telefone2, String contaCorrente, String registro,
            String cracha, String usuario2, String senha2) {
        super(codigo, nome, email, telefone, dataNascimento, usuario, senha);
        codigo = codigo2;
        nome = nome2;
        telefone = telefone2;
        this.contaCorrente = contaCorrente;
        this.registro = registro;
        this.cracha = cracha;
        usuario = usuario2;
        senha = senha2;
    }

}
