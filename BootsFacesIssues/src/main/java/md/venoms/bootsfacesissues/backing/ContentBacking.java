package md.venoms.bootsfacesissues.backing;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class ContentBacking implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String content;
    
    @PostConstruct
    private void postConstruct() {
        this.content = "home-step-0";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        System.out.println("ContentBacking Method setContent called..");
        this.content = content;
    }
    
}
