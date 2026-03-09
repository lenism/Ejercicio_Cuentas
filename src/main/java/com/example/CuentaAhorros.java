package com.example;

public class CuentaAhorros extends Cuenta {
    private boolean activa;

    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        if (saldo < 10000) {
            activa = false;
        } else {
            activa = true;
        }
    }

    @Override
    public void consignar(float valor) {
        if (activa) {
            super.consignar(valor);
            if (saldo < 10000) {
                activa = false;
            }
        } else {
            System.out.println("La cuenta no está activa. No se pueden realizar consignaciones.");
        }
    }

    @Override
    public void retirar(float valor) {
        if (activa) {
            super.retirar(valor);
            if (saldo < 10000) {
                activa = false;
            }
        } else {
            System.out.println("La cuenta no está activa. No se pueden realizar retiros.");
        }
    }

    @Override
    public void extractomensual() {
        if (activa) {
            super.extractomensual();
        } else {
            System.out.println("La cuenta no está activa. No se puede generar el extracto mensual.");
        }
    }

     public void imprimir(){
        System.out.println("Saldo: " + saldo);
        System.out.println("Numero de consignaciones: " + numeroConsignaciones);
        System.out.println("Numero de retiros: " + retiros);
        System.out.println("Cuenta activa: " + activa);
     }
    
}
