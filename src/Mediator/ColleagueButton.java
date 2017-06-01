package Mediator;

import java.awt.*;

/**
 * Created by snowWave on 2017/6/1
 */
public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;
    public ColleagueButton(String caption){
        super(caption);
    }
    public void setMediator(Mediator mediator){             //保存Mediator
        this.mediator = mediator;
    }
    public  void setColleagueEnabled(boolean enabled){      //Mediator 下达启用/禁止的指示
        setEnabled(enabled);
    }
}
