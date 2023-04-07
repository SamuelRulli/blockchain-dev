package com.cygnus;

public class Main {
    public static void main(String[] args) {
        System.out.println("POC Blockchain!");

        Blockchain blockchain = new Blockchain();

        blockchain.addBlock("Transaction 1");
        blockchain.addBlock("Transaction 2");
        blockchain.addBlock("Transaction 3");

        boolean isValid = blockchain.isChainValid();

        System.out.println("Is chain valid? " + isValid);
    }
}