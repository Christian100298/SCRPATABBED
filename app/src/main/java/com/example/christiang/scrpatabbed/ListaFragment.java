package com.example.christiang.scrpatabbed;



import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class ListaFragment extends Fragment {

    private TextView mostrar;
    private ListView list_postes;

    private String postes[] = {"#1","#2","#3","#4","#5","#6"};
    private String dir[] = {"calle 25 x18 y 120","calle 27 x20 y 122","calle 29 x22 y 124","calle 31 x24 y 126","calle 33 x26 y 128","calle 35 x28 y 130"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lista, container, false);

    }
    public void OnCreate(){
        //mostrar=(TextView)findViewById(R.id.mostrar);

    }
}
