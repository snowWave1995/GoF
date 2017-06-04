package AbstractFactory;

/**
 * Created by snowWave on 2017/6/5
 */
public class TableLink extends Link {

    public TableLink(String caption, String url){
        super(caption,url);
    }
    @Override
    public String makeHTML() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
