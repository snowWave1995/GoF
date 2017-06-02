package Observer;

import java.util.*;

/**
 * Created by snowWave on 2017/6/2
 */
public abstract class NumberGenerator {
    private ArrayList obsrervers = new ArrayList();     //保存Observer
    public void addObserver(Observer  observer){        //注册observer
        obsrervers.add(observer);
    }
    public void deleteObserver(Observer observer){      //删除Observer
        obsrervers.remove(observer);
    }
    public void notifyObservers(){
        Iterator it = obsrervers.iterator();            //向Observer通知
        while (it.hasNext()){
            Observer o = (Observer)it.next();
            o.update(this);
        }
    }
    public abstract int getNumber();
    public abstract void execute();
}
