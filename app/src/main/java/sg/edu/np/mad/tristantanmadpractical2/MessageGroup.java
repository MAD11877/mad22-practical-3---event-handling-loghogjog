package sg.edu.np.mad.tristantanmadpractical2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;


import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MessageGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_group);

        Button button1 = (Button) findViewById(R.id.group1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new Group1Fragment());
            }
        });

        Button button2 = (Button) findViewById(R.id.group2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new Group2Fragment());
            }
        });
    }

    public void loadFragment(Fragment fragment){
        //Creating a Fragment Manager
        FragmentManager fm = getFragmentManager();
        //Creating a FragmentTransaction to begin transaction and replace fragment
        FragmentTransaction ft = fm.beginTransaction();
        //replace layout

        ft.replace(R.id.placeholder, fragment);
        ft.commit();
    }
}