package com.example.jurara.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Resultados extends AppCompatActivity {
    Bundle b ;

    TextView txt;

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
            String indicadorramcel="",indicadorprocesadorcel="",indicadordiscodurocel="",indicadorgraficoscel="",datos="";
            String so="";
            int indicador=0;
            indicador=b.getInt("indicador");
            indicadorramcel = b.getString("indicadorrama");
            indicadorprocesadorcel = b.getString("indicadorprocesadora");
            indicadordiscodurocel = b.getString("indicadordiscoduroa");
            indicadorgraficoscel = b.getString("indicadorgraficosa");
            so = b.getString("soa");
            datos=b.getString("datos");

            if(indicador==1){
                txt.setText("Usted Necesita un Celular con:\n\n⚫"+indicadorramcel+" mb de memoria ram \n\n⚫ "+indicadordiscodurocel+" mb de almacenamiento\n\n"+"⚫ Con sistema operativo\n"+so+" \n\n⚫ Datos a conciderar: \n"+datos);
            }
            if(indicador==2){
                txt.setText("Usted Necesita una Computadora con:\n\n⚫"+indicadorramcel+" mb de memoria ram \n\n⚫ "+indicadordiscodurocel+" mb de almacenamiento (solo para programas)\n\n"+"⚫ Con sistema operativo "+so+" \n\n⚫ Con un procesador que corra a: \n"+indicadorprocesadorcel+" GHz\n\n⚫ Con una targeta grafica que corra un directx: \n"+indicadorgraficoscel+" \n\n⚫ Datos a conciderar: \n"+datos);
            }

        }


    }
}
