package com.example.android.dictations2;

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

public class Level1Melody extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_level1_melody, container, false);


        Switch l1m1switch = (Switch) view.findViewById(R.id.l1m1);
        Switch l1m2switch = (Switch) view.findViewById(R.id.l1m2);
        Switch l1m3switch = (Switch) view.findViewById(R.id.l1m3);
        Switch l1m4switch = (Switch) view.findViewById(R.id.l1m4);
        Switch l1m5switch = (Switch) view.findViewById(R.id.l1m5);
        Switch l1m6switch = (Switch) view.findViewById(R.id.l1m6);
        Switch l1m7switch = (Switch) view.findViewById(R.id.l1m7);
        Switch l1m8switch = (Switch) view.findViewById(R.id.l1m8);
        Switch l1m9switch = (Switch) view.findViewById(R.id.l1m9);
        Switch l1m10switch = (Switch) view.findViewById(R.id.l1m10);
        Switch l1m11switch = (Switch) view.findViewById(R.id.l1m11);
        Switch l1m12switch = (Switch) view.findViewById(R.id.l1m12);
        Switch l1m13switch = (Switch) view.findViewById(R.id.l1m13);
        Switch l1m14switch = (Switch) view.findViewById(R.id.l1m14);
        Switch l1m15switch = (Switch) view.findViewById(R.id.l1m15);
        Switch l1m16switch = (Switch) view.findViewById(R.id.l1m16);
        Switch l1m17switch = (Switch) view.findViewById(R.id.l1m17);
        Switch l1m18switch = (Switch) view.findViewById(R.id.l1m18);
        Switch l1m19switch = (Switch) view.findViewById(R.id.l1m19);
        Switch l1m20switch = (Switch) view.findViewById(R.id.l1m20);
        Switch l1m21switch = (Switch) view.findViewById(R.id.l1m21);
        Switch l1m22switch = (Switch) view.findViewById(R.id.l1m22);
        Switch l1m23switch = (Switch) view.findViewById(R.id.l1m23);
        Switch l1m24switch = (Switch) view.findViewById(R.id.l1m24);
        Switch l1m25switch = (Switch) view.findViewById(R.id.l1m25);
        Switch l1m26switch = (Switch) view.findViewById(R.id.l1m26);
        Switch l1m27switch = (Switch) view.findViewById(R.id.l1m27);
        Switch l1m28switch = (Switch) view.findViewById(R.id.l1m28);
        Switch l1m29switch = (Switch) view.findViewById(R.id.l1m29);
        Switch l1m30switch = (Switch) view.findViewById(R.id.l1m30);
        Switch l1m31switch = (Switch) view.findViewById(R.id.l1m31);
        Switch l1m32switch = (Switch) view.findViewById(R.id.l1m32);
        Switch l1m33switch = (Switch) view.findViewById(R.id.l1m33);
        Switch l1m34switch = (Switch) view.findViewById(R.id.l1m34);
        Switch l1m35switch = (Switch) view.findViewById(R.id.l1m35);
        Switch l1m36switch = (Switch) view.findViewById(R.id.l1m36);
        Switch l1m37switch = (Switch) view.findViewById(R.id.l1m37);
        Switch l1m38switch = (Switch) view.findViewById(R.id.l1m38);
        Switch l1m39switch = (Switch) view.findViewById(R.id.l1m39);
        Switch l1m40switch = (Switch) view.findViewById(R.id.l1m40);
        Switch l1m41switch = (Switch) view.findViewById(R.id.l1m41);
        Switch l1m42switch = (Switch) view.findViewById(R.id.l1m42);
        Switch l1m43switch = (Switch) view.findViewById(R.id.l1m43);
        Switch l1m44switch = (Switch) view.findViewById(R.id.l1m44);
        Switch l1m45switch = (Switch) view.findViewById(R.id.l1m45);
        Switch l1m46switch = (Switch) view.findViewById(R.id.l1m46);
        Switch l1m47switch = (Switch) view.findViewById(R.id.l1m47);
        Switch l1m48switch = (Switch) view.findViewById(R.id.l1m48);
        Switch l1m49switch = (Switch) view.findViewById(R.id.l1m49);
        Switch l1m50switch = (Switch) view.findViewById(R.id.l1m50);
        Switch l1m51switch = (Switch) view.findViewById(R.id.l1m51);
        Switch l1m52switch = (Switch) view.findViewById(R.id.l1m52);
        Switch l1m53switch = (Switch) view.findViewById(R.id.l1m53);
        Switch l1m54switch = (Switch) view.findViewById(R.id.l1m54);
        Switch l1m55switch = (Switch) view.findViewById(R.id.l1m55);
        Switch l1m56switch = (Switch) view.findViewById(R.id.l1m56);
        Switch l1m57switch = (Switch) view.findViewById(R.id.l1m57);
        Switch l1m58switch = (Switch) view.findViewById(R.id.l1m58);
        Switch l1m59switch = (Switch) view.findViewById(R.id.l1m59);
        Switch l1m60switch = (Switch) view.findViewById(R.id.l1m60);
        Switch l1m61switch = (Switch) view.findViewById(R.id.l1m61);
        Switch l1m62switch = (Switch) view.findViewById(R.id.l1m62);
        Switch l1m63switch = (Switch) view.findViewById(R.id.l1m63);
        Switch l1m64switch = (Switch) view.findViewById(R.id.l1m64);
        Switch l1m65switch = (Switch) view.findViewById(R.id.l1m65);
        Switch l1m66switch = (Switch) view.findViewById(R.id.l1m66);
        Switch l1m67switch = (Switch) view.findViewById(R.id.l1m67);
        Switch l1m68switch = (Switch) view.findViewById(R.id.l1m68);
        Switch l1m69switch = (Switch) view.findViewById(R.id.l1m69);
        Switch l1m70switch = (Switch) view.findViewById(R.id.l1m70);


        SharedPreferences sp = getActivity().getSharedPreferences("switchState",MODE_PRIVATE);

        boolean l1m1state = sp.getBoolean("l1m1", false);
        boolean l1m2state = sp.getBoolean("l1m2", false);
        boolean l1m3state = sp.getBoolean("l1m3", false);
        boolean l1m4state = sp.getBoolean("l1m4", false);
        boolean l1m5state = sp.getBoolean("l1m5", false);
        boolean l1m6state = sp.getBoolean("l1m6", false);
        boolean l1m7state = sp.getBoolean("l1m7", false);
        boolean l1m8state = sp.getBoolean("l1m8", false);
        boolean l1m9state = sp.getBoolean("l1m9", false);
        boolean l1m10state = sp.getBoolean("l1m10", false);
        boolean l1m11state = sp.getBoolean("l1m11", false);
        boolean l1m12state = sp.getBoolean("l1m12", false);
        boolean l1m13state = sp.getBoolean("l1m13", false);
        boolean l1m14state = sp.getBoolean("l1m14", false);
        boolean l1m15state = sp.getBoolean("l1m15", false);
        boolean l1m16state = sp.getBoolean("l1m16", false);
        boolean l1m17state = sp.getBoolean("l1m17", false);
        boolean l1m18state = sp.getBoolean("l1m18", false);
        boolean l1m19state = sp.getBoolean("l1m19", false);
        boolean l1m20state = sp.getBoolean("l1m20", false);
        boolean l1m21state = sp.getBoolean("l1m21", false);
        boolean l1m22state = sp.getBoolean("l1m22", false);
        boolean l1m23state = sp.getBoolean("l1m23", false);
        boolean l1m24state = sp.getBoolean("l1m24", false);
        boolean l1m25state = sp.getBoolean("l1m25", false);
        boolean l1m26state = sp.getBoolean("l1m26", false);
        boolean l1m27state = sp.getBoolean("l1m27", false);
        boolean l1m28state = sp.getBoolean("l1m28", false);
        boolean l1m29state = sp.getBoolean("l1m29", false);
        boolean l1m30state = sp.getBoolean("l1m30", false);
        boolean l1m31state = sp.getBoolean("l1m31", false);
        boolean l1m32state = sp.getBoolean("l1m32", false);
        boolean l1m33state = sp.getBoolean("l1m33", false);
        boolean l1m34state = sp.getBoolean("l1m34", false);
        boolean l1m35state = sp.getBoolean("l1m35", false);
        boolean l1m36state = sp.getBoolean("l1m36", false);
        boolean l1m37state = sp.getBoolean("l1m37", false);
        boolean l1m38state = sp.getBoolean("l1m38", false);
        boolean l1m39state = sp.getBoolean("l1m39", false);
        boolean l1m40state = sp.getBoolean("l1m40", false);
        boolean l1m41state = sp.getBoolean("l1m41", false);
        boolean l1m42state = sp.getBoolean("l1m42", false);
        boolean l1m43state = sp.getBoolean("l1m43", false);
        boolean l1m44state = sp.getBoolean("l1m44", false);
        boolean l1m45state = sp.getBoolean("l1m45", false);
        boolean l1m46state = sp.getBoolean("l1m46", false);
        boolean l1m47state = sp.getBoolean("l1m47", false);
        boolean l1m48state = sp.getBoolean("l1m48", false);
        boolean l1m49state = sp.getBoolean("l1m49", false);
        boolean l1m50state = sp.getBoolean("l1m50", false);
        boolean l1m51state = sp.getBoolean("l1m51", false);
        boolean l1m52state = sp.getBoolean("l1m52", false);
        boolean l1m53state = sp.getBoolean("l1m53", false);
        boolean l1m54state = sp.getBoolean("l1m54", false);
        boolean l1m55state = sp.getBoolean("l1m55", false);
        boolean l1m56state = sp.getBoolean("l1m56", false);
        boolean l1m57state = sp.getBoolean("l1m57", false);
        boolean l1m58state = sp.getBoolean("l1m58", false);
        boolean l1m59state = sp.getBoolean("l1m59", false);
        boolean l1m60state = sp.getBoolean("l1m60", false);
        boolean l1m61state = sp.getBoolean("l1m61", false);
        boolean l1m62state = sp.getBoolean("l1m62", false);
        boolean l1m63state = sp.getBoolean("l1m63", false);
        boolean l1m64state = sp.getBoolean("l1m64", false);
        boolean l1m65state = sp.getBoolean("l1m65", false);
        boolean l1m66state = sp.getBoolean("l1m66", false);
        boolean l1m67state = sp.getBoolean("l1m67", false);
        boolean l1m68state = sp.getBoolean("l1m68", false);
        boolean l1m69state = sp.getBoolean("l1m69", false);
        boolean l1m70state = sp.getBoolean("l1m70", false);


        setState(l1m1state, l1m1switch);
        setState(l1m2state, l1m2switch);
        setState(l1m3state, l1m3switch);
        setState(l1m4state, l1m4switch);
        setState(l1m5state, l1m5switch);
        setState(l1m6state, l1m6switch);
        setState(l1m7state, l1m7switch);
        setState(l1m8state, l1m8switch);
        setState(l1m9state, l1m9switch);
        setState(l1m10state, l1m10switch);
        setState(l1m11state, l1m11switch);
        setState(l1m12state, l1m12switch);
        setState(l1m13state, l1m13switch);
        setState(l1m14state, l1m14switch);
        setState(l1m15state, l1m15switch);
        setState(l1m16state, l1m16switch);
        setState(l1m17state, l1m17switch);
        setState(l1m18state, l1m18switch);
        setState(l1m19state, l1m19switch);
        setState(l1m20state, l1m20switch);
        setState(l1m21state, l1m21switch);
        setState(l1m22state, l1m22switch);
        setState(l1m23state, l1m23switch);
        setState(l1m24state, l1m24switch);
        setState(l1m25state, l1m25switch);
        setState(l1m26state, l1m26switch);
        setState(l1m27state, l1m27switch);
        setState(l1m28state, l1m28switch);
        setState(l1m29state, l1m29switch);
        setState(l1m30state, l1m30switch);
        setState(l1m31state, l1m31switch);
        setState(l1m32state, l1m32switch);
        setState(l1m33state, l1m33switch);
        setState(l1m34state, l1m34switch);
        setState(l1m35state, l1m35switch);
        setState(l1m36state, l1m36switch);
        setState(l1m37state, l1m37switch);
        setState(l1m38state, l1m38switch);
        setState(l1m39state, l1m39switch);
        setState(l1m40state, l1m40switch);
        setState(l1m41state, l1m41switch);
        setState(l1m42state, l1m42switch);
        setState(l1m43state, l1m43switch);
        setState(l1m44state, l1m44switch);
        setState(l1m45state, l1m45switch);
        setState(l1m46state, l1m46switch);
        setState(l1m47state, l1m47switch);
        setState(l1m48state, l1m48switch);
        setState(l1m49state, l1m49switch);
        setState(l1m50state, l1m50switch);
        setState(l1m51state, l1m51switch);
        setState(l1m52state, l1m52switch);
        setState(l1m53state, l1m53switch);
        setState(l1m54state, l1m54switch);
        setState(l1m55state, l1m55switch);
        setState(l1m56state, l1m56switch);
        setState(l1m57state, l1m57switch);
        setState(l1m58state, l1m58switch);
        setState(l1m59state, l1m59switch);
        setState(l1m60state, l1m60switch);
        setState(l1m61state, l1m61switch);
        setState(l1m62state, l1m62switch);
        setState(l1m63state, l1m63switch);
        setState(l1m64state, l1m64switch);
        setState(l1m65state, l1m65switch);
        setState(l1m66state, l1m66switch);
        setState(l1m67state, l1m67switch);
        setState(l1m68state, l1m68switch);
        setState(l1m69state, l1m69switch);
        setState(l1m70state, l1m70switch);


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
