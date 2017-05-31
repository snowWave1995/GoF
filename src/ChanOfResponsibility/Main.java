package ChanOfResponsibility;

/**
 * Created by snowWave on 2017/5/31
 */
public class Main {
    public static void main(String[] args) {
        Support alice   = new NoSupport("Alice");
        Support bob     = new LimitSupport("bob", 100);
        Support charlie = new SpecialSupport("charlie", 429);
        Support diana   = new LimitSupport("diana", 200);
        Support elmo    = new OddSupport("elmo");
        Support fred    = new LimitSupport("fred", 300);
        //形成责任链
        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);
        //制造各种问题
        for (int i = 0; i < 500; i += 30) {
            alice.support(new Trouble(i));
        }
    }
}
