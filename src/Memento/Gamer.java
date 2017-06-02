package Memento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by snowWave on 2017/6/2
 */
public class Gamer {
    private int money;      //所持金钱
    private List fruits = new ArrayList();  //所获得的水果
    private Random random = new Random();   //随机数生成器
    private static String[] fruitsName = {      //表示水果种类的数组
            "apple","orange","banana","pink",
    };
    public Gamer(int money){
        this.money = money;
    }
    public int getMoney(){
        return money;
    }
    public void bet(){      //掷骰子进行游戏
        int dice = random.nextInt(6)+1;
        if (dice == 1){
            money += 100;
            System.out.println("所持的金钱增加了。");
        }else if(dice == 2){
            money /=2;
            System.out.println("所持的金钱减半了。");
        }else if(dice == 6){
            String f = getFruit();
            System.out.println("获得了水果("+ f + ")。");
            fruits.add(f);
        }else {
            System.out.println("什么都没有发生");
        }
    }
    public Memento createMemento(){ //拍摄快照
        Memento m = new Memento(money);
        Iterator it = fruits.iterator();
        while (it.hasNext()){
            String f = (String)it.next();
            if( f.startsWith("好吃的")){       //只保存好吃的水果
                m.addFruit(f);
            }
        }
        return m;
    }
    public void restoreMemento(Memento memento){    //撤销
        this.money = memento.money;
        this.fruits = memento.getFruit();
    }
    public String toString(){          //用字符串表示主人现在状态
        return "[money= " + money + ", fruits = " + fruits + "]";
    }
    private String getFruit(){      //获取一个水果
        String prefix = "";
        if (random.nextBoolean()){
            prefix = "好吃的";
        }
        return prefix + fruitsName[random.nextInt(fruitsName.length)];
    }
}
