
package br.dao;
import br.dto.Passageiro;

public interface InterfacePassageiro{
   public boolean InserirDadosPassageiro(String pacote, String cpf, String rg, String nome, String dataNascimento, String email, String senha, String telefone, String sexo, String civil, String dadosMedicos);
    Passageiro ExibirCliente(String cpf);
    public String gerarSenha();
}

