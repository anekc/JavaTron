import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2b {
    public static void main(String[] args) {
        int[] a = new int [10];
        int elemento, posicion, ultimo;
        System.out.println("ingrese 10 numeros");
        Scanner s = new Scanner(System.in);
        for (int i =0; i < a.length; i++){
            a[i] = s.nextInt();

        }
        System.out.println();
        System.out.println("Nuevo elemento");
        elemento = s.nextInt();
        System.out.println("posición donde agregar del 0 al 9");
        posicion = s.nextInt();
        ultimo = a[a.length-1];
        for (int i = a.length -2 ; i >=posicion; i--){
            a[i+1] = a[i];


        }
        int[] b= new int[a.length+1];
        System.arraycopy(a,0, b,0, a.length);
        b[posicion] = elemento;
        b[b.length -1] = ultimo;
        System.out.println("el arreglo");
        for (int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
    }
}
