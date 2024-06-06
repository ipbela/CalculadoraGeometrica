package espaciais;

import java.util.Scanner;

public class Paralelepipedo {
    Scanner scanner = new Scanner(System.in);

    private double comprimento = 0;
    private double altura = 0;
    private double largura = 0;
    
    public Paralelepipedo(double comprimento, double altura, double largura) {
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public String calcularVolume(){
        System.out.println("\n--- CALCULAR VOLUME ---\n");

        // faz essa linha de código enquanto o usuário estiver digitando um número menor que 0
        do{
            System.out.println("Digite o valor do comprimento: ");
            this.comprimento = scanner.nextDouble();
        }while(this.comprimento <= 0);

        // faz essa linha de código enquanto o usuário estiver digitando um número menor que 0
        do{
            System.out.println("Digite o valor da altura: ");
            this.altura = scanner.nextDouble();
        }while(this.altura <= 0);

        // faz essa linha de código enquanto o usuário estiver digitando um número menor que 0
        do{
            System.out.println("Digite o valor da largura: ");
            this.largura = scanner.nextDouble();
        }while(this.largura <= 0);

        double volume = this.comprimento * this.altura * this.largura;
        //multiplica por 100 para virar um número inteiro
        // ceil arredonda para cima
        // o resto da divisão por 10 pega o último número
        int ultimoNumero = ((int) Math.ceil(volume * 100)) % 10;
        if (ultimoNumero % 2 == 0){
            return String.format("\nO volume do paralelepipedo é: %.2f\n", volume).toUpperCase();
        }else{
            return String.format("\nO volume do paralelepipedo é: %.2f\n", volume).toLowerCase();
        }

    }

    public String calcularAreaSuperficial(){
        System.out.println("\n--- CALCULAR ÁREA SUPERFICIAL ---\n");

        // faz essa linha de código enquanto o usuário estiver digitando um número menor que 0
        do{
            System.out.println("Digite o valor do comprimento: ");
            this.comprimento = scanner.nextDouble();
        }while(this.comprimento <= 0);

        // faz essa linha de código enquanto o usuário estiver digitando um número menor que 0
        do{
            System.out.println("Digite o valor da altura: ");
            this.altura = scanner.nextDouble();
        }while(this.altura <= 0);

        // faz essa linha de código enquanto o usuário estiver digitando um número menor que 0
        do{
            System.out.println("Digite o valor da largura: ");
            this.largura = scanner.nextDouble();
        }while(this.largura <= 0);

        double areaSuperficial = 2 * ((this.comprimento * this.altura) + (this.altura * this.largura) + (this.comprimento * this.largura));
        //multiplica por 100 para virar um número inteiro
        // ceil arredonda para cima
        // o resto da divisão por 10 pega o último número
        int ultimoNumero = ((int) Math.ceil(areaSuperficial * 100)) % 10;
        if (ultimoNumero % 2 == 0){
            return String.format("\nA área superficial do paralelepipedo é: %.2f\n", areaSuperficial).toUpperCase();
        }else{
            return String.format("\nA área superficial do paralelepipedo é: %.2f\n", areaSuperficial).toLowerCase();
        }

    }
}
