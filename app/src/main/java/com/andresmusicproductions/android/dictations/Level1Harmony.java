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
 * Created by Hoyt on 5/1/2017.
 */

public class Level1Harmony extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_level1_harmony, container, false);

        Switch l1h1switch = (Switch) view.findViewById(R.id.l1h1);
        Switch l1h2switch = (Switch) view.findViewById(R.id.l1h2);
        Switch l1h3switch = (Switch) view.findViewById(R.id.l1h3);
        Switch l1h4switch = (Switch) view.findViewById(R.id.l1h4);
        Switch l1h5switch = (Switch) view.findViewById(R.id.l1h5);
        Switch l1h6switch = (Switch) view.findViewById(R.id.l1h6);
        Switch l1h7switch = (Switch) view.findViewById(R.id.l1h7);
        Switch l1h8switch = (Switch) view.findViewById(R.id.l1h8);
        Switch l1h9switch = (Switch) view.findViewById(R.id.l1h9);
        Switch l1h10switch = (Switch) view.findViewById(R.id.l1h10);
        Switch l1h11switch = (Switch) view.findViewById(R.id.l1h11);
        Switch l1h12switch = (Switch) view.findViewById(R.id.l1h12);
        Switch l1h13switch = (Switch) view.findViewById(R.id.l1h13);
        Switch l1h14switch = (Switch) view.findViewById(R.id.l1h14);
        Switch l1h15switch = (Switch) view.findViewById(R.id.l1h15);
        Switch l1h16switch = (Switch) view.findViewById(R.id.l1h16);
        Switch l1h17switch = (Switch) view.findViewById(R.id.l1h17);
        Switch l1h18switch = (Switch) view.findViewById(R.id.l1h18);
        Switch l1h19switch = (Switch) view.findViewById(R.id.l1h19);
        Switch l1h20switch = (Switch) view.findViewById(R.id.l1h20);
        Switch l1h21switch = (Switch) view.findViewById(R.id.l1h21);
        Switch l1h22switch = (Switch) view.findViewById(R.id.l1h22);
        Switch l1h23switch = (Switch) view.findViewById(R.id.l1h23);
        Switch l1h24switch = (Switch) view.findViewById(R.id.l1h24);
        Switch l1h25switch = (Switch) view.findViewById(R.id.l1h25);
        Switch l1h26switch = (Switch) view.findViewById(R.id.l1h26);
        Switch l1h27switch = (Switch) view.findViewById(R.id.l1h27);
        Switch l1h28switch = (Switch) view.findViewById(R.id.l1h28);
        Switch l1h29switch = (Switch) view.findViewById(R.id.l1h29);
        Switch l1h30switch = (Switch) view.findViewById(R.id.l1h30);
        Switch l1h31switch = (Switch) view.findViewById(R.id.l1h31);
        Switch l1h32switch = (Switch) view.findViewById(R.id.l1h32);
        Switch l1h33switch = (Switch) view.findViewById(R.id.l1h33);
        Switch l1h34switch = (Switch) view.findViewById(R.id.l1h34);
        Switch l1h35switch = (Switch) view.findViewById(R.id.l1h35);
        Switch l1h36switch = (Switch) view.findViewById(R.id.l1h36);
        Switch l1h37switch = (Switch) view.findViewById(R.id.l1h37);
        Switch l1h38switch = (Switch) view.findViewById(R.id.l1h38);
        Switch l1h39switch = (Switch) view.findViewById(R.id.l1h39);
        Switch l1h40switch = (Switch) view.findViewById(R.id.l1h40);
        Switch l1h41switch = (Switch) view.findViewById(R.id.l1h41);
        Switch l1h42switch = (Switch) view.findViewById(R.id.l1h42);
        Switch l1h43switch = (Switch) view.findViewById(R.id.l1h43);
        Switch l1h44switch = (Switch) view.findViewById(R.id.l1h44);
        Switch l1h45switch = (Switch) view.findViewById(R.id.l1h45);
        Switch l1h46switch = (Switch) view.findViewById(R.id.l1h46);
        Switch l1h47switch = (Switch) view.findViewById(R.id.l1h47);
        Switch l1h48switch = (Switch) view.findViewById(R.id.l1h48);
        Switch l1h49switch = (Switch) view.findViewById(R.id.l1h49);
        Switch l1h50switch = (Switch) view.findViewById(R.id.l1h50);
        Switch l1h51switch = (Switch) view.findViewById(R.id.l1h51);
        Switch l1h52switch = (Switch) view.findViewById(R.id.l1h52);
        Switch l1h53switch = (Switch) view.findViewById(R.id.l1h53);
        Switch l1h54switch = (Switch) view.findViewById(R.id.l1h54);
        Switch l1h55switch = (Switch) view.findViewById(R.id.l1h55);

        SharedPreferences sp = getActivity().getSharedPreferences("switchState",MODE_PRIVATE);

        boolean l1h1state = sp.getBoolean("l1h1", false);
        boolean l1h2state = sp.getBoolean("l1h2", false);
        boolean l1h3state = sp.getBoolean("l1h3", false);
        boolean l1h4state = sp.getBoolean("l1h4", false);
        boolean l1h5state = sp.getBoolean("l1h5", false);
        boolean l1h6state = sp.getBoolean("l1h6", false);
        boolean l1h7state = sp.getBoolean("l1h7", false);
        boolean l1h8state = sp.getBoolean("l1h8", false);
        boolean l1h9state = sp.getBoolean("l1h9", false);
        boolean l1h10state = sp.getBoolean("l1h10", false);
        boolean l1h11state = sp.getBoolean("l1h11", false);
        boolean l1h12state = sp.getBoolean("l1h12", false);
        boolean l1h13state = sp.getBoolean("l1h13", false);
        boolean l1h14state = sp.getBoolean("l1h14", false);
        boolean l1h15state = sp.getBoolean("l1h15", false);
        boolean l1h16state = sp.getBoolean("l1h16", false);
        boolean l1h17state = sp.getBoolean("l1h17", false);
        boolean l1h18state = sp.getBoolean("l1h18", false);
        boolean l1h19state = sp.getBoolean("l1h19", false);
        boolean l1h20state = sp.getBoolean("l1h20", false);
        boolean l1h21state = sp.getBoolean("l1h21", false);
        boolean l1h22state = sp.getBoolean("l1h22", false);
        boolean l1h23state = sp.getBoolean("l1h23", false);
        boolean l1h24state = sp.getBoolean("l1h24", false);
        boolean l1h25state = sp.getBoolean("l1h25", false);
        boolean l1h26state = sp.getBoolean("l1h26", false);
        boolean l1h27state = sp.getBoolean("l1h27", false);
        boolean l1h28state = sp.getBoolean("l1h28", false);
        boolean l1h29state = sp.getBoolean("l1h29", false);
        boolean l1h30state = sp.getBoolean("l1h30", false);
        boolean l1h31state = sp.getBoolean("l1h31", false);
        boolean l1h32state = sp.getBoolean("l1h32", false);
        boolean l1h33state = sp.getBoolean("l1h33", false);
        boolean l1h34state = sp.getBoolean("l1h34", false);
        boolean l1h35state = sp.getBoolean("l1h35", false);
        boolean l1h36state = sp.getBoolean("l1h36", false);
        boolean l1h37state = sp.getBoolean("l1h37", false);
        boolean l1h38state = sp.getBoolean("l1h38", false);
        boolean l1h39state = sp.getBoolean("l1h39", false);
        boolean l1h40state = sp.getBoolean("l1h40", false);
        boolean l1h41state = sp.getBoolean("l1h41", false);
        boolean l1h42state = sp.getBoolean("l1h42", false);
        boolean l1h43state = sp.getBoolean("l1h43", false);
        boolean l1h44state = sp.getBoolean("l1h44", false);
        boolean l1h45state = sp.getBoolean("l1h45", false);
        boolean l1h46state = sp.getBoolean("l1h46", false);
        boolean l1h47state = sp.getBoolean("l1h47", false);
        boolean l1h48state = sp.getBoolean("l1h48", false);
        boolean l1h49state = sp.getBoolean("l1h49", false);
        boolean l1h50state = sp.getBoolean("l1h50", false);
        boolean l1h51state = sp.getBoolean("l1h51", false);
        boolean l1h52state = sp.getBoolean("l1h52", false);
        boolean l1h53state = sp.getBoolean("l1h53", false);
        boolean l1h54state = sp.getBoolean("l1h54", false);
        boolean l1h55state = sp.getBoolean("l1h55", false);

        setState(l1h1state, l1h1switch);
        setState(l1h2state, l1h2switch);
        setState(l1h3state, l1h3switch);
        setState(l1h4state, l1h4switch);
        setState(l1h5state, l1h5switch);
        setState(l1h6state, l1h6switch);
        setState(l1h7state, l1h7switch);
        setState(l1h8state, l1h8switch);
        setState(l1h9state, l1h9switch);
        setState(l1h10state, l1h10switch);
        setState(l1h11state, l1h11switch);
        setState(l1h12state, l1h12switch);
        setState(l1h13state, l1h13switch);
        setState(l1h14state, l1h14switch);
        setState(l1h15state, l1h15switch);
        setState(l1h16state, l1h16switch);
        setState(l1h17state, l1h17switch);
        setState(l1h18state, l1h18switch);
        setState(l1h19state, l1h19switch);
        setState(l1h20state, l1h20switch);
        setState(l1h21state, l1h21switch);
        setState(l1h22state, l1h22switch);
        setState(l1h23state, l1h23switch);
        setState(l1h24state, l1h24switch);
        setState(l1h25state, l1h25switch);
        setState(l1h26state, l1h26switch);
        setState(l1h27state, l1h27switch);
        setState(l1h28state, l1h28switch);
        setState(l1h29state, l1h29switch);
        setState(l1h30state, l1h30switch);
        setState(l1h31state, l1h31switch);
        setState(l1h32state, l1h32switch);
        setState(l1h33state, l1h33switch);
        setState(l1h34state, l1h34switch);
        setState(l1h35state, l1h35switch);
        setState(l1h36state, l1h36switch);
        setState(l1h37state, l1h37switch);
        setState(l1h38state, l1h38switch);
        setState(l1h39state, l1h39switch);
        setState(l1h40state, l1h40switch);
        setState(l1h41state, l1h41switch);
        setState(l1h42state, l1h42switch);
        setState(l1h43state, l1h43switch);
        setState(l1h44state, l1h44switch);
        setState(l1h45state, l1h45switch);
        setState(l1h46state, l1h46switch);
        setState(l1h47state, l1h47switch);
        setState(l1h48state, l1h48switch);
        setState(l1h49state, l1h49switch);
        setState(l1h50state, l1h50switch);
        setState(l1h51state, l1h51switch);
        setState(l1h52state, l1h52switch);
        setState(l1h53state, l1h53switch);
        setState(l1h54state, l1h54switch);
        setState(l1h55state, l1h55switch);

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
