package AbstractFactory;

/**
 * Created by snowWave on 2017/6/4
 */
public abstract class Link extends Item{
    protected String url;
    public Link(String caption, String url){
        super(caption);
        this.url = url;
    }
}
