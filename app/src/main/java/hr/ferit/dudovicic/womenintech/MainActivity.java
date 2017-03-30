package hr.ferit.dudovicic.womenintech;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import static hr.ferit.dudovicic.womenintech.R.id.text;

public class MainActivity extends AppCompatActivity {

    InspiringPerson PrvaOsoba;
    InspiringPerson DrugaOsoba;
    InspiringPerson TrećaOsoba;


ImageButton imageButton1, imageButton2, imageButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PrvaOsoba = new InspiringPerson("Ada","Lovelace","10.12.1815","29.12.1852");
        DrugaOsoba = new InspiringPerson("Grace","Hopper","9.12.1906.","1.1.1992.");
        TrećaOsoba = new InspiringPerson("Barbara","Liskov","7.11.1939.","-");


        System.out.println("Ada Lovelace je rođena"+PrvaOsoba.getDatum_rođ());
        System.out.println("Grace Hopper je rođena"+PrvaOsoba.getDatum_rođ());


        addListenerOnButton();


        TextView describe2 = (TextView) findViewById(R.id.describe2);
        describe2.setMovementMethod(new ScrollingMovementMethod());

        TextView describe1 = (TextView) findViewById(R.id.describe1);
        describe1.setMovementMethod(new ScrollingMovementMethod());

        TextView describe3 = (TextView) findViewById(R.id.describe3);
        describe3.setMovementMethod(new ScrollingMovementMethod());

    }

    private void addListenerOnButton() {
        imageButton1 = (ImageButton) findViewById(R.id.image1);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,R.string.Toast2, Toast.LENGTH_LONG).show();
            }
        });

        imageButton2 = (ImageButton) findViewById(R.id.image2);
        imageButton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,R.string.Toast1, Toast.LENGTH_LONG).show();
            }
        });

        imageButton3 = (ImageButton) findViewById(R.id.image3);
        imageButton3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,R.string.Toast3, Toast.LENGTH_LONG).show();
            }

        });


    }
}
