import java.util.Locale;
import java.util.Scanner;

public class EjemplOaREGLOSBuscarTexto {
    public static void main(String[] args) {
        String []  a  = new String [4];
        Scanner s = new Scanner(System.in);

        for(int i=0; i < a.length; i++){
            System.out.print("Ingrese una Palabra: ");
            a[i]= s.next();
        }
        System.out.println("\r\nIngrese palabra a buscar a buscar: ");
        String word = s.next();
        int i = 0;
        for( ; i < a.length && !a[i].equalsIgnoreCase(word); i++){

        }
       if(i == a.length){
           System.out.println("Palabra no encontrada");
        } else if( a[i].toLowerCase().compareTo(word.toLowerCase()) == 0  ){
           System.out.println("Encontrada en la posición : "+ i);
       }
    }
}
