package org.ejercicio.banco;

public class CuentaBancaria{
        long numero;
        Cliente titular;
        long saldo;
        CuentaBancaria (long num, Cliente ctl, long s){ //contructor 
            this.numero = num;
            this.titular = ctl;
            this.saldo = s;
        }
}
//clase, atributos, tenemos un objeto con un atributo, cuenta bancaria, constructor que recibe un cliente