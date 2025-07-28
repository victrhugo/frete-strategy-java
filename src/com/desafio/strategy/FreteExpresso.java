package com.desafio.strategy;

public class FreteExpresso implements Frete {
    public double calcular(double pesoEmKg) {
        return pesoEmKg * 18;
    }
}
