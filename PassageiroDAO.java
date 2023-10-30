package br.dao;
import java.sql.PreparedStatement;
import br.dao.InterfacePassageiro;
import br.dao.ConexaoDB;
import br.dto.Passageiro;
import java.security.SecureRandom;
import java.sql.Connection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import br.dto.Passageiro;
import java.sql.*;

public abstract class PassageiroDAO implements InterfacePassageiro{
    
    Connection conexao = ConexaoDB.inicializaDB();
    
       public boolean InserirDadosPassageiro(String pacote, String cpf, String rg, String nome, String dataNascimento, String email, String senha, String telefone, String sexo, String civil, String dadosMedicos) {
           
         String sql = "INSERT INTO Passageiro(Pacote, Despesa, CPF, RG, Nome, DataNasc, Email, Senha, Telefone, Sexo, Civil, DadosMedicos) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
         
         try{
               Passageiro pass = new Passageiro(pacote, cpf,  rg, nome, dataNascimento,  email,senha, telefone, sexo,civil, dadosMedicos);
                PreparedStatement in = conexao.prepareStatement(sql); 
                in.setString(1, pass.getPacote());
                in.setInt(2, pass.getDespesa());
                in.setString(3, pass.getCpf());
                in.setString(4, pass.getRg());
                in.setString(5, pass.getNome());
                in.setString(6, pass.getDataNascimento());
                in.setString(7, pass.getEmail());
                in.setString(8, pass.getSenha());
                in.setString(9, pass.getTelefone());
                in.setString(10, pass.getSexo());
                in.setString(11, pass.getCivil());
                in.setString(12, pass.getDadosMedicos());
                in.execute();   
                in.close();
                return true;
         }
         catch (SQLException u) {    
                throw new RuntimeException(u);    
            }    
    }
    
    public String gerarSenha(){
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom random = new SecureRandom();
        return IntStream.range(0, 8)
                .map(i -> random.nextInt(chars.length()))
                .mapToObj(randomIndex -> String.valueOf(chars.charAt(randomIndex)))
                .collect(Collectors.joining());
    }
    
}

