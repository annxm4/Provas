import java.util.ArrayList;

public class PedidoItem {

    private String nomeEvento;
    private int qtdeIngresso;
    private double precoIngresso;

    // Construtor (método PedidoItem)
    public PedidoItem(String nomeEvento, int qtdeIngresso, double precoIngresso) {
        this.nomeEvento = nomeEvento;
        this.qtdeIngresso = qtdeIngresso;
        this.precoIngresso = precoIngresso;
    }

    // Getters e Setters

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public int getQtdeIngresso() {
        return qtdeIngresso;
    }

    public void setQtdeIngresso(int qtdeIngresso) {
        this.qtdeIngresso = qtdeIngresso;
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

    // Método para atualizar o estoque de ingressos
    public boolean atualizaEstoqueIngresso() {
        // Lógica para atualizar o estoque de ingressos
        // Retorna true se a atualização for bem-sucedida, false caso contrário
        // Pode ser implementada de acordo com a lógica específica do seu sistema
        return true;
    }

    // Método para calcular o subtotal do item
    public double getSubtotal() {
        return qtdeIngresso * precoIngresso;
    }
}

