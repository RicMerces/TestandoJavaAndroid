package br.com.mariojp.exercise1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editName;
    private TextView textView;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = (EditText) findViewById(R.id.editNome);
        textView = (TextView) findViewById(R.id.labelMensagem);
        btn = (Button) findViewById(R.id.btnCumprimentar);
        Log.d("Exercicio01", "Exercicio01 onCreate");

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String texto = editName.getText().toString();
                Log.d("Exercicio01", "Exercicio01 click Button!");

                Toast.makeText(MainActivity.this, "Bem Vindo " + texto, Toast.LENGTH_LONG).show();
            }
        });

    }


    public void alterarTexto(View view){
        String texto = editName.getText().toString();
        System.out.println(texto);
        textView.setText("Alô, " + texto + "!");

    }


}