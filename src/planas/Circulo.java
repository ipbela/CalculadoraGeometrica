package planas;

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class Circulo {
    Scanner scanner = new Scanner(System.in);

    private double raio = 0;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String calcularArea(){
        System.out.println("\n--- CALCULAR ÁREA ---\n");

        // faz essa linha de código enquanto o usuário estiver digitando um número menor que 0
        do{
            System.out.println(" -> Digite o valor do raio: ");
            this.raio = scanner.nextDouble();
        }while(this.raio <= 0);

        double area = (Math.PI * (Math.pow(this.raio, 2)));

        //multiplica por 100 para virar um número inteiro
        // ceil arredonda para cima
        // o resto da divisão por 10 pega o último número
        int ultimoNumero = ((int) Math.ceil(area * 100)) % 10;
        if (ultimoNumero % 2 == 0){
            return String.format("\nA área do círculo é: %.2f\n", area).toUpperCase();
        }else {
            return String.format("\nA área do círculo é: %.2f\n", area).toLowerCase();
        }
    }

    public String calcularPerimetro(){
        System.out.println("\n--- CALCULAR PERÍMETRO ---\n");

        // faz essa linha de código enquanto o usuário estiver digitando um número menor que 0
        do{
            System.out.println(" -> Digite o valor do raio: ");
            this.raio = scanner.nextDouble();
        }while(this.raio <= 0);

        double perimetro = 2 * Math.PI * this.raio;
        //multiplica por 100 para virar um número inteiro
        // ceil arredonda para cima
        // o resto da divisão por 10 pega o último número
        int ultimoNumero = ((int) Math.ceil(perimetro * 100)) % 10;
        if (ultimoNumero % 2 == 0){
            return String.format("\nO perímetro do círculo é: %.2f\n", perimetro).toUpperCase();
        }else {
            return String.format("\nO perímetro do círculo é: %.2f\n", perimetro).toLowerCase();
        }
    }
}
