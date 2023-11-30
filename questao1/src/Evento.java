import java.util.Date;

public class Evento {

    private String nomeEvento;
    private Date dataEvento;
    private double precoEvento;
    private String descEvento;
    private int qtdeIngresso;
    public String categoria;

    // Construtor (método inserirEvento)
    public Evento(String nomeEvento, Date dataEvento, double precoEvento, String descEvento, int qtdeIngresso, String categoria) {
        this.nomeEvento = nomeEvento;
        this.dataEvento = dataEvento;
        this.precoEvento = precoEvento;
        this.descEvento = descEvento;
        this.qtdeIngresso = qtdeIngresso;
        this.categoria = categoria;
    }

    // Getters e Setters
    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public Date getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }

    public double getPrecoEvento() {
        return precoEvento;
    }

    public void setPrecoEvento(double precoEvento) {
        this.precoEvento = precoEvento;
    }

    public String getDescEvento() {
        return descEvento;
    }

    public void setDescEvento(String descEvento) {
        this.descEvento = descEvento;
    }

    public int getQtdeIngresso() {
        return qtdeIngresso;
    }

    public void setQtdeIngresso(int qtdeIngresso) {
        this.qtdeIngresso = qtdeIngresso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Método para buscar o evento
    public boolean buscarEvento(Evento eventoBusca) {
        return nomeEvento.equals(eventoBusca.getNomeEvento());
    }
}