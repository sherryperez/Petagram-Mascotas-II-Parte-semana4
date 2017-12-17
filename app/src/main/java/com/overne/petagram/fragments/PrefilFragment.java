package com.overne.petagram.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.overne.petagram.R;
import com.overne.petagram.adapter.RVAdapter;
import com.overne.petagram.pojo.Mascota;
import java.util.ArrayList;

public class PrefilFragment extends Fragment {

    ArrayList mascotas;
    RecyclerView rvPerfil;
    TextView nombre_perro;
    public PrefilFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_prefil, container, false);

        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("",1,R.drawable.perro4));
        mascotas.add(new Mascota("",9,R.drawable.perro4));
        mascotas.add(new Mascota("",8,R.drawable.perro4));
        mascotas.add(new Mascota("",7,R.drawable.perro4));
        mascotas.add(new Mascota("",6,R.drawable.perro4));
        mascotas.add(new Mascota("",5,R.drawable.perro4));
        mascotas.add(new Mascota("", 4, R.drawable.perro4));
        mascotas.add(new Mascota("",3,R.drawable.perro4));
        mascotas.add(new Mascota("", 0, R.drawable.perro4));

        rvPerfil = (RecyclerView) v.findViewById(R.id.rv_perfil);
        rvPerfil.setHasFixedSize(true);
        final GridLayoutManager glm= new GridLayoutManager(getActivity(),3, GridLayoutManager.VERTICAL,false);
        rvPerfil.setLayoutManager(glm);
        RVAdapter adapter = new RVAdapter(mascotas);
        rvPerfil.setAdapter(adapter);
        return v;
    }

}
