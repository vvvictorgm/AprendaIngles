package com.barbaburguer.aprendaingles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.barbaburguer.aprendaingles.Fragments.BichoFragment;
import com.barbaburguer.aprendaingles.Fragments.NumerosFragment;
import com.barbaburguer.aprendaingles.Fragments.VogaisFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {
private ViewPager viewPager;
private SmartTabLayout smartTabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        smartTabLayout = findViewById(R.id.smartTabLayout);
        getSupportActionBar().setElevation(0);



        FragmentPagerAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                    .add("Bicho", BichoFragment.class)
                    .add("Vogais", VogaisFragment.class)
                    .add("Numeros", NumerosFragment.class)
                .create()
        );
        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager(viewPager);


    }
}
