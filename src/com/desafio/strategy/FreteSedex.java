package com.desafio.strategy;

public class FreteSedex implements Frete {
    public double calcular(double pesoEmKg) {
        return pesoEmKg * 25;
    }
}
