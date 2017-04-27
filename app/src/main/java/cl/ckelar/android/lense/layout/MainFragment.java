package cl.ckelar.android.lense.layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import cl.ckelar.android.lense.R;
import cl.ckelar.android.lense.helper.adapters.AlfabetoAdapter;

public class MainFragment extends Fragment {

    private GridView gridAlfabeto;
    private AlfabetoAdapter alfabetoAdapter;

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_main, container, false);
        final View view = inflater.inflate(R.layout.fragment_main, container, false);


        AlfabetoAdapter alfabetoAdapter = new AlfabetoAdapter(view.getContext());

        gridAlfabeto = (GridView) view.findViewById(R.id.grd_main_alfabeto);
        gridAlfabeto.setAdapter(alfabetoAdapter);


        return view;
    }

}
