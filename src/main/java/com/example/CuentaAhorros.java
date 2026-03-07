package com.example;

public class CuentaAhorros extends Cuenta {
    private boolean activa;

    public CuentaAhorros(float saldo, float tasaanual) {
        super(saldo, tasaanual);
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
    
}
