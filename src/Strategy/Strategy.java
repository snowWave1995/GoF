package Strategy;

/**
 * Created by snowWave on 2017/5/29
 */
public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);


}
