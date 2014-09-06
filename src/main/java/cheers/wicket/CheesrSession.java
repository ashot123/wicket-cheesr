package cheers.wicket;

import cheers.model.Cart;
import org.apache.wicket.protocol.http.WebSession;
import org.apache.wicket.request.Request;

public class CheesrSession extends WebSession {


    private Cart cart;

    protected CheesrSession(Request request) {
        super(request);
        cart = new Cart();
    }

    public Cart getCart() {
        return cart;
    }


}