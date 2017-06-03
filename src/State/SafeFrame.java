package State;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by snowWave on 2017/6/3
 */
public class SafeFrame extends Frame implements ActionListener,Context {
    private TextField textClock = new TextField(60);
    private TextArea textScreen = new TextArea(10,60);
    private Button buttonUse = new Button("使用金库");
    private Button buttonAlarm = new Button("按下警铃");
    private Button buttonPhone = new Button("正常通话");
    private Button buttonExit = new Button("结束");

    private State state = DayState.getInstance();

    //构造函数
    public SafeFrame(String title){
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        //配置textClock
        add(textClock,BorderLayout.NORTH);
        textClock.setEnabled(false);
        //配置textScreen
        add(textScreen,BorderLayout.CENTER);
        textScreen.setEditable(false);
        //为界面添加按钮
        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);

        //配置界面
        add(panel, BorderLayout.SOUTH);
        //显示
        pack();
        show();
        //设置监听器
        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    //按下被按后盖方法会被调用

    public void actionPerformed(ActionEvent e){
        System.out.println(e.toString());

        if (e.getSource() == buttonUse){
            state.doUse(this);
        }else if(e.getSource() == buttonAlarm){
            state.doAlarm(this);
        }else if(e.getSource() == buttonPhone){
            state.doPhone(this);
        }else if(e.getSource() == buttonExit){
            System.exit(0);
        }else {
            System.out.println("?");
        }
    }

    //设置时间
    public void setClock(int hour){
        String clockstring = "现在时间是";
        if (hour < 10){
            clockstring += "0" + hour + ":00";
        }else {
            clockstring += hour + ":00";
        }
        System.out.println(clockstring);
        textClock.setText(clockstring);
        state.doClock(this,hour);
    }

    //改变状态
    public void changeState(State state){
        System.out.println("从" + this.state + "状态变为了" + state + "状态。");
        this.state = state;
    }

    //联系警报中心
    public void callSecurityCenter(String msg){
        textScreen.append("call!" + msg + "\n" );
    }
    //在警报中心留下记录
    public void recordLog(String msg){
        textScreen.append("record..." + msg + "\n");
    }
}
