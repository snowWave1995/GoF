package Interpreter;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by snowWave on 2017/6/4
 */
public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\lenovo\\Desktop\\GoF\\src\\Interpreter\\program.txt"));

            String text;
            while ((text = reader.readLine()) != null){
                System.out.println("text =\"" + text +"\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
            reader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
