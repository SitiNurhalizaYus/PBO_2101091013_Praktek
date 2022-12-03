/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SITI021222;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author siti nurhaliza yus
 */
public class StudentRecord1 {
    public static void main(String[] args) {
        StudentRecord s = new StudentRecord();
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String [] name = new String[100];
        String [] address = new String[100];
        String [] telpn = new String[100];
        String [] email = new String[100];
        String pilihan="";
        String n="";
        String yes_no="";
        int no;
        int jumlah=0;
        
        do{
            System.out.println("|>>>>>>>>>[ MENU ]<<<<<<<<<<<|");
            System.out.println("| 1. Memasukan Data          |");
            System.out.println("| 2. Menghapus Data          |");
            System.out.println("| 3. Menampilkan Data        |");
            System.out.println("| 4. Update Data             |");
            System.out.println("| 5. Akhiri sesi             |");
            System.out.println("|----------------------------|");
            System.out.print("\nMasukan Pilihan (1-5): ");
                try{
                    pilihan = dataIn.readLine();
                }
                catch(IOException e){
                    System.out.println("Error!");
                }
            
            switch(Integer.parseInt(pilihan)){
                case 1 :
                    System.out.println("----------------");
                    System.out.println("~Memasukan Data~");
                    System.out.println("----------------");               
                    System.out.print("Masukan Jumlah Siswa : ");
                    try{
                        n = dataIn.readLine();                        
                    }catch(IOException e){
                        System.out.println("Error!");
                    }
                    jumlah = Integer.parseInt(n);
                    
                    for(int i=0; i<jumlah; i++){
                        System.out.println("#Data ke-"+(i+1));
                        System.out.print(" Masukan Nama : ");
                        try{
                            name[i]=dataIn.readLine();
                        }catch(IOException e){
                            System.out.println("Error!");
                        }
                        System.out.print(" Masukan Alamat : ");
                        try{
                            address[i]=dataIn.readLine();
                        }catch(IOException e){
                            System.out.println("Error!");
                        }
                        System.out.print(" Masukan Telepon : ");
                        try{
                            telpn[i]=dataIn.readLine();
                        }catch(IOException e){
                            System.out.println("Error!");
                        }
                        System.out.print(" Masukan Email : ");
                        try{
                            email[i]=dataIn.readLine();
                        }catch(IOException e){
                            System.out.println("Error!");
                        }                        
                    }
                    for(int i=0; i<jumlah; i++){
                        s.setNama(name[i],i,address[i],telpn[i],email[i]);
                        System.out.println(">>>>>>>>>>>>[ OUTPUT ]<<<<<<<<<<<<<");
                        System.out.println("Nama\t : "+s.getName(i));
                        System.out.println("Alamat\t : "+s.getAddress(i));
                        System.out.println("Telepon\t : "+s.getTelpn(i));
                        System.out.println("Email\t : "+s.getEmail(i));
                        System.out.println("------------------------------------\n");                        
                    }
                    System.out.println("'Data Berhasil dimasukan :)'\n");
                    break;
                case 2 :
                    System.out.println("----------------"); 
                    System.out.println("~Menghapus Data~");
                    System.out.println("----------------"); 
                    System.out.print("Masukan Nomor Urutan Data : Input(1-"+jumlah+") : ");
                    try{
                        n = dataIn.readLine();
                    }catch(IOException e){
                        System.out.println("Error!");
                    }
                    no = Integer.parseInt(n);
                    System.out.println("#Ditemukan Data ke-"+no);
                    no=no-1;
                    s.setNama(name[no],no,address[no],telpn[no],email[no]);
                    System.out.println(">>>>>>>>>>>>[ OUTPUT ]<<<<<<<<<<<<<");
                    System.out.println("Nama\t : "+s.getName(no));
                    System.out.println("Alamat\t : "+s.getAddress(no));
                    System.out.println("Telepon\t : "+s.getTelpn(no));
                    System.out.println("Email\t : "+s.getEmail(no)); 
                    System.out.println("------------------------------------");  
                    System.out.print("Yakin Ingin Menghapus Data?(y/n) : ");
                    try{
                        yes_no = dataIn.readLine();
                    }catch(IOException e){
                        System.out.println("Error!");
                    }
                    if (("no".equals(yes_no))||("n".equals(yes_no))||("N".equals(yes_no))){
                        System.out.println("\n'Data Tidak Dihapus'\n");
                    }else{
                        name[no]="";
                        address[no]="";
                        telpn[no]="";
                        email[no]="";
                        s.setNama(name[no],no,address[no],telpn[no],email[no]);
                        System.out.println("\n>>>>>>>>>>>>[ OUTPUT ]<<<<<<<<<<<<<");
                        System.out.println("Nama\t : "+s.getName(no));
                        System.out.println("Alamat\t : "+s.getAddress(no));
                        System.out.println("Telepon\t : "+s.getTelpn(no));
                        System.out.println("Email\t : "+s.getEmail(no));
                        System.out.println("------------------------------------\n");  
                        System.out.println("'Data Berhasil Dihapus'\n"); 
                    }
                    break;
                case 3:
                    System.out.println("-------------------------");
                    System.out.println("~Daftar Semua Data Siswa~");
                    System.out.println("-------------------------"); 
                    System.out.println(">>>>>>>>>>>>[ OUTPUT ]<<<<<<<<<<<<<");
                    for(int i=0; i<jumlah; i++){
                        s.setNama(name[i],i,address[i],telpn[i],email[i]);                       
                        System.out.println("Nama\t : "+s.getName(i));
                        System.out.println("Alamat\t : "+s.getAddress(i));
                        System.out.println("Telepon\t : "+s.getTelpn(i));
                        System.out.println("Email\t : "+s.getEmail(i));
                        System.out.println("------------------------------------\n");                          
                    }
                    break;
                case 4:
                    System.out.println("---------------"); 
                    System.out.println("~Mengubah Data~");
                    System.out.println("---------------"); 
                    System.out.print("Masukan Nomor Urutan Data : Input(1-"+jumlah+") : ");
                    try{
                        n = dataIn.readLine();
                    }catch(IOException e){
                        System.out.println("Error!");
                    }
                    no = Integer.parseInt(n);
                    System.out.println("#Ditemukan Data ke-"+no);
                    no=no-1;
                    s.setNama(name[no],no,address[no],telpn[no],email[no]);
                    System.out.println(">>>>>>>>>>>>[ OUTPUT ]<<<<<<<<<<<<<");
                    System.out.println("Nama\t : "+s.getName(no));
                    System.out.println("Alamat\t : "+s.getAddress(no));
                    System.out.println("Telepon\t : "+s.getTelpn(no));
                    System.out.println("Email\t : "+s.getEmail(no)); 
                    System.out.println("------------------------------------\n");  
                    System.out.print("Yakin Ingin Mengubah Data?(y/n) : ");
                    try{
                        yes_no = dataIn.readLine();
                    }catch(IOException e){
                        System.out.println("Error!");
                    }
                    if (("no".equals(yes_no))||("n".equals(yes_no))||("N".equals(yes_no))){
                        System.out.println("\n'Data Tidak Dihapus'\n");
                    }else{
                        System.out.println("Proses Ubah Data ke-"+(no+1));
                        System.out.print(" Masukan Nama : ");
                        try{
                            name[no] = dataIn.readLine();                            
                        }catch(IOException e){
                            System.out.println("Error!");                            
                        }
                        System.out.print(" Masukan Alamat : ");
                        try{
                            address[no] = dataIn.readLine();                            
                        }catch(IOException e){
                            System.out.println("Error!");                            
                        }
                        System.out.print(" Masukan Telepon : ");
                        try{
                            telpn[no] = dataIn.readLine();                            
                        }catch(IOException e){
                            System.out.println("Error!");                            
                        }
                        System.out.print(" Masukan Email : ");
                        try{
                            email[no] = dataIn.readLine();                            
                        }catch(IOException e){
                            System.out.println("Error!");                            
                        }
                        s.setNama(name[no],no,address[no],telpn[no],email[no]);
                        System.out.println(">>>>>>>>>>>>[ OUTPUT ]<<<<<<<<<<<<<");
                        System.out.println("Nama\t : "+s.getName(no));
                        System.out.println("Alamat\t : "+s.getAddress(no));
                        System.out.println("Telepon\t : "+s.getTelpn(no));
                        System.out.println("Email\t : "+s.getEmail(no)); 
                        System.out.println("------------------------------------\n");  
                        System.out.println("'Data Berhasil Diubah'\n");
                    }
                    break;
                default:
                    System.out.println("\n'Terima Kasih, Sehat Selalu :)'");
            }     
        }while(Integer.parseInt(pilihan) !=5);
    }
}
                