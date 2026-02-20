public class Produto {
    private String nome;
    private int idProduto;
    private String tipoProduto;
    private double preco;
    private int estoqueAtual;

    public Produto(String nome, int idProduto, String tipoProduto, double preco, int estoqueAtual){
        this.nome= nome;
        this.idProduto = idProduto;
        this.tipoProduto = tipoProduto;
        this.preco = preco;
        this.estoqueAtual = estoqueAtual;
    }

    public void exibirDadosProduto(){
        System.out.println("+====== Produto ======+");
        System.out.println("ID:  "+idProduto);
        System.out.println("Nome:  "+nome);
        System.out.println("Tipo: "+tipoProduto);
        System.out.println("Quantidade: "+estoqueAtual);
        System.out.println("Valor unitário: R$ "+preco);
        System.out.println("+=====================+");
    }
    public int getIdProduto(){
        return idProduto;
    }

    public String getNome(){
        return nome;
    }


    public String getTipoProduto() {
        return tipoProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public void setValorUnitario(double valorUnitario) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoqueAtual;
    }

    public void setEstoque(int estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    public boolean vender(int quantidade){
        if(quantidade <= 0 || quantidade > estoqueAtual){
             return false;
        }
            estoqueAtual -= quantidade;
            return true;
        }


    }
}

