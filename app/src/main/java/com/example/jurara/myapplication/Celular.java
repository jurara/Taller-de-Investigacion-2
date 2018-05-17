package com.example.jurara.myapplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Vector;


public class Celular extends Fragment {
    int c=0,indicadorpar=0;
    CheckBox wolf,photomat,carrera,facebook,messenger,whatsapp,instagram,snapchat,officesuite,boomerang,aviary,afterlight,snapseed,poweramp,predeterminado,desmos,geogebra,mathally;
    AutoCompleteTextView so;




    private static final String[] COUNTRIES = new String[] {
            "Android 4.0.x",
            "Android 4.1.x",
            "Android 4.4.x",
            "Android 5.x.x",
            "Android 6.x.x",
            "Android 7.x.x",
            "Android 8.x.x",
            "Ios"
    };
    Button btn;
    float sumaalmacen=0;
    String indicadorram="",indicadorprocesador="",indicadordiscoduro="",indicadorgraficos="";
    String so2="";
    public Celular() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v=inflater.inflate(R.layout.fragment_celular, container, false);
        btn=v.findViewById(R.id.generarcel);


        facebook=v.findViewById(R.id.facebook);
        messenger=v.findViewById(R.id.messenger);
        whatsapp=v.findViewById(R.id.whatsapp);
        instagram=v.findViewById(R.id.instagram);
        snapchat=v.findViewById(R.id.snapchat);
        officesuite=v.findViewById(R.id.officesuite);
        boomerang=v.findViewById(R.id.boomerang);
        aviary=v.findViewById(R.id.aviary);
        afterlight=v.findViewById(R.id.afterlight);
        snapseed=v.findViewById(R.id.snapseed);
        poweramp=v.findViewById(R.id.poweramp);
        predeterminado=v.findViewById(R.id.predeterminado);
        desmos=v.findViewById(R.id.desmos);
        geogebra=v.findViewById(R.id.geogebra);
        mathally=v.findViewById(R.id.mathally);
        carrera=v.findViewById(R.id.carrera);
        so=v.findViewById(R.id.so);
        wolf=v.findViewById(R.id.wolf);
        photomat=v.findViewById(R.id.photomat);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_dropdown_item_1line, COUNTRIES);

        so.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal();


            }
        });

        return v;
    }

    public void cal(){
        //el almacen es el necesario para cada app
        //la ram es dato simulado y se agrega con v.add(valor de la ram);
        //falta ver datos acerca del procesador de un celular
        //
        String datos="";
        Vector v=new Vector();
        Vector vecpro=new Vector();


        float resultadoram=0;

        if(facebook.isChecked()){
            sumaalmacen+=72.73;
            v.add(127);
            vecpro.add(1);
        }
        if(messenger.isChecked()){
            sumaalmacen+=69;
            v.add(40);
            vecpro.add(1);
        }
        if(whatsapp.isChecked()){
            sumaalmacen+=26.7;
            v.add(39);
            vecpro.add(1);
        }
        if(instagram.isChecked()){
            sumaalmacen+=18.99;
            v.add(14);
            vecpro.add(1);
        }
        if(snapchat.isChecked()){
            sumaalmacen+=71.99;
            v.add(3.7);
            vecpro.add(1);
        }
        if(officesuite.isChecked()){
            sumaalmacen+=38;
            v.add(10);
            vecpro.add(1);
        }
        if(boomerang.isChecked()){
            sumaalmacen+=8.59;
            v.add(10);
            vecpro.add(1);
        }
        if(aviary.isChecked()){
            sumaalmacen+=22;
            v.add(1.2);
            vecpro.add(1);
        }
        if(afterlight.isChecked()){
            sumaalmacen+=35;
            v.add(10);
            vecpro.add(1);
        }
        if(snapseed.isChecked()){
            sumaalmacen+=27.78;
            v.add(10);
            vecpro.add(1);
        }
        if(poweramp.isChecked()){
            sumaalmacen+=6.3;
            v.add(10);
            vecpro.add(1);
        }
        if(predeterminado.isChecked()){
            sumaalmacen+=0;
            v.add(10);
            vecpro.add(1);
        }
        if(desmos.isChecked()){
            sumaalmacen+=2.23;
            v.add(10);
            vecpro.add(1);
        }
        if(geogebra.isChecked()){
            sumaalmacen+=19.06;
            v.add(1.6);
            vecpro.add(1);
        }
        if(mathally.isChecked()){
            sumaalmacen+=4.36;
            v.add(10);
            vecpro.add(1);
        }

        if(photomat.isChecked()){
            sumaalmacen+=11.66;
            v.add(1.3);
            vecpro.add(1);
        }

        if(wolf.isChecked()){
            sumaalmacen+=26;
            v.add(10);
            vecpro.add(1);
        }

        if(carrera.isChecked()){
            datos+="Usted necesita un celular de preferencia con Android puesto que en su carrera hay una materia en la cual programan para android";
        }

        so2=so.getText().toString();
        switch (so2){
            case "Android 6.x.x":
                v.add(773);
                break;
            case "Android 4.0.x":
                v.add(773);
                break;
            case "Android 4.1.x":
                v.add(773);
                break;
            case "Android 4.4.x":
                v.add(773);
                break;
            case "Android 5.x.x":
                v.add(773);
                break;
            case "Android 7.x.x":
                v.add(773);
                break;
            case "Android 8.x.x":
                v.add(773);
                break;

            case "IOS":
                v.add(773);
                datos+="\nPuede que muchas de las app que selecciono no se encuentren en IOS";
                break;

        }



        float temp=0;
        float temp2=0;
        float resultado=0;
        for(int i=0;i<v.size();i++){
            for(int j=0;j<v.size();j++){
                if(Float.parseFloat(v.get(i)+"")>=Float.parseFloat(v.get(j)+"")){
                    temp=Float.parseFloat(v.get(i)+"");
                  v.setElementAt(Float.parseFloat(v.get(j)+""),i);
                  v.setElementAt(temp,j);
                }
            }
        }

        for(int i=0;i<v.size();i++){
            resultado+=(float)v.get(i);
        }


        for(int i=0;i<vecpro.size();i++){
            for(int j=0;j<vecpro.size();j++){
                if(Float.parseFloat(vecpro.get(i)+"")>=Float.parseFloat(vecpro.get(j)+"")){
                    temp2=Float.parseFloat(vecpro.get(i)+"");
                    vecpro.setElementAt(Float.parseFloat(vecpro.get(j)+""),i);
                    vecpro.setElementAt(temp2,j);
                }
            }
        }

        indicadordiscoduro=sumaalmacen+"";
        indicadorram=(resultado)+"";
        indicadorprocesador=" "+vecpro.get(0);
        indicadordiscoduro=""+sumaalmacen;
        indicadorgraficos=""+ sumaalmacen;
        Intent intent=new Intent(getContext(),Resultados.class);
        intent.putExtra("indicadorrama",indicadorram);
        intent.putExtra("indicadorprocesadora",indicadorprocesador);
        intent.putExtra("indicadordiscoduroa",indicadordiscoduro);
        intent.putExtra("indicadorgraficosa",indicadorgraficos);
        intent.putExtra("datos",datos);
        intent.putExtra("soa",so2);
        intent.putExtra("indicador",1);
        startActivity(intent);
    }






}
