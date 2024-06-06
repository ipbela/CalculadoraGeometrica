package espaciais;

import java.util.Scanner;

public class Esfera {
    Scanner scanner = new Scanner(System.in);

    private double raio = 0;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String calcularVolume(){
        System.out.println("\n--- CALCULAR VOLUME ---\n");

        // faz essa linha de código enquanto o usuário estiver digitando um número menor que 0
        do{
            System.out.println("Digite o valor do raio: ");
            this.raio = scanner.nextDouble();
        }while (this.raio <= 0);

        double volume = (double) 4 /3 * Math.PI * Math.pow(raio, 3);
        //multiplica por 100 para virar um número inteiro
        // ceil arredonda para cima
        // o resto da divisão por 10 pega o último número
        int ultimoNumero = ((int) Math.ceil(volume * 100)) % 10;
        if (ultimoNumero % 2 == 0){
            return String.format("\nO volume da esfera é: %.2f\n", volume).toUpperCase();
        }else{
            return String.format("\nO volume da esfera é: %.2f\n", volume).toLowerCase();
        }

    }

    public String calcularAreaSuperficial(){
        System.out.println("\n--- CALCULAR ÁREA SUPERFICIAL ---\n");

        // faz essa linha de código enquanto o usuário estiver digitando um número menor que 0
        do{
            System.out.println("Digite o valor do raio: ");
            this.raio = scanner.nextDouble();
        }while(this.raio <= 0);

        double areaSuperficial = 4 * Math.PI * Math.pow(raio, 2);
        //multiplica por 100 para virar um número inteiro
        // ceil arredonda para cima
        // o resto da divisão por 10 pega o último número
        int ultimoNumero = ((int) Math.ceil(areaSuperficial * 100)) % 10;
        if (ultimoNumero % 2 == 0){
            return String.format("\nA área superficial da esfera é: %.2f\n", areaSuperficial).toUpperCase();
        }else{
            return String.format("\nA área superficial da esfera é: %.2f\n", areaSuperficial).toLowerCase();
        }
    }
}
