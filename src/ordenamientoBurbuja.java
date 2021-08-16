import java.util.Arrays;

public class  ordenamientoBurbuja {
    public static void arregloInverso(String[] arreglo) {
        int total2 = arreglo.length;
        int total = arreglo.length;
        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];
            arreglo[i] = inverso;
            arreglo[total - 1 - i] = actual;
            total2--;

        }
    }
  public static void sortBurbuja(Object[] arreglo){
        int total = arreglo.length;
        int contador = 0;
      for (int i = 0; i < total -1; i++) {
          for (int j = 0; j < total -1 -i; j++) {
              if (((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) > 0) {
                  Object aux = arreglo[j];
                  arreglo[j] = arreglo[j + 1];
                  arreglo[j + 1] = aux;
              }
              contador++;
          }
          System.out.println("contador = " + contador);
      }
  }
    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air",
                "Chromecast 4ta generación", "Bicicleta Oxford"};

        int total = productos.length;
        sortBurbuja(productos);
        /*int contador = 0;

        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if (productos[j + 1].compareTo(productos[j]) < 0) {
                    String aux = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = aux;
                }
                contador++;
            }

        }*/

       /* for(int i = 0; i < total; i++){
            for(int j=0; j <total; j++){
                if (productos[i].compareTo(productos[j]) < 0){
                    String aux = productos[i];
                    productos[i] = productos[j];
                    productos[j] = aux;
               */



        //  Arrays.sort(productos);
        // arregloInverso(productos);
        // solucion de el JDK
        //Collections.reverse(Arrays.asList(productos));

        System.out.println("=== Usando for ===");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        Integer[] numeros = new Integer[4];
        numeros[0] = 10;
        numeros[1] = 7;
        numeros[2] = 35;
        numeros[3] = -1;

       /* for (int i = 0; i < numeros.length -1; i++) {
            for (int j = 0; j < numeros.length -1 -i; j++) {
                if (((Integer) numeros[j + 1]).compareTo(numeros[j]) < 0) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
                contador++;
            }

        }*/
        sortBurbuja(numeros);
        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}