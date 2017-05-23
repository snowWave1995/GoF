package Proxy;

/**
 * Created by snowWave.
 */
public class Printer {
    private String name;
    public Printer(){
        heavyJob("正在生成Printer的实例");
    }
    public Printer(String name){
        this.name = name;
        heavyJob("正在生成Printer的实例("+ name + ")");
    }

    public String getPrinterName() {
        return name;
    }

    public void setPrinterName(String name) {
        this.name = name;
    }
    public void print(String string){           //显示带打印机名字的文字
        System.out.println("==="+ name + "===");
        System.out.println(string);
    }
    private void heavyJob(String msg){          //重活
        System.out.println(msg);
        for (int i = 0; i <5; i++) {
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(".");
            }
        }
        System.out.println("结束。");
    }
}
