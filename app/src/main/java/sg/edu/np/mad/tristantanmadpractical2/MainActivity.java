package sg.edu.np.mad.tristantanmadpractical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User u = new User();
        TextView name = findViewById(R.id.username);
        name.setText(u.name);

        TextView desc = findViewById(R.id.description);
        desc.setText(u.description);

        TextView f = findViewById(R.id.follow);
        if(!u.followed){
            f.setText("Follow");
            u.followed = true;
        }
        else{
            f.setText("Followed");
            u.followed = false;
        }

        //OnCLick for Follow button
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!u.followed){
                    f.setText("Follow");
                    u.followed = true;
                    Toast.makeText(getApplicationContext(),"Unfollowed", Toast.LENGTH_SHORT).show();
                }
                else{
                    f.setText("Followed");
                    u.followed = false;
                    Toast.makeText(getApplicationContext(),"Followed", Toast.LENGTH_SHORT).show();

                }

            }
        });

        //Appending random number
        Intent i = getIntent();

        String message = i.getStringExtra("newText");
        name.setText(message);

        //OnClick for Message button
        Button msgButton = findViewById(R.id.message);
        msgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToMessage = new Intent(MainActivity.this, MessageGroup.class);
                startActivity(goToMessage);
            }
        });

    }



}