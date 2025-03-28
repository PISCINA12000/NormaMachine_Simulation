import java.util.Scanner;

public class Principal {
    public static int menu(){
        Scanner leitor = new Scanner(System.in);
        int opc;
        System.out.println("$$$$$$$$\\  $$$$$$\\  ");
        System.out.println("\\__$$  __|$$  __$$\\ ");
        System.out.println("   $$ |   $$ /  \\__|");
        System.out.println("   $$ |   $$ |      ");
        System.out.println("   $$ |   $$ |      ");
        System.out.println("   $$ |   $$ |  $$\\ ");
        System.out.println("   $$ |   \\$$$$$$  |");
        System.out.println("   \\__|    \\______/ ");
        System.out.println("***** MÁQUINA DE NORMA *****");
        System.out.println("1 - Adição SEM PRESERVAR o conteúdo");
        System.out.println("2 - Adição PRESERVANDO o conteúdo");
        System.out.println("3 - Multiplicação SEM PRESERVAR o conteúdo");
        System.out.println("4 - Multiplicação PRESERVANDO o conteúdo");
        opc = leitor.nextInt();
        return opc;
    }

    public static void tituloADPreservar() {
        System.out.println(" $$$$$$\\  $$$$$$$\\  $$$$$$$\\                                  ");
        System.out.println("$$  __$$\\ $$  __$$\\ $$  __$$\\                                 ");
        System.out.println("$$ /  $$ |$$ |  $$ |$$ |  $$ |       $$$$$$\\   $$$$$$\\   $$$$$$\\   $$$$$$$\\  $$$$$$\\   $$$$$$\\ $$\\    $$\\ $$$$$$\\   $$$$$$\\  ");
        System.out.println("$$$$$$$$ |$$ |  $$ |$$ |  $$ |      $$  __$$\\ $$  __$$\\ $$  __$$\\ $$  _____|$$  __$$\\ $$  __$$\\\\$$\\  $$  |\\____$$\\ $$  __$$\\ ");
        System.out.println("$$  __$$ |$$ |  $$ |$$ |  $$ |      $$ /  $$ |$$ |  \\__|$$$$$$$$ |\\$$$$$$\\  $$$$$$$$ |$$ |  \\__|\\$$\\$$  / $$$$$$$ |$$ |  \\__|");
        System.out.println("$$ |  $$ |$$ |  $$ |$$ |  $$ |      $$ |  $$ |$$ |      $$   ____| \\____$$\\ $$   ____|$$ |       \\$$$  / $$  __$$ |$$ |      ");
        System.out.println("$$ |  $$ |$$$$$$$  |$$$$$$$  |      $$$$$$$  |$$ |      \\$$$$$$$\\ $$$$$$$  |\\$$$$$$$\\ $$ |        \\$  /  \\$$$$$$$ |$$ |      ");
        System.out.println("\\__|  \\__|\\_______/ \\_______/       $$  ____/ \\__|       \\_______|\\_______/  \\_______|\\__|         \\_/    \\_______|\\__|      ");
        System.out.println("                                    $$ |         ");
        System.out.println("                                    $$ |         ");
        System.out.println("                                    \\__|         ");
    }

    public static void tituloADNaoPreservar() {
        System.out.println(" $$$$$$\\  $$$$$$$\\  $$$$$$$\\  ");
        System.out.println("$$  __$$\\ $$  __$$\\ $$  __$$\\ ");
        System.out.println("$$ /  $$ |$$ |  $$ |$$ |  $$ |");
        System.out.println("$$$$$$$$ |$$ |  $$ |$$ |  $$ |");
        System.out.println("$$  __$$ |$$ |  $$ |$$ |  $$ |");
        System.out.println("$$ |  $$ |$$ |  $$ |$$ |  $$ |");
        System.out.println("$$ |  $$ |$$$$$$$  |$$$$$$$  |");
        System.out.println("\\__|  \\__|\\_______/ \\_______/ ");
    }

