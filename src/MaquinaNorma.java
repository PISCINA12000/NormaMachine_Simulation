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
    public Numero soma(Numero x, Numero y)  {
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
        // retorna se o numero é negativo
        return !(x.getSinal() == 0);
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

    public Numero multiplica(Numero a, Numero b) {
        // realiza a multiplicação e retorna um numero inteiro
        Numero c = new Numero(), d = new Numero();

        zerar(d);
        //c pega o valor de a
        zerar(c);
        System.out.println("A1 "+"A2  "+"B1 "+"B2  "+"C1 "+"C2  "+"D1 "+"D2 ");
        while(!isZero(a)){
            c.setMagnitude(c.getMagnitude()+1);
            a.setMagnitude(a.getMagnitude()-1);
            System.out.println(a.getSinal()+" "+a.getMagnitude()+"    "+b.getSinal()+"  "+b.getMagnitude()+"    "+c.getSinal()+"  "+c.getMagnitude()+"   "+d.getSinal()+"  "+d.getMagnitude());
        }

        //multiplicacao
        while(!isZero(c)){
            //d pegar o valor de b
            while(!isZero(b)){
                d.setMagnitude(d.getMagnitude()+1);
                b.setMagnitude(b.getMagnitude()-1);
                System.out.println(a.getSinal()+" "+a.getMagnitude()+"    "+b.getSinal()+"  "+b.getMagnitude()+"    "+c.getSinal()+"  "+c.getMagnitude()+"   "+d.getSinal()+"  "+d.getMagnitude());;
            }
            while(!isZero(d)){
                a.setMagnitude(a.getMagnitude()+1);
                d.setMagnitude(d.getMagnitude()-1);
                b.setMagnitude(b.getMagnitude()+1);
                System.out.println(a.getSinal()+" "+a.getMagnitude()+"    "+b.getSinal()+"  "+b.getMagnitude()+"    "+c.getSinal()+"  "+c.getMagnitude()+"   "+d.getSinal()+"  "+d.getMagnitude());
            }
            c.setMagnitude(c.getMagnitude()-1);
            System.out.println(a.getSinal()+" "+a.getMagnitude()+"    "+b.getSinal()+"  "+b.getMagnitude()+"    "+c.getSinal()+"  "+c.getMagnitude()+"   "+d.getSinal()+"  "+d.getMagnitude());
        }

        //verifica o sinal
        if(!this.isNegativo(a) && !this.isNegativo(b)){
            // os dois são positivos
            a.setSinal(0);
        }
        else{
            if(this.isNegativo(a) && this.isNegativo(b)){
                // os dois são negativos
                a.setSinal(0);
            }
            else
                a.setSinal(1);
        }
        return a;
    }

    public Numero multiplicaPreserva(Numero a, Numero b, Numero c) {
        // realiza a multiplicação e retorna um numero inteiro
        Numero d = new Numero();

        zerar(d);
        //c pega o valor de a
        zerar(c);
        System.out.println("A1 "+"A2  "+"B1 "+"B2  "+"C1 "+"C2  "+"D1 "+"D2 ");
        while(!isZero(a)){
            c.setMagnitude(c.getMagnitude()+1);
            a.setMagnitude(a.getMagnitude()-1);
            System.out.println(a.getSinal()+" "+a.getMagnitude()+"    "+b.getSinal()+"  "+b.getMagnitude()+"    "+c.getSinal()+"  "+c.getMagnitude()+"   "+d.getSinal()+"  "+d.getMagnitude());
        }

        //multiplicacao
        while(!isZero(c)){
            //d pegar o valor de b
            while(!isZero(b)){
                d.setMagnitude(d.getMagnitude()+1);
                b.setMagnitude(b.getMagnitude()-1);
                System.out.println(a.getSinal()+" "+a.getMagnitude()+"    "+b.getSinal()+"  "+b.getMagnitude()+"    "+c.getSinal()+"  "+c.getMagnitude()+"   "+d.getSinal()+"  "+d.getMagnitude());;
            }
            while(!isZero(d)){
                a.setMagnitude(a.getMagnitude()+1);
                d.setMagnitude(d.getMagnitude()-1);
                b.setMagnitude(b.getMagnitude()+1);
                System.out.println(a.getSinal()+" "+a.getMagnitude()+"    "+b.getSinal()+"  "+b.getMagnitude()+"    "+c.getSinal()+"  "+c.getMagnitude()+"   "+d.getSinal()+"  "+d.getMagnitude());
            }
            c.setMagnitude(c.getMagnitude()-1);
            System.out.println(a.getSinal()+" "+a.getMagnitude()+"    "+b.getSinal()+"  "+b.getMagnitude()+"    "+c.getSinal()+"  "+c.getMagnitude()+"   "+d.getSinal()+"  "+d.getMagnitude());
        }


        //verifica o sinal
        if(!this.isNegativo(a) && !this.isNegativo(b)){
            // os dois são positivos
            a.setSinal(0);
        }
        else{
            if(this.isNegativo(a) && this.isNegativo(b)){
                // os dois são negativos
                a.setSinal(0);
            }
            else
                a.setSinal(1);
        }
        return a;
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
