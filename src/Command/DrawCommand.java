package Command;

import java.awt.*;

/**
 * Created by snowWave on 2017/6/4
 */
public class DrawCommand implements Command{
    //绘制对象
    protected Drawable drawable;
    //绘制位置
    private Point position;
    //构造函数
    public DrawCommand(Drawable drawable, Point position){
        this.drawable = drawable;
        this.position = position;
    }
    //执行
    public void execute(){
        drawable.draw(position.x,position.y);
    }
}
