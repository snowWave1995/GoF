package AbstractFactory;

/**
 * Created by snowWave on 2017/6/5
 */
public class ListLink extends Link {

    public ListLink(String caption, String url){
        super(caption, url);
    }
    @Override
    public String makeHTML() {
        return "   <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
