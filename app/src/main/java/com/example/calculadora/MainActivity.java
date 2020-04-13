package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText txtResultado;
    Button N0, N1, N2, N3, N4, N5, N6, N7, N8, N9, N000, PUNTO, SUM, RES, MUL, DIV, IGUAL, CE, C, INVERS;
    String memoria1;
    String signo;
    String memoria2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResultado = (EditText) findViewById(R.id.editText);
        N0 = findViewById(R.id.button_n0);
        N1 = findViewById(R.id.button_n1);
        N2 = findViewById(R.id.button_n2);
        N3 = findViewById(R.id.button_n3);
        N4 = findViewById(R.id.button_n4);
        N5 = findViewById(R.id.button_n5);
        N6 = findViewById(R.id.button_n6);
        N7 = findViewById(R.id.button_n7);
        N8 = findViewById(R.id.button_n8);
        N9 = findViewById(R.id.button_n9);
        N000 = findViewById(R.id.button_n000);
        PUNTO = findViewById(R.id.button_punto);
        SUM = findViewById(R.id.button_suma);
        RES = findViewById(R.id.button_resta);
        MUL = findViewById(R.id.button_multiplicar);
        DIV = findViewById(R.id.button_dividir);
        IGUAL = findViewById(R.id.button_igual);
        CE = findViewById(R.id.button_ce);
        C = findViewById(R.id.button_c);
        INVERS = findViewById(R.id.button_inver);

        N0.setOnClickListener(this);
        N1.setOnClickListener(this);
        N2.setOnClickListener(this);
        N3.setOnClickListener(this);
        N4.setOnClickListener(this);
        N5.setOnClickListener(this);
        N6.setOnClickListener(this);
        N7.setOnClickListener(this);
        N8.setOnClickListener(this);
        N9.setOnClickListener(this);
        N000.setOnClickListener(this);
        PUNTO.setOnClickListener(this);
        SUM.setOnClickListener(this);
        RES.setOnClickListener(this);
        MUL.setOnClickListener(this);
        DIV.setOnClickListener(this);
        IGUAL.setOnClickListener(this);
        CE.setOnClickListener(this);
        C.setOnClickListener(this);
        INVERS.setOnClickListener(this);

        txtResultado.setSelection(txtResultado.getText().length());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_n0:
                txtResultado.setText(txtResultado.getText()+"0");
                txtResultado.setSelection(txtResultado.getText().length());
                break;
            case R.id.button_n1:
                txtResultado.setText(txtResultado.getText()+"1");
                txtResultado.setSelection(txtResultado.getText().length());
                break;
            case R.id.button_n2:
                txtResultado.setText(txtResultado.getText()+"2");
                txtResultado.setSelection(txtResultado.getText().length());
                break;
            case R.id.button_n3:
                txtResultado.setText(txtResultado.getText()+"3");
                txtResultado.setSelection(txtResultado.getText().length());
                break;
            case R.id.button_n4:
                txtResultado.setText(txtResultado.getText()+"4");
                txtResultado.setSelection(txtResultado.getText().length());
                break;
            case R.id.button_n5:
                txtResultado.setText(txtResultado.getText()+"5");
                txtResultado.setSelection(txtResultado.getText().length());
                break;
            case R.id.button_n6:
                txtResultado.setText(txtResultado.getText()+"6");
                txtResultado.setSelection(txtResultado.getText().length());
                break;
            case R.id.button_n7:
                txtResultado.setText(txtResultado.getText()+"7");
                txtResultado.setSelection(txtResultado.getText().length());
                break;
            case R.id.button_n8:
                txtResultado.setText(txtResultado.getText()+"8");
                txtResultado.setSelection(txtResultado.getText().length());
                break;
            case R.id.button_n9:
                txtResultado.setText(txtResultado.getText()+"9");
                txtResultado.setSelection(txtResultado.getText().length());
                break;
            case R.id.button_n000:
                txtResultado.setText(txtResultado.getText()+"000");
                txtResultado.setSelection(txtResultado.getText().length());
                break;
            case R.id.button_punto:
                txtResultado.setText(txtResultado.getText()+".");
                txtResultado.setSelection(txtResultado.getText().length());
                break;
            case R.id.button_suma:
                if (!txtResultado.getText().equals("")) {
                    memoria1 = txtResultado.getText().toString();
                    signo="+";
                    txtResultado.setText("");
                }
                txtResultado.setSelection(txtResultado.getText().length());
                break;
            case R.id.button_resta:
                if (!txtResultado.getText().equals("")) {
                    memoria1=txtResultado.getText().toString();
                    signo="-";
                    txtResultado.setText("");
                }
                txtResultado.setSelection(txtResultado.getText().length());
                break;
            case R.id.button_multiplicar:
                if (!txtResultado.getText().equals("")) {
                    memoria1=txtResultado.getText().toString();
                    signo="*";
                    txtResultado.setText("");
                }
                txtResultado.setSelection(txtResultado.getText().length());
                break;
            case R.id.button_dividir:
                if (!txtResultado.getText().equals("")) {
                    memoria1=txtResultado.getText().toString();
                    signo="/";
                    txtResultado.setText("");
                }
                txtResultado.setSelection(txtResultado.getText().length());
                break;
            case R.id.button_igual:
                String resultado;
                memoria2=txtResultado.getText().toString();
                if (!memoria2.equals("")) {
                    resultado=calculadora(memoria1,memoria2,signo);
                    txtResultado.setText(resultado);
                }
                txtResultado.setSelection(txtResultado.getText().length());
                break;
            case R.id.button_ce:
                String cadena;
                cadena = txtResultado.getText().toString();
                if (cadena.length()>0) {
                    cadena=cadena.substring(0, cadena.length()-1);
                    txtResultado.setText(cadena);
                    txtResultado.setSelection(txtResultado.getText().length());
                }
                break;
            case R.id.button_c:
                memoria1 = "";
                memoria2 = "";
                signo = "";
                txtResultado.setText("");
                break;
            case R.id.button_inver:
                String cadena2;
                Double num;
                cadena2=txtResultado.getText().toString();
                if (cadena2.length()>0) {
                    num = 1 / (Double.parseDouble(cadena2));
                    txtResultado.setText(num.toString());
                }
                break;
        }
    }

    public static String calculadora(String memoria1,String memoria2,String signo){
        Double resultado=0.0;
        String respuesta;

        if (signo.equals("-")) {
            resultado=Double.parseDouble(memoria1)-Double.parseDouble(memoria2);

        }
        if (signo.equals("+")) {
            resultado=Double.parseDouble(memoria1)+Double.parseDouble(memoria2);

        }
        if (signo.equals("*")) {
            resultado=Double.parseDouble(memoria1)*Double.parseDouble(memoria2);

        }
        if (signo.equals("/")) {
            resultado=Double.parseDouble(memoria1)/Double.parseDouble(memoria2);

        }

        respuesta=resultado.toString();
        return respuesta;
    }
}
