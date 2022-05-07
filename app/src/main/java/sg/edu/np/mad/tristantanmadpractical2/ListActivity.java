package sg.edu.np.mad.tristantanmadpractical2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ImageView middleImage = findViewById(R.id.middle_image);
        middleImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder ab = new AlertDialog.Builder(ListActivity.this);
                ab.setTitle("Profile");
                ab.setMessage("MADness");
                ab.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                ab.setPositiveButton("View", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        openMainActivity();


                    }
                });

                ab.show();
            }
        });
    }
    public void openMainActivity() {
        Intent intent = new Intent(ListActivity.this, MainActivity.class);
        Random rd = new Random();
        String textString = "MAD" + rd.nextInt();
        intent.putExtra("newText", textString);
        startActivity(intent);
    }
}