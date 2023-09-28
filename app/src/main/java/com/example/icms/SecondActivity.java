package com.example.icms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public Spinner Estados;
    public ImageView img;
    public TextView textView4, mostrador;
    public Double taxa, resultado;
    public Button calculador;
    public EditText produto;
    public String textonovo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Estados = findViewById(R.id.spinSO);
        img = findViewById(R.id.img);
        textView4 = findViewById(R.id.textView4);
        calculador = findViewById(R.id.button);
        produto = findViewById(R.id.editTextMercadoria);
        mostrador = findViewById(R.id.textView6);

        final String[] str ={"Selecionar", "Acre","Alagoas","Amazonas","Amapá","Bahia","Ceará","Espírito Santo","Goiás","Maranhão","Mato Grosso","Mato Grosso do Sul","Minas Gerais","Pará","Paraíba","Paraná","Pernambuco","Piauí","Rio de Janeiro","Rio Grande do Norte","Rio Grande do Sul","Rondônia","Roraima","Santa Catarina","São Paulo","Sergipe","Tocantins","Distrito Federal"};

        ArrayAdapter adapter = new ArrayAdapter(SecondActivity.this, android.R.layout.simple_dropdown_item_1line,str);
        Estados.setAdapter(adapter);

        Estados.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(str[0].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.brasil);
                    textonovo = "Não definido";
                    textView4.setText(textonovo);
                    taxa = 0.0;
                }
                else if(str[1].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.ac);
                    textonovo = "17%";
                    textView4.setText(textonovo);
                    taxa = 0.17;
                }
                else if(str[2].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.al);
                    textonovo = "17%";
                    textView4.setText(textonovo);
                    taxa = 0.17;
                }
                else if(str[3].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.am);
                    textonovo = "18%";
                    textView4.setText(textonovo);
                    taxa = 0.18;
                }
                else if(str[4].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.ap);
                    textonovo = "18%";
                    textView4.setText(textonovo);
                    taxa = 0.18;
                }
                else if(str[5].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.ba);
                    textonovo = "18%";
                    textView4.setText(textonovo);
                    taxa = 0.18;
                }
                else if(str[6].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.ce);
                    textonovo = "18%";
                    textView4.setText(textonovo);
                    taxa = 0.18;
                }
                else if(str[7].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.es);
                    textonovo = "17%";
                    textView4.setText(textonovo);
                    taxa = 0.17;
                }
                else if(str[8].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.go);
                    textonovo = "17%";
                    textView4.setText(textonovo);
                    taxa = 0.17;
                }
                else if(str[9].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.ma);
                    textonovo = "18%";
                    textView4.setText(textonovo);
                    taxa = 0.18;
                }
                else if(str[10].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.mt);
                    textonovo = "17%";
                    textView4.setText(textonovo);
                    taxa = 0.17;
                }
                else if(str[11].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.ms);
                    textonovo = "18%";
                    textView4.setText(textonovo);
                    taxa = 0.18;
                }
                else if(str[12].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.mg);
                    textonovo = "18%";
                    textView4.setText(textonovo);
                    taxa = 0.18;
                }
                else if(str[13].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.pa);
                    textonovo = "17%";
                    textView4.setText(textonovo);
                    taxa = 0.17;
                }
                else if(str[14].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.pb);
                    textonovo = "18%";
                    textView4.setText(textonovo);
                    taxa = 0.18;
                }
                else if(str[15].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.pr);
                    textonovo = "18%";
                    textView4.setText(textonovo);
                    taxa = 0.18;
                }
                else if(str[16].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.pe);
                    textonovo = "18%";
                    textView4.setText(textonovo);
                    taxa = 0.18;
                }
                else if(str[17].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.pi);
                    textonovo = "18%";
                    textView4.setText(textonovo);
                    taxa = 0.18;
                }
                else if(str[18].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.rj);
                    textonovo = "18%";
                    textView4.setText(textonovo);
                    taxa = 0.18;
                }
                else if(str[19].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.rn);
                    textonovo = "18%";
                    textView4.setText(textonovo);
                    taxa = 0.18;
                }
                else if(str[20].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.rs);
                    textonovo = "18%";
                    textView4.setText(textonovo);
                    taxa = 0.18;
                }
                else if(str[21].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.ro);
                    textonovo = "17.5%";
                    textView4.setText(textonovo);
                    taxa = 0.175;
                }
                else if(str[22].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.rr);
                    textonovo = "17%";
                    textView4.setText(textonovo);
                    taxa = 0.17;
                }
                else if(str[23].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.sc);
                    textonovo = "17%";
                    textView4.setText(textonovo);
                    taxa = 0.17;
                }
                else if(str[24].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.sp);
                    textonovo = "18%";
                    textView4.setText(textonovo);
                    taxa = 0.18;
                }
                else if(str[25].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.se);
                    textonovo = "18%";
                    textView4.setText(textonovo);
                    taxa = 0.18;
                }
                else if(str[26].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.to);
                    textonovo = "18%";
                    textView4.setText(textonovo);
                    taxa = 0.18;
                }
                else if(str[27].equals(Estados.getItemAtPosition(i).toString())){
                    img.setImageResource(R.drawable.df);
                    textonovo = "18%";
                    textView4.setText(textonovo);
                    taxa = 0.18;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        calculador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculo();
            }
        });

    }

    public void calculo(){
        double num1 = Double.parseDouble(produto.getText().toString());
        if(num1 != 0){
            resultado = num1+(taxa*num1);
            mostrador.setText("R$ " + resultado.toString());
        }
    }
}