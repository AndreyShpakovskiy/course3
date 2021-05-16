package project.shpakovskiy.com.mypizza.product;

import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.math.BigDecimal;

import butterknife.BindView;
import project.shpakovskiy.com.mypizza.BaseFragment;
import project.shpakovskiy.com.mypizza.R;
import project.shpakovskiy.com.mypizza.cart.CartActivity;
import project.shpakovskiy.com.mypizza.cart.helper.CartHelper;
import project.shpakovskiy.com.mypizza.cart.helper.entity.CartEntity;
import project.shpakovskiy.com.mypizza.cart.helper.entity.models.ProductEntityModel;
import project.shpakovskiy.com.mypizza.etc.ProductsHelper;
import project.shpakovskiy.com.mypizza.product.adapter.ProductRecyclerAdapter;
import project.shpakovskiy.com.mypizza.product.adapter.models.ProductModel;

public class ProductFragment extends BaseFragment implements ProductRecyclerAdapter.OnItemClickListener {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @Override
    public int getViewId() {
        return R.layout.fragment_product;
    }

    @Override
    public void onViewCreated(View view) {
        ProductRecyclerAdapter productRecyclerAdapter = new ProductRecyclerAdapter(context, ProductsHelper.getProductsList());
        productRecyclerAdapter.setOnItemClickListener(this);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 2));
        recyclerView.setAdapter(productRecyclerAdapter);
    }

    @Override
    public void onItemClick(ProductModel productModel) {
        ProductEntityModel product = new ProductEntityModel();
        product.setId(productModel.getId());
        product.setName(productModel.getTitle());
        product.setDescription(productModel.getDescription());
        product.setPrice(BigDecimal.valueOf(productModel.getPrice()));
        product.setImage(productModel.getImage());

        CartEntity cart = CartHelper.getCart();
        cart.add(product, 1);

        Intent intent = new Intent(context, CartActivity.class);
        startActivity(intent);

        getActivity().invalidateOptionsMenu();
    }
}
