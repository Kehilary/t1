
package br.dto;


public class Passageiro{
    public String pacote;
    public int despesa;
    public String cpf;
    public String rg;
    public String nome;
    public String dataNascimento;
    public String email;
    public String senha;
    public String telefone;
    public String sexo;
    public String estadoCivil;
    public String dadosMedicos;
    
            
    public Passageiro(String pacote, String cpf, String rg, String nome, String dataNascimento, String email, String senha, String telefone, String sexo, String estadoCivil, String dadosMedicos){
        this.pacote = pacote;
        this.despesa = 0;
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.dadosMedicos = dadosMedicos;
    }
    
    public String getPacote(){
    return this.pacote;
}
    
    public int getDespesa(){
        return this.despesa;
}
    
    public String getCpf(){
        return this.cpf;
    }
            
    public String getRg(){
        return this.rg;
    }
       
    public String getNome(){
        return this.nome;
    }
    
    public String getDataNascimento(){
        return this.dataNascimento;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getSenha(){
        return this.senha;
    }
    public String getTelefone(){
        return this.telefone;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    
    public String getCivil(){
        return this.estadoCivil;
    }

    public String getDadosMedicos() {
        return this.dadosMedicos;                                          
}
}
