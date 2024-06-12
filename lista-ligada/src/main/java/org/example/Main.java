package org.example;

public class Main {
    public static void main(String[] args) {
        Node retornado;
        ListaLigada lista = new ListaLigada();

        lista.insereNode(10);
        lista.insereNode(20);
        lista.insereNode(30);

        lista.exibe();
        System.out.println("Tamanho da lista: " + lista.getTamanho());

        lista.insereNode(40);
        lista.insereNode(50);

        lista.exibe();
        System.out.println("Tamanho da lista: " + lista.getTamanho());

        retornado = lista.buscaNode(40);
        if (retornado == null) {
            System.out.println("Valor 40 não foi encontrado");
        }
        else {
            System.out.println("Encontrado node com valor " + retornado.getInfo());
        }

        retornado = lista.buscaNode(77);
        if (retornado == null) {
            System.out.println("Valor 77 não foi encontrado");
        }
        else {
            System.out.println("Encontrado node com valor " + retornado.getInfo());
        }

        if (lista.removeNode(20)) {
            System.out.println("Valor 20 removido com sucesso");
        }
        else {
            System.out.println("Valor 20 não foi encontrado para remoção");
        }

        lista.exibe();
        System.out.println("Tamanho da lista: " + lista.getTamanho());

        if (lista.removeNode(100)) {
            System.out.println("Valor 100 removido com sucesso");
        }
        else {
            System.out.println("Valor 100 não foi encontrado para remoção");
        }

        PilhaLigada pilha = new PilhaLigada();
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        pilha.exibe();
        System.out.println("Topo da pilha: " + pilha.peek());

        System.out.println("Removido da pilha: " + pilha.pop());
        pilha.exibe();
        System.out.println("Topo da pilha: " + pilha.peek());

        FilaLigada fila = new FilaLigada();
        fila.insert(10);
        fila.insert(20);
        fila.insert(30);

        fila.exibe();
        System.out.println("Primeiro da fila: " + fila.peek());

        System.out.println("Removido da fila: " + fila.poll());
        fila.exibe();
        System.out.println("Primeiro da fila: " + fila.peek());
    }
}