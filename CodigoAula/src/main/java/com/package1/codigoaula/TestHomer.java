/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.package1.codigoaula;

/**
 *
 * @author okmen
 */
public class TestHomer {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        
        
        lista.inserir("Homer");
        lista.inserir("Marge");
        lista.exibir();

        lista.esvaziar();
        lista.exibir();

        lista.inserir("Homer");
        lista.inserir("Bart[0]");
        lista.inserir("Moll[1]");
        lista.exibir();

        lista.esvaziar();

        lista.inserir("Homer");
        lista.inserir("Bart");
        lista.inserir("Lisa");
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        lista.esvaziar();
        lista.exibir();

        lista.inserir("Homer");
        lista.inserir("Maggie");
        lista.inserir("Bart[0]");
        lista.inserir("Marge[1]");
        lista.exibir();
        System.out.println(lista.contem("Lisa"));

        lista.esvaziar();

        lista.inserir("Homer");
        lista.inserir("Bart");
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println(lista.contem("Marge"));
        System.out.println(lista.contem("Homer"));
        System.out.println(lista.contem("Bart"));
        System.out.println(lista.contem("Maggie"));
        System.out.println("Tamanho: " + lista.tamanho());

        lista.esvaziar();

        lista.inserir("Homer");
        lista.inserir("Bart");
        lista.inserir("Marge");
        lista.inserir("Maggie[1]");
        lista.inserir("Ned Flanders");
        lista.inserir("Sr. Burns");
        lista.exibir();

        lista.remover("Sr. Burns");
        lista.exibir();

        lista.remover("Maggie[1]");
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println(lista.contem("Marge"));
        System.out.println(lista.contem("Homer"));
        System.out.println(lista.contem("Bart"));
        System.out.println(lista.contem("Maggie"));
        System.out.println("Tamanho: " + lista.tamanho());

        lista.remover("Ned Flanders");
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println(lista.contem("Marge"));
        System.out.println(lista.contem("Homer"));
        System.out.println(lista.contem("Bart"));
        System.out.println(lista.contem("Maggie"));
        System.out.println("Tamanho: " + lista.tamanho());

        lista.esvaziar();
        lista.exibir();
    }
}

