import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Stack;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;


class Vector implements Calculadora{
    public Vector(){

        Stack<Integer> calc = new Stack<Integer>();
}
String line = "No hay archivo";

public String decode(String a){
    BufferedReader br = null;
    String line = "No hay archivo";
    try{
        FileReader fr = new FileReader(a); // lee el archivo
        br = new BufferedReader(fr);
        //por cada linea del txt se hace un loop
        while((line = br.readLine())!= null){
            //imprime la linea del txt
            System.out.println(line);
        }
    }catch(IOException e){ //si hay una exepcion entonces el catch hace que no se cierre el programa
        System.out.println("No");
    }
    //regresa la linea del txt o el mensaje de error
    return line;
}
public int operar(stack b){
    sc = b;
    String input = sc.next();
    Stack<Integer> calc = new Stack<Integer>();
    while(sc.hasNext()){
    for(int i = 0; i < input.length(); i++){
        char c = input.charAt(i);
        int x = 0;
        int y = 0;
        int r = 0;
        if(Character.isDigit(c)){
        int t = Character.getNumericValue(c);
            calc.push(t);
        }
        else if(c == '+'){
            x = calc.pop();
            y = calc.pop();
            r = x+y;
            calc.push(r);
        }
        else if(c == '-'){
            x = calc.pop();
            y = calc.pop();
            r = x-y;
            calc.push(r);
        }
        else if(c == '*'){
            x = calc.pop();
            y = calc.pop();
            r = x*y;
            calc.push(r);
        }
        else if(c == '/'){
            x = calc.pop();
            y = calc.pop();
            r = x/y;
            calc.push(r);
        }
}
 }
    int wow = calc.pop();
    System.out.println(wow);
}

}
