import java.time.LocalDate;

public class Elemento {
    String categoria;
    int numero;
    LocalDate data;
    
    public Elemento() {
    }

    public Elemento(String categoria, int numero) {
        this.categoria = categoria;
        this.numero = numero;
        data = LocalDate.now();
    }
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "" + categoria + "," + numero + "," + data;
    }
}
