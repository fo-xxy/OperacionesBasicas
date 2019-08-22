package com.example.operacionesbasias;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
/*1: se importa una libreria que son los campos de texto*/
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    /*2: se crean los atributos de la app*/
    private EditText numero1;
    private EditText numero2;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*3: Asignar los campos del diseño a las variables de esta clase*/
        numero1 = (EditText)findViewById(R.id.etnumero1);
        numero2 = (EditText)findViewById(R.id.etnumero2);
        resultado = (TextView)findViewById(R.id.lblresultado);
    }

    /*4: se crean los metodos, en este caso es el de sumar, es obligatorio darle una clase de tipo View y se crea un objeto alt + enter RECORDARRRR no olvidar*/
    public void sumar(View view){
        /*5: se pasan loa datos*/
        double num1 = Double.parseDouble(numero1.getText().toString());
        double num2 = Double.parseDouble(numero2.getText().toString());

        /*6: se manda el resultado al label, en este caso se hace la suma */
        resultado.setVisibility(view.VISIBLE);
        resultado.setText(String.valueOf(num1 + num2));
    }

    /*7: nos vamos para el diseño y le pones el nombre del boton en onclick*/

    /*8: se crea el otro metodo, en este caso el de resta, no olvidar el parametro*/
    public void restar(View view){
        double num1 = Double.parseDouble(numero1.getText().toString());
        double num2 = Double.parseDouble(numero2.getText().toString());

        resultado.setVisibility(View.VISIBLE);
        resultado.setText(String.valueOf(num1 - num2));
    }

    /*9: se va al diseño y le pones el nombre del boton en onclick*/

    /*10: se crea el otro metodo, en este caso multiplicacion, no olvidar el parametro*/
    public void multiplicar(View view){
        double num1 = Double.parseDouble(numero1.getText().toString());
        double num2 = Double.parseDouble(numero2.getText().toString());

        resultado.setVisibility(View.VISIBLE);
        resultado.setText(String.valueOf(num1 * num2));
    }
    /*11: se va al diseño y le pones el nombre del boton en onclick*/

    /*12: se crea el otro metodo, en este caso division, no olvidar el parametro para que reconozca la propiedad oclick*/
    public void division(View view){
        double num1 = Double.parseDouble(numero1.getText().toString());
        double num2 = Double.parseDouble(numero2.getText().toString());

        resultado.setVisibility(View.VISIBLE);
        resultado.setText(String.valueOf(num1 / num2));
    }
    /*14: se va al diseño y le pones el nombre del boton en onclick*/

}
