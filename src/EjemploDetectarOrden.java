import java.util.Scanner;

public class EjemploDetectarOrden {
    public static void main(String[] args) {
        int[]a = new int[7];

        Scanner s = new Scanner(System.in);

        System.out.println("In grese 7 numeros");
        for(int i =0; i < a.length; i++){
            a[i] = s.nextInt();
        }
        boolean asc = false;
        boolean desc = false;
        for(int i = 0; i < a.length -1; i++){
            if(a[i] > a[i+1]){
                desc = true;
            }
            if(a[i] < a[i+1]){
                asc= true;
            }
        }
        if(asc  == true && desc == true){
            System.out.println("Arreglo desordenado");
        }
        if(asc  == false && desc == false){

            System.out.println("todos son iguales");
        }

        if(asc == true && desc == false){
            System.out.println("arreglo  ascendente");
        }
        if(asc == false  && desc == true){
            System.out.println("arreglo descendente");
        }
    }
}
