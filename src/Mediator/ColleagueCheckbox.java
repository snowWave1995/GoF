package Mediator;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by snowWave on 2017/6/1
 */
public class ColleagueCheckbox extends Checkbox implements ItemListener,Colleague{
    private Mediator mediator;
    public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state){
        super(caption,group,state);
    }
    public void setMediator(Mediator mediator){       //保存Mediator
        this.mediator = mediator;
    }
    public void setColleagueEnabled(boolean enabled){   //Mediator下达启用/禁用指示
        setEnabled(enabled);
    }

    public void itemStateChanged(ItemEvent e){      //当状态发生变化时通知Mediator
        mediator.colleagueChanged();
    }
}
