package com.example;

public class Main {
    public static void main(String[] args) {
        CuentaAhorros cuentaAhorros = new CuentaAhorros(15000, 5);
        cuentaAhorros.consignar(5000);
        cuentaAhorros.retirar(2000);
        cuentaAhorros.extractomensual();

       
    }
}