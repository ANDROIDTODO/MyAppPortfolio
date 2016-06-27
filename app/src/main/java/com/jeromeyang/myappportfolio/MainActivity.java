package com.jeromeyang.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initClickListener();
    }

    private void initClickListener() {
        try{
            findViewById(R.id.popular_movies).setOnClickListener(this);
            findViewById(R.id.bigger).setOnClickListener(this);
            findViewById(R.id.capstone).setOnClickListener(this);
            findViewById(R.id.material).setOnClickListener(this);
            findViewById(R.id.stock_hawk).setOnClickListener(this);
            findViewById(R.id.ubiquitous).setOnClickListener(this);
        }catch (NullPointerException e){}
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.popular_movies:
                toast(getResources().getString(R.string.main_popular_movies));
                break;
            case R.id.stock_hawk:
                toast(getResources().getString(R.string.main_stock_hawk));
                break;
            case R.id.bigger:
                toast(getResources().getString(R.string.main_bulid_it_bigger));
                break;
            case R.id.material:
                toast(getResources().getString(R.string.main_make_your_app_material));
                break;
            case R.id.ubiquitous:
                toast(getResources().getString(R.string.main_go_ubiquitous));
                break;
            case R.id.capstone:
                toast(getResources().getString(R.string.main_capstone));
                break;
        }
    }

    /**
     * show toast
     * @param str
     */
    private void toast(String str){
        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();
    }

}
