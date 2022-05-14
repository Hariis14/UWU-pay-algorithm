package com.tutorial;

import java.util.Scanner;

public class database {

    String nama;
    int saldo;
    int pin;
    int ID;
    int password;

    database(String nama, int saldo,int ID,int password){
        this.nama = nama;
        this.saldo = saldo;
        this.ID = ID;
        this.password = password;
    }
    void display(){
        System.out.println("user : "+this.nama);
        System.out.println("saldo : "+this.saldo);
        System.out.println("ID : "+this.ID);
        System.out.println("Pass : "+this.password);
    }
    void setNama(String nama){this.nama=nama;}
    String getNama(){return this.nama;}
    void setID(int ID){this.ID=ID;}
    int getID(){return this.ID;}
    void setPass(int password){this.password=password;}
    int getPass(){return this.password;}
    void setSaldo(int saldo){this.saldo=saldo;}
    int getSaldo(){return this.saldo;}
}
