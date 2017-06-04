package AbstractFactory;

import FactoryMethod.*;


/**
 * Created by snowWave on 2017/6/4
 */
public class Main {
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listFactory.ListFactory");
            System.out.println("Example 2: java Main TableFactory.TableFactory");
        }
        Factory factory = Factory.getFactory(args[0]);

        Link people = factory.createLink("人民日报","http://www.people.com.cn");
        Link gmw = factory.createLink("光明日报","http://www.gmv.cn");

        Link us_yahoo = factory.createLink("Yahoo!","http://www.yahoo.com");
        Link jp_yahoo = factory.createLink("Yahoo!Japan","http://www.yahoo.co.jp");
        Link excite = factory.createLink("Excite!","http://www.excite.com");
        Link google = factory.createLink("Google!","http://www.google.com");

        Tray traynews = factory.createTray("日报");
        traynews.add(people);
        traynews.add(gmw);

        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(jp_yahoo);

        Tray traySearch = factory.createTray("检索引擎");
        traySearch.add(trayyahoo);
        traySearch.add(excite);
        traySearch.add(google);

        Page page = factory.createPage("LinkPage", "yangwenixan");
        page.add(traynews);
        page.add(traySearch);
        page.output();

    }
}
