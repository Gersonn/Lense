package cl.ckelar.android.lense.layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.GridView;

import java.util.Arrays;

import cl.ckelar.android.lense.R;
import cl.ckelar.android.lense.helper.Util;
import cl.ckelar.android.lense.helper.ValidatorUtil;
import cl.ckelar.android.lense.helper.adapters.TextToAlphabetAdapter;

public class TextToLettersFragment extends Fragment {

    private EditText edtTraducir;
    private final String TAG = this.getClass().getName();

    private GridView gridAlfabeto;
    String[] arrayText = null;

    public TextToLettersFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }

        edtTraducir = (EditText) getActivity().findViewById(R.id.edtTraductor);
        //edtTraducir.max
        edtTraducir.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String texto = edtTraducir.getText().toString();
                arrayText = Util.stringToCharacterArray(texto);

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

                TextToAlphabetAdapter alfabetoAdapter = null;

                if (arrayText != null && arrayText.length > 0) {
                    alfabetoAdapter = new TextToAlphabetAdapter(getActivity(), arrayText);

                    gridAlfabeto = (GridView) getActivity().findViewById(R.id.grd_texto_to_alfabeto);
                    gridAlfabeto.setAdapter(alfabetoAdapter);
                    gridAlfabeto.setVisibility(View.VISIBLE);
                } else {
                    gridAlfabeto.setVisibility(View.INVISIBLE);
                }

            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_text_to_letters, container, false);
        final View view = inflater.inflate(R.layout.fragment_text_to_letters, container, false);



        return view;
    }

}
