package com.example;

public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones=0;
    protected int retiros=0;
    protected float tasaAnual;
    protected float comisionMensual=0;

    Cuenta (float saldo,  float tasaaAnual  ){
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
      
    }

     public void consignar(float valor){
        saldo = saldo + valor;
        numeroConsignaciones = numeroConsignaciones + 1;
     }

     public void retirar(float valor){
      if (valor <= saldo){
        saldo = saldo - valor;
        retiros = retiros + 1;
        
      }
      else {
        System.out.println("No se puede retirar, saldo insuficiente");
      }
     }

     public void calcularinteres(){
        float interesmensual = saldo * (tasaAnual/100)/12;
        saldo = saldo + interesmensual;
     }  

     public void extractomensual(){
        calcularinteres();
        saldo = saldo - comisionMensual;
        System.out.println("Saldo: " + saldo);
        System.out.println("Numero de consignaciones: " + numeroConsignaciones);
        System.out.println("Numero de retiros: " + retiros);
     }  

     public void imprimir(){
        System.out.println("Saldo: " + saldo);
        System.out.println("Numero de consignaciones: " + numeroConsignaciones);
        System.out.println("Numero de retiros: " + retiros);
     }






}
