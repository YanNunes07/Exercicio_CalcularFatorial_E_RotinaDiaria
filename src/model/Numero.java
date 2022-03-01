package model;

public class Numero {
    public int valor;

    public int calcularFatorial(){
        int cont = 1;
        int fatorial = 1;

        while (cont <= this.valor){
            fatorial = fatorial * cont;
            cont++;
        }
        return fatorial;
    }
}
