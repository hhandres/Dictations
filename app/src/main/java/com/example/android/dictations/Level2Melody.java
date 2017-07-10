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

public class Level2Melody extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_level2_melody, container, false);

        Switch l2m1switch = (Switch) view.findViewById(R.id.l2m1);
        Switch l2m2switch = (Switch) view.findViewById(R.id.l2m2);
        Switch l2m3switch = (Switch) view.findViewById(R.id.l2m3);
        Switch l2m4switch = (Switch) view.findViewById(R.id.l2m4);
        Switch l2m5switch = (Switch) view.findViewById(R.id.l2m5);
        Switch l2m6switch = (Switch) view.findViewById(R.id.l2m6);
        Switch l2m7switch = (Switch) view.findViewById(R.id.l2m7);
        Switch l2m8switch = (Switch) view.findViewById(R.id.l2m8);
        Switch l2m9switch = (Switch) view.findViewById(R.id.l2m9);
        Switch l2m10switch = (Switch) view.findViewById(R.id.l2m10);
        Switch l2m11switch = (Switch) view.findViewById(R.id.l2m11);
        Switch l2m12switch = (Switch) view.findViewById(R.id.l2m12);
        Switch l2m13switch = (Switch) view.findViewById(R.id.l2m13);
        Switch l2m14switch = (Switch) view.findViewById(R.id.l2m14);
        Switch l2m15switch = (Switch) view.findViewById(R.id.l2m15);
        Switch l2m16switch = (Switch) view.findViewById(R.id.l2m16);
        Switch l2m17switch = (Switch) view.findViewById(R.id.l2m17);
        Switch l2m18switch = (Switch) view.findViewById(R.id.l2m18);
        Switch l2m19switch = (Switch) view.findViewById(R.id.l2m19);
        Switch l2m20switch = (Switch) view.findViewById(R.id.l2m20);
        Switch l2m21switch = (Switch) view.findViewById(R.id.l2m21);
        Switch l2m22switch = (Switch) view.findViewById(R.id.l2m22);
        Switch l2m23switch = (Switch) view.findViewById(R.id.l2m23);
        Switch l2m24switch = (Switch) view.findViewById(R.id.l2m24);
        Switch l2m25switch = (Switch) view.findViewById(R.id.l2m25);
        Switch l2m26switch = (Switch) view.findViewById(R.id.l2m26);
        Switch l2m27switch = (Switch) view.findViewById(R.id.l2m27);
        Switch l2m28switch = (Switch) view.findViewById(R.id.l2m28);
        Switch l2m29switch = (Switch) view.findViewById(R.id.l2m29);
        Switch l2m30switch = (Switch) view.findViewById(R.id.l2m30);
        Switch l2m31switch = (Switch) view.findViewById(R.id.l2m31);
        Switch l2m32switch = (Switch) view.findViewById(R.id.l2m32);
        Switch l2m33switch = (Switch) view.findViewById(R.id.l2m33);
        Switch l2m34switch = (Switch) view.findViewById(R.id.l2m34);
        Switch l2m35switch = (Switch) view.findViewById(R.id.l2m35);
        Switch l2m36switch = (Switch) view.findViewById(R.id.l2m36);
        Switch l2m37switch = (Switch) view.findViewById(R.id.l2m37);
        Switch l2m38switch = (Switch) view.findViewById(R.id.l2m38);
        Switch l2m39switch = (Switch) view.findViewById(R.id.l2m39);
        Switch l2m40switch = (Switch) view.findViewById(R.id.l2m40);

        SharedPreferences sp = getActivity().getSharedPreferences("switchState",MODE_PRIVATE);

        boolean l2m1state = sp.getBoolean("l2m1", false);
        boolean l2m2state = sp.getBoolean("l2m2", false);
        boolean l2m3state = sp.getBoolean("l2m3", false);
        boolean l2m4state = sp.getBoolean("l2m4", false);
        boolean l2m5state = sp.getBoolean("l2m5", false);
        boolean l2m6state = sp.getBoolean("l2m6", false);
        boolean l2m7state = sp.getBoolean("l2m7", false);
        boolean l2m8state = sp.getBoolean("l2m8", false);
        boolean l2m9state = sp.getBoolean("l2m9", false);
        boolean l2m10state = sp.getBoolean("l2m10", false);
        boolean l2m11state = sp.getBoolean("l2m11", false);
        boolean l2m12state = sp.getBoolean("l2m12", false);
        boolean l2m13state = sp.getBoolean("l2m13", false);
        boolean l2m14state = sp.getBoolean("l2m14", false);
        boolean l2m15state = sp.getBoolean("l2m15", false);
        boolean l2m16state = sp.getBoolean("l2m16", false);
        boolean l2m17state = sp.getBoolean("l2m17", false);
        boolean l2m18state = sp.getBoolean("l2m18", false);
        boolean l2m19state = sp.getBoolean("l2m19", false);
        boolean l2m20state = sp.getBoolean("l2m20", false);
        boolean l2m21state = sp.getBoolean("l2m21", false);
        boolean l2m22state = sp.getBoolean("l2m22", false);
        boolean l2m23state = sp.getBoolean("l2m23", false);
        boolean l2m24state = sp.getBoolean("l2m24", false);
        boolean l2m25state = sp.getBoolean("l2m25", false);
        boolean l2m26state = sp.getBoolean("l2m26", false);
        boolean l2m27state = sp.getBoolean("l2m27", false);
        boolean l2m28state = sp.getBoolean("l2m28", false);
        boolean l2m29state = sp.getBoolean("l2m29", false);
        boolean l2m30state = sp.getBoolean("l2m30", false);
        boolean l2m31state = sp.getBoolean("l2m31", false);
        boolean l2m32state = sp.getBoolean("l2m32", false);
        boolean l2m33state = sp.getBoolean("l2m33", false);
        boolean l2m34state = sp.getBoolean("l2m34", false);
        boolean l2m35state = sp.getBoolean("l2m35", false);
        boolean l2m36state = sp.getBoolean("l2m36", false);
        boolean l2m37state = sp.getBoolean("l2m37", false);
        boolean l2m38state = sp.getBoolean("l2m38", false);
        boolean l2m39state = sp.getBoolean("l2m39", false);
        boolean l2m40state = sp.getBoolean("l2m40", false);

        setState(l2m1state, l2m1switch);
        setState(l2m2state, l2m2switch);
        setState(l2m3state, l2m3switch);
        setState(l2m4state, l2m4switch);
        setState(l2m5state, l2m5switch);
        setState(l2m6state, l2m6switch);
        setState(l2m7state, l2m7switch);
        setState(l2m8state, l2m8switch);
        setState(l2m9state, l2m9switch);
        setState(l2m10state, l2m10switch);
        setState(l2m11state, l2m11switch);
        setState(l2m12state, l2m12switch);
        setState(l2m13state, l2m13switch);
        setState(l2m14state, l2m14switch);
        setState(l2m15state, l2m15switch);
        setState(l2m16state, l2m16switch);
        setState(l2m17state, l2m17switch);
        setState(l2m18state, l2m18switch);
        setState(l2m19state, l2m19switch);
        setState(l2m20state, l2m20switch);
        setState(l2m21state, l2m21switch);
        setState(l2m22state, l2m22switch);
        setState(l2m23state, l2m23switch);
        setState(l2m24state, l2m24switch);
        setState(l2m25state, l2m25switch);
        setState(l2m26state, l2m26switch);
        setState(l2m27state, l2m27switch);
        setState(l2m28state, l2m28switch);
        setState(l2m29state, l2m29switch);
        setState(l2m30state, l2m30switch);
        setState(l2m31state, l2m31switch);
        setState(l2m32state, l2m32switch);
        setState(l2m33state, l2m33switch);
        setState(l2m34state, l2m34switch);
        setState(l2m35state, l2m35switch);
        setState(l2m36state, l2m36switch);
        setState(l2m37state, l2m37switch);
        setState(l2m38state, l2m38switch);
        setState(l2m39state, l2m39switch);
        setState(l2m40state, l2m40switch);

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
