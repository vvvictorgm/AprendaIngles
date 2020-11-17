package com.barbaburguer.aprendaingles.Fragments;


import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.barbaburguer.aprendaingles.MainActivity;
import com.barbaburguer.aprendaingles.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BichoFragment extends Fragment implements View.OnClickListener {
    private ImageView cao,gato,macaco,ovelha,vaca,leao;
    private MediaPlayer mediaPlayer;

    public BichoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_bicho, container, false);

         cao = view.findViewById(R.id.imageCao);
         gato = view.findViewById(R.id.imageGato);
         leao = view.findViewById(R.id.imageLeao);
         macaco = view.findViewById(R.id.imageMacaco);
         ovelha = view.findViewById(R.id.imageOvelha);
         vaca = view.findViewById(R.id.imageVaca);

         cao.setOnClickListener(this);
        gato.setOnClickListener(this);
        leao.setOnClickListener(this);
        macaco.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        vaca.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        //verificar id de cada item clicado
        //Log.i("Elemento Clicado","item:" + v.getId());
        switch (v.getId()){
            case R.id.imageCao :
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.dog);
                tocarSom();
                break;
            case R.id.imageGato :
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.cat);
                tocarSom();
                break;
            case R.id.imageLeao :
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.lion);
                tocarSom();
                break;
            case R.id.imageVaca :
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.cow);
                tocarSom();
                break;
            case R.id.imageMacaco :
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.monkeyda);
                tocarSom();
                break;
            case R.id.imageOvelha :
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.sheep);
                tocarSom();
                break;

        }

    }
    public void tocarSom(){
        if (mediaPlayer != null){
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
