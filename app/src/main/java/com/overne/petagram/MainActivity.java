package com.overne.petagram;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.overne.petagram.adapter.PageAdapter;
import com.overne.petagram.fragments.PrefilFragment;
import com.overne.petagram.fragments.RecyclerViewFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.vievPager);
        ((TextView) findViewById(R.id.toolbar_title)).setText("Petagram");
        setupViewPager();
    }

    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments=new ArrayList<>();
        fragments.add(new RecyclerViewFragment());
        fragments.add(new PrefilFragment());
        return fragments;
    }

    private void  setupViewPager(){
             viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(),agregarFragments()));
             tabLayout.setupWithViewPager(viewPager);
             tabLayout.getTabAt(0).setIcon(R.drawable.caseta);
             tabLayout.getTabAt(1).setIcon(R.drawable.rostro_de_perro);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.about) {
            Intent intent = new Intent(MainActivity.this, About.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.contacto) {
            Intent intent = new Intent(MainActivity.this, Contacto.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void irDetalle(View v){
        Intent intent= new Intent(MainActivity.this,Detalle.class);
        startActivity(intent);

    }

}
