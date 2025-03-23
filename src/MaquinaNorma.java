import java.util.Scanner;

public class MaquinaNorma {
    // Construtores
    public MaquinaNorma() {}

    public void atribuicao(Numero x, Numero y) {
        // colocar o valor zero no numero x
        this.zerar(x);

        if (!this.isNegativo(y)){
            // positivo ou zero
            while(!this.isZero(y)){
                x.setMagnitude(x.getMagnitude()+1);
                y.setMagnitude(y.getMagnitude()-1);
                System.out.println("X="+x.getMagnitude() + " Y="+y.getMagnitude());
            }
        }
        else{
            //negativo
            while(!this.isZero(y)){
                x.setMagnitude(x.getMagnitude()+1);
                y.setMagnitude(y.getMagnitude()-1);
                System.out.println("X="+x.getMagnitude() + " Y="+y.getMagnitude());
            }
            x.setSinal(1); // meu x vai ser zero
            y.setSinal(0);
        }
    }

    // Métodos
    public Numero soma(Numero x, Numero y) {
        // ira somar dois numeros e retornar

        if(!this.isNegativo(x) && !this.isNegativo(y)){
            // os dois são positivos
            while(!this.isZero(y)){
                x.setMagnitude(x.getMagnitude()+1);
                y.setMagnitude(y.getMagnitude()-1);
                System.out.println("X="+x.getMagnitude() + " Y="+y.getMagnitude());
            }
        }
        else{
            if(this.isNegativo(x) && this.isNegativo(y)){
                // o dois são negativos
                while(!this.isZero(y)){
                    x.setMagnitude(x.getMagnitude()+1);
                    y.setMagnitude(y.getMagnitude()-1);
                    System.out.println("X="+x.getMagnitude() + " Y="+y.getMagnitude());
                }
                y.setSinal(0);
            }
            else{
                if(this.isNegativo(x)){
                    // só o x é negativo
                    while(!this.isZero(x) && !this.isZero(y)){
                        x.setMagnitude(x.getMagnitude()-1);
                        y.setMagnitude(y.getMagnitude()-1);
                        System.out.println("X="+x.getMagnitude() + " Y="+y.getMagnitude());
                    }
                    if(this.isZero(x)){
                        x.setSinal(0); // deixando para positivo
                        if(!this.isZero(y)) {
                            while (!this.isZero(y)) {
                                x.setMagnitude(x.getMagnitude() + 1);
                                y.setMagnitude(y.getMagnitude() - 1);
                                System.out.println("X=" + x.getMagnitude() + " Y=" + y.getMagnitude());
                            }
                        }
                    }
                }
                else{
                    // só o y é negativo
                    while(!this.isZero(x) && !this.isZero(y)){
                        x.setMagnitude(x.getMagnitude()-1);
                        y.setMagnitude(y.getMagnitude()-1);
                        System.out.println("X="+x.getMagnitude() + " Y="+y.getMagnitude());
                    }
                    if(this.isZero(x) && !this.isZero(y)){
                        x.setSinal(1); //deixando para negativo
                        while(!this.isZero(y)){
                            x.setMagnitude(x.getMagnitude()+1);
                            y.setMagnitude(y.getMagnitude()-1);
                            System.out.println("X="+x.getMagnitude() + " Y="+y.getMagnitude());
                        }
                        y.setSinal(0); // deixando o y como não negativo
                    }
                }
            }
        }
        return x;
    }

    public Numero somaPreserva(Numero a, Numero b, Numero c) {
        // ira somar dois numeros e retornar
        this.zerar(c);
        if(this.isNegativo(b)){
            c.setSinal(1);
        }
        else{
            c.setSinal(0);
        }

        if(!this.isNegativo(a) && !this.isNegativo(a)){
            // os dois são positivos
            while(!this.isZero(b)){
                a.setMagnitude(a.getMagnitude()+1);
                b.setMagnitude(b.getMagnitude()-1);
                c.setMagnitude(c.getMagnitude()+1); //somar o c para preservar o valor de b
                System.out.println("X="+a.getMagnitude() + " Y="+b.getMagnitude());
            }
        }
        else{
            if(this.isNegativo(a) && this.isNegativo(b)){
                // o dois são negativos
                while(!this.isZero(b)){
                    a.setMagnitude(a.getMagnitude()+1);
                    b.setMagnitude(b.getMagnitude()-1);
                    c.setMagnitude(c.getMagnitude()+1); //somar o c para preservar o valor de b
                    System.out.println("X="+a.getMagnitude() + " Y="+b.getMagnitude());
                }
                b.setSinal(0);
            }
            else{
                if(this.isNegativo(a)){
                    // só o x é negativo
                    while(!this.isZero(a) && !this.isZero(b)){
                        a.setMagnitude(a.getMagnitude()-1);
                        b.setMagnitude(b.getMagnitude()-1);
                        c.setMagnitude(c.getMagnitude()+1); //somar o c para preservar o valor de b
                        System.out.println("X="+a.getMagnitude() + " Y="+b.getMagnitude());
                    }
                    if(this.isZero(a)){
                        a.setSinal(0); // deixando para positivo
                        if(!this.isZero(b)) {
                            while (!this.isZero(b)) {
                                a.setMagnitude(a.getMagnitude() + 1);
                                b.setMagnitude(b.getMagnitude() - 1);
                                c.setMagnitude(c.getMagnitude()+1); //somar o c para preservar o valor de b
                                System.out.println("X=" + a.getMagnitude() + " Y=" + b.getMagnitude());
                            }
                        }
                    }
                }
                else{
                    // só o y é negativo
                    while(!this.isZero(a) && !this.isZero(b)){
                        a.setMagnitude(a.getMagnitude()-1);
                        b.setMagnitude(b.getMagnitude()-1);
                        c.setMagnitude(c.getMagnitude()+1); //somar o c para preservar o valor de b
                        System.out.println("X="+a.getMagnitude() + " Y="+b.getMagnitude());
                    }
                    if(this.isZero(a) && !this.isZero(b)){
                        a.setSinal(1); //deixando para negativo
                        while(!this.isZero(b)){
                            a.setMagnitude(a.getMagnitude()+1);
                            b.setMagnitude(b.getMagnitude()-1);
                            c.setMagnitude(c.getMagnitude()+1); //somar o c para preservar o valor de b
                            System.out.println("X="+a.getMagnitude() + " Y="+b.getMagnitude());
                        }
                        b.setSinal(0); // deixando o y como não negativo
                    }
                }
            }
        }
        return a;
    }

