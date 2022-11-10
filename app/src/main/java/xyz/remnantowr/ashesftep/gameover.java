package xyz.remnantowr.ashesftep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class gameover extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameover);
    }

    public void game(View view){
        Intent intent = new Intent(gameover.this, game.class);
        startActivity(intent);
    }
    public void ext(View view){
finish();
    }
}