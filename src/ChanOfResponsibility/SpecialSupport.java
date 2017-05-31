package ChanOfResponsibility;

/**
 * Created by snowWave on 2017/5/31
 */
public class SpecialSupport extends Support {
    private int number;                                 //只能解决指定编号问题
    public SpecialSupport(String name , int number){    //构造函数
        super(name);
        this.number = number;
    }
    protected boolean resolve(Trouble trouble){         //解决问题的办法
        if ( trouble.getNumber() == number){
            return true;
        }else {
            return false;
        }
    }
}
