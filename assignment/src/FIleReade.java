import java.util.Scanner;
import java.io.FileReader;
public class FIleReade {
    public static void main(String[] args) {


                try{System.out.println("Hello World");
                    Scanner sc=new Scanner(System.in);
                    String filename=sc.nextLine();
                    FileReader fr=new FileReader(filename);
                    int ch;
                    while(true){
                        ch=fr.read();
                        if(ch==-1){
                            break;
                        }System.out.println((char)ch);
                    }
                    fr.close();}
                catch(Exception e){
                    System.out.println(e.getMessage());

                }
            }}


