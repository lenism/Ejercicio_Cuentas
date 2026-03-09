package com.example;
public class CuentaCorriente extends Cuenta {
    private float sobregiro;

    public CuentaCorriente(float saldo, float tasaAnual, float sobregiro) {
        super(saldo, tasaAnual);
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

    @Override
    public void extractomensual() {
        super.extractomensual();
        if (saldo < 0) {
            System.out.println("La cuenta está en sobregiro. Sobregiro actual: " + (-saldo));
        }
    }

     public void imprimir(){
        System.out.println("Saldo: " + saldo);
        System.out.println("Numero de consignaciones: " + numeroConsignaciones);
        System.out.println("Numero de retiros: " + retiros);
        System.out.println("Sobregiro disponible: " + sobregiro);
     }
}