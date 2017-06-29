/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listatelefonica;

/**
 *
 * @author Aluno
 */
public class pessoa {
    private String nome;
    private String telefone;

    public pessoa(String nome, String idade) {
        this.nome = nome;
        this.telefone = idade;
    }

    public pessoa() {
      
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

    public void setTelefone(String idade) {
        this.telefone = idade;
    }
}
