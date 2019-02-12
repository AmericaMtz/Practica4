package mx.ipn.americamartinezandevelinecruz.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText correo, contrasenia;
    Button login;
    TextView ingreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        correo= (EditText) findViewById(R.id.email);
        contrasenia=(EditText)findViewById(R.id.password);
        login=(Button)findViewById(R.id.login);
        ingreso= (TextView)findViewById(R.id.mensaje);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String email=correo.getText().toString();
                final String password= contrasenia.getText().toString();
                if (email.equals("merimtz1@hotmail.com") && password.equals("12345")){
                    Intent intent = new Intent(MainActivity.this, MenuPrincipalActivity.class);
                    finish();
                    startActivity(intent);
                }
                else{
                    ingreso.setText("Usuario o contraseña incorrectos");
                }
            }
        });
    }
}
