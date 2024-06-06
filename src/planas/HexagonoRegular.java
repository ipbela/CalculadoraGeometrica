package planas;

import java.util.Locale;
import java.util.Scanner;

public class HexagonoRegular {
    Scanner scanner = new Scanner(System.in);
    private double lado = 0;

    public HexagonoRegular(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public String calcularArea(){
        System.out.println("\n--- CALCULAR ÁREA ---\n");

        // faz essa linha de código enquanto o usuário estiver digitando um número menor que 0
        do{
            System.out.println("Digite o valor do lado do hexágono regular: ");
            this.lado = scanner.nextDouble();
        }while(this.lado <= 0);

        double area = 6 * this.lado * Math.sqrt((double) 3 /4);
        //multiplica por 100 para virar um número inteiro
        // ceil arredonda para cima
        // o resto da divisão por 10 pega o último número
        int ultimoNumero = ((int) Math.ceil(area * 100)) % 10;
        if (ultimoNumero % 2 == 0){
            return String.format("\nA área do hexágono regular é: %.2f\n", area).toUpperCase();
        }else{
            return String.format("\nA área do hexágono regular é: %.2f\n", area).toLowerCase();
        }

    }

    public String calcularPerimetro(){
        System.out.println("\n--- CALCULAR PERÍMETRO ---\n");

        // faz essa linha de código enquanto o usuário estiver digitando um número menor que 0
        do{
            System.out.println("Digite o valor do lado do hexágono regular: ");
            this.lado = scanner.nextDouble();
        }while(this.lado <= 0);

        double perimetro = this.lado * 6;
        //multiplica por 100 para virar um número inteiro
        // ceil arredonda para cima
        // o resto da divisão por 10 pega o último número
        int ultimoNumero = ((int) Math.ceil(perimetro * 100)) % 10;
        if (ultimoNumero % 2 == 0){
            return String.format("\nO perímetro do hexágono regular é: %.2f\n", perimetro).toUpperCase();
        }else{
            return String.format("\nO perímetro do hexágono regular é: %.2f\n", perimetro).toLowerCase();
        }

    }
}
