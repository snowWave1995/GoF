package Facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by snowWave on 2017/6/1
 */
public class DataBase {
    private DataBase(){
                            //防止外部声明
    }
    public static Properties getProperties(String dbname){
        String filename = dbname + ".txt";
        Properties prop = new Properties();
        try{
            System.out.println(filename);
            prop.load(new FileInputStream(filename));

        }catch (IOException e){
            System.out.println("Warning: " + filename + " is not found.");
        }
        return prop;
    }
}
