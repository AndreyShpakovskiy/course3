package project.shpakovskiy.com.mypizza.cart;

import project.shpakovskiy.com.mypizza.BaseActivity;
import project.shpakovskiy.com.mypizza.R;

public class CartActivity extends BaseActivity {

    @Override
    public int getViewId() {
        return R.layout.activity_cart;
    }

    @Override
    public void onCreateView() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }
}
