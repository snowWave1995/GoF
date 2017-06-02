package Observer;

import java.util.Random;

/**
 * Created by snowWave on 2017/6/2
 */
public class RandomNumberGenerator extends NumberGenerator {

    private Random random = new Random();   //随机数生成器
    private int number;
    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
