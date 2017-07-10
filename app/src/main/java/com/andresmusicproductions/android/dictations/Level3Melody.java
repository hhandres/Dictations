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
 * Created by Hoyt on 6/28/2017.
 */

public class Level3Melody extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_level3_melody, container, false);

        Switch l3m1switch = (Switch) view.findViewById(R.id.l3m1);
        Switch l3m2switch = (Switch) view.findViewById(R.id.l3m2);
        Switch l3m3switch = (Switch) view.findViewById(R.id.l3m3);
        Switch l3m4switch = (Switch) view.findViewById(R.id.l3m4);
        Switch l3m5switch = (Switch) view.findViewById(R.id.l3m5);
        Switch l3m6switch = (Switch) view.findViewById(R.id.l3m6);
        Switch l3m7switch = (Switch) view.findViewById(R.id.l3m7);
        Switch l3m8switch = (Switch) view.findViewById(R.id.l3m8);
        Switch l3m9switch = (Switch) view.findViewById(R.id.l3m9);
        Switch l3m10switch = (Switch) view.findViewById(R.id.l3m10);
        Switch l3m11switch = (Switch) view.findViewById(R.id.l3m11);
        Switch l3m12switch = (Switch) view.findViewById(R.id.l3m12);
        Switch l3m13switch = (Switch) view.findViewById(R.id.l3m13);
        Switch l3m14switch = (Switch) view.findViewById(R.id.l3m14);
        Switch l3m15switch = (Switch) view.findViewById(R.id.l3m15);
        Switch l3m16switch = (Switch) view.findViewById(R.id.l3m16);
        Switch l3m17switch = (Switch) view.findViewById(R.id.l3m17);
        Switch l3m18switch = (Switch) view.findViewById(R.id.l3m18);
        Switch l3m19switch = (Switch) view.findViewById(R.id.l3m19);
        Switch l3m20switch = (Switch) view.findViewById(R.id.l3m20);
        Switch l3m21switch = (Switch) view.findViewById(R.id.l3m21);
        Switch l3m22switch = (Switch) view.findViewById(R.id.l3m22);
        Switch l3m23switch = (Switch) view.findViewById(R.id.l3m23);
        Switch l3m24switch = (Switch) view.findViewById(R.id.l3m24);
        Switch l3m25switch = (Switch) view.findViewById(R.id.l3m25);
        Switch l3m26switch = (Switch) view.findViewById(R.id.l3m26);
        Switch l3m27switch = (Switch) view.findViewById(R.id.l3m27);
        Switch l3m28switch = (Switch) view.findViewById(R.id.l3m28);
        Switch l3m29switch = (Switch) view.findViewById(R.id.l3m29);
        Switch l3m30switch = (Switch) view.findViewById(R.id.l3m30);
        Switch l3m31switch = (Switch) view.findViewById(R.id.l3m31);
        Switch l3m32switch = (Switch) view.findViewById(R.id.l3m32);
        Switch l3m33switch = (Switch) view.findViewById(R.id.l3m33);
        Switch l3m34switch = (Switch) view.findViewById(R.id.l3m34);
        Switch l3m35switch = (Switch) view.findViewById(R.id.l3m35);
        
        SharedPreferences sp = getActivity().getSharedPreferences("switchState",MODE_PRIVATE);

        boolean l3m1state = sp.getBoolean("l3m1", false);
        boolean l3m2state = sp.getBoolean("l3m2", false);
        boolean l3m3state = sp.getBoolean("l3m3", false);
        boolean l3m4state = sp.getBoolean("l3m4", false);
        boolean l3m5state = sp.getBoolean("l3m5", false);
        boolean l3m6state = sp.getBoolean("l3m6", false);
        boolean l3m7state = sp.getBoolean("l3m7", false);
        boolean l3m8state = sp.getBoolean("l3m8", false);
        boolean l3m9state = sp.getBoolean("l3m9", false);
        boolean l3m10state = sp.getBoolean("l3m10", false);
        boolean l3m11state = sp.getBoolean("l3m11", false);
        boolean l3m12state = sp.getBoolean("l3m12", false);
        boolean l3m13state = sp.getBoolean("l3m13", false);
        boolean l3m14state = sp.getBoolean("l3m14", false);
        boolean l3m15state = sp.getBoolean("l3m15", false);
        boolean l3m16state = sp.getBoolean("l3m16", false);
        boolean l3m17state = sp.getBoolean("l3m17", false);
        boolean l3m18state = sp.getBoolean("l3m18", false);
        boolean l3m19state = sp.getBoolean("l3m19", false);
        boolean l3m20state = sp.getBoolean("l3m20", false);
        boolean l3m21state = sp.getBoolean("l3m21", false);
        boolean l3m22state = sp.getBoolean("l3m22", false);
        boolean l3m23state = sp.getBoolean("l3m23", false);
        boolean l3m24state = sp.getBoolean("l3m24", false);
        boolean l3m25state = sp.getBoolean("l3m25", false);
        boolean l3m26state = sp.getBoolean("l3m26", false);
        boolean l3m27state = sp.getBoolean("l3m27", false);
        boolean l3m28state = sp.getBoolean("l3m28", false);
        boolean l3m29state = sp.getBoolean("l3m29", false);
        boolean l3m30state = sp.getBoolean("l3m30", false);
        boolean l3m31state = sp.getBoolean("l3m31", false);
        boolean l3m32state = sp.getBoolean("l3m32", false);
        boolean l3m33state = sp.getBoolean("l3m33", false);
        boolean l3m34state = sp.getBoolean("l3m34", false);
        boolean l3m35state = sp.getBoolean("l3m35", false);

        setState(l3m1state, l3m1switch);
        setState(l3m2state, l3m2switch);
        setState(l3m3state, l3m3switch);
        setState(l3m4state, l3m4switch);
        setState(l3m5state, l3m5switch);
        setState(l3m6state, l3m6switch);
        setState(l3m7state, l3m7switch);
        setState(l3m8state, l3m8switch);
        setState(l3m9state, l3m9switch);
        setState(l3m10state, l3m10switch);
        setState(l3m11state, l3m11switch);
        setState(l3m12state, l3m12switch);
        setState(l3m13state, l3m13switch);
        setState(l3m14state, l3m14switch);
        setState(l3m15state, l3m15switch);
        setState(l3m16state, l3m16switch);
        setState(l3m17state, l3m17switch);
        setState(l3m18state, l3m18switch);
        setState(l3m19state, l3m19switch);
        setState(l3m20state, l3m20switch);
        setState(l3m21state, l3m21switch);
        setState(l3m22state, l3m22switch);
        setState(l3m23state, l3m23switch);
        setState(l3m24state, l3m24switch);
        setState(l3m25state, l3m25switch);
        setState(l3m26state, l3m26switch);
        setState(l3m27state, l3m27switch);
        setState(l3m28state, l3m28switch);
        setState(l3m29state, l3m29switch);
        setState(l3m30state, l3m30switch);
        setState(l3m31state, l3m31switch);
        setState(l3m32state, l3m32switch);
        setState(l3m33state, l3m33switch);
        setState(l3m34state, l3m34switch);
        setState(l3m35state, l3m35switch);
        
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
