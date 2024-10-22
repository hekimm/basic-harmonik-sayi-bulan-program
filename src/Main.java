/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hekimcanaktas
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       
        double harmonikToplam=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("n sayisini giriniz:");
        int n = scanner.nextInt();
         for(int i=1;i<=n;i++){
             harmonikToplam +=(1.0/i);
         }
         
         System.out.println("Harmonik toplam" + harmonikToplam);
        
        
 
    }
}
