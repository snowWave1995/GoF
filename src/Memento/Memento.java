package Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by snowWave on 2017/6/2
 */
public class Memento {
    int money;              //所持金钱
    ArrayList fruits;       //获取的水果
    public int getMoney(){  //获取当前所持金钱
        return money;
    }
    Memento(int money){
        this.money = money;
        this.fruits = new ArrayList();
    }
    void addFruit(String  fruit){      //增加水果
        fruits.add(fruit);
    }
    List getFruit(){            //获取当前持有的水果
        return (List)fruits.clone();
    }

}
