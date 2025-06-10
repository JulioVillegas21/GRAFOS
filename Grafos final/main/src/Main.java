public class Main {



    public static void main(String[] args) {

        GrafoMatriz matriz = new GrafoMatriz();


        matriz.NuevoVertice("Vm");//Alicante
        matriz.NuevoVertice("Chajan");//Belgrano
        matriz.NuevoVertice("Sampacho");//Cartagena
        matriz.NuevoVertice("Ribera");//Murcia
        matriz.NuevoVertice("Naschel");//Reus

        System.out.println("Matriz vacia:");
        matriz.Mostrase();

        matriz.NuevoArco("Vm","Sampacho",5);
        matriz.NuevoArco("Vm","Ribera",3);
        matriz.NuevoArco("Chajan","Sampacho",5);
        matriz.NuevoArco("Chajan","Naschel",3);
        matriz.NuevoArco("Chajan","Ribera",6);
        matriz.NuevoArco("Sampacho","Vm",3);
        matriz.NuevoArco("Ribera","Chajan",2);
        matriz.NuevoArco("Naschel","Chajan",1);

        matriz.Mostrase();

        System.out.println("_____________________________________________");
        System.out.println("Matriz con Valores:");
        System.out.println(matriz.Adyacente("Sampacho","Chajan"));
        System.out.println(matriz.Adyacente("Ribera","Sampacho"));
        System.out.println(matriz.Adyacente("Vm","Chajan"));
        System.out.println(matriz.Adyacente("Vm","Ribera"));
        System.out.println(matriz.Adyacente("Chajan","Chajan"));

        System.out.println("______________________________________________");

        System.out.println(matriz.Busqueda("Chajan"));
        System.out.println();
        System.out.println(matriz.Busqueda("Vm"));
        System.out.println();
        System.out.println(matriz.Busqueda("Sampacho"));
        System.out.println();
        System.out.println(matriz.Busqueda("Ribera"));
        System.out.println();
        System.out.println(matriz.Busqueda("Carolina"));












    }
}