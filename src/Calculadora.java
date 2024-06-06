import planas.*;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import espaciais.Cilindro;
import espaciais.Cone;
import espaciais.Cubo;
import espaciais.Esfera;
import espaciais.Paralelepipedo;
import espaciais.PiramideBaseQuadrada;

public class Calculadora {
    static Scanner scanner = new Scanner(System.in);
    static String nomeUsuario = "";

    public static void main(String[] args) throws InterruptedException{
        System.out.println("Bem-Vindo ao programa de - Calculadora Geometrica -");
        System.out.println(" -> Digite seu nome para continuar: "); // usuário insere o seu nome
        nomeUsuario = scanner.nextLine(); // leitura do nome do usuário

        // contagem para começar o programa
        System.out.println(nomeUsuario.toUpperCase() + " o programa irá iniciar em...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("3...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("2...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("1...");
        TimeUnit.SECONDS.sleep(1);
        menuPrincipal(); // redireciona para o menu principal
    }

    static void menuPrincipal(){
        int opcao = 0;

        // tenta fazer a execução do menu com as opções possíveis
        while (true){
            try{
                System.out.println("\n--- CALCULADORA GEOMTRICA ---\n");
                System.out.println("\n -> (" + nomeUsuario + ") escolha uma opcao para continuar: " +
                        "\n1 - Planas" +
                        "\n2 - Espaciais" +
                        "\n3 - Sair do Programa");
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        figurasPlanas();
                        break;
                    case 2:
                        figurasEspaciais();
                        break;
                    case 3:
                        System.out.println("Finalizando o programa...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Essa opção não existe. Digite outra por favor!");
                }
            }catch (Exception e){ // caso o usuário digite uma opção que não existe, o programa volta ao menu
                System.out.println("Digite apenas números!");
                scanner.next(); //limpa o scanner
            }
            }
        }

    static void figurasPlanas() {
        int opcao = 0;

        // tenta fazer a execução do menu com as opções possíveis
        while (true){
            try {
                System.out.println("\n -> (" + nomeUsuario + ") escolha uma opção de forma plana para continuar: " +
                        "\n1 - Círculo" +
                        "\n2 - Hexágono Regular" +
                        "\n3 - Quadrado" +
                        "\n4 - Retângulo" +
                        "\n5 - Triângulo Equilátero" +
                        "\n6 - Voltar ao Menu Principal");
                opcao = scanner.nextInt();

                // de acordo com a opção escolhida, redireciona para a classe da forma escolhida
                switch (opcao) {
                    case 1:
                        Circulo circulo = new Circulo(0);
                        System.out.println(circulo.calcularArea());
                        System.out.println(circulo.calcularPerimetro());
                        break;
                    case 2:
                        HexagonoRegular hexRegular = new HexagonoRegular(0);
                        System.out.println(hexRegular.calcularArea());
                        System.out.println(hexRegular.calcularPerimetro());
                        break;
                    case 3:
                        Quadrado quadrado = new Quadrado(0);
                        System.out.println(quadrado.calcularArea());
                        System.out.println(quadrado.calcularPerimetro());
                        break;
                    case 4:
                        Retangulo retangulo = new Retangulo(0, 0);
                        System.out.println(retangulo.calcularArea());
                        System.out.println(retangulo.calcularPerimetro());
                        break;
                    case 5:
                        TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero(0);
                        System.out.println(trianguloEquilatero.calcularArea());
                        System.out.println(trianguloEquilatero.calcularPerimetro());
                        break;
                    case 6:
                        menuPrincipal();
                        break;
                    default:
                        System.out.println("Essa opção não existe. Digite outra por favor!");
                }
            }catch (Exception e){ // caso o usuário digite algo além das opções é redirecionado para essa tratativa de erro
                System.out.println("Digite apenas números!");
                scanner.next(); //limpar o scanner
            }
            }
        }


    static void figurasEspaciais() {
        int opcao = 0;

        // tenta fazer a execução do menu com as opções possíveis
        while(true){
            try{
                System.out.println("\n -> (" + nomeUsuario + ") escolha uma opção de forma espacial para continuar: " +
                        "\n1 - Cilindro" +
                        "\n2 - Cone" +
                        "\n3 - Cubo" +
                        "\n4 - Esfera" +
                        "\n5 - Paralelepipedo" +
                        "\n6 - Pirâmide de Base Quadrada" +
                        "\n7 - Voltar ao Menu Principal");
                opcao = scanner.nextInt();

                // de acordo com a opção escolhida, redireciona para a classe da forma escolhida
                switch (opcao) {
                    case 1:
                        Cilindro cilindro = new Cilindro(0, 0);
                        System.out.println(cilindro.calcularVolume());
                        System.out.println(cilindro.calcularAreaSuperficial());
                        break;
                    case 2:
                        Cone cone = new Cone(0, 0);
                        System.out.println(cone.calcularVolume());
                        System.out.println(cone.calcularAreaSuperficial());
                        break;
                    case 3:
                        Cubo cubo = new Cubo(0);
                        System.out.println(cubo.calcularVolume());
                        System.out.println(cubo.calcularAreaSuperficial());
                        break;
                    case 4:
                        Esfera esfera = new Esfera(0);
                        System.out.println(esfera.calcularVolume());
                        System.out.println(esfera.calcularAreaSuperficial());
                        break;
                    case 5:
                        Paralelepipedo paralelepipedo = new Paralelepipedo(0, 0, 0);
                        System.out.println(paralelepipedo.calcularVolume());
                        System.out.println(paralelepipedo.calcularAreaSuperficial());
                        break;
                    case 6:
                        PiramideBaseQuadrada piramideBaseQuadrada = new PiramideBaseQuadrada(0, 0, 0);
                        System.out.println(piramideBaseQuadrada.calcularVolume());
                        System.out.println(piramideBaseQuadrada.calcularAreaSuperficial());
                        break;
                    case 7:
                        menuPrincipal(); //volta ao menu principal
                        break;
                    default:
                        System.out.println("Essa opção não existe. Digite outra por favor!");
                }
            }catch (Exception e){ // caso o usuário digite algo além das opções é redirecionado para essa tratativa de erro
                System.out.println("Digite apenas números!");
                scanner.next(); //limpa o scanner
            }
            }
        }
}