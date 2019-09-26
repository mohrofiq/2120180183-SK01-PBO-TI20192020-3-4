/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2120180183.sk01.pbo.ti20192020.pkg3.pkg4.pkg01;

/**
 *
 * @author User1
 */
public class SK01PBOTI201920203401 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int x = 9;
        int a = 1;
        for(int i = 1; i <=x; i++){
            for(int j = a; j>i; j--){
                System.out.print("");
            }
            for(int k = 1; k<=i; k++){
                System.out.print(a);
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("baris = " + x);
    }
    
}
