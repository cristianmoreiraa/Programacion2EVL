
package boletin27.ClaseObjeto;

/**
 *
 * @author crist
 */
public class Libros {
    private String nome, autor;
    private float precio;
    private int unidades;

    public Libros(String nome, String autor, float precio, int unidades) {
        this.nome = nome;
        this.autor = autor;
        this.precio = precio;
        this.unidades = unidades;
    }
    
    public Libros(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return nome + ", " + autor + ", " + precio + ", " + unidades;
    }
  }

