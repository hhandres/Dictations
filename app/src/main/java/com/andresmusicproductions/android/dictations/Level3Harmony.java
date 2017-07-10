package com.andresmusicproductions.android.dictations;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by Hoyt on 6/30/2017.
 */

public class Level3Harmony extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_level3_harmony, container, false);

        Switch l3h1switch = (Switch) view.findViewById(R.id.l3h1);
        Switch l3h2switch = (Switch) view.findViewById(R.id.l3h2);
        Switch l3h3switch = (Switch) view.findViewById(R.id.l3h3);
        Switch l3h4switch = (Switch) view.findViewById(R.id.l3h4);
        Switch l3h5switch = (Switch) view.findViewById(R.id.l3h5);
        Switch l3h6switch = (Switch) view.findViewById(R.id.l3h6);
        Switch l3h7switch = (Switch) view.findViewById(R.id.l3h7);
        Switch l3h8switch = (Switch) view.findViewById(R.id.l3h8);
        Switch l3h9switch = (Switch) view.findViewById(R.id.l3h9);
        Switch l3h10switch = (Switch) view.findViewById(R.id.l3h10);
        Switch l3h11switch = (Switch) view.findViewById(R.id.l3h11);
        Switch l3h12switch = (Switch) view.findViewById(R.id.l3h12);
        Switch l3h13switch = (Switch) view.findViewById(R.id.l3h13);
        Switch l3h14switch = (Switch) view.findViewById(R.id.l3h14);
        Switch l3h15switch = (Switch) view.findViewById(R.id.l3h15);
        Switch l3h16switch = (Switch) view.findViewById(R.id.l3h16);
        Switch l3h17switch = (Switch) view.findViewById(R.id.l3h17);
        Switch l3h18switch = (Switch) view.findViewById(R.id.l3h18);
        Switch l3h19switch = (Switch) view.findViewById(R.id.l3h19);
        Switch l3h20switch = (Switch) view.findViewById(R.id.l3h20);
        Switch l3h21switch = (Switch) view.findViewById(R.id.l3h21);
        Switch l3h22switch = (Switch) view.findViewById(R.id.l3h22);
        Switch l3h23switch = (Switch) view.findViewById(R.id.l3h23);
        Switch l3h24switch = (Switch) view.findViewById(R.id.l3h24);
        Switch l3h25switch = (Switch) view.findViewById(R.id.l3h25);
        Switch l3h26switch = (Switch) view.findViewById(R.id.l3h26);
        Switch l3h27switch = (Switch) view.findViewById(R.id.l3h27);
        Switch l3h28switch = (Switch) view.findViewById(R.id.l3h28);
        Switch l3h29switch = (Switch) view.findViewById(R.id.l3h29);
        Switch l3h30switch = (Switch) view.findViewById(R.id.l3h30);
        Switch l3h31switch = (Switch) view.findViewById(R.id.l3h31);
        Switch l3h32switch = (Switch) view.findViewById(R.id.l3h32);
        Switch l3h33switch = (Switch) view.findViewById(R.id.l3h33);
        Switch l3h34switch = (Switch) view.findViewById(R.id.l3h34);
        Switch l3h35switch = (Switch) view.findViewById(R.id.l3h35);
        Switch l3h36switch = (Switch) view.findViewById(R.id.l3h36);
        Switch l3h37switch = (Switch) view.findViewById(R.id.l3h37);
        Switch l3h38switch = (Switch) view.findViewById(R.id.l3h38);
        Switch l3h39switch = (Switch) view.findViewById(R.id.l3h39);
        Switch l3h40switch = (Switch) view.findViewById(R.id.l3h40);

        SharedPreferences sp = getActivity().getSharedPreferences("switchState",MODE_PRIVATE);

        boolean l3h1state = sp.getBoolean("l3h1", false);
        boolean l3h2state = sp.getBoolean("l3h2", false);
        boolean l3h3state = sp.getBoolean("l3h3", false);
        boolean l3h4state = sp.getBoolean("l3h4", false);
        boolean l3h5state = sp.getBoolean("l3h5", false);
        boolean l3h6state = sp.getBoolean("l3h6", false);
        boolean l3h7state = sp.getBoolean("l3h7", false);
        boolean l3h8state = sp.getBoolean("l3h8", false);
        boolean l3h9state = sp.getBoolean("l3h9", false);
        boolean l3h10state = sp.getBoolean("l3h10", false);
        boolean l3h11state = sp.getBoolean("l3h11", false);
        boolean l3h12state = sp.getBoolean("l3h12", false);
        boolean l3h13state = sp.getBoolean("l3h13", false);
        boolean l3h14state = sp.getBoolean("l3h14", false);
        boolean l3h15state = sp.getBoolean("l3h15", false);
        boolean l3h16state = sp.getBoolean("l3h16", false);
        boolean l3h17state = sp.getBoolean("l3h17", false);
        boolean l3h18state = sp.getBoolean("l3h18", false);
        boolean l3h19state = sp.getBoolean("l3h19", false);
        boolean l3h20state = sp.getBoolean("l3h20", false);
        boolean l3h21state = sp.getBoolean("l3h21", false);
        boolean l3h22state = sp.getBoolean("l3h22", false);
        boolean l3h23state = sp.getBoolean("l3h23", false);
        boolean l3h24state = sp.getBoolean("l3h24", false);
        boolean l3h25state = sp.getBoolean("l3h25", false);
        boolean l3h26state = sp.getBoolean("l3h26", false);
        boolean l3h27state = sp.getBoolean("l3h27", false);
        boolean l3h28state = sp.getBoolean("l3h28", false);
        boolean l3h29state = sp.getBoolean("l3h29", false);
        boolean l3h30state = sp.getBoolean("l3h30", false);
        boolean l3h31state = sp.getBoolean("l3h31", false);
        boolean l3h32state = sp.getBoolean("l3h32", false);
        boolean l3h33state = sp.getBoolean("l3h33", false);
        boolean l3h34state = sp.getBoolean("l3h34", false);
        boolean l3h35state = sp.getBoolean("l3h35", false);
        boolean l3h36state = sp.getBoolean("l3h36", false);
        boolean l3h37state = sp.getBoolean("l3h37", false);
        boolean l3h38state = sp.getBoolean("l3h38", false);
        boolean l3h39state = sp.getBoolean("l3h39", false);
        boolean l3h40state = sp.getBoolean("l3h40", false);

        setState(l3h1state, l3h1switch);
        setState(l3h2state, l3h2switch);
        setState(l3h3state, l3h3switch);
        setState(l3h4state, l3h4switch);
        setState(l3h5state, l3h5switch);
        setState(l3h6state, l3h6switch);
        setState(l3h7state, l3h7switch);
        setState(l3h8state, l3h8switch);
        setState(l3h9state, l3h9switch);
        setState(l3h10state, l3h10switch);
        setState(l3h11state, l3h11switch);
        setState(l3h12state, l3h12switch);
        setState(l3h13state, l3h13switch);
        setState(l3h14state, l3h14switch);
        setState(l3h15state, l3h15switch);
        setState(l3h16state, l3h16switch);
        setState(l3h17state, l3h17switch);
        setState(l3h18state, l3h18switch);
        setState(l3h19state, l3h19switch);
        setState(l3h20state, l3h20switch);
        setState(l3h21state, l3h21switch);
        setState(l3h22state, l3h22switch);
        setState(l3h23state, l3h23switch);
        setState(l3h24state, l3h24switch);
        setState(l3h25state, l3h25switch);
        setState(l3h26state, l3h26switch);
        setState(l3h27state, l3h27switch);
        setState(l3h28state, l3h28switch);
        setState(l3h29state, l3h29switch);
        setState(l3h30state, l3h30switch);
        setState(l3h31state, l3h31switch);
        setState(l3h32state, l3h32switch);
        setState(l3h33state, l3h33switch);
        setState(l3h34state, l3h34switch);
        setState(l3h35state, l3h35switch);
        setState(l3h36state, l3h36switch);
        setState(l3h37state, l3h37switch);
        setState(l3h38state, l3h38switch);
        setState(l3h39state, l3h39switch);
        setState(l3h40state, l3h40switch);

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
