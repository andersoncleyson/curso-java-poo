package introducaoPOO.domain;

public class Student {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double mediaFinal() {
        double media = this.nota1 + this.nota2 + this.nota3;
        double missing;
        if (media >= 60) {
            System.out.println("FINAL GRADE: " + String.format("%.2f", media));
            System.out.println("PASS");

        } else {
            System.out.println("FINAL GRADE: " + String.format("%.2f", media));
            System.out.println("FAILED");
            missing = 60 - media;
            System.out.println("MISSED " + String.format("%.2f", missing) + " POINTS");
        }

        return 0;
    }
}
