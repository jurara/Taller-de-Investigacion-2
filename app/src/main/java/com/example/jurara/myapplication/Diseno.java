package com.example.jurara.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Diseno extends Fragment {
    int c=0;
    Button btn;
    int indicadorram,indicadorprocesador,indicadordiscoduro,indicadorgraficos;
    public Diseno() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v=inflater.inflate(R.layout.fragment_diseno, container, false);
        btn=v.findViewById(R.id.generarpcdiseño);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(),Resultados.class);
                intent.putExtra("indicadorram",indicadorram);
                intent.putExtra("indicadorprocesador",indicadorprocesador);
                intent.putExtra("indicadordiscoduro",indicadordiscoduro);
                intent.putExtra("indicadorgraficos",indicadorgraficos);
                startActivity(intent);
            }
        });

        return v;
    }
}
