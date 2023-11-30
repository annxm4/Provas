import java.util.ArrayList;
import java.util.Date;

public class Pedido {

    private int numeroPedido;
    private Date dataHoraPedido;
    private double precoTotal;
    private int statusPedido;
    private ArrayList<PedidoItem> itensPedido;

    // Construtor (método inserirPedido)
    public Pedido(int numeroPedido, Date dataHoraPedido, int statusPedido) {
        this.numeroPedido = numeroPedido;
        this.dataHoraPedido = dataHoraPedido;
        this.statusPedido = statusPedido;
        this.itensPedido = new ArrayList<>();
    }

    // Getters e Setters

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Date getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setDataHoraPedido(Date dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getStatusPedido() {
        return statusPedido;
    }

    // Método para obter os itens do pedido
    public ArrayList<PedidoItem> getItensPedido() {
        return itensPedido;
    }

    public void setStatusPedido(int statusPedido) {
        this.statusPedido = statusPedido;
    }

    // Método para inserir itens no pedido
    public void inserirItensPedido(PedidoItem pedidoItem) {
        itensPedido.add(pedidoItem);
    }

    // Método para excluir itens do pedido
    public void excluirItensPedido(PedidoItem pedidoItem) {
        itensPedido.remove(pedidoItem);
    }

    // Método para calcular o total a pagar
    public double calculaTotalPagar() {
        double totalPagar = 0.0;
        for (PedidoItem item : itensPedido) {
            totalPagar += item.getSubtotal();
        }
        setPrecoTotal(totalPagar); // Atualiza o preço total do pedido
        return totalPagar;
    }

    // Método para alterar o status do pedido
    public void alterarStatus(int novoStatus) {
        this.statusPedido = novoStatus;
    }

    // Método para consultar o pedido
    public boolean consultarPedido(Pedido pedidoBusca) {
        return numeroPedido == pedidoBusca.getNumeroPedido();
    }
}
