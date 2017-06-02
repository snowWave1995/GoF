package Memento;

/**
 * Created by snowWave on 2017/6/2
 */
public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);           //最初所持的金钱树为100
        Memento memento = gamer.createMemento();        //保存最初的状态
        for (int i = 0; i < 100; i++) {
            System.out.println("====="+ i );        //显示掷骰子的次数
            System.out.println("当前状态： " + gamer);   //显示主人现在的状态

            gamer.bet();
            System.out.println("所持金钱为" + gamer.getMoney() + "元");
            //决定如何处理Memento
            if (gamer.getMoney() > memento.getMoney()){
                System.out.println("   (所持金钱增加了许多，因此保存游戏当前状态）");
                memento = gamer.createMemento();
            }else if ( gamer.getMoney() > memento.getMoney()/2){
                System.out.println("    (所持金钱减少了许多，因此将游戏恢复成以前的状态");
                gamer.restoreMemento(memento);
            }

            //等待一段时间
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
            System.out.println("");
        }
    }
}
