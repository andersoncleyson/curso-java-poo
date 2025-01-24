package introducaoPOO.test;

import introducaoPOO.domain.Student;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioStudent03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        student.nome = sc.nextLine();
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();

        student.mediaFinal();


    }
}
