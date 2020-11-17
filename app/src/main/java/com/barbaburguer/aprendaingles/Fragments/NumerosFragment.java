package com.barbaburguer.aprendaingles.Fragments;


import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.barbaburguer.aprendaingles.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NumerosFragment extends Fragment implements View.OnClickListener {
    private ImageView numeroUm,numeroDois,numeroTres,numeroQuatro,numeroCinco,numeroSeis;
    private MediaPlayer mediaPlayer;


    public NumerosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_numeros, container, false);

        numeroUm = view.findViewById(R.id.imageUm);
        numeroDois = view.findViewById(R.id.imageDois);
        numeroTres = view.findViewById(R.id.imageTres);
        numeroQuatro = view.findViewById(R.id.imageQuatro);
        numeroCinco = view.findViewById(R.id.imageCinco);
        numeroSeis = view.findViewById(R.id.imageSeis);

        numeroUm.setOnClickListener(this);
        numeroDois.setOnClickListener(this);
        numeroTres.setOnClickListener(this);
        numeroQuatro.setOnClickListener(this);
        numeroCinco.setOnClickListener(this);
        numeroSeis.setOnClickListener(this);




        return view;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageUm:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.one);
                tocarSom();
                break;
            case R.id.imageDois:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.two);
                tocarSom();
                break;
            case R.id.imageTres:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.three);
                tocarSom();
                break;
            case R.id.imageQuatro:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.four);
                tocarSom();
                break;
            case R.id.imageCinco:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.five);
                tocarSom();
                break;
            case R.id.imageSeis:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.six);
                tocarSom();
                break;
        }


    }
    public void tocarSom(){
        if(mediaPlayer != null){
            mediaPlayer.start();
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer.release();
                }
            });
        }
    }
    public void OnDestroy(){
        super.onDestroy();
        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer =null;
        }
    }
}
