public class GrafoMatriz {
    private int numVerts = 0;
    private static final int maxVerts = 5;
    private Vertice[] verts;
    private int[][] matAd;

    public GrafoMatriz() {
        this(maxVerts);
    }

    public GrafoMatriz(int mx) {

        this.matAd = new int[mx][mx];

        this.verts = new Vertice[mx];

        for (int i = 0; i < mx; i++) {

            for (int j = 0; i < mx; i++) {
                matAd[i][j] = 0;
            }
        }

        numVerts = 0;
    }

    public void NuevoVertice(String nombre) {
        boolean esta = GetNumVerts(nombre) >= 0;
        if (!esta) {
            Vertice v = new Vertice(nombre);
            v.SetNumVertice(this.numVerts);
            verts[this.numVerts++] = v;
        }
    }

    private int GetNumVerts(String nombre) {

        Vertice v = new Vertice(nombre);
        boolean encontrado = false;
        int i;

        for (i = 0; i < numVerts; i++) {

            /* Para usar esta linea hay que cambiar el equals
            y queda muy compleja la logica.

                encontrado = verts[i].equals(v);

             */

            //la solucion mas facil
            encontrado = verts[i].GetNombre().equals(v.GetNombre());

            if (encontrado) break;
        }
        return (i < numVerts) ? i : -1;
    }


    public void NuevoArco(String nombVertice1, String nombVertice2, int peso){

        int vertice1, vertice2;

        vertice1 = GetNumVerts(nombVertice1);

        vertice2 = GetNumVerts(nombVertice2);

        if(vertice1 == -1 || vertice2 == -1){
            System.out.println("Error");

        }
        else{
            matAd[vertice1][vertice2] = peso;
            matAd[vertice2][vertice1] = peso;
        }

    }

    public boolean Adyacente(int va, int vb) throws Exception {
        if (va < 0 || vb < 0) throw new Exception("Uno de los vertices no existe");
        return matAd[va][vb] != 0;
    }


    public void Mostrase() {
        int i, j;
        int ancho = 12; // Ancho fijo para nombres y números

        // Encabezado: espacios en blanco y luego los nombres de las columnas
        System.out.printf("%" + ancho + "s", ""); // espacio vacío inicial
        for (i = 0; i < numVerts; i++) {
            System.out.printf("%" + ancho + "s", verts[i].GetNombre());
        }
        System.out.println();

        // Filas de la matriz
        for (i = 0; i < numVerts; i++) {
            // Nombre de la fila
            System.out.printf("%" + ancho + "s", verts[i].GetNombre());

            // Contenido de la matriz
            for (j = 0; j < numVerts; j++) {
                System.out.printf("%" + ancho + "d", matAd[i][j]);
            }
            System.out.println();
        }
    }



}

