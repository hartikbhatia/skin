package com.example.hp.skin2;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

     CardView cardMelanoma;
    CardView cardBasal;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

   fab=(FloatingActionButton)findViewById(R.id.fab);

   fab.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Intent i=new Intent(Main2Activity.this,camera.class);
           startActivity(i);
       }
   });
       final ImageView imageMelanoma=(ImageView)findViewById(R.id.imageMelanoma);
        cardMelanoma=(CardView)findViewById(R.id.cardMelanoma);
        cardMelanoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main2Activity.this,melanoma.class);
                ActivityOptionsCompat options=ActivityOptionsCompat.makeSceneTransitionAnimation(Main2Activity.this,imageMelanoma,ViewCompat.getTransitionName(imageMelanoma));
                startActivity(i,options.toBundle());
            }
        });

        final ImageView imageBasal=(ImageView)findViewById(R.id.imageBasal);
        cardBasal=(CardView)findViewById(R.id.cardBasal);
        cardBasal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(Main2Activity.this,basalCell.class);
                ActivityOptionsCompat option=ActivityOptionsCompat.makeSceneTransitionAnimation(Main2Activity.this,imageBasal,"abc");
                startActivity(j,option.toBundle());
            }
        });
        final ImageView imageSquamous=(ImageView)findViewById(R.id.imageSquamous);
        cardBasal=(CardView)findViewById(R.id.cardSquamous);
        cardBasal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(Main2Activity.this,SquamousCell.class);
                ActivityOptionsCompat option=ActivityOptionsCompat.makeSceneTransitionAnimation(Main2Activity.this,imageSquamous,"pqr");
                startActivity(j,option.toBundle());
            }
        });
        final ImageView imageMerkel=(ImageView)findViewById(R.id.imageMerkel);
        cardBasal=(CardView)findViewById(R.id.cardMerkel);
        cardBasal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(Main2Activity.this,Merkel.class);
                ActivityOptionsCompat option=ActivityOptionsCompat.makeSceneTransitionAnimation(Main2Activity.this,imageMerkel,"cda");
                startActivity(j,option.toBundle());
            }
        });

    }
}
