public class Vertice {
    private String nombre;
    private int numVertice;

    public Vertice(String x) {
        this.nombre = x;
        this.numVertice = -1;
    }

    public String GetNombre() {
        return this.nombre;
    }

    public int GetNum() {
        return this.numVertice;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void SetNumVertice(int n) {
        this.numVertice = n;
    }

    public boolean SonIguales(Vertice n) {
        return this.nombre.equals(n.nombre);
    }

    public String ToString() {
        return this.nombre + " (" + this.numVertice + ")";
    }
}
