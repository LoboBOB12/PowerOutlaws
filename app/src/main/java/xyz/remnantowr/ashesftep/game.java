package xyz.remnantowr.ashesftep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class game extends AppCompatActivity {
    private int mon = 0;
    private int left = 1;
    private int spin;
    private int a1 = 1;
    private int a2 = 1;
    private int a3 = 1;
    private int a4 = 1;
    private int a5 = 1;
    private int a6 = 1;
    private int a7 = 1;
    private int a8 = 1;
    private int a9 = 1;
    private int a10 = 1;

    private int way1 = 0;
    private int way2 =0;
    private int way3 =0;
    private int a11 = 1;
    private int tm = 8;
    private int cointer;
    private int timespin = 500000;
    private ImageView imagebg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        int[] images = {R.drawable.bg_circle1, R.drawable.bg_circle2, R.drawable.bg_circle3, R.drawable.bg_circle4, R.drawable.bg_circle5, R.drawable.bg_circle6, R.drawable.bg_circle7, R.drawable.bg_circle7, R.drawable.bg_circle8, R.drawable.bg_circle9, R.drawable.bg_circle10, R.drawable.bg_circle11, R.drawable.bg_circle12};
        spin = timespin;
        CountDownTimer waitTimer;
        waitTimer = new CountDownTimer(spin, 300) {
            ImageView imageView = findViewById(R.id.imageView4);






            ImageView imageView1 = findViewById(R.id.a1);
            ImageView imageView2 = findViewById(R.id.a2);
            ImageView imageView3 = findViewById(R.id.a3);
            ImageView imageView4 = findViewById(R.id.a4);
            ImageView imageView5 = findViewById(R.id.a5);
            ImageView imageView6 = findViewById(R.id.a6);
            ImageView imageView7 = findViewById(R.id.a7);
            ImageView imageView8 = findViewById(R.id.a8);
            ImageView imageView9 = findViewById(R.id.a9);
            ImageView imageView10 = findViewById(R.id.a10);
            ImageView imageView11 = findViewById(R.id.a11);


            ImageView tnt1 = findViewById(R.id.tnt1);
            ImageView tnt2 = findViewById(R.id.tnt2);
            ImageView tnt3 = findViewById(R.id.tnt3);
            ImageView tnt4 = findViewById(R.id.tnt4);
            ImageView tnt5 = findViewById(R.id.tnt5);
            ImageView tnt6 = findViewById(R.id.tnt7);
            ImageView tnt7 = findViewById(R.id.tnt8);


            public void onTick(long millisUntilFinished) {






                if (way1 == 1){
                    way1 = 2;
                    tnt2.setVisibility(View.VISIBLE);

                    tnt1.setVisibility(View.INVISIBLE);

                    tnt3.setVisibility(View.INVISIBLE);
                    tnt4.setVisibility(View.INVISIBLE);
                    tnt5.setVisibility(View.INVISIBLE);
                    tnt6.setVisibility(View.INVISIBLE);
                    tnt7.setVisibility(View.INVISIBLE);


                }

                if (way2 == 1){
                    way2 = 2;
                    tnt4.setVisibility(View.VISIBLE);
                    tnt1.setVisibility(View.INVISIBLE);
                    tnt2.setVisibility(View.INVISIBLE);
                    tnt3.setVisibility(View.INVISIBLE);

                    tnt5.setVisibility(View.INVISIBLE);
                    tnt6.setVisibility(View.INVISIBLE);
                    tnt7.setVisibility(View.INVISIBLE);
                }
                if (way3 == 1){
                    way3 = 2;
                    tnt6.setVisibility(View.VISIBLE);
                    tnt1.setVisibility(View.INVISIBLE);
                    tnt2.setVisibility(View.INVISIBLE);
                    tnt3.setVisibility(View.INVISIBLE);
                    tnt4.setVisibility(View.INVISIBLE);
                    tnt5.setVisibility(View.INVISIBLE);

                    tnt7.setVisibility(View.INVISIBLE);
                }


                Random tom = new Random();

                if (tm == 8 ) {
                    tm = (tom.nextInt(2));
                }

if (tm ==0){
    tnt1.setVisibility(View.VISIBLE);
    way1 = 1;
    tm =7;
}
                if (tm ==1){
                    tnt1.setVisibility(View.VISIBLE);

                    way2 = 1;
                    tm=7;
                }
                if (tm ==2){
                    tnt1.setVisibility(View.VISIBLE);
                    way3 = 1;
                    tm=7;
                }
                if (way1 == 2){
                    way1 = 0;
                    tm =8;
                    tnt3.setVisibility(View.VISIBLE);

                    tnt1.setVisibility(View.INVISIBLE);
                    tnt2.setVisibility(View.INVISIBLE);

                    tnt4.setVisibility(View.INVISIBLE);
                    tnt5.setVisibility(View.INVISIBLE);
                    tnt6.setVisibility(View.INVISIBLE);
                    tnt7.setVisibility(View.INVISIBLE);
                }
                if (way2 == 2){
                    way2 = 0;
                    tm =8;
                    tnt5.setVisibility(View.VISIBLE);


                    tnt1.setVisibility(View.INVISIBLE);
                    tnt2.setVisibility(View.INVISIBLE);
                    tnt3.setVisibility(View.INVISIBLE);
                    tnt4.setVisibility(View.INVISIBLE);

                    tnt6.setVisibility(View.INVISIBLE);
                    tnt7.setVisibility(View.INVISIBLE);
                }
                if (way3 == 2){
                    way3 = 0;
                    tm =8;
                    tnt7.setVisibility(View.VISIBLE);



                    tnt1.setVisibility(View.INVISIBLE);
                    tnt2.setVisibility(View.INVISIBLE);
                    tnt3.setVisibility(View.INVISIBLE);
                    tnt4.setVisibility(View.INVISIBLE);
                    tnt5.setVisibility(View.INVISIBLE);
                    tnt6.setVisibility(View.INVISIBLE);

                }


                if (mon == 1) {
                    imageView1.setVisibility(View.INVISIBLE);
                    cointer = cointer + a11;
                    a11 = 0;
                    ((TextView) findViewById(R.id.textView)).setText("" + cointer);
                }
                if (mon == 2) {
                    imageView2.setVisibility(View.INVISIBLE);
                    cointer = cointer + a1;
                    a1 = 0;
                    ((TextView) findViewById(R.id.textView)).setText("" + cointer);
                    if (way2 == 2){
                        finish();
                    }
                }
                if (mon == 3) {
                    imageView3.setVisibility(View.INVISIBLE);
                    cointer = cointer + a2;
                    a2 = 0;
                    ((TextView) findViewById(R.id.textView)).setText("" + cointer);
                }

                if (mon == 4) {
                    imageView4.setVisibility(View.INVISIBLE);
                    cointer = cointer + a3;
                    a3 = 0;
                    ((TextView) findViewById(R.id.textView)).setText("" + cointer);
                }
                if (mon == 5) {
                    imageView5.setVisibility(View.INVISIBLE);
                    cointer = cointer + a4;
                    a4 = 0;
                    ((TextView) findViewById(R.id.textView)).setText("" + cointer);
                    if (way3 == 2){
                        finish();
                    }
                }
                if (mon == 6) {
                    imageView6.setVisibility(View.INVISIBLE);
                    cointer = cointer + a5;
                    ((TextView) findViewById(R.id.textView)).setText("" + cointer);
                    a5 = 0;
                }

                if (mon == 7) {
                    imageView7.setVisibility(View.INVISIBLE);
                    cointer = cointer + a6;
                    a6 = 0;
                    ((TextView) findViewById(R.id.textView)).setText("" + cointer);
                }

                if (mon == 8) {
                    imageView8.setVisibility(View.INVISIBLE);
                    cointer = cointer + a7;
                    ((TextView) findViewById(R.id.textView)).setText("" + cointer);
                    a7 = 0;
                }
                if (mon == 9) {
                    imageView9.setVisibility(View.INVISIBLE);
                    cointer = cointer + a8;
                    ((TextView) findViewById(R.id.textView)).setText("" + cointer);
                    a8 = 0;
                }
                if (mon == 10) {
                    imageView10.setVisibility(View.INVISIBLE);
                    cointer = cointer + a9;
                    ((TextView) findViewById(R.id.textView)).setText("" + cointer);
                    a9 = 0;
                    if (way1 == 2){
                        finish();
                    }
                }

                if (mon == 11) {
                    imageView11.setVisibility(View.INVISIBLE);
                    cointer = cointer + a10;
                    ((TextView) findViewById(R.id.textView)).setText("" + cointer);
                    a10 = 0;
                }

                mon = mon + left;
                if (mon == 12) {
                    mon = 0;
                }
                if (mon == -1) {
                    mon = 11;
                }

                imageView.setImageResource(images[mon]);


                if (cointer == 11) {
                    game_over();
                    cancel();
                }
            }

            @Override
            public void onFinish() {
                game_over();
            }

        }.start();
    }


    public void left(View view) {
        if (left == 1) {
            left = -1;
        } else {
            left = 1;
        }
    }


    public void game_over() {
        Intent intent = new Intent(game.this, gameover.class);
        startActivity(intent);
    }
}





