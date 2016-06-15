package md.venoms.bootsfacesissues.backing;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Damiano Esposito <espo@zhaw.ch>
 */
@Named
@RequestScoped
public class DummyBacking implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public void action() {
        System.out.println("DummyBacking action method called..");
    }
    
}
