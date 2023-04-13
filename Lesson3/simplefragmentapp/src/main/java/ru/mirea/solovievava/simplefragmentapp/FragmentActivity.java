package ru.mirea.solovievava.simplefragmentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

public class FragmentActivity extends AppCompatActivity {

    Fragment fragment1, fragment2;
    FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        fragment1 = new FirstFragment();
        fragment2 = new SecondFragment();
    }

    public void onClick(View view) {
        fragmentManager = getSupportFragmentManager();
        switch (view.getId()){
            case R.id.btnFirstFragment:

                fragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment1).commit();

                break;
            case R.id.btnSecondFragment:

                fragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment2).commit();

                break;
            default:
                break;
        }
    }
}