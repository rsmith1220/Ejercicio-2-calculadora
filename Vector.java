import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Stack;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;


class Vector implements Calculadora{
    public Vector(){

    Stack<Integer> stack=new Stack<>();
}
String line = "No hay archivo";

public String decode(String a){
    BufferedReader br = null;
    String line = "No hay archivo";
    try{
        FileReader fr = new FileReader(a);
        br = new BufferedReader(fr);
        while((line = br.readLine())!= null){
            System.out.println(line);
        }
    }catch(IOException e){
        System.out.println("No");
    }
    return line;
}


}