    public boolean isNegativo(Numero x) {
        // retorna se o numero é negatvo
        return x.getSinal() == 1;
    }

    public boolean isZero(Numero x) {
        return x.getMagnitude() == 0;
    }

    public void zerar(Numero x) {
        // zerar o numero
        // não importa oq esteja no 'sinal' pois a magnitude tem que chegar a zero
        while (!this.isZero(x)) {
            x.setMagnitude(x.getMagnitude() - 1);
        }
        x.setSinal(0);
    }

    public Numero multiplica(Numero x, Numero y) {
        // realiza a multiplicação e retorna um numero inteiro
        Numero soma = new Numero(), aux = new Numero();

        this.zerar(aux);
        while(!this.isZero(y)){
            y.setMagnitude(y.getMagnitude()-1);
            aux.setMagnitude(aux.getMagnitude()+1);
        }

        while(!this.isZero(x)){
            while (!this.isZero(y)) {
                y.setMagnitude(y.getMagnitude() - 1);
            }
            while(!this.isZero(aux)){
                aux.setMagnitude(aux.getMagnitude()-1);
                y.setMagnitude(y.getMagnitude()+1);
            }
            while(!this.isZero(y)){
                soma.setMagnitude(soma.getMagnitude()+1);
                y.setMagnitude(y.getMagnitude()-1);
                aux.setMagnitude(aux.getMagnitude()+1);
                System.out.println("X="+x.getMagnitude() + " Y="+y.getMagnitude());
            }
            x.setMagnitude(x.getMagnitude()-1);
        }

        //verifica o sinal
        if(!this.isNegativo(x) && !this.isNegativo(y)){
            // os dois são positivos
            soma.setSinal(0);
        }
        else{
            if(this.isNegativo(x) && this.isNegativo(y)){
                // os dois são negativos
                soma.setSinal(0);
            }
            else
                soma.setSinal(1);
        }

        return soma;
    }

    public Numero multiplicaPreserva(Numero x, Numero y, Numero z) {
        // realiza a multiplicação e retorna um numero inteiro
        Numero soma = new Numero();

        this.zerar(soma);

        //preservar o conteúdo de 'y'
        this.zerar(z);
        while(!this.isZero(y)){
            y.setMagnitude(y.getMagnitude()-1);
            z.setMagnitude(z.getMagnitude()+1);
        }
        if(this.isNegativo(y)){
            z.setSinal(1);
        }
        else{
            z.setSinal(0);
        }

        while(!this.isZero(x)){
            while (!this.isZero(y)) {
                y.setMagnitude(y.getMagnitude() - 1);
            }
            while(!this.isZero(z)){
                z.setMagnitude(z.getMagnitude()-1);
                y.setMagnitude(y.getMagnitude()+1);
            }
            while(!this.isZero(y)){
                soma.setMagnitude(soma.getMagnitude()+1);
                y.setMagnitude(y.getMagnitude()-1);
                z.setMagnitude(z.getMagnitude()+1);
                System.out.println("X="+x.getMagnitude() + " Y="+y.getMagnitude());
            }
            x.setMagnitude(x.getMagnitude()-1);
        }

        //verifica o sinal
        if(!this.isNegativo(x) && !this.isNegativo(y)){
            // os dois são positivos
            soma.setSinal(0);
        }
        else{
            if(this.isNegativo(x) && this.isNegativo(y)){
                // os dois são negativos
                soma.setSinal(0);
            }
            else
                soma.setSinal(1);
        }

        return soma;
    }

    public Numero ler(){
        Numero x = new Numero();
        Scanner leitor = new Scanner(System.in);
        x.setMagnitude(leitor.nextInt());
        if(x.getMagnitude()<0){
            x.setMagnitude(Math.abs(x.getMagnitude()));
            x.setSinal(1);
        }
        return x;
    }

    public void exibir(Numero x) {
        if(this.isNegativo(x)){
            System.out.println("-"+x.getMagnitude());
        }
        else{
            System.out.println(x.getMagnitude());
        }
    }
}
