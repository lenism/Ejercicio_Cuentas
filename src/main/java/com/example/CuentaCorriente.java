package com.example;
public class CuentaCorriente extends Cuenta {
    private float sobregiro;

    public CuentaCorriente(float saldo, float tasaanual, float sobregiro) {
        super(saldo, tasaanual);
        this.sobregiro = sobregiro;
    }

    @Override
    public void retirar(float valor) {
        if (saldo + sobregiro >= valor) {
            super.retirar(valor);
        } else {
            System.out.println("No se puede realizar el retiro. Sobregiro excedido.");
        }
    }
}