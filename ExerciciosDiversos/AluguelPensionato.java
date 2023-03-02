package ExerciciosDiversos;

public class AluguelPensionato {

    private String nome;
    private String email;

    public AluguelPensionato(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String name) {
        this.nome = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return nome + ", " + email;
    }

}
