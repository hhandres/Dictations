package com.example.android.dictations;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by Hoyt on 4/30/2017.
 */

public class BeginnerMelody extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_beginner_melody, container, false);


        Switch bm1switch = (Switch) view.findViewById(R.id.bm1);
        Switch bm2switch = (Switch) view.findViewById(R.id.bm2);
        Switch bm3switch = (Switch) view.findViewById(R.id.bm3);
        Switch bm4switch = (Switch) view.findViewById(R.id.bm4);
        Switch bm5switch = (Switch) view.findViewById(R.id.bm5);
        Switch bm6switch = (Switch) view.findViewById(R.id.bm6);
        Switch bm7switch = (Switch) view.findViewById(R.id.bm7);
        Switch bm8switch = (Switch) view.findViewById(R.id.bm8);
        Switch bm9switch = (Switch) view.findViewById(R.id.bm9);
        Switch bm10switch = (Switch) view.findViewById(R.id.bm10);
        Switch bm11switch = (Switch) view.findViewById(R.id.bm11);
        Switch bm12switch = (Switch) view.findViewById(R.id.bm12);
        Switch bm13switch = (Switch) view.findViewById(R.id.bm13);
        Switch bm14switch = (Switch) view.findViewById(R.id.bm14);
        Switch bm15switch = (Switch) view.findViewById(R.id.bm15);
        Switch bm16switch = (Switch) view.findViewById(R.id.bm16);
        Switch bm17switch = (Switch) view.findViewById(R.id.bm17);
        Switch bm18switch = (Switch) view.findViewById(R.id.bm18);
        Switch bm19switch = (Switch) view.findViewById(R.id.bm19);
        Switch bm20switch = (Switch) view.findViewById(R.id.bm20);
        Switch bm21switch = (Switch) view.findViewById(R.id.bm21);
        Switch bm22switch = (Switch) view.findViewById(R.id.bm22);
        Switch bm23switch = (Switch) view.findViewById(R.id.bm23);
        Switch bm24switch = (Switch) view.findViewById(R.id.bm24);
        Switch bm25switch = (Switch) view.findViewById(R.id.bm25);
        Switch bm26switch = (Switch) view.findViewById(R.id.bm26);
        Switch bm27switch = (Switch) view.findViewById(R.id.bm27);
        Switch bm28switch = (Switch) view.findViewById(R.id.bm28);
        Switch bm29switch = (Switch) view.findViewById(R.id.bm29);
        Switch bm30switch = (Switch) view.findViewById(R.id.bm30);
        Switch bm31switch = (Switch) view.findViewById(R.id.bm31);
        Switch bm32switch = (Switch) view.findViewById(R.id.bm32);
        Switch bm33switch = (Switch) view.findViewById(R.id.bm33);
        Switch bm34switch = (Switch) view.findViewById(R.id.bm34);
        Switch bm35switch = (Switch) view.findViewById(R.id.bm35);
        Switch bm36switch = (Switch) view.findViewById(R.id.bm36);
        Switch bm37switch = (Switch) view.findViewById(R.id.bm37);
        Switch bm38switch = (Switch) view.findViewById(R.id.bm38);
        Switch bm39switch = (Switch) view.findViewById(R.id.bm39);
        Switch bm40switch = (Switch) view.findViewById(R.id.bm40);

        SharedPreferences sp = getActivity().getSharedPreferences("switchState",MODE_PRIVATE);

        boolean bm1state = sp.getBoolean("bm1", false);
        boolean bm2state = sp.getBoolean("bm2", false);
        boolean bm3state = sp.getBoolean("bm3", false);
        boolean bm4state = sp.getBoolean("bm4", false);
        boolean bm5state = sp.getBoolean("bm5", false);
        boolean bm6state = sp.getBoolean("bm6", false);
        boolean bm7state = sp.getBoolean("bm7", false);
        boolean bm8state = sp.getBoolean("bm8", false);
        boolean bm9state = sp.getBoolean("bm9", false);
        boolean bm10state = sp.getBoolean("bm10", false);
        boolean bm11state = sp.getBoolean("bm11", false);
        boolean bm12state = sp.getBoolean("bm12", false);
        boolean bm13state = sp.getBoolean("bm13", false);
        boolean bm14state = sp.getBoolean("bm14", false);
        boolean bm15state = sp.getBoolean("bm15", false);
        boolean bm16state = sp.getBoolean("bm16", false);
        boolean bm17state = sp.getBoolean("bm17", false);
        boolean bm18state = sp.getBoolean("bm18", false);
        boolean bm19state = sp.getBoolean("bm19", false);
        boolean bm20state = sp.getBoolean("bm20", false);
        boolean bm21state = sp.getBoolean("bm21", false);
        boolean bm22state = sp.getBoolean("bm22", false);
        boolean bm23state = sp.getBoolean("bm23", false);
        boolean bm24state = sp.getBoolean("bm24", false);
        boolean bm25state = sp.getBoolean("bm25", false);
        boolean bm26state = sp.getBoolean("bm26", false);
        boolean bm27state = sp.getBoolean("bm27", false);
        boolean bm28state = sp.getBoolean("bm28", false);
        boolean bm29state = sp.getBoolean("bm29", false);
        boolean bm30state = sp.getBoolean("bm30", false);
        boolean bm31state = sp.getBoolean("bm31", false);
        boolean bm32state = sp.getBoolean("bm32", false);
        boolean bm33state = sp.getBoolean("bm33", false);
        boolean bm34state = sp.getBoolean("bm34", false);
        boolean bm35state = sp.getBoolean("bm35", false);
        boolean bm36state = sp.getBoolean("bm36", false);
        boolean bm37state = sp.getBoolean("bm37", false);
        boolean bm38state = sp.getBoolean("bm38", false);
        boolean bm39state = sp.getBoolean("bm39", false);
        boolean bm40state = sp.getBoolean("bm40", false);


        setState(bm1state, bm1switch);
        setState(bm2state, bm2switch);
        setState(bm3state, bm3switch);
        setState(bm4state, bm4switch);
        setState(bm5state, bm5switch);
        setState(bm6state, bm6switch);
        setState(bm7state, bm7switch);
        setState(bm8state, bm8switch);
        setState(bm9state, bm9switch);
        setState(bm10state, bm10switch);
        setState(bm11state, bm11switch);
        setState(bm12state, bm12switch);
        setState(bm13state, bm13switch);
        setState(bm14state, bm14switch);
        setState(bm15state, bm15switch);
        setState(bm16state, bm16switch);
        setState(bm17state, bm17switch);
        setState(bm18state, bm18switch);
        setState(bm19state, bm19switch);
        setState(bm20state, bm20switch);
        setState(bm21state, bm21switch);
        setState(bm22state, bm22switch);
        setState(bm23state, bm23switch);
        setState(bm24state, bm24switch);
        setState(bm25state, bm25switch);
        setState(bm26state, bm26switch);
        setState(bm27state, bm27switch);
        setState(bm28state, bm28switch);
        setState(bm29state, bm29switch);
        setState(bm30state, bm30switch);
        setState(bm31state, bm31switch);
        setState(bm32state, bm32switch);
        setState(bm33state, bm33switch);
        setState(bm34state, bm34switch);
        setState(bm35state, bm35switch);
        setState(bm36state, bm36switch);
        setState(bm37state, bm37switch);
        setState(bm38state, bm38switch);
        setState(bm39state, bm39switch);
        setState(bm40state, bm40switch);

        return view;
    }
    public void setState(boolean state, Switch button) {
        if (state) {
            button.setChecked(true);
        } else {
            button.setChecked(false);
        }
    }
    
}
