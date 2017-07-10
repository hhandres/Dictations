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

public class Level4Melody extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_level4_melody, container, false);

        Switch l4m1switch = (Switch) view.findViewById(R.id.l4m1);
        Switch l4m2switch = (Switch) view.findViewById(R.id.l4m2);
        Switch l4m3switch = (Switch) view.findViewById(R.id.l4m3);
        Switch l4m4switch = (Switch) view.findViewById(R.id.l4m4);
        Switch l4m5switch = (Switch) view.findViewById(R.id.l4m5);
        Switch l4m6switch = (Switch) view.findViewById(R.id.l4m6);
        Switch l4m7switch = (Switch) view.findViewById(R.id.l4m7);
        Switch l4m8switch = (Switch) view.findViewById(R.id.l4m8);
        Switch l4m9switch = (Switch) view.findViewById(R.id.l4m9);
        Switch l4m10switch = (Switch) view.findViewById(R.id.l4m10);
        Switch l4m11switch = (Switch) view.findViewById(R.id.l4m11);
        Switch l4m12switch = (Switch) view.findViewById(R.id.l4m12);
        Switch l4m13switch = (Switch) view.findViewById(R.id.l4m13);
        Switch l4m14switch = (Switch) view.findViewById(R.id.l4m14);
        Switch l4m15switch = (Switch) view.findViewById(R.id.l4m15);
        Switch l4m16switch = (Switch) view.findViewById(R.id.l4m16);
        Switch l4m17switch = (Switch) view.findViewById(R.id.l4m17);
        Switch l4m18switch = (Switch) view.findViewById(R.id.l4m18);
        Switch l4m19switch = (Switch) view.findViewById(R.id.l4m19);
        Switch l4m20switch = (Switch) view.findViewById(R.id.l4m20);
        Switch l4m21switch = (Switch) view.findViewById(R.id.l4m21);
        Switch l4m22switch = (Switch) view.findViewById(R.id.l4m22);
        Switch l4m23switch = (Switch) view.findViewById(R.id.l4m23);
        Switch l4m24switch = (Switch) view.findViewById(R.id.l4m24);
        Switch l4m25switch = (Switch) view.findViewById(R.id.l4m25);
        Switch l4m26switch = (Switch) view.findViewById(R.id.l4m26);
        Switch l4m27switch = (Switch) view.findViewById(R.id.l4m27);
        Switch l4m28switch = (Switch) view.findViewById(R.id.l4m28);
        Switch l4m29switch = (Switch) view.findViewById(R.id.l4m29);
        Switch l4m30switch = (Switch) view.findViewById(R.id.l4m30);
        Switch l4m31switch = (Switch) view.findViewById(R.id.l4m31);
        Switch l4m32switch = (Switch) view.findViewById(R.id.l4m32);
        Switch l4m33switch = (Switch) view.findViewById(R.id.l4m33);
        Switch l4m34switch = (Switch) view.findViewById(R.id.l4m34);
        Switch l4m35switch = (Switch) view.findViewById(R.id.l4m35);
        Switch l4m36switch = (Switch) view.findViewById(R.id.l4m36);
        Switch l4m37switch = (Switch) view.findViewById(R.id.l4m37);
        Switch l4m38switch = (Switch) view.findViewById(R.id.l4m38);
        Switch l4m39switch = (Switch) view.findViewById(R.id.l4m39);
        Switch l4m40switch = (Switch) view.findViewById(R.id.l4m40);

        SharedPreferences sp = getActivity().getSharedPreferences("switchState",MODE_PRIVATE);

        boolean l4m1state = sp.getBoolean("l4m1", false);
        boolean l4m2state = sp.getBoolean("l4m2", false);
        boolean l4m3state = sp.getBoolean("l4m3", false);
        boolean l4m4state = sp.getBoolean("l4m4", false);
        boolean l4m5state = sp.getBoolean("l4m5", false);
        boolean l4m6state = sp.getBoolean("l4m6", false);
        boolean l4m7state = sp.getBoolean("l4m7", false);
        boolean l4m8state = sp.getBoolean("l4m8", false);
        boolean l4m9state = sp.getBoolean("l4m9", false);
        boolean l4m10state = sp.getBoolean("l4m10", false);
        boolean l4m11state = sp.getBoolean("l4m11", false);
        boolean l4m12state = sp.getBoolean("l4m12", false);
        boolean l4m13state = sp.getBoolean("l4m13", false);
        boolean l4m14state = sp.getBoolean("l4m14", false);
        boolean l4m15state = sp.getBoolean("l4m15", false);
        boolean l4m16state = sp.getBoolean("l4m16", false);
        boolean l4m17state = sp.getBoolean("l4m17", false);
        boolean l4m18state = sp.getBoolean("l4m18", false);
        boolean l4m19state = sp.getBoolean("l4m19", false);
        boolean l4m20state = sp.getBoolean("l4m20", false);
        boolean l4m21state = sp.getBoolean("l4m21", false);
        boolean l4m22state = sp.getBoolean("l4m22", false);
        boolean l4m23state = sp.getBoolean("l4m23", false);
        boolean l4m24state = sp.getBoolean("l4m24", false);
        boolean l4m25state = sp.getBoolean("l4m25", false);
        boolean l4m26state = sp.getBoolean("l4m26", false);
        boolean l4m27state = sp.getBoolean("l4m27", false);
        boolean l4m28state = sp.getBoolean("l4m28", false);
        boolean l4m29state = sp.getBoolean("l4m29", false);
        boolean l4m30state = sp.getBoolean("l4m30", false);
        boolean l4m31state = sp.getBoolean("l4m31", false);
        boolean l4m32state = sp.getBoolean("l4m32", false);
        boolean l4m33state = sp.getBoolean("l4m33", false);
        boolean l4m34state = sp.getBoolean("l4m34", false);
        boolean l4m35state = sp.getBoolean("l4m35", false);
        boolean l4m36state = sp.getBoolean("l4m36", false);
        boolean l4m37state = sp.getBoolean("l4m37", false);
        boolean l4m38state = sp.getBoolean("l4m38", false);
        boolean l4m39state = sp.getBoolean("l4m39", false);
        boolean l4m40state = sp.getBoolean("l4m40", false);

        setState(l4m1state, l4m1switch);
        setState(l4m2state, l4m2switch);
        setState(l4m3state, l4m3switch);
        setState(l4m4state, l4m4switch);
        setState(l4m5state, l4m5switch);
        setState(l4m6state, l4m6switch);
        setState(l4m7state, l4m7switch);
        setState(l4m8state, l4m8switch);
        setState(l4m9state, l4m9switch);
        setState(l4m10state, l4m10switch);
        setState(l4m11state, l4m11switch);
        setState(l4m12state, l4m12switch);
        setState(l4m13state, l4m13switch);
        setState(l4m14state, l4m14switch);
        setState(l4m15state, l4m15switch);
        setState(l4m16state, l4m16switch);
        setState(l4m17state, l4m17switch);
        setState(l4m18state, l4m18switch);
        setState(l4m19state, l4m19switch);
        setState(l4m20state, l4m20switch);
        setState(l4m21state, l4m21switch);
        setState(l4m22state, l4m22switch);
        setState(l4m23state, l4m23switch);
        setState(l4m24state, l4m24switch);
        setState(l4m25state, l4m25switch);
        setState(l4m26state, l4m26switch);
        setState(l4m27state, l4m27switch);
        setState(l4m28state, l4m28switch);
        setState(l4m29state, l4m29switch);
        setState(l4m30state, l4m30switch);
        setState(l4m31state, l4m31switch);
        setState(l4m32state, l4m32switch);
        setState(l4m33state, l4m33switch);
        setState(l4m34state, l4m34switch);
        setState(l4m35state, l4m35switch);
        setState(l4m36state, l4m36switch);
        setState(l4m37state, l4m37switch);
        setState(l4m38state, l4m38switch);
        setState(l4m39state, l4m39switch);
        setState(l4m40state, l4m40switch);

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
