package Bridge;

/**
 * Created by snowWave on 2017/5/29
 */
public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, China"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello,world"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello,Universe."));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}
