package javaapplication1;
import java.io.File;
import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Insira file: ");
        analyzePath(input.nextLine());
    }
    
    public static void analyzePath(String path){
        File name = new File(path);
        
        if(name.exists()){
            System.out.printf()
        }
    }
    
}
