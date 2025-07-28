package com.desafio.service;

import com.desafio.strategy.Frete;

public class CalculadoraFrete {
    private Frete estrategiaFrete;

    public CalculadoraFrete(Frete estrategiaFrete) {
        this.estrategiaFrete = estrategiaFrete;
    }

    public double calcularFrete(double pesoEmKg) {
        return estrategiaFrete.calcular(pesoEmKg);
    }
}
