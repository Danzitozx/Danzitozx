/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.package1.codigoaula;

/**
 *
 * @author okmen
 */
public class No {
    String valor;
    No anterior;
    No proximo;

    public No(String valor) {
        this.valor = valor;
        this.anterior = null;
        this.proximo = null;
    }
}

class ListaDuplamenteEncadeada {
    No inicio;
    No fim;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    public void inserir(String valor) {
        No novoNo = new No(valor);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
    }

    public void exibir() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void remover(String valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.valor.equals(valor)) {
                if (atual.anterior != null) {
                    atual.anterior.proximo = atual.proximo;
                } else {
                    inicio = atual.proximo;
                }

                if (atual.proximo != null) {
                    atual.proximo.anterior = atual.anterior;
                } else {
                    fim = atual.anterior;
                }
                return;
            }
            atual = atual.proximo;
        }
    }

    public boolean contem(String valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.valor.equals(valor)) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    public void esvaziar() {
        inicio = null;
        fim = null;
    }

    public int tamanho() {
        int count = 0;
        No atual = inicio;
        while (atual != null) {
            count++;
            atual = atual.proximo;
        }
        return count;
    }
}
