public class Pessoa {
        String nome;
        int idade;
        String cpf;
        String email;
        String telefone;

        public Pessoa(String nome, int idade, String cpf, String email, String telefone){
            this.nome = nome;
            this.idade = idade;
            this.cpf = cpf;
            this.email = email;
            this.telefone = telefone;
        }

    public void exibirDados(){
        System.out.println("Nome: "+ nome + ", idade: "+ idade +", email: " + email + ", CPF: "+cpf+ ", telefone: "+telefone);
    }
    public String getCpf(){
            return cpf;
    }
    public String getNome(){
            return nome;
    }
    public String getEmail(){
            return email;
    }
    public String getTelefone(){
            return telefone;
    }
    public int getIdade(){
            return idade;
    }
    }



