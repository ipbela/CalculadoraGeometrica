package espaciais;

import java.util.Scanner;

public class PiramideBaseQuadrada {
    Scanner scanner = new Scanner(System.in);

    private double arestaBase = 0;
    private double apotema = 0;
    private double altura = 0;
    
    public PiramideBaseQuadrada(double arestaBase, double apotema, double altura) {
        this.arestaBase = arestaBase;
        this.apotema = apotema;
        this.altura = altura;
    }

    public double getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
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
            System.out.println("Digite o valor da aresta da base: ");
            this.arestaBase = scanner.nextDouble();
        }while(this.arestaBase <= 0);

        // faz essa linha de código enquanto o usuário estiver digitando um número menor que 0
        do{
            System.out.println("Digite o valor da altura: ");
            this.altura = scanner.nextDouble();
        }while(this.altura <= 0);

        double volume = (Math.pow(arestaBase, 2) * this.altura) / 3;
        //multiplica por 100 para virar um número inteiro
        // ceil arredonda para cima
        // o resto da divisão por 10 pega o último número
        int ultimoNumero = ((int) Math.ceil(volume * 100)) % 10;
        if (ultimoNumero % 2 == 0){
            return String.format("\nO volume da pirâmide de base quadrada é: %.2f\n", volume).toUpperCase();
        }else{
            return String.format("\nO volume da pirâmide de base quadrada é: %.2f\n", volume).toLowerCase();
        }
    }

    public String calcularAreaSuperficial(){
        System.out.println("\n--- CALCULAR ÁREA SUPERFICIAL ---\n");

        // faz essa linha de código enquanto o usuário estiver digitando um número menor que 0
        do{
            System.out.println("Digite o valor da aresta da base: ");
            this.arestaBase = scanner.nextDouble();
        }while(this.arestaBase <= 0);

        // faz essa linha de código enquanto o usuário estiver digitando um número menor que 0
        do{
            System.out.println("Digite o valor da apótema: ");
            this.apotema = scanner.nextDouble();
        }while(this.apotema <= 0);

        double areaSuperficial = (2 * arestaBase * apotema) + Math.pow(arestaBase, 2);
        //multiplica por 100 para virar um número inteiro
        // ceil arredonda para cima
        // o resto da divisão por 10 pega o último número
        int ultimoNumero = ((int) Math.ceil(areaSuperficial * 100)) % 10;
        if (ultimoNumero % 2 == 0){
            return String.format("\nA área superficial da pirâmide de base quadrada é: %.2f\n", areaSuperficial).toUpperCase();
        }else{
            return String.format("\nA área superficial da pirâmide de base quadrada é: %.2f\n", areaSuperficial).toLowerCase();
        }

    }
}
