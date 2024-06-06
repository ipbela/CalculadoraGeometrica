package espaciais;

import java.util.Scanner;

public class Cilindro {
    Scanner scanner = new Scanner(System.in);

    private double raio = 0;
    private double altura = 0;
    
    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String calcularVolume(){
        System.out.println("\n--- CALCULAR VOLUME ---\n");

        // faz essa linha de código enquanto o usuário estiver digitando um número menor que 0
        do{
            System.out.println("Digite o valor da altura (maior que 0): ");
            this.altura = scanner.nextDouble();
        }while (this.altura <= 0);

        // faz essa linha de código enquanto o usuário estiver digitando um número menor que 0
        do{
            System.out.println("Digite o valor do raio (maior que 0): ");
            this.raio = scanner.nextDouble();
        }while(this.raio <= 0);

        double volume = (Math.PI * this.altura * (Math.pow(this.raio, 2)));
        //multiplica por 100 para virar um número inteiro
        // ceil arredonda para cima
        // o resto da divisão por 10 pega o último número
        int ultimoNumero = ((int) Math.ceil(volume * 100)) % 10;
        if (ultimoNumero % 2 == 0){
            return String.format("\nO volume do cilindro é: %.2f\n", volume).toUpperCase();
        }else{
            return String.format("\nO volume do cilindro é: %.2f\n", volume).toLowerCase();
        }
    }

    public String calcularAreaSuperficial(){
        System.out.println("\n--- CALCULAR ÁREA SUPERFICIAL ---\n");

        // faz essa linha de código enquanto o usuário estiver digitando um número menor que 0
        do{
            System.out.println("Digite o valor da altura (maior que 0): ");
            this.altura = scanner.nextDouble();
        }while(this.altura <= 0);

        // faz essa linha de código enquanto o usuário estiver digitando um número menor que 0
        do{
            System.out.println("Digite o valor do raio (maior que 0): ");
            this.raio = scanner.nextDouble();
        }while (this.raio <= 0);

        double areaSuperficial = (2 * Math.PI * this.raio * this.altura) + (2 * Math.PI + Math.pow(this.raio, 2));
        //multiplica por 100 para virar um número inteiro
        // ceil arredonda para cima
        // o resto da divisão por 10 pega o último número
        int ultimoNumero = ((int) Math.ceil(areaSuperficial * 100)) % 10;
        if (ultimoNumero % 2 == 0){
            return String.format("\nA área superficial do cilindro é: %.2f\n", areaSuperficial).toUpperCase();
        }else{
            return String.format("\nA área superficial do cilindro é: %.2f\n", areaSuperficial).toLowerCase();
        }
    }
}
