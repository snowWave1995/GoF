package ChanOfResponsibility;

/**
 * Created by snowWave on 2017/5/31
 */
public class NoSupport extends Support{
    public NoSupport(String name){
        super(name);
    }
    protected boolean resolve(Trouble trouble){              //解决问题的方法
                                                             //自己什么也不处理
        return false;
    }
}
