package Pagamento.dominio;

public class Compra {
    private Produto produto;
    private MetodoPagamento pagamento;

    public Compra(Produto produto, MetodoPagamento pagamento) {
        this.produto = produto;
        this.pagamento = pagamento;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "produto=" + produto +
                ", pagamento=" + pagamento +
                ", Valor compra=" +  valorCompra()+
                '}';
    }

    public double valorCompra(){
        double valor = produto.getValor();
        double taxa = 1;
        switch (pagamento){
            case MetodoPagamento.A_VISTA_CREDITO:
                taxa = 0.9;
                break;
            case MetodoPagamento.A_VISTA_DINHEIRO_PIX:
                taxa = 0.85;
                break;
            case MetodoPagamento.PARCELADO_CARTAO_2X:
                taxa = 1;
                break;
            case MetodoPagamento.PARCELADO_CARTAO_3X:
                taxa = 1.1;
                break;
        }
        return valor * taxa;
    }
}
