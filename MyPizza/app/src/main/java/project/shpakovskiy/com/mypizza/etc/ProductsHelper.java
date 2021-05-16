package project.shpakovskiy.com.mypizza.etc;

import java.util.ArrayList;
import java.util.List;

import project.shpakovskiy.com.mypizza.product.adapter.models.ProductModel;

public class ProductsHelper {
    public static List<ProductModel> getProductsList() {
        List<ProductModel> productModels = new ArrayList<>();

        ProductModel model = new ProductModel();
        model.setId(123l);
        model.setTitle("Пепперони");
        model.setDescription("Томатный соус, пепперони, моцарелла");
        model.setImage("https://github.com/AndreyShpakovskiy/course3/blob/main/images/Pepperoni.png?raw=true");
        model.setPrice(5);
        productModels.add(model);

        model = new ProductModel();
        model.setId(124l);
        model.setTitle("4 Сезона");
        model.setDescription("Томатный соус, томаты, пепперони, брынза, моцарелла, ветчина, шампиньоны");
        model.setImage("https://github.com/AndreyShpakovskiy/course3/blob/main/images/4Seasons.jpg?raw=true");
        model.setPrice(6);
        productModels.add(model);

        model = new ProductModel();
        model.setId(125l);
        model.setTitle("Грибы и ветчина");
        model.setDescription("Томатный соус, моцарелла, ветчина, шампиньоны");
        model.setImage("https://github.com/AndreyShpakovskiy/course3/blob/main/images/mushrooms.jpg?raw=true");
        model.setPrice(5);
        productModels.add(model);

        model = new ProductModel();
        model.setId(126l);
        model.setTitle("Маргарита");
        model.setDescription("Томатный соус, моцарелла");
        model.setImage("https://github.com/AndreyShpakovskiy/course3/blob/main/images/margarita1.jpg?raw=true");
        model.setPrice(4);
        productModels.add(model);

        model = new ProductModel();
        model.setId(127l);
        model.setTitle("Гавайская");
        model.setDescription("Томатный соус, моцарелла, курица, ананасы");
        model.setImage("https://github.com/AndreyShpakovskiy/course3/blob/main/images/hawaii.jpg?raw=true");
        model.setPrice(7);
        productModels.add(model);

        model = new ProductModel();
        model.setId(128l);
        model.setTitle("Овощная");
        model.setDescription("Томатный соус, томаты, брынза, маслины, лук, сладкий перец, моцарелла");
        model.setImage("https://github.com/AndreyShpakovskiy/course3/blob/main/images/Vegetrian.jpeg?raw=true");
        model.setPrice(5);
        productModels.add(model);

        return productModels;
    }
}
