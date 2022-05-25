package com.tutorial;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    database nasabah1 = new database("Muhammad Haris", 750000, 1171, 1414);
    database nasabah2 = new database("k Petim", 350000, 1172, 2020);
    database nasabah3 = new database("Azra Ulayya", 345000, 1173, 1212);
    database nasabah4 = new database("", 0, 0, 0);
    database nasabah5 = new database("", 0, 0, 0);
    
    Scanner input = new Scanner(System.in);
    Scanner pick = new Scanner(System.in);
    Scanner pilih = new Scanner(System.in);
    Calendar now = Calendar.getInstance();
    ArrayList history = new ArrayList();

    boolean passVerifikasi; String USER="",user="";
    int noHp,pulsa;
    int VA,Oid,tagihan,sall=0,Ipel=0;
    int kode,Invoice,pdam,Listrik,password;


    //daftar account
    System.out.print("Input Username ");
    USER = input.nextLine();
    System.out.print("Masukkan ID ");
    int ID = input.nextInt();
    System.out.print("masukkan Password ");
    int PASS = input.nextInt();
    
    nasabah4.setNama(USER);
    nasabah4.setID(ID);
    nasabah4.setPass(PASS);
    nasabah4.display();
        
    // Start
    for (int nilai=1;nilai <= 30; nilai++) {
        int pass=0,id=0; sall=0; user="";
        System.out.println("    "+now.get(Calendar.DATE)+"/"+now.get(Calendar.MONTH)+"/"+now.get(Calendar.YEAR));
        System.out.println("\n === UwU-PAY ===");
        System.out.print("Masukkan No ID :");
        id = pick.nextInt();
        if (id == nasabah1.ID) {
            pass = pass + nasabah1.password;
            sall = sall + nasabah1.saldo;
            user = user + nasabah1.nama;
        }
        else if(id== nasabah2.ID) {
            pass = pass + nasabah2.password;
            sall = sall + nasabah2.saldo;
            user = user + nasabah2.nama;
        }else if(id== nasabah3.ID) {
            pass = pass + nasabah3.password;
            sall = sall + nasabah3.saldo;
            user = user + nasabah3.nama;
        }else if(id== nasabah4.ID) {
            pass = pass + nasabah4.password;
            sall = sall + nasabah4.saldo;
            user = user + nasabah4.nama;
        }else if (id== nasabah5.ID) {
            pass = pass + nasabah5.password;
            sall = sall + nasabah5.saldo;
            user = user + nasabah5.nama;
        }else{}

        System.out.print("Masukkan Password :");
        password = input.nextInt();

        if (password==pass) {
            passVerifikasi =true;
        }else{
            passVerifikasi=false;}
        int loop=0;
        do {
                if (passVerifikasi==true) {
                    System.out.println("\n\nHallo "+user);
                    System.out.println("==== MENU UTAMA ====");
                    System.out.println("push(1) Payment");
                    System.out.println("push(2) TopUp");
                    System.out.println("push(3) Entertaintment");
                    System.out.println("push(4) Transportation");
                    System.out.println("push(5) Wanna Logout ?\n");
                    int push = input.nextInt();
                    if (push==5) {loop++;}
                    if (push==1) {
                        history.add("-PAYMENT-");
                        System.out.println("=PAYMENT=");
                        System.out.println("push(1) Pulsa ");
                        System.out.println("push(2) Internet");
                        System.out.println("push(3) E-Commerce");
                        System.out.println("push(4) PDAM");
                        System.out.println("push(5) Listrik");
                        push = pilih.nextInt();
                        if(push==1){
                            history.add("pulsa");
                            System.out.print("\nNo Handphone :");
                            noHp = input.nextInt();
                            System.out.println("(1)- 10.000 ");
                            System.out.println("(2)- 20.000 ");
                            System.out.println("(3)- 50.000 ");
                            pulsa = input.nextInt();
                            if (pulsa==1) {
                                pulsa=10000;
                                sall -= pulsa;
                            }else if(pulsa==2){
                                pulsa=20000;
                                sall -= pulsa;
                            }else if(pulsa==3){
                                pulsa=50000;
                                sall=sall-pulsa;
                            }
                        }
                        else if(push==2){
                            history.add("Internet");
                            System.out.print("\nID Pelanggan : ");
                            Ipel = input.nextInt();
                            System.out.print("jumlah Tagihan : ");
                            tagihan = input.nextInt();
                            sall=sall-tagihan;
                        }
                        else if(push==3){
                            history.add("E-Commerce");
                            System.out.print("\nVirtual Account Number : ");
                            VA = input.nextInt();
                            System.out.print("\nJumlah tagihan : ");
                            tagihan = input.nextInt();
                            sall=sall-tagihan;
                        }else if(push==4){
                            history.add("PDAM");
                            System.out.print("\nNo Pembayaran : ");
                            pdam = input.nextInt();
                            System.out.print("Jumlah tagihan : ");
                            tagihan = input.nextInt();
                            sall=sall-tagihan;
                        }else if(push==5){
                            history.add("Listrik");
                            System.out.print("\nNo Pelanggan : ");
                            Listrik = input.nextInt();
                            System.out.println("Jumlah Tagihan : ");
                            tagihan = input.nextInt();
                            sall=sall-tagihan;
                        }
                        else{System.out.println("maaf ada kesalahan ! ");}
                    }
                    else if(push==2){
                        System.out.println("=TOPUP=");
                        System.out.println("push(1) to Other Account");
                        push = pilih.nextInt();
                        if (push==1) {
                            history.add("TopUp");
                            System.out.print("\nNo ID : ");
                            Oid = input.nextInt();
                            System.out.print("Jumlah = ");
                            tagihan = input.nextInt();
                            if (Oid == nasabah1.ID) {nasabah1.setSaldo(tagihan);}
                            else if (Oid == nasabah2.ID) {nasabah2.setSaldo(tagihan);}
                            else if (Oid == nasabah3.ID) {nasabah3.setSaldo(tagihan);}
                            else if (Oid == nasabah4.ID) {nasabah4.setSaldo(tagihan);}
                            else{}
                        }else{System.out.println("maaf ada kesalahan ! ");}
                    }
                    else if(push==3){
                        System.out.println("=ENTERTAINTMENT=");
                        System.out.println("push(1) SPP Sekolah ");
                        System.out.println("push(2) SPP Perkuliahan");
                        System.out.println("push(3) Game");
                        push = pilih.nextInt();
                        if (push==1) {
                            history.add("SPP Sekolah");
                            System.out.print("\nMasukkan kode Institusi : ");
                            kode = pilih.nextInt();
                            System.out.print("Jumlah Tagihan : ");
                            tagihan = input.nextInt();
                            sall=sall-tagihan;
                        }else if(push==2){
                            history.add("SPP Kampus");
                            System.out.print("No Invoice : ");
                            Invoice = pilih.nextInt();
                            System.out.print("Jumlah Tagihan : ");
                            tagihan = input.nextInt();
                            sall=sall-tagihan;
                        }else if(push==3){
                            history.add("TopUp Games");
                            System.out.print("Masukkan ID Game : ");
                            Invoice = input.nextInt();
                            System.out.print("Jumlah Tagihan : ");
                            tagihan = pilih.nextInt();
                            sall=sall-tagihan;
                        }
                    }
                    else if(push==4){
                        System.out.println("=TRANSPORTATION=");
                        System.out.println("push(1) Train ");
                        System.out.println("push(2) Bus Card");
                        System.out.println("push(3) Go-Blok");
                        push = pilih.nextInt();
                        if (push==1) {
                            history.add("Train pay");
                            System.out.print("\nJumlah Tagihan : ");
                            tagihan = input.nextInt();
                            sall=sall-tagihan;
                        }else if(push==2){
                            history.add("Bus pay");
                            System.out.print("\nJumlah Tagihan : ");
                            tagihan = input.nextInt();
                            sall=sall-tagihan;
                        }else if(push==3){
                            history.add("Go-Blok");
                            System.out.print("\nJumlah Tagihan : ");
                            tagihan = input.nextInt();
                            sall=sall-tagihan;
                        }
                    }else{}
                }else{
                    System.out.println("\nID ANDA TIDAK TERDAFTAR ! ");
                    return;}
                    System.out.println("\nsisa saldo = "+sall);
                    System.out.print("\nRecent : "+history);
            }while(loop<1);
        }
    }
}
