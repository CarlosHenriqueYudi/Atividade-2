public class PilhaEstatica {

    private int topo;
    private int capacidade;
    private int[] dados;

    public void inicializa(int capacidade) {
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.topo = -1;
    }

    public boolean cheia() {
        return topo == capacidade - 1;
    }

    public boolean vazia() {
        return topo == -1;
    }

    public void empilhar(int x) {

        if (cheia()) {
            System.out.println("Erro: Pilha cheia");
            return;
        }
        topo++;
        dados[topo] = x;
    }

    public void desempilhar() {

        if (vazia()) {
            System.out.println("Erro: Pilha vazia");
            return;
        }

        int valor = dados[topo];
        topo--;
        System.out.println("Valor desempilhado: "+valor);
    }

    public void imprimir() {

        if (vazia()) {
            System.out.println("Pilha vazia");
            return;
        }

        System.out.println("Topo: ");
        for (int i = topo; i >= 0; i--) {
            System.out.println(dados[i]);
        }
    }
}
