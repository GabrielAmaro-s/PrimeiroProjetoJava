public class Produto {
    private String nomeProduto;
    private int idProduto;
    private String tipoProduto;
    private int qtdProduto;
    private double valorUnitario;

    public Produto(String nomeProduto, int idProduto, String tipoProduto, int qtdProduto, double valorUnitario){
        this.nomeProduto = nomeProduto;
        this.idProduto = idProduto;
        this.tipoProduto = tipoProduto;
        this.qtdProduto = qtdProduto;
        this.valorUnitario = valorUnitario;
    }

    public void exibirDadosProduto(){
        System.out.println("+====== Produto ======+");
        System.out.println("ID:  "+idProduto);
        System.out.println("Nome:  "+nomeProduto);
        System.out.println("Tipo: "+tipoProduto);
        System.out.println("Quantidade: "+qtdProduto);
        System.out.println("Valor unitário: R$ "+valorUnitario);
        System.out.println("+=====================+");
    }
    public int getIdProduto(){
        return idProduto;
    }
    public String getNomeProduto(){
        return nomeProduto;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }
    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

}

