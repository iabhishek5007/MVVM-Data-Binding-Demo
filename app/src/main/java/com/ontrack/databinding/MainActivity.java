package com.ontrack.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.ontrack.databinding.databinding.ActivityMainBinding;
import com.ontrack.databinding.models.Product;
import com.ontrack.databinding.util.Products;

public class MainActivity extends AppCompatActivity implements IMainActivity {

    //data binding
    ActivityMainBinding mBinding;

    private Product mProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       mBinding= DataBindingUtil.setContentView(this, R.layout.activity_main);
        Products products= new Products();
        mProduct= products.PRODUCTS[0];

        mBinding.setProduct(mProduct);

        mBinding.setQuantity(1);

        mBinding.setIMainActivity((IMainActivity)this);

    }

    @Override
    public void inflateQunatityDialog() {
        ChooseQuantityDialog dialog= new ChooseQuantityDialog();
        dialog.show(getSupportFragmentManager(), "Choose Quantity");
    }

    @Override
    public void setQuantity(int quantity) {
        mBinding.setQuantity(quantity);

    }
}
