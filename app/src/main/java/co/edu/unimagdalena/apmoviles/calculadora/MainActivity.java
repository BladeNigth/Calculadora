package co.edu.unimagdalena.apmoviles.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bmas,bmenos,bpor,bdiv,bigual,bsqrt,bc,binv;
    EditText dato;
    Boolean operador = false;
    long acum = 0;
    String op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = findViewById(R.id.btn0);
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);
        bmas = findViewById(R.id.btnmas);
        bmenos = findViewById(R.id.btnmenos);
        bpor = findViewById(R.id.btnpor);
        bdiv = findViewById(R.id.btndiv);
        bigual = findViewById(R.id.btnigual);
        bsqrt = findViewById(R.id.btnsqrt);
        bc = findViewById(R.id.btnc);
        binv = findViewById(R.id.btninv);
        dato = findViewById(R.id.editDato);
        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        bmas.setOnClickListener(this);
        bmenos.setOnClickListener(this);
        bpor.setOnClickListener(this);
        bdiv.setOnClickListener(this);
        bigual.setOnClickListener(this);
        bsqrt.setOnClickListener(this);
        bc.setOnClickListener(this);
        binv.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String valor;
        long num = 0;
        if(!TextUtils.isEmpty(dato.getText().toString())){
            num  = Integer.parseInt(dato.getText().toString());
            valor = dato.getText().toString();
        }else{
            valor = "";
        }
        switch (v.getId()) {
            case R.id.btn0:
                if (num != 0) {
                    valor = valor + "0";
                    dato.setText(valor);
                }

                break;
            case R.id.btn1:
                valor = valor + "1";
                dato.setText(valor);
                break;
            case R.id.btn2:
                valor = valor + "2";
                dato.setText(valor);
                break;
            case R.id.btn3:
                valor = valor + "3";
                dato.setText(valor);
                break;
            case R.id.btn4:
                valor = valor + "4";
                dato.setText(valor);
                break;
            case R.id.btn5:
                valor = valor + "5";
                dato.setText(valor);
                break;
            case R.id.btn6:
                valor = valor + "6";
                dato.setText(valor);
                break;
            case R.id.btn7:
                valor = valor + "7";
                dato.setText(valor);
                break;
            case R.id.btn8:
                valor = valor + "8";
                dato.setText(valor);
                break;
            case R.id.btn9:
                valor = valor + "9";
                dato.setText(valor);
                break;
            case R.id.btnmas:
                if(!operador){
                    acum = Integer.parseInt(dato.getText().toString());
                    dato.setText("");
                    operador = true;
                    op = "+";
                }
                break;
            case R.id.btnigual:

                if(op.equals("+")){
                    dato.setText(acum + Integer.parseInt(dato.getText().toString()) + "");
                    operador = false;
                }else if(op.equals("-")){
                    dato.setText(acum - Integer.parseInt(dato.getText().toString()) + "");
                    operador = false;
                }

                break;
        }
    }
}