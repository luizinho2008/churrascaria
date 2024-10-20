package Controllers;

public class Pessoa {
    private String email;
    private String senha;
    
    public Pessoa(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getemail() {
        return this.email;
    }

    public String getSenha() {
        return this.senha;
    }
}
