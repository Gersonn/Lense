package cl.ckelar.android.lense.layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.Arrays;

import cl.ckelar.android.lense.R;
import cl.ckelar.android.lense.helper.Util;
import cl.ckelar.android.lense.helper.ValidatorUtil;

public class TraductorFragment extends Fragment {

    public EditText edtTraducir;

    private final String TAG = this.getClass().getName();
    private Fragment fragmentToLetters = null;
    private FragmentManager fragmentManager;

    public TraductorFragment() {
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
        //return inflater.inflate(R.layout.fragment_traductor, container, false);
        final View view = inflater.inflate(R.layout.fragment_traductor, container, false);


        fragmentToLetters = new TextToLettersFragment();
        fragmentManager = getActivity().getSupportFragmentManager();
        final FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frmTrad, fragmentToLetters).commit();

        //String[] aa = Util.stringToCharacterArray("Esto es un texto");
        //Log.d("TRADUCCION", Arrays.toString(aa));

        //AlfabetoAdapter alfabetoAdapter = new AlfabetoAdapter(view.getContext());

        //gridAlfabeto = (GridView) view.findViewById(R.id.grd_main_alfabeto);
        //gridAlfabeto.setAdapter(alfabetoAdapter);

        edtTraducir = (EditText) view.findViewById(R.id.edtTraductor);

/*
        edtTraducir = (EditText) view.findViewById(R.id.edtTraductor);
        //edtTraducir.max
        edtTraducir.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String texto = edtTraducir.getText().toString();
                String[] arrayText = Util.stringToCharacterArray(texto);

                if (!ValidatorUtil.isLettersOnly(texto)) {
                    Log.e(TAG, "(" + texto + ") Contiene un caracter que no es una letra");

                    //String texto = edtTraducir.getText().toString().replace(arrayText[arrayText.length-1], "");
                    texto = Util.characterArrayToString(arrayText);
                    Log.e(TAG, texto);

                    edtTraducir.setText(texto);
                    edtTraducir.setSelection(texto.length());
                }

                Log.d(TAG, Arrays.toString(arrayText));
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

*/
        return view;
    }

}
