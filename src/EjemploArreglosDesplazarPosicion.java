import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion {
    public static void main(String[] args) {
        int[] a = new int [10];
        int ultimo;
        System.out.println("ingrese 10 numeros");
        Scanner s = new Scanner(System.in);
        for (int i =0; i < a.length; i++){
            a[i] = s.nextInt();

        }
        System.out.println();
        ultimo = a[a.length-1];
        for (int i = a.length -2 ; i >=0; i--){
     a[i+1] = a[i];


        }
        a[0] = ultimo;
        System.out.println("el arreglo");
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
