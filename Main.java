/**
* @author Rebecca Smith
* 
*/
import java.util.Stack;
import java.util.Scanner;

class Main{
String doc = "yes";
public static void main(String[] args) {

    Vector vec = new Vector();
    System.out.println("Escriba el nombre de la carpeta separado por dos lineas diagonales hacia la izquierda(\\) y el nombre del .txt sin espacios");
    Scanner scan = new Scanner(System.in);
    String doc = scan.next();
    vec.decode(doc);
    System.out.println("ok");
    Stack calcu = vec.getcalc();
    vec.operar(calcu);
    System.out.println("ok");
    
}
public String getDoc(){
    return doc;
}

}