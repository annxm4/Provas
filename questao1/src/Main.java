import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        ArrayList<Categoria> categorias = new ArrayList<>();
        categorias.add(new Categoria("FUTEBOL"));
        categorias.add(new Categoria("VOLEI"));
        categorias.add(new Categoria("NADAR"));
        categorias.add(new Categoria("CORRER"));
        categorias.add(new Categoria("MALHAR"));
        // Criando ArrayList de Evento
        ArrayList<Evento> eventos = new ArrayList<>();

        // Inserindo 5 eventos distintos
        eventos.add(new Evento("Jogar futebol", new Date(), 50.0, "Jogar bola na quinta", 100, categorias.get(0).getDescCategoria()));
        eventos.add(new Evento("Jogar volei", new Date(), 30.0, "Jogar volei com o Rafael", 150, categorias.get(1).getDescCategoria()));
        eventos.add(new Evento("Nadar", new Date(), 20.0, "Nadar 300m rasos", 200, categorias.get(2).getDescCategoria()));
        eventos.add(new Evento("Correr", new Date(), 15.0, "Correr 21km", 120, categorias.get(3).getDescCategoria()));
        eventos.add(new Evento("Malhar", new Date(), 10.0, "Fortalecer os musculos", 300, categorias.get(4).getDescCategoria()));

        // Criando ArrayList de Pedido
        ArrayList<Pedido> pedidos = new ArrayList<>();

        // Inserindo 2 pedidos com 3 respectivos itens cada
        Pedido pedido1 = new Pedido(1, new Date(), 1);
        pedido1.inserirItensPedido(new PedidoItem("Jogar futebol", 2, 50.0));
        pedido1.inserirItensPedido(new PedidoItem("Jogar volei", 1, 30.0));
        pedido1.inserirItensPedido(new PedidoItem("Nadar", 3, 20.0));
        pedidos.add(pedido1);

        Pedido pedido2 = new Pedido(2, new Date(), 1);
        pedido2.inserirItensPedido(new PedidoItem("Correr", 4, 15.0));
        pedido2.inserirItensPedido(new PedidoItem("Malhar", 2, 10.0));
        pedido2.inserirItensPedido(new PedidoItem("Jogar volei", 1, 30.0));
        pedidos.add(pedido2);

        // Realizando as validações
        for (Pedido pedido : pedidos) {
            for (PedidoItem item : pedido.getItensPedido()) {
                // Validando se o PedidoItem existe como Evento
                boolean eventoExiste = false;
                for (Evento evento : eventos) {
                    if (evento.getNomeEvento().equals(item.getNomeEvento())) {
                        eventoExiste = true;
                        // Atualizando o estoque de ingressos
                        evento.setQtdeIngresso(evento.getQtdeIngresso() - item.getQtdeIngresso());
                        break;
                    }
                }

                if (!eventoExiste) {
                    System.out.println("Erro: O evento do PedidoItem não existe como Evento.");
                }
            }

            // Atualizando o status do pedido para 2
            pedido.alterarStatus(2);

            // Calculando o valor total a pagar para o pedido
            double totalPagar = pedido.calculaTotalPagar();

            // Imprimindo informações do pedido
            System.out.println("Pedido #" + pedido.getNumeroPedido());
            System.out.println("Status: " + pedido.getStatusPedido());
            System.out.println("Total a Pagar: R$" + totalPagar);
            System.out.println();
        }
    }
}
