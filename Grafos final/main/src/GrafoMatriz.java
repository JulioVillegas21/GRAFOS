public class GrafoMatriz {
    private int numVerts;
    private static final int maxVerts = 5;
    private Vertice[] verts;
    private int[][] matAd;

    public GrafoMatriz() {
        this(5);
    }

    public GrafoMatriz(int mx) {
        this.numVerts = 0;
        this.matAd = new int[mx][mx];
        this.verts = new Vertice[mx];

        for(int i = 0; i < mx; ++i) {
            for(int j = 0; i < mx; ++i) {
                this.matAd[i][j] = 0;
            }
        }

        this.numVerts = 0;
    }

    public void NuevoVertice(String nombre) {
        boolean esta = this.GetNumVerts(nombre) >= 0;
        if (!esta) {
            Vertice v = new Vertice(nombre);
            v.SetNumVertice(this.numVerts);
            this.verts[this.numVerts++] = v;
        }

    }

    private int GetNumVerts(String nombre) {
        Vertice v = new Vertice(nombre);
        boolean encontrado = false;

        int i;
        for(i = 0; i < this.numVerts; ++i) {
            encontrado = this.verts[i].GetNombre().equals(v.GetNombre());
            if (encontrado) {
                break;
            }
        }

        return i < this.numVerts ? i : -1;
    }

    public void NuevoArco(String nombVertice1, String nombVertice2, int peso) {
        int vertice1 = this.GetNumVerts(nombVertice1);
        int vertice2 = this.GetNumVerts(nombVertice2);
        if (vertice1 != -1 && vertice2 != -1) {
            this.matAd[vertice1][vertice2] = peso;
        } else {
            System.out.println("Error");
        }

    }

    public String Adyacente(String nomVart1, String nomVart2)  {

        int numVerts1 = GetNumVerts(nomVart1);

        int numVerts2 = GetNumVerts(nomVart2);



        if (matAd[numVerts1][numVerts2] > 0 ) {

            return "Las ciudad " + nomVart1 + " y " + nomVart2 + " Son adayacentes";

        }
        else {

            return "Las ciudad " + nomVart1 + " y " + nomVart2 + " No son adayacentes";

        }
    }

    public void Mostrase() {

        System.out.printf("%12s","");

        for(int i = 0; i < this.numVerts; i++) {
            System.out.printf("%-12s", this.verts[i].GetNombre());
        }

        System.out.println();

        for(int i = 0; i < this.numVerts; i++) {
            System.out.printf("%-12s", this.verts[i].GetNombre());

            for(int j = 0; j < this.numVerts; ++j) {
                System.out.printf("%-12d", this.matAd[i][j]);
            }

            System.out.println();
        }

    }

    public String Busqueda(String nomVertice){

        int numVertice = GetNumVerts(nomVertice);

        for (int i = 0 ; i<maxVerts ; i++){

        if(verts[i].GetNum() == numVertice ){

        return "El vertice " + nomVertice + " Ha sido encontrado correctamente, Su numero de reconocimiento es " + GetNumVerts(nomVertice);
        }}

        return "El vertice " + nomVertice + " No ha sido encontrado correctamente ";
    }




}