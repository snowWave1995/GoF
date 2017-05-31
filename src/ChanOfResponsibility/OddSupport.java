package ChanOfResponsibility;

/**
 * Created by snowWave on 2017/5/31
 */
public class OddSupport extends Support{
    public OddSupport(String name){                          //构造函数
        super(name);
    }
    protected boolean resolve(Trouble trouble){             //解决问题的办法
        if ( trouble.getNumber() % 2 == 1){
            return true;
        }else {
            return false;
        }
    }
}
