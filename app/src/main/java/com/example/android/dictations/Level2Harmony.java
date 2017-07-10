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
 * Created by Hoyt on 6/7/2017.
 */

public class Level2Harmony extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_level2_harmony, container, false);

        Switch l2h1switch = (Switch) view.findViewById(R.id.l2h1);
        Switch l2h2switch = (Switch) view.findViewById(R.id.l2h2);
        Switch l2h3switch = (Switch) view.findViewById(R.id.l2h3);
        Switch l2h4switch = (Switch) view.findViewById(R.id.l2h4);
        Switch l2h5switch = (Switch) view.findViewById(R.id.l2h5);
        Switch l2h6switch = (Switch) view.findViewById(R.id.l2h6);
        Switch l2h7switch = (Switch) view.findViewById(R.id.l2h7);
        Switch l2h8switch = (Switch) view.findViewById(R.id.l2h8);
        Switch l2h9switch = (Switch) view.findViewById(R.id.l2h9);
        Switch l2h10switch = (Switch) view.findViewById(R.id.l2h10);
        Switch l2h11switch = (Switch) view.findViewById(R.id.l2h11);
        Switch l2h12switch = (Switch) view.findViewById(R.id.l2h12);
        Switch l2h13switch = (Switch) view.findViewById(R.id.l2h13);
        Switch l2h14switch = (Switch) view.findViewById(R.id.l2h14);
        Switch l2h15switch = (Switch) view.findViewById(R.id.l2h15);
        Switch l2h16switch = (Switch) view.findViewById(R.id.l2h16);
        Switch l2h17switch = (Switch) view.findViewById(R.id.l2h17);
        Switch l2h18switch = (Switch) view.findViewById(R.id.l2h18);
        Switch l2h19switch = (Switch) view.findViewById(R.id.l2h19);
        Switch l2h20switch = (Switch) view.findViewById(R.id.l2h20);
        Switch l2h21switch = (Switch) view.findViewById(R.id.l2h21);
        Switch l2h22switch = (Switch) view.findViewById(R.id.l2h22);
        Switch l2h23switch = (Switch) view.findViewById(R.id.l2h23);
        Switch l2h24switch = (Switch) view.findViewById(R.id.l2h24);
        Switch l2h25switch = (Switch) view.findViewById(R.id.l2h25);
        Switch l2h26switch = (Switch) view.findViewById(R.id.l2h26);
        Switch l2h27switch = (Switch) view.findViewById(R.id.l2h27);
        Switch l2h28switch = (Switch) view.findViewById(R.id.l2h28);
        Switch l2h29switch = (Switch) view.findViewById(R.id.l2h29);
        Switch l2h30switch = (Switch) view.findViewById(R.id.l2h30);
        Switch l2h31switch = (Switch) view.findViewById(R.id.l2h31);
        Switch l2h32switch = (Switch) view.findViewById(R.id.l2h32);
        Switch l2h33switch = (Switch) view.findViewById(R.id.l2h33);
        Switch l2h34switch = (Switch) view.findViewById(R.id.l2h34);
        Switch l2h35switch = (Switch) view.findViewById(R.id.l2h35);
        Switch l2h36switch = (Switch) view.findViewById(R.id.l2h36);
        Switch l2h37switch = (Switch) view.findViewById(R.id.l2h37);
        Switch l2h38switch = (Switch) view.findViewById(R.id.l2h38);
        Switch l2h39switch = (Switch) view.findViewById(R.id.l2h39);
        Switch l2h40switch = (Switch) view.findViewById(R.id.l2h40);

        SharedPreferences sp = getActivity().getSharedPreferences("switchState",MODE_PRIVATE);

        boolean l2h1state = sp.getBoolean("l2h1", false);
        boolean l2h2state = sp.getBoolean("l2h2", false);
        boolean l2h3state = sp.getBoolean("l2h3", false);
        boolean l2h4state = sp.getBoolean("l2h4", false);
        boolean l2h5state = sp.getBoolean("l2h5", false);
        boolean l2h6state = sp.getBoolean("l2h6", false);
        boolean l2h7state = sp.getBoolean("l2h7", false);
        boolean l2h8state = sp.getBoolean("l2h8", false);
        boolean l2h9state = sp.getBoolean("l2h9", false);
        boolean l2h10state = sp.getBoolean("l2h10", false);
        boolean l2h11state = sp.getBoolean("l2h11", false);
        boolean l2h12state = sp.getBoolean("l2h12", false);
        boolean l2h13state = sp.getBoolean("l2h13", false);
        boolean l2h14state = sp.getBoolean("l2h14", false);
        boolean l2h15state = sp.getBoolean("l2h15", false);
        boolean l2h16state = sp.getBoolean("l2h16", false);
        boolean l2h17state = sp.getBoolean("l2h17", false);
        boolean l2h18state = sp.getBoolean("l2h18", false);
        boolean l2h19state = sp.getBoolean("l2h19", false);
        boolean l2h20state = sp.getBoolean("l2h20", false);
        boolean l2h21state = sp.getBoolean("l2h21", false);
        boolean l2h22state = sp.getBoolean("l2h22", false);
        boolean l2h23state = sp.getBoolean("l2h23", false);
        boolean l2h24state = sp.getBoolean("l2h24", false);
        boolean l2h25state = sp.getBoolean("l2h25", false);
        boolean l2h26state = sp.getBoolean("l2h26", false);
        boolean l2h27state = sp.getBoolean("l2h27", false);
        boolean l2h28state = sp.getBoolean("l2h28", false);
        boolean l2h29state = sp.getBoolean("l2h29", false);
        boolean l2h30state = sp.getBoolean("l2h30", false);
        boolean l2h31state = sp.getBoolean("l2h31", false);
        boolean l2h32state = sp.getBoolean("l2h32", false);
        boolean l2h33state = sp.getBoolean("l2h33", false);
        boolean l2h34state = sp.getBoolean("l2h34", false);
        boolean l2h35state = sp.getBoolean("l2h35", false);
        boolean l2h36state = sp.getBoolean("l2h36", false);
        boolean l2h37state = sp.getBoolean("l2h37", false);
        boolean l2h38state = sp.getBoolean("l2h38", false);
        boolean l2h39state = sp.getBoolean("l2h39", false);
        boolean l2h40state = sp.getBoolean("l2h40", false);

        setState(l2h1state, l2h1switch);
        setState(l2h2state, l2h2switch);
        setState(l2h3state, l2h3switch);
        setState(l2h4state, l2h4switch);
        setState(l2h5state, l2h5switch);
        setState(l2h6state, l2h6switch);
        setState(l2h7state, l2h7switch);
        setState(l2h8state, l2h8switch);
        setState(l2h9state, l2h9switch);
        setState(l2h10state, l2h10switch);
        setState(l2h11state, l2h11switch);
        setState(l2h12state, l2h12switch);
        setState(l2h13state, l2h13switch);
        setState(l2h14state, l2h14switch);
        setState(l2h15state, l2h15switch);
        setState(l2h16state, l2h16switch);
        setState(l2h17state, l2h17switch);
        setState(l2h18state, l2h18switch);
        setState(l2h19state, l2h19switch);
        setState(l2h20state, l2h20switch);
        setState(l2h21state, l2h21switch);
        setState(l2h22state, l2h22switch);
        setState(l2h23state, l2h23switch);
        setState(l2h24state, l2h24switch);
        setState(l2h25state, l2h25switch);
        setState(l2h26state, l2h26switch);
        setState(l2h27state, l2h27switch);
        setState(l2h28state, l2h28switch);
        setState(l2h29state, l2h29switch);
        setState(l2h30state, l2h30switch);
        setState(l2h31state, l2h31switch);
        setState(l2h32state, l2h32switch);
        setState(l2h33state, l2h33switch);
        setState(l2h34state, l2h34switch);
        setState(l2h35state, l2h35switch);
        setState(l2h36state, l2h36switch);
        setState(l2h37state, l2h37switch);
        setState(l2h38state, l2h38switch);
        setState(l2h39state, l2h39switch);
        setState(l2h40state, l2h40switch);

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
