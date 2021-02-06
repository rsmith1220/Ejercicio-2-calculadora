import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Stack;
import java.util.Scanner;
import java.io.IOException;
import java.util.*;
import java.io.*;
import java.util.ArrayList;



class Vector implements Calculadora{
    Main main = new Main();
    BufferedReader br = null;
    String line = "No hay archivo";
    String ops = " ";
   
    ArrayList<String> ecu = new ArrayList<String>();

    public String decode(String a){
        
        line = "No hay archivo";
        try{
            //File text = new File("C:/Users/rebe/Ejercicio 2 AED/datos.txt");
            //Scanner esto = new Scanner(text);

            File file = new File("datos.txt");

            //Scanner esto = new Scanner(new File("Ejercicio 2 AED\\datos.txt"));
            //FileReader fr = new FileReader("Ejercicio 2 AED\\datos.txt"); // lee el archivo
            //br = new BufferedReader(fr);
            
            Scanner esto = new Scanner(file);

            //por cada linea del txt se hace un loop
            while((esto.hasNextLine())){
                
                ops+=esto.nextLine();
                System.out.println("\nDoc leido exitoso\n");
                
                
            }
        }catch(Exception e){ 
            System.out.println("\nNo se encontro el documento\n");
        }

        String [] opt = ops.split(" "); // el txt esta separado por espacios

        //regresa la linea del txt o el mensaje de error
        return line;
    }

    Stack<Integer> calc = new Stack<Integer>();
    

    public Stack getcalc(){
        return calc;
    }

    public int operar(Stack b){
        String listString = " ";

        Scanner patos = new Scanner(new File("datos.txt"));
        String input = patos.toString();
        
        System.out.println(listString);

        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            int x = 0;
            int y = 0;
            int r = 0;

            if(Character.isDigit(c)){
                int t = Character.getNumericValue(c);
                calc.push(t);
            }else if (c == '+'){
                x = calc.pop();
                y = calc.pop();
                r = x+y;
                calc.push(r);

            }else if (c == '-'){
                x = calc.pop();
                y = calc.pop();
                r = x-y;
                calc.push(r);
            }else if (c == '*'){
                x = calc.pop();
                y = calc.pop();
                r = x*y;
                calc.push(r);
            }else if (c == '/'){
                x = calc.pop();
                y = calc.pop();
                r = x/y;
                calc.push(r);
            }
        }
        int a = calc.pop();
        return a;

    }
    
}





















   


    
