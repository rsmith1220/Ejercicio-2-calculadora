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
   
    ArrayList<String> ecu = new ArrayList<String>();

    public String decode(String a){
        
        line = "No hay archivo";
        try{
            FileReader fr = new FileReader(a); // lee el archivo
            br = new BufferedReader(fr);
            //por cada linea del txt se hace un loop
            while((line = br.readLine())!= null){
                //imprime la linea del txt
                System.out.println("La operacion a realizar "+line);

                //String[] letrasSeparadas = lineaOperacion.split(" ");

                String[] datos = data.split(" ");
                    
                for(String s: tmp){
                    ecu.add(s);
                }
                
            }
        }catch(IOException e){ //si hay una exepcion entonces el catch hace que no se cierre el programa
            System.out.println("No");
        }
        //regresa la linea del txt o el mensaje de error
        return line;
    }

    Stack<Integer> calc = new Stack<Integer>();
    

    public Stack getcalc(){
        return calc;
    }

    public int operar(Stack b){
         

        for(int i = 0; i < ecu.length(); i++){
            char c = ecu.charAt(i);
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





















   


    
