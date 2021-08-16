import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2 {
    public static void main(String[] args) {
        int[] a = new int [10];
        int elemento, posicion;
        System.out.println("ingrese 10 numeros");
        Scanner s = new Scanner(System.in);
        for (int i =0; i < a.length-1; i++){
            a[i] = s.nextInt();

        }
        System.out.println();
        System.out.println("Nuevo elemento");
        elemento = s.nextInt();
        System.out.println("posición donde agregar del 0 al 9");
        posicion = s.nextInt();
        for (int i = a.length -2 ; i >=posicion; i--){
            a[i+1] = a[i];


        }
        a[posicion] = elemento;
        System.out.println("el arreglo");
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
