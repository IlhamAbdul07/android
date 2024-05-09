package com.ilham_abdul_hakim;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Home extends AppCompatActivity {
String menuList []={"Home", "User", "Menu","Buka Kamera"};
ListView listView;
private ImageView imageView;

private static final int ACTIVITY_REQUEST_CODE = 1000;
private static final int PERMISSION_REQUEST_CODE = 2000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);
        String username=getIntent().getStringExtra("username");
        if(username!=null){
            TextView usernameTextView=findViewById(R.id.tekshome);
//            usernameTextView.setText("Selamat Datang " + username);
        }
    listView= findViewById(R.id.list);
        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String> (this, R.layout.activity_home, R.id.tekshome, menuList);
    listView.setAdapter(arrayAdapter);
    TextView textlistmenu=findViewById(R.id.tekshome);
        };
    }
