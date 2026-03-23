public class PilhaDinamica {

    private class No {
        int valor;
        No proximo;
    }

    private No topo;

    public PilhaDinamica() {
        topo = null;
    }

    public boolean vazia() {
        return topo == null;
    }

    public void empilhar(int x) {

        No novo = new No();
        novo.valor = x;

        novo.proximo = topo;
        topo = novo;
    }

    public void desempilhar() {

        if (vazia()) {
            System.out.println("Erro: Pilha vazia");
            return;
        }

        int valor = topo.valor;
        topo = topo.proximo;
        System.out.println("Valor desempilhado: "+ valor);
    }

    public void imprimir() {

        if (vazia()) {
            System.out.println("Pilha vazia");
            return;
        }

        No atual = topo;

        System.out.println("Topo: ");

        while (atual != null) {
            System.out.println(atual.valor);
            atual = atual.proximo;
        }
    }
}
