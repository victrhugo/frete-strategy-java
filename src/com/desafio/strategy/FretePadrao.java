package com.desafio.strategy;

public class FretePadrao implements Frete {
    public double calcular(double pesoEmKg) {
        return pesoEmKg * 10;
    }
}
