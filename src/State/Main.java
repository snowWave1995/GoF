package State;

/**
 * Created by snowWave on 2017/6/3
 */
public class Main {
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("State Sample");
        while (true){
            for (int hour = 0; hour < 24; hour++) {
                frame.setClock(hour);
                try{
                    Thread.sleep(100);
                }catch (InterruptedException e){

                }
            }
        }
    }
}
