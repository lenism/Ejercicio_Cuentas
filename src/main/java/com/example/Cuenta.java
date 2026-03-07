package com.example;

public class Cuenta {
    protected float saldo;
    protected int numeroconsignaciones=0;
    protected int retiros=0;
    protected float tasaanual;
    protected float comisionmensual;

    Cuenta (float saldo,  float tasaanual ){
        this.saldo = saldo;
        this.tasaanual = tasaanual;
       
    }

     public void consignar(float valor){
        saldo = saldo + valor;
        numeroconsignaciones = numeroconsignaciones + 1;
     }

     public void retirar(float valor){
        saldo = saldo - valor;
        retiros = retiros + 1;
     }  

     public void calcularinteres(){
        float interesmensual = saldo * (tasaanual/100)/12;
        saldo = saldo + interesmensual;
     }  

     public void extractomensual(){
        calcularinteres();
        saldo = saldo - comisionmensual;
        System.out.println("Saldo: " + saldo);
        System.out.println("Numero de consignaciones: " + numeroconsignaciones);
        System.out.println("Numero de retiros: " + retiros);
     }  






}
