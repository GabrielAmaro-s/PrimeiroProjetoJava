public class Venda {
    private int id;
    private Produto produto;
    private int quantidade;
    private String formaPagamento;


    public Venda(int id, Produto produto, int quantidade, String formaPagamento) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.formaPagamento = formaPagamento;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return quantidade * produto.getPreco();
    }



    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void consultaVenda(){
        System.out.println("+====== Consulta de Vendas ======+");
        System.out.println("ID:  "+id);
        System.out.println("Produto:  "+produto);
        System.out.println("Quantidade: "+quantidade);
        System.out.println("Forma de Pagamento: "+formaPagamento);
        System.out.println("+=====================+");
    }


}
