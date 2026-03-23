public class Main {

    public static void main(String[] args) {

        PilhaEstatica p1 = new PilhaEstatica();
        System.out.println("Pilha estática");
        p1.inicializa(5);

        p1.empilhar(10);
        p1.empilhar(20);
        p1.empilhar(30);
        p1.empilhar(40);
        p1.desempilhar();
        p1.imprimir();

        PilhaDinamica p2 = new PilhaDinamica();
        System.out.println("Pilha dinâmica");

        p2.empilhar(10);
        p2.empilhar(20);
        p2.empilhar(30);
        p2.empilhar(40);
        p2.desempilhar();
        p2.imprimir();

    }
}
