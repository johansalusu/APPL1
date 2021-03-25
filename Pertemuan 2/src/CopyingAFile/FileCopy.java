/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CopyingAFile;

/**
 *
 * @author Johan Salusu
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileCopy
{
    public static void main(String[] args)
    {
        Scanner filename = new Scanner(System.in);
        Scanner input = null;
        boolean found = false;
        String pilihan = "Y";
        File file;
        
        Scanner scan = new Scanner(System.in);
        
        while(("y".equals(pilihan)) || ("Y".equals(pilihan)))
        {
            System.out.println("\nMasukkan alamat berkas! (Tuliskan juga ekstensi dari berkas tersebut, misalnya, 'D:\\nama_folder\\berkas.txt') ");
            try
            {
                file = new File(filename.nextLine());
                input = new Scanner(file);
                found = true;
                System.out.println("Membaca isi berkas.\n");
                while(input.hasNext())
                {
                    System.out.println(input.nextLine());
                }
            }
            catch(FileNotFoundException nf)
            {
                System.out.println("Berkas tidak ditemukan.");
            }
            
            System.out.print("\nApakan Anda mau membaca berkas lainnya? (Y/T)\n");
            pilihan = scan.next();
        }
        
        System.out.print("\nTerima kasih telah menggunakan program ini. Samapai jumpa pada lain kesempatan.\n");
    }
}