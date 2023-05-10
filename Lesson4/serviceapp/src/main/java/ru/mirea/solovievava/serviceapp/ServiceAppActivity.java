package ru.mirea.solovievava.serviceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import static android.Manifest.permission.FOREGROUND_SERVICE;
import static android.Manifest.permission.POST_NOTIFICATIONS;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import android.view.View;

import ru.mirea.solovievava.serviceapp.databinding.ActivityServiceAppBinding;
public class ServiceAppActivity extends AppCompatActivity {
    ActivityServiceAppBinding binding;

    private int PermissionCode = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityServiceAppBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        if (ContextCompat.checkSelfPermission(this, POST_NOTIFICATIONS) == PackageManager.PERMISSION_GRANTED) {

            Log.d(ServiceAppActivity.class.getSimpleName().toString(), "Разрешения получены");
        } else {
            Log.d(ServiceAppActivity.class.getSimpleName().toString(), "Нет разрешений!");

            ActivityCompat.requestPermissions(this, new String[]{POST_NOTIFICATIONS, FOREGROUND_SERVICE}, PermissionCode);

        }
        binding.btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent serviceIntent = new Intent(ServiceAppActivity.this, PlayerService.class);
                ContextCompat.startForegroundService(ServiceAppActivity.this, serviceIntent);
            }
        });
        binding.btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(
                        new Intent(ServiceAppActivity.this, PlayerService.class));
            }
        });
    }
}