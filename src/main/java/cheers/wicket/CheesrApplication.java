package cheers.wicket;

import org.apache.wicket.Page;
import org.apache.wicket.Session;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.request.Request;
import org.apache.wicket.request.Response;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

/**
 * Created by Ashot Karakhanyan on 10-08-2014
 */
public class CheesrApplication extends WebApplication {

    public CheesrApplication() {
    }

    @Override
    protected void init() {
        super.init();
        getComponentInstantiationListeners().add(new SpringComponentInjector(this));
    }

    @Override
    public Class<? extends Page> getHomePage() {
        return Index.class;
    }

    @Override
    public Session newSession(Request request, Response response) {
        return new CheesrSession(request);
    }



    /* public static CheesrApplication get() {
        return (CheesrApplication) Application.get();
    }
    */


   /* @Deprecated
    public List<Cheese> getCheeses() {
        return cheeses;
    }*/


}