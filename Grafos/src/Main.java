public class Main {



    public static void main(String[] args) {

        GrafoMatriz matriz = new GrafoMatriz();


        matriz.NuevoVertice("Vm");
        matriz.NuevoVertice("Chajan");
        matriz.NuevoVertice("Sampacho");
        matriz.NuevoVertice("Ribera");
        matriz.NuevoVertice("Naschel");

        matriz.Mostrase();

        matriz.NuevoArco("Sampacho","Chajan",40);
        matriz.NuevoArco("Vm","Sampacho",12);
        matriz.NuevoArco("Ribera","Chajan",57);
        matriz.NuevoArco("Vm","Ribera",11);
        matriz.NuevoArco("Chajan","Naschel",5);

        matriz.Mostrase();











    }
}