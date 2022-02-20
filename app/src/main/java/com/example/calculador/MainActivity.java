package com.example.calculador;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultado, total;

    Button cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, punto, dividir, restar, sumar, multiplicar, porcentaje, potencia, raiz, sen, cos, tan;
    String proceso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Inicial();

    }

    public void Inicial(){
        resultado = findViewById(R.id.process);
        total = findViewById(R.id.result);

        cero = findViewById(R.id.cero);
        uno = findViewById(R.id.uno);
        dos = findViewById(R.id.dos);
        tres = findViewById(R.id.tres);
        cuatro = findViewById(R.id.cuatro);
        cinco = findViewById(R.id.cinco);
        seis = findViewById(R.id.seis);
        siete = findViewById(R.id.siete);
        ocho = findViewById(R.id.ocho);
        nueve = findViewById(R.id.nueve);


        sumar = findViewById(R.id.suma);
        multiplicar = findViewById(R.id.multiplicar);
        restar = findViewById(R.id.restar);
        potencia = findViewById(R.id.potencia);
        dividir = findViewById(R.id.dividir);
        punto = findViewById(R.id.punto);
        porcentaje = findViewById(R.id.porcentaje);
        raiz = findViewById(R.id.raiz);
        sen = findViewById(R.id.sen);
        cos = findViewById(R.id.cos);
        tan = findViewById(R.id.tan);

        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + "0");
            }
        });

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + "1");
            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + "2");
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + "3");
            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + "4");
            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + "5");
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + "6");
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + "7");
            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + "8");
            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + "9");
            }
        });


        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + " + ");
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + " x ");
            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + " / ");
            }
        });

        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + " - ");
            }
        });

        porcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + " % ");
            }
        });

        potencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + " ^ ");
            }
        });

        raiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + " √ ");
            }
        });

        sen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + " sen ");
            }
        });

        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + " cos ");
            }
        });

        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + " tan ");
            }
        });

        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proceso = resultado.getText().toString();
                resultado.setText(proceso + ".");
            }
        });

    }

    public void igual(View view) {
        proceso = resultado.getText().toString();
        String[] oper = proceso.split(" ");
        switch (oper[1]) {
            case "+":
                sumOperator();
                break;
            case "-":
                resOperator();
                break;
            case "x":
                mulOperator();
                break;
            case "/":
                divOperator();
                break;
            case "%":
                modOperator();
                break;
            case "^":
                potOperator();
                break;
            case "√":
                raizOperator();
                break;
            case "sen":
                senOperator();
                break;
            case "cos":
                cosOperator();
                break;
            case "tan":
                tanOperator();
                break;
            default:
                total.setText("0");
        }
    }

    public void sumOperator() {
        proceso = resultado.getText().toString();
        String[] oper = proceso.split(" ");
        int num1 = Integer.parseInt(oper[0]);
        int num2 = Integer.parseInt(oper[2]);
        int operSum = num1 + num2;
        String resultSum = String.valueOf(operSum);
        total.setText(resultSum);
    }
    public void resOperator() {
        proceso = resultado.getText().toString();
        String[] oper = proceso.split(" ");
        int num1 = Integer.parseInt(oper[0]);
        int num2 = Integer.parseInt(oper[2]);
        int operRes = num1 - num2;
        String resultRes = String.valueOf(operRes);
        total.setText(resultRes);
    }

    public void mulOperator() {
        proceso = resultado.getText().toString();
        String[] oper = proceso.split(" ");
        int num1 = Integer.parseInt(oper[0]);
        int num2 = Integer.parseInt(oper[2]);
        int operMul = num1 * num2;
        String resultMul = String.valueOf(operMul);
        total.setText(resultMul);
    }

    public void divOperator() {
        proceso = resultado.getText().toString();
        String[] oper = proceso.split(" ");
        int num1 = Integer.parseInt(oper[0]);
        int num2 = Integer.parseInt(oper[2]);
        int operDiv = num1 / num2;
        String resultDiv = String.valueOf(operDiv);
        total.setText(resultDiv);
    }

    public void modOperator() {
        proceso = resultado.getText().toString();
        String[] oper = proceso.split(" ");
        int num1 = Integer.parseInt(oper[0]);
        int num2 = Integer.parseInt(oper[2]);
        int operMod = num1 % num2;
        String resultMod = String.valueOf(operMod);
        total.setText(resultMod);
    }

    public void potOperator() {
        proceso = resultado.getText().toString();
        String[] oper = proceso.split(" ");
        int num1 = Integer.parseInt(oper[0]);
        int num2 = Integer.parseInt(oper[2]);
        double operPot = Math.pow(num1, num2);
        String resultPot = String.valueOf(operPot);
        total.setText(resultPot);
    }

    public void raizOperator() {
        proceso = resultado.getText().toString();
        String[] oper = proceso.split(" ");
        int num1 = Integer.parseInt(oper[2]);
        double operRaiz = Math.sqrt(num1);
        String resultRaiz = String.valueOf(operRaiz);
        total.setText(resultRaiz);
    }

    public void senOperator() {
        proceso = resultado.getText().toString();
        String[] oper = proceso.split(" ");
        double num1 = Integer.parseInt(oper[2]);
        double numRadianes = Math.toRadians(num1);
        double operSen = Math.sin(numRadianes);
        String resultSen = String.valueOf(operSen);
        total.setText(resultSen);
    }

    public void cosOperator() {
        proceso = resultado.getText().toString();
        String[] oper = proceso.split(" ");
        double num1 = Integer.parseInt(oper[2]);
        double numRadianes = Math.toRadians(num1);
        double operCos = Math.cos(numRadianes);
        String resultCos = String.valueOf(operCos);
        total.setText(resultCos);
    }

    public void tanOperator() {
        proceso = resultado.getText().toString();
        String[] oper = proceso.split(" ");
        double num1 = Integer.parseInt(oper[2]);
        double numRadianes = Math.toRadians(num1);
        double operTan = Math.tan(numRadianes);
        String resultTan = String.valueOf(operTan);
        total.setText(resultTan);
    }

    public void clear(View view) {
        resultado.setText("");
        total.setText("");
    }

    public void borrar(View view) {
        String string = resultado.getText().toString();
        if (string.length() >= 1){
            string = string.substring(0, string.length() - 1);
            resultado.setText(string);
        }else if (string.length() <1){
            resultado.setText("");
        }
    }
}
