import java.util.Scanner;

public class EjemploArregloNotasAlumos {
    public static void main(String[] args) {

        double[] claseMatematicas, claseHistoria, claseLenguaje;
        int sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 7 notas para estudiantes de matemáticas");
        for(int i =0; i < claseMatematicas.length; i++){
            claseMatematicas[i] = s.nextDouble();
        }
        System.out.println("Ingrese 7 notas para estudiantes de historia");
        for (int i =0; i < claseHistoria.length; i++){
            claseHistoria[i] = s.nextDouble();
        }

        System.out.println("Ingrese 7 notas para estudiantes de lenguaje");
        for (int i =0; i < claseLenguaje.length; i++){
            claseLenguaje[i] = s.nextDouble();
        }

        for (int i =0; i < 7; i++){
            sumNotasMatematicas += claseMatematicas[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLenguaje += claseLenguaje[i];
        }
        double promedioMatematicas =(sumNotasMatematicas/claseMatematicas.length);
        double promedioHistoria =( sumNotasHistoria/claseHistoria.length);
        double promedioLenguaje = (sumNotasLenguaje/claseLenguaje.length);
        double promedioCurso = (promedioHistoria+ promedioMatematicas + promedioLenguaje)/3;
        System.out.println("Promedio clase matemáticas : "+ promedioMatematicas);
        System.out.println("Promedio clase historia : " + promedioHistoria);
        System.out.println("Promedio clase historia: "+ promedioLenguaje);
        System.out.println("Promedio del curso: " + promedioCurso);


        System.out.println("ingrese el identificador del alumno (de 0 a 6)");
        int id  = s.nextInt();
        double promedioAlumno = (claseHistoria[id]+ claseMatematicas[id]+ claseLenguaje[id])/3;
        System.out.println("Promedio alumno Nro " + id + " : " + promedioAlumno);

    }
}
