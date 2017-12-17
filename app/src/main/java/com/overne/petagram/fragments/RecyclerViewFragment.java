package com.overne.petagram.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.overne.petagram.R;
import com.overne.petagram.adapter.RVAdapter;
import com.overne.petagram.pojo.Mascota;
import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment {

    ArrayList mascotas;
    RecyclerView rv;

    public RecyclerViewFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recycler_view, container, false);

        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Roony",0,R.drawable.perro4));
        mascotas.add(new Mascota("Kattie",0,R.drawable.perro1));
        mascotas.add(new Mascota("Duke",0,R.drawable.perro3));
        mascotas.add(new Mascota("Rex",0,R.drawable.perro2));
        mascotas.add(new Mascota("Decer",0,R.drawable.perro5));
        mascotas.add(new Mascota("Tie",0,R.drawable.perro6));
        mascotas.add(new Mascota("Marke",0,R.drawable.perro7));

        rv = (RecyclerView) v.findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(llm);
        RVAdapter adapter = new RVAdapter(mascotas);
        rv.setAdapter(adapter);

        return  v;

    }

}
