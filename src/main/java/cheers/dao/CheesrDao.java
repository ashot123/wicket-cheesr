package cheers.dao;

import cheers.model.Cheese;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Ashot Karakhanyan on 11-08-2014
 */
public class CheesrDao {

    @Resource
    private SessionFactory sessionFactory;

    public CheesrDao() {
        int x = 10;
    }


    /*
    private List<Cheese> cheeses = Arrays.asList(
            new Cheese("Gouda", "Gouda is a traditional, creamery, hard cheese. It is round with very smooth, yellow, waxed rind. The flavor is sweet and fruity. As time passes, the taste intensifies and becomes more complex. Mature Gouda (18 months plus) is coated in black wax which provides a stark contrast to the deep yellow interior. Gouda is considered to be one of the world's great cheeses. It is both a table cheese and a dessert cheese, excellent with fruit and wine.", 1.65),
            new Cheese("Edam", "This is a pressed, semi-hard to hard cheese, made from cow's milk. It comes in a shape of ball covered with distinctive red wax. Edam is produced from skimmed or semi-skimmed milk. It is usually consumed young, when the texture is elastic and supple and the flavor is smooth, sweet and nutty. Black-wax coating means that Edam has been matured for at least 17 weeks. The cheese tastes delicious with a glass of Pinot Noir.", 1.05),
            new Cheese("Maasdam", "Modern, creamery, semi-hard cheese made from cow's milk. It is boulder-shaped cheese. The smooth, natural rind is polished and may be waxed. The cheese was created in the early 1990's as an alternative to more expensive Swiss cheese Emmental. Although there are similarities with Emmental, it is higher in moisture and therefore, more supple. It ripens faster than other Dutch cheeses, being ready in four to 12 weeks. The flavor is sweet and buttery, with a fruity background, making it ideal for serving as a snack or breakfast cheese. It can also be grilled.", 2.35),
            new Cheese("Brie", "Brie is a soft, cows' cheese named after Brie, the French province in which it originated (roughly corresponding to the modern dйpartement of Seine-et-Marne). It is pale in colour with a slight greyish tinge under crusty white mould; very soft and savoury with a hint of ammonia. The white mouldy rind is moderately tasteful and edible, and is not intended to be separated from the cheese during consumption.", 3.15),
            new Cheese("Buxton Blue", "Buxton Blue cheese is an English blue cheese that is a close relative of Blue Stilton. It is made from cow's milk and is lightly veined with a deep russet colouring. It is usually made in a cylindrical shape. This cheese is complimented with a chilled glass of sweet dessert wine or ruby port.", 0.99),
            new Cheese("Parmesan", "Parmesan is a grana, a hard, fat granular cheese, cooked but not pressed, named after the producing areas of Parma, Reggio Emilia, Modena, Bologna, in Emilia-Romagna, and Mantova, in Lombardy, Italy. Parmigiano is simply the Italian adjective for Parma; the French version, Parmesan, is used in English. The term Parmesan is also loosely used as a common term for cheeses imitating true Parmesan cheese, especially outside Europe; within Europe, the Parmesan name is classified as a protected designation of origin. The generic name for this type of cheese is grana.", 1.99),
            new Cheese("Cheddar", "Cheddar cheese is a hard, pale yellow to orange, sharp-tasting cheese originally (and still) made in the English village of Cheddar, in Somerset. Cheddar cheese is the most popular cheese in the United Kingdom, accounting for just over 50% of the country's Ј1.9 billion annual cheese market. Although Cheddar cheese is originally English, it is also widely produced in other countries, including the Republic of Ireland, the USA, Australia, New Zealand, South Africa and Canada.", 2.95),
            new Cheese("Roquefort", "Roquefort is a ewe's-milk blue cheese from the south of France, and together with Bleu d'Auvergne, Stilton and Gorgonzola is one of the world's greatest blue cheeses. The cheese is white, crumbly and slightly moist, with distinctive veins of blue mold. It has characteristic odor and flavor with a notable taste of butyric acid; the blue veins provide a sharp tang. The overall flavor sensation begins slightly mild, then waxing sweet, then smoky, and fading to a salty finish. It has no rind; the exterior is edible and slightly salty.", 1.67),
            new Cheese("Boursin", "Boursin cheese is a soft creamy cheese available in a variety of flavours. Its flavor and texture is somewhat similar to the American cream cheese.", 1.33),
            new Cheese("Camembert", "Camembert is a soft, creamy French cheese. When fresh, it is quite crumbly and relatively hard, but characteristically ripens and becomes more runny and strongly flavoured as it ages. Camembert can be used in many dishes, but is also popularly eaten uncooked on bread or with wine or meat, to enjoy the subtle flavour and texture which does not survive heating. It is usually served at room temperature.", 1.69),
            new Cheese("Emmental", "Emmental is a yellow, medium-hard cheese, with characteristic large holes. It has a piquant, but not really sharp taste.", 2.39),
            new Cheese("Reblochon", "Reblochon is a soft washed-rind cheese made from raw cow's milk. eblochon has a nutty taste that remains in mouth after its soft and uniform centre has been enjoyed. It is an essential ingredient of tartiflette, a Savoyard gratin made from potatoes, cream, onions, and bacon.", 2.99));

*/

    @Transactional(readOnly = true)
    public List<Cheese> findAll() {
        Query query = sessionFactory.getCurrentSession().createQuery("from Cheese");
        return query.list();

    }

}
