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
 * Created by Hoyt on 7/5/2017.
 */

public class Level4Harmony extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_level4_harmony, container, false);


        Switch l4h1switch = (Switch) view.findViewById(R.id.l4h1);
        Switch l4h2switch = (Switch) view.findViewById(R.id.l4h2);
        Switch l4h3switch = (Switch) view.findViewById(R.id.l4h3);
        Switch l4h4switch = (Switch) view.findViewById(R.id.l4h4);
        Switch l4h5switch = (Switch) view.findViewById(R.id.l4h5);
        Switch l4h6switch = (Switch) view.findViewById(R.id.l4h6);
        Switch l4h7switch = (Switch) view.findViewById(R.id.l4h7);
        Switch l4h8switch = (Switch) view.findViewById(R.id.l4h8);
        Switch l4h9switch = (Switch) view.findViewById(R.id.l4h9);
        Switch l4h10switch = (Switch) view.findViewById(R.id.l4h10);
        Switch l4h11switch = (Switch) view.findViewById(R.id.l4h11);
        Switch l4h12switch = (Switch) view.findViewById(R.id.l4h12);
        Switch l4h13switch = (Switch) view.findViewById(R.id.l4h13);
        Switch l4h14switch = (Switch) view.findViewById(R.id.l4h14);
        Switch l4h15switch = (Switch) view.findViewById(R.id.l4h15);
        Switch l4h16switch = (Switch) view.findViewById(R.id.l4h16);
        Switch l4h17switch = (Switch) view.findViewById(R.id.l4h17);
        Switch l4h18switch = (Switch) view.findViewById(R.id.l4h18);
        Switch l4h19switch = (Switch) view.findViewById(R.id.l4h19);
        Switch l4h20switch = (Switch) view.findViewById(R.id.l4h20);
        Switch l4h21switch = (Switch) view.findViewById(R.id.l4h21);
        Switch l4h22switch = (Switch) view.findViewById(R.id.l4h22);
        Switch l4h23switch = (Switch) view.findViewById(R.id.l4h23);
        Switch l4h24switch = (Switch) view.findViewById(R.id.l4h24);
        Switch l4h25switch = (Switch) view.findViewById(R.id.l4h25);
        Switch l4h26switch = (Switch) view.findViewById(R.id.l4h26);
        Switch l4h27switch = (Switch) view.findViewById(R.id.l4h27);
        Switch l4h28switch = (Switch) view.findViewById(R.id.l4h28);
        Switch l4h29switch = (Switch) view.findViewById(R.id.l4h29);
        Switch l4h30switch = (Switch) view.findViewById(R.id.l4h30);
        Switch l4h31switch = (Switch) view.findViewById(R.id.l4h31);
        Switch l4h32switch = (Switch) view.findViewById(R.id.l4h32);
        Switch l4h33switch = (Switch) view.findViewById(R.id.l4h33);
        Switch l4h34switch = (Switch) view.findViewById(R.id.l4h34);
        Switch l4h35switch = (Switch) view.findViewById(R.id.l4h35);
        Switch l4h36switch = (Switch) view.findViewById(R.id.l4h36);
        Switch l4h37switch = (Switch) view.findViewById(R.id.l4h37);
        Switch l4h38switch = (Switch) view.findViewById(R.id.l4h38);
        Switch l4h39switch = (Switch) view.findViewById(R.id.l4h39);
        Switch l4h40switch = (Switch) view.findViewById(R.id.l4h40);


        SharedPreferences sp = getActivity().getSharedPreferences("switchState",MODE_PRIVATE);

        boolean l4h1state = sp.getBoolean("l4h1", false);
        boolean l4h2state = sp.getBoolean("l4h2", false);
        boolean l4h3state = sp.getBoolean("l4h3", false);
        boolean l4h4state = sp.getBoolean("l4h4", false);
        boolean l4h5state = sp.getBoolean("l4h5", false);
        boolean l4h6state = sp.getBoolean("l4h6", false);
        boolean l4h7state = sp.getBoolean("l4h7", false);
        boolean l4h8state = sp.getBoolean("l4h8", false);
        boolean l4h9state = sp.getBoolean("l4h9", false);
        boolean l4h10state = sp.getBoolean("l4h10", false);
        boolean l4h11state = sp.getBoolean("l4h11", false);
        boolean l4h12state = sp.getBoolean("l4h12", false);
        boolean l4h13state = sp.getBoolean("l4h13", false);
        boolean l4h14state = sp.getBoolean("l4h14", false);
        boolean l4h15state = sp.getBoolean("l4h15", false);
        boolean l4h16state = sp.getBoolean("l4h16", false);
        boolean l4h17state = sp.getBoolean("l4h17", false);
        boolean l4h18state = sp.getBoolean("l4h18", false);
        boolean l4h19state = sp.getBoolean("l4h19", false);
        boolean l4h20state = sp.getBoolean("l4h20", false);
        boolean l4h21state = sp.getBoolean("l4h21", false);
        boolean l4h22state = sp.getBoolean("l4h22", false);
        boolean l4h23state = sp.getBoolean("l4h23", false);
        boolean l4h24state = sp.getBoolean("l4h24", false);
        boolean l4h25state = sp.getBoolean("l4h25", false);
        boolean l4h26state = sp.getBoolean("l4h26", false);
        boolean l4h27state = sp.getBoolean("l4h27", false);
        boolean l4h28state = sp.getBoolean("l4h28", false);
        boolean l4h29state = sp.getBoolean("l4h29", false);
        boolean l4h30state = sp.getBoolean("l4h30", false);
        boolean l4h31state = sp.getBoolean("l4h31", false);
        boolean l4h32state = sp.getBoolean("l4h32", false);
        boolean l4h33state = sp.getBoolean("l4h33", false);
        boolean l4h34state = sp.getBoolean("l4h34", false);
        boolean l4h35state = sp.getBoolean("l4h35", false);
        boolean l4h36state = sp.getBoolean("l4h36", false);
        boolean l4h37state = sp.getBoolean("l4h37", false);
        boolean l4h38state = sp.getBoolean("l4h38", false);
        boolean l4h39state = sp.getBoolean("l4h39", false);
        boolean l4h40state = sp.getBoolean("l4h40", false);


        setState(l4h1state, l4h1switch);
        setState(l4h2state, l4h2switch);
        setState(l4h3state, l4h3switch);
        setState(l4h4state, l4h4switch);
        setState(l4h5state, l4h5switch);
        setState(l4h6state, l4h6switch);
        setState(l4h7state, l4h7switch);
        setState(l4h8state, l4h8switch);
        setState(l4h9state, l4h9switch);
        setState(l4h10state, l4h10switch);
        setState(l4h11state, l4h11switch);
        setState(l4h12state, l4h12switch);
        setState(l4h13state, l4h13switch);
        setState(l4h14state, l4h14switch);
        setState(l4h15state, l4h15switch);
        setState(l4h16state, l4h16switch);
        setState(l4h17state, l4h17switch);
        setState(l4h18state, l4h18switch);
        setState(l4h19state, l4h19switch);
        setState(l4h20state, l4h20switch);
        setState(l4h21state, l4h21switch);
        setState(l4h22state, l4h22switch);
        setState(l4h23state, l4h23switch);
        setState(l4h24state, l4h24switch);
        setState(l4h25state, l4h25switch);
        setState(l4h26state, l4h26switch);
        setState(l4h27state, l4h27switch);
        setState(l4h28state, l4h28switch);
        setState(l4h29state, l4h29switch);
        setState(l4h30state, l4h30switch);
        setState(l4h31state, l4h31switch);
        setState(l4h32state, l4h32switch);
        setState(l4h33state, l4h33switch);
        setState(l4h34state, l4h34switch);
        setState(l4h35state, l4h35switch);
        setState(l4h36state, l4h36switch);
        setState(l4h37state, l4h37switch);
        setState(l4h38state, l4h38switch);
        setState(l4h39state, l4h39switch);
        setState(l4h40state, l4h40switch);

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
