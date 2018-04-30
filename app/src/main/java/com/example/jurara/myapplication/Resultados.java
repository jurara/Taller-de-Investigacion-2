package com.example.jurara.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Resultados extends AppCompatActivity {
    Bundle b ;
    String indicadorramcel="",indicadorprocesadorcel="",indicadordiscodurocel="",indicadorgraficoscel="",datos="";
    String so="";
    TextView txt;
    int indicador=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        txt=(TextView)findViewById(R.id.res);
        b= new Bundle();
        b = getIntent().getExtras();
        if(b==null){
            Toast.makeText(getApplicationContext(),"datos vacios",Toast.LENGTH_SHORT).show();
        }else {
            indicador=b.getInt("indicador");
            indicadorramcel = b.getString("indicadorrama");
            indicadorprocesadorcel = b.getString("indicadorprocesadora");
            indicadordiscodurocel = b.getString("indicadordiscoduroa");
            indicadorgraficoscel = b.getString("indicadorgraficosa");
            so = b.getString("soa");
            datos=b.getString("datos");

        }
        if(indicador==1){
            txt.setText("Usted Necesita un Celular con:\n"+indicadorramcel+" mb de memoria ram \n"+indicadordiscodurocel+" mb de almacenamiento\n"+"con sistema operatibo "+so+" \ndatos a conciderar: "+datos);
        }

    }
}
