package br.com.tt.comunicador.common;

import com.sun.org.apache.xpath.internal.objects.XNull;

import javax.swing.*;
import java.util.Scanner;

public class Util {

    private Util(){
    }

    public static void print(String texto){
       JOptionPane.showMessageDialog( null, texto);
        //System.out.println(texto);
    }

    public static String read(){
        return JOptionPane.showInputDialog("");
        // return new Scanner(System.in).nextLine();
    }
}
