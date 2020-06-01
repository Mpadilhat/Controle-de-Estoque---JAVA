package Bean;

class Produto {

    private String descricao, fornecedor;
    private int qtd;
    private double preco_compra;
    
    
    // Colocar com set e mostrar com get  // Encapsulamento
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String desc) {
        this.descricao = desc;
    }
    
    public int getQtd() {
        return qtd;
    }

        public void setQtd(int quant) {
        this.qtd = quant;
    }

        public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String forn) {
        this.fornecedor = forn;
    }
    
      public double getPrecoCompra() {
        return preco_compra;
    }

    public void setPrecoCompra(double preco_compra) {
        this.preco_compra = preco_compra;
    }
        
}
