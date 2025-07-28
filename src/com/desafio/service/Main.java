package com.desafio;

import com.desafio.strategy.FretePadrao;
import com.desafio.strategy.FreteExpresso;
import com.desafio.strategy.FreteSedex;
import com.desafio.service.CalculadoraFrete;

public class Main {
    public static void main(String[] args) {
        double peso = 3.0; // 3 kg

        CalculadoraFrete padrao = new CalculadoraFrete(new FretePadrao());
        CalculadoraFrete expresso = new CalculadoraFrete(new FreteExpresso());
        CalculadoraFrete sedex = new CalculadoraFrete(new FreteSedex());

        System.out.println("Frete Padrão: R$ " + padrao.calcularFrete(peso));
        System.out.println("Frete Expresso: R$ " + expresso.calcularFrete(peso));
        System.out.println("Frete Sedex: R$ " + sedex.calcularFrete(peso));
    }
}
