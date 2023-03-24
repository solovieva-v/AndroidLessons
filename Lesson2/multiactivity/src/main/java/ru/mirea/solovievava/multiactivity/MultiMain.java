package ru.mirea.solovievava.multiactivity;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MultiMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MultiMain", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MultiMain", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MultiMain", "onResume");
    }
    public void onClickNewActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key", "MIREA - Шурчков Владислав Дмитриевич");
        startActivity(intent);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MultiMain", "OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MultiMain", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MultiMain", "OnDestroy");
    }
}