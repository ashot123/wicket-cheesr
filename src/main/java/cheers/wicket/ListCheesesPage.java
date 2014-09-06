package cheers.wicket;

import cheers.dao.CheesrDao;
import cheers.model.Cheese;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;

/**
 * Created by Ashot Karakhanyan on 30-08-2014
 */
public class ListCheesesPage extends WebPage {

    @SpringBean
    private CheesrDao dao;


    public ListCheesesPage() {
        IModel<Cheese> model = new LoadableDetachableModel<Cheese>() {
            @Override
            protected Cheese load() {
                return dao.findAll();
            }
        };
        add(new ListView<Cheese>("cheeses", model) {
            protected void populateItem(ListItem item) {
                Cheese cheese = (Cheese)item.getModelObject();
                item.add(new Label("name", cheese.getName()));

            }
        });
    }
}