package cheers.wicket;

import cheers.model.Address;
import cheers.model.Cart;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.PropertyModel;

/**
 * Created by Ashot Karakhanyan on 13-08-2014
 */
public class CheckOut extends CheesrPage {
    public CheckOut() {
        add(new FeedbackPanel("feedback"));
        Form<Address> form = new Form<>("form");
        add(form);

        Address address = getCheesrSession().getCart().getBillingAddress();

        CompoundPropertyModel<Address> model = new CompoundPropertyModel<>(address);
        form.setModel(model);
        form.add(new TextField<>("name1", new PropertyModel<IModel<String>>(address, "name")));
        //form.add(new TextField<>("name1", model.<IModel<String>>bind("name")).setRequired(true)); // Huh!
        form.add(new TextField("street").setRequired(true));
        form.add(new TextField("zipcode").setRequired(true));
        form.add(new TextField("city").setRequired(true));


        form.add(new Link("cancel") {
            @Override
            public void onClick() {
                setResponsePage(Index.class);
            }
        });

        form.add(new Button("order") {
            @Override
            public void onSubmit() {
                //Cart cart = getCart();
                Cart cart = getCheesrSession().getCart();
                // charge customers’ credit card
                // ship cheeses to our customer
                // clean out shopping cart
                cart.getCheeses().clear();
                // return to front page
                setResponsePage(Index.class);
            }

        });
        add(new ShoppingCartPanel("cart", getCheesrSession().getCart()));
    }
}
