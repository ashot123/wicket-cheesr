package cheers.wicket;

import cheers.model.Cart;
import cheers.model.Cheese;
import org.apache.wicket.markup.html.WebPage;

import java.util.List;

/**
 * Created by Ashot Karakhanyan on 11-08-2014
 */
public class CheesrPage extends WebPage {

    // Helper method to cast
    public CheesrSession getCheesrSession() {
        return (CheesrSession) getSession();
    }

    @Deprecated
    public Cart getCart() {
        return getCheesrSession().getCart();
    }

    /*@Deprecated
    public List<Cheese> getCheeses() {
        return CheesrApplication.get().getCheeses();
    }*/
}
