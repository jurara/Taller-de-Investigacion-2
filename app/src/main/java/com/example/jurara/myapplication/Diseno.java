package com.example.jurara.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.Vector;

public class Diseno extends Fragment {
    int c=0;
    Button btn;
    Vector ram=new Vector();
    Vector procesador=new Vector();
    Vector discoduro=new Vector();
    Vector graficos=new Vector();
    Vector so=new Vector();
    String datos="";
    String so2="";
    int indicadorram;
    float indicadorprocesador,indicadordiscoduro,indicadorgraficos;
    CheckBox officefive,officesix,chrome,firefox,safari,autocad,solid,civil,wmp,itunes,vlc,matlab,coreldraw,proteus,circuitmaker,autodesk,androidstudio,wamp,xampp,sqlserver,netbeans,visualstudio;
    public Diseno() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v=inflater.inflate(R.layout.fragment_diseno, container, false);
        btn=v.findViewById(R.id.generarpcdiseño);
        officefive=v.findViewById(R.id.officefive);
        officesix=v.findViewById(R.id.officesix);
        chrome=v.findViewById(R.id.chrome);
        firefox=v.findViewById(R.id.firefox);
        safari=v.findViewById(R.id.safari);
        autocad=v.findViewById(R.id.autocad);
        solid=v.findViewById(R.id.solid);
        civil=v.findViewById(R.id.civil);
        wmp=v.findViewById(R.id.wmp);
        itunes=v.findViewById(R.id.itunes);
        vlc=v.findViewById(R.id.vlc);

        coreldraw=v.findViewById(R.id.coreldraw);







        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcular();

            }
        });

        return v;
    }

    public void calcular() {
        if(officesix.isChecked()){
            ram.add(2048);
            procesador.add(1);
            discoduro.add((3*1024));
            graficos.add(10);
            so.add(7);
        }
        if(officefive.isChecked()){
            ram.add(2048);
            procesador.add(1);
            discoduro.add((3*1024));
            graficos.add(10);
            so.add(7);
        }
        if(chrome.isChecked()){
            ram.add(256);
            procesador.add(1);
            discoduro.add((403));
            graficos.add(10);
            so.add(7);
        }
        if(firefox.isChecked()){
            ram.add(256);
            procesador.add(1);
            discoduro.add((403));
            graficos.add(10);
            so.add(6);
        }
        if(safari.isChecked()){
            ram.add(256);
            procesador.add(0.5);
            discoduro.add((36.5));
            graficos.add(9);
            so.add(6);
        }
        if(autocad.isChecked()){
            ram.add((4*1024));
            procesador.add(1.3);
            discoduro.add((6*1024));
            graficos.add(11);
            so.add(7);
        }
        if(solid.isChecked()){
            ram.add((8*1024));
            procesador.add(0.733);
            discoduro.add((3*1024));
            graficos.add(10);
            so.add(7);
            datos+="Solid Works requiere so con arquitectura 64 bits.";
        }
        if(civil.isChecked()){
            ram.add(2048);
            procesador.add(1);
            discoduro.add((100));
            graficos.add(10);
            so.add(6);
        }
        if(wmp.isChecked()){
            ram.add(64);
            procesador.add(0.5);
            discoduro.add((200));
            graficos.add(10);
            so.add(6);
        }
        if(itunes.isChecked()){
            ram.add(512);
            procesador.add(1);
            discoduro.add((250));
            graficos.add(9);
            so.add(6);
        }
        if(vlc.isChecked()){
            ram.add(512);
            procesador.add(0.773);
            discoduro.add((23.6));
            graficos.add(10);
            so.add(6);
        }


        if(coreldraw.isChecked()){
            ram.add(2048);
            procesador.add(0.733);
            discoduro.add((1024));
            graficos.add(10);
            so.add(7);
        }



        float temp=0;
        float temp2=0;
        float temp3=0;

        for(int i=0;i<ram.size();i++){
            for(int j=0;j<ram.size();j++){
                if(Float.parseFloat(ram.get(i)+"")>=Float.parseFloat(ram.get(j)+"")){
                    temp=Float.parseFloat(ram.get(i)+"");
                    ram.setElementAt(Float.parseFloat(ram.get(j)+""),i);
                    ram.setElementAt(temp,j);
                }
            }
        }


        for(int i=0;i<procesador.size();i++){
            for(int j=0;j<procesador.size();j++){
                if(Float.parseFloat(procesador.get(i)+"")>=Float.parseFloat(procesador.get(j)+"")){
                    temp2=Float.parseFloat(procesador.get(i)+"");
                    procesador.setElementAt(Float.parseFloat(procesador.get(j)+""),i);
                    procesador.setElementAt(temp2,j);
                }
            }
        }



        indicadorprocesador= Float.parseFloat(procesador.get(0)+"") ;


        //1024  2048  4096  8192

        if(Float.parseFloat(ram.get(0)+"")<=1024.0){
            indicadorram=1024;
        }else{
            if(Float.parseFloat(ram.get(0)+"")<=2048.0){
                indicadorram=2048;
            }else{
                if(Float.parseFloat(ram.get(0)+"")<=4096.0){
                    indicadorram=4096;
                }else{
                    if(Float.parseFloat(ram.get(0)+"")<=8192.0){
                        indicadorram=8192;
                    }
                }
            }
        }




        for(int i=0;i<discoduro.size();i++){
            indicadordiscoduro+=Float.parseFloat(discoduro.get(i)+"");
        }

        for(int i=0;i<graficos.size();i++){
            for(int j=0;j<graficos.size();j++){
                if(Float.parseFloat(graficos.get(i)+"")>=Float.parseFloat(graficos.get(j)+"")){
                    temp3=Float.parseFloat(graficos.get(i)+"");
                    graficos.setElementAt(Float.parseFloat(graficos.get(j)+""),i);
                    graficos.setElementAt(temp3,j);
                }
            }
        }

        int temp5=0;

        for(int i=0;i<so.size();i++){
            for(int j=0;j<so.size();j++){
                if(Integer.parseInt(so.get(i)+"")>=Integer.parseInt(so.get(j)+"")){
                    temp5=Integer.parseInt(so.get(i)+"");
                    so.setElementAt(Integer.parseInt(so.get(j)+""),i);
                    so.setElementAt(temp5,j);
                }
            }
        }


        switch ((int)so.get(0)){
            case 6:
                so2="windows xp";
                break;
            case 7:
                so2="windows 7";
                break;
        }

        indicadorgraficos=Float.parseFloat(graficos.get(0)+"");


        Intent intent=new Intent(getContext(),Resultados.class);
        intent.putExtra("indicadorrama",indicadorram+"");
        intent.putExtra("indicadorprocesadora",indicadorprocesador+"");
        intent.putExtra("indicadordiscoduroa",indicadordiscoduro+"");
        intent.putExtra("indicadorgraficosa",indicadorgraficos+"");
        intent.putExtra("indicador",2);
        intent.putExtra("datos",datos);
        intent.putExtra("soa",so2);
        startActivity(intent);
    }
}
