package planas;

import java.util.Scanner;

public class Retangulo {
    Scanner scanner = new Scanner(System.in);

    private double altura = 0;
    private double base = 0;

    public Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public String calcularArea(){
        System.out.println("\n--- CALCULAR ÁREA ---\n");

        // faz essa linha de código enquanto o usuário estiver digitando um número menor que 0
        do{
            System.out.println("Digite o valor da altura do retângulo: ");
            this.altura = scanner.nextDouble();
        }while(this.altura <= 0);

        // faz essa linha de código enquanto o usuário estiver digitando um número menor que 0
        do{
            System.out.println("Digite o valor da base do retângulo: ");
            this.base = scanner.nextDouble();
        }while(this.base <= 0);

        double area = this.base * this.altura;
        //multiplica por 100 para virar um número inteiro
        // ceil arredonda para cima
        // o resto da divisão por 10 pega o último número
        int ultimoNumero = ((int) Math.ceil(area * 100)) % 10;
        if (ultimoNumero % 2 == 0){
            return String.format("\nA área do retângulo é: %.2f\n", area).toUpperCase();
        }else{
            return String.format("\nA área do retângulo é: %.2f\n", area).toLowerCase();
        }
    }

    public String calcularPerimetro(){
        System.out.println("\n--- CALCULAR PERÍMETRO ---\n");

        // faz essa linha de código enquanto o usuário estiver digitando um número menor que 0
        do{
            System.out.println("Digite o valor da altura do retângulo: ");
            this.altura = scanner.nextDouble();
        }while(this.altura <= 0);

        // faz essa linha de código enquanto o usuário estiver digitando um número menor que 0
        do{
            System.out.println("Digite o valor da base do retângulo: ");
            this.base = scanner.nextDouble();
        }while(this.base <= 0);

        double perimetro = (this.base * 2) + (this.altura * 2);
        //multiplica por 100 para virar um número inteiro
        // ceil arredonda para cima
        // o resto da divisão por 10 pega o último número
        int ultimoNumero = ((int) Math.ceil(perimetro * 100)) % 10;
        if (ultimoNumero % 2 == 0){
            return String.format("\nO perímetro do retângulo é: %.2f\n", perimetro).toUpperCase();
        }else{
            return String.format("\nO perímetro do retângulo é: %.2f\n", perimetro).toLowerCase();
        }
    }
}
