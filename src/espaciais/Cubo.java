package espaciais;

import java.util.Scanner;

public class Cubo {
    Scanner scanner = new Scanner(System.in);

    private double lado = 0;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public String calcularVolume(){
        System.out.println("\n--- CALCULAR VOLUME ---\n");

        // faz essa linha de código enquanto o usuário estiver digitando um número menor que 0
        do{
            System.out.println("Digite o valor do lado: ");
            this.lado = scanner.nextDouble();
        }while(this.lado <= 0);

        double volume = Math.pow(lado, 3);
        //multiplica por 100 para virar um número inteiro
        // ceil arredonda para cima
        // o resto da divisão por 10 pega o último número
        int ultimoNumero = ((int) Math.ceil(volume * 100)) % 10;
        if (ultimoNumero % 2 == 0){
            return String.format("\nO volume do cubo é: %.2f\n", volume).toUpperCase();
        }else{
            return String.format("\nO volume do cubo é: %.2f\n", volume).toLowerCase();
        }

    }

    public String calcularAreaSuperficial(){
        System.out.println("\n--- CALCULAR ÁREA SUPERFICIAL ---\n");

        // faz essa linha de código enquanto o usuário estiver digitando um número menor que 0
        do{
            System.out.println("Digite o valor do lado: ");
            this.lado = scanner.nextDouble();
        }while(this.lado <= 0);

        double areaSuperficial = Math.pow(lado, 2) * 6;
        //multiplica por 100 para virar um número inteiro
        // ceil arredonda para cima
        // o resto da divisão por 10 pega o último número
        int ultimoNumero = ((int) Math.ceil(areaSuperficial * 100)) % 10;
        if (ultimoNumero % 2 == 0){
            return String.format("\nA área superficial do cubo é: %.2f\n", areaSuperficial).toUpperCase();
        }else{
            return String.format("\nA área superficial do cubo é: %.2f\n", areaSuperficial).toLowerCase();
        }

    }
}
