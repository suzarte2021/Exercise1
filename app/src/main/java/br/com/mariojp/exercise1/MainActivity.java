package br.com.mariojp.exercise1;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void executar(View view) {
        EditText editText = findViewById(R.id.editNome);

        TextView textView = findViewById(R.id.labelMensagem);

        texto = editText.getText().toString();

        textView.setText("Alô, " + texto + "!");


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        TextView textView = findViewById(R.id.labelMensagem);
        outState.putString("Alô, Mundo!", textView.getText().toString());
        super.onSaveInstanceState(outState);


    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstaceState) {
        TextView textView = findViewById(R.id.labelMensagem);
        textView.setText(savedInstaceState.getString("Alô, Mundo!"));
        super.onRestoreInstanceState(savedInstaceState);
    }

}

