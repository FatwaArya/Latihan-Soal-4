package com.company;

public class Main {

    public static void main(String[] args) {
        int nilaiAwal = 5;
        int beda = 5;
        int hasil;

        for (int i=0; i<=4; i++){
            for (int j=0; j<i; j++){
                hasil=nilaiAwal;
                nilaiAwal+=beda;

                System.out.print(" "+hasil);
            }
            System.out.println(" ");
        }
    }
}
