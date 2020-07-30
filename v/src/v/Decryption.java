package v;

import java.util.Scanner;
public class Decryption  {
    public static void main(String[] args)
    {
           int[]a=new int[100];
           Scanner s = new Scanner(System.in);
           System.out.println("Ciphertext£º");
           String str = s.nextLine();
           char[] chars =str.toCharArray();

           Scanner sr = new Scanner(System.in);
           System.out.println("Key(4bits)£º");
           String strr = sr.nextLine();
           char[] cha =strr.toCharArray();

           int[]b=new int[4];
           for (int i = 0; i < cha.length; i++) 
            {  
               b[i]=(int)cha[i];
            }

          System.out.println("Plaintext:");

         for (int i = 0,j=0; i < chars.length; i++,j++) 
         {  
           a[i]=(int)chars[i];
           if(a[i]==32) 
            {
              --j;
              System.out.print((char)a[i]);
            }
        else 
         { 
           a[i]=a[i]-b[j%4]+97;
           if(a[i]<97&&a[i]!=32) 
           {
           a[i]=a[i]+26;
         }
        System.out.print((char)a[i]);
    }
}
}
}