    public static void tituloMultPreservar() {
        System.out.println("$$\\      $$\\ $$\\   $$\\ $$\\    $$$$$$$$\\  ");
        System.out.println("$$$\\    $$$ |$$ |  $$ |$$ |   \\__$$  __| ");
        System.out.println("$$$$\\  $$$$ |$$ |  $$ |$$ |      $$ |          $$$$$$\\   $$$$$$\\   $$$$$$\\   $$$$$$$\\  $$$$$$\\   $$$$$$\\ $$\\    $$\\ $$$$$$\\   $$$$$$\\  ");
        System.out.println("$$\\$$\\$$ $$ |$$ |  $$ |$$ |      $$ |         $$  __$$\\ $$  __$$\\ $$  __$$\\ $$  _____|$$  __$$\\ $$  __$$\\\\$$\\  $$  |\\____$$\\ $$  __$$\\ ");
        System.out.println("$$ \\$$$  $$ |$$ |  $$ |$$ |      $$ |         $$ /  $$ |$$ |  \\__|$$$$$$$$ |\\$$$$$$\\  $$$$$$$$ |$$ |  \\__|\\$$\\$$  / $$$$$$$ |$$ |  \\__|");
        System.out.println("$$ |\\$  /$$ |$$ |  $$ |$$ |      $$ |         $$ |  $$ |$$ |      $$   ____| \\____$$\\ $$   ____|$$ |       \\$$$  / $$  __$$ |$$ |      ");
        System.out.println("$$ | \\_/ $$ |\\$$$$$$  |$$$$$$$$\\ $$ |         $$$$$$$  |$$ |      \\$$$$$$$\\ $$$$$$$  |\\$$$$$$$\\ $$ |        \\$  /  \\$$$$$$$ |$$ |      ");
        System.out.println("\\__|     \\__| \\______/ \\________|\\__|         $$  ____/ \\__|       \\_______|\\_______/  \\_______|\\__|         \\_/    \\_______|\\__|      ");
        System.out.println("                                              $$ |        ");
        System.out.println("                                              $$ |        ");
        System.out.println("                                              \\__|        ");
    }

    public static void tituloMultNaoPreservar() {
        System.out.println("$$\\      $$\\ $$\\   $$\\ $$\\    $$$$$$$$\\ ");
        System.out.println("$$$\\    $$$ |$$ |  $$ |$$ |   \\__$$  __|");
        System.out.println("$$$$\\  $$$$ |$$ |  $$ |$$ |      $$ |   ");
        System.out.println("$$\\$$\\$$ $$ |$$ |  $$ |$$ |      $$ |   ");
        System.out.println("$$ \\$$$  $$ |$$ |  $$ |$$ |      $$ |   ");
        System.out.println("$$ |\\$  /$$ |$$ |  $$ |$$ |      $$ |   ");
        System.out.println("$$ | \\_/ $$ |\\$$$$$$  |$$$$$$$$\\ $$ |   ");
        System.out.println("\\__|     \\__| \\______/ \\________|\\__|   ");
    }

    private static void continuar() {
        System.out.println("\nPressione QUALQUER tecla para continuar");
        try {
            System.in.read();
        } catch (Exception e) {
            System.out.println("Erro na leitura! " + e.getMessage());
        }
    }

    public static void main(String[] args){
        MaquinaNorma maquina = new MaquinaNorma();
        Numero a = new Numero(), b = new Numero(), c = new Numero(), numero, aux = new Numero();
        int opc;

        do{
            opc = menu();
            switch(opc){
                case 1:{
                    tituloADNaoPreservar();
                    System.out.println("Digite o A e o B: ");
                    a = maquina.ler();
                    b = maquina.ler();
                    numero = maquina.soma(a, b);
                    System.out.print("Resultado da Soma: ");
                    maquina.exibir(numero);
                    continuar();
                    break;
                }
                case 2:{
                    tituloADPreservar();
                    System.out.println("Digite o A e o B: ");
                    a = maquina.ler();
                    b = maquina.ler();
                    numero = maquina.somaPreserva(a, b, c);
                    System.out.print("Resultado da Soma: ");
                    maquina.exibir(numero);
                    System.out.print("Valor Preservado de B: ");
                    maquina.exibir(c);
                    continuar();
                    break;
                }
                case 3:{
                    tituloMultNaoPreservar();
                    System.out.println("Digite o A e o B: ");
                    a = maquina.ler();
                    b = maquina.ler();
                    numero = maquina.multiplica(a, b);
                    System.out.print("Resultado da Multiplicação: ");
                    maquina.exibir(numero);
                    continuar();
                    break;
                }
                case 4:{
                    tituloMultPreservar();
                    System.out.println("Digite o A e o B: ");
                    a = maquina.ler();
                    b = maquina.ler();
                    numero = maquina.multiplicaPreserva(a, b, c);
                    System.out.print("Resultado da Multiplicação: ");
                    maquina.exibir(numero);
                    System.out.print("Valor Preservado de B: ");
                    maquina.exibir(b);
                    continuar();
                    break;
                }
                default:
                    System.out.println("Opcão inválida!!");
            }
        }while(opc!=0);
    }
}
