package Proxy;

/**
 * Created by snowWave.
 */
public class PrinterProxy implements Printable {
    private String name;
    private Printer real; //"本人"
    public PrinterProxy(){

    }
    public PrinterProxy(String name){
        this.name = name;
    }
    public synchronized void setPrinterName(String name){       //设置名字
        if(real != null){
            real.setPrinterName(name);      //同时设置"本人"名字
        }
        this.name = name;
    }
    public String getPrinterName(){
        return name;
    }
    public void print(String string){   //显示
        realize();
        real.print(string);
    }
    private synchronized void realize(){       //生成本人
        if(real == null){
            real = new Printer(name);
        }
    }
}
