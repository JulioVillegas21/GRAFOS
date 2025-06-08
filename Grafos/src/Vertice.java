public class Vertice {

    private String nombre;

    private int numVertice;

    public Vertice(String x) {
        this.nombre = x;
        this.numVertice = -1;
    }

    public String GetNombre() // devuelve identificador del vértice
    {
        return this.nombre;
    }

    public int GetNum() {

        return this.numVertice;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void SetNumVertice(int n) { // establece el número de vértices
        this.numVertice = n;
    }

    public boolean SonIguales(Vertice n){ //Devuelve true si son iguales, false si son falsos
        return nombre.equals(n.nombre);
    }

    public String ToString(){ //hasta el momento ni idea
        return nombre + " (" + numVertice + ")";
    }
}










