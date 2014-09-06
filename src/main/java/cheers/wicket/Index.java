package cheers.wicket;

import cheers.dao.CheesrDao;
import cheers.model.Cheese;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.list.PageableListView;
import org.apache.wicket.markup.html.navigation.paging.PagingNavigator;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.spring.injection.annot.SpringBean;

import java.text.NumberFormat;
import java.util.List;

public class Index extends CheesrPage {

    @SpringBean
    private CheesrDao dao;


    public Index() {


        PageableListView<Cheese> cheeses = new PageableListView<Cheese>("cheeses", dao.findAll(), 5) {
            @Override
            protected void populateItem(ListItem<Cheese> item) {
                Cheese cheese = item.getModelObject();
                item.add(new Label("name", cheese.getName()));
                item.add(new Label("description", cheese.getDescription()));
                item.add(new Label("price", "$" + cheese.getPrice()));
                item.add(new Link<Cheese>("add", item.getModel()) {
                    @Override
                    public void onClick() {
                        Cheese selected = getModelObject();
                        getCheesrSession().getCart().getCheeses().add(selected);
                    }
                });
            }
        };
        add(cheeses);
        add(new PagingNavigator("navigator", cheeses));
        add(new ShoppingCartPanel("shoppingCart", getCheesrSession().getCart()));


        add(new Link("checkout") {

            @Override
            public void onClick() {
                setResponsePage(new CheckOut());
            }

            @Override
            public boolean isVisible() {
                return !getCheesrSession().getCart().getCheeses().isEmpty();
            }
        });


    }
}