package com.example.android.dictations;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;

import static android.content.Context.MODE_PRIVATE;


public class BeginnerRhythm extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_beginner_rhythm, container, false);


        Switch br1switch = (Switch) view.findViewById(R.id.br1);
        Switch br2switch = (Switch) view.findViewById(R.id.br2);
        Switch br3switch = (Switch) view.findViewById(R.id.br3);
        Switch br4switch = (Switch) view.findViewById(R.id.br4);
        Switch br5switch = (Switch) view.findViewById(R.id.br5);
        Switch br6switch = (Switch) view.findViewById(R.id.br6);
        Switch br7switch = (Switch) view.findViewById(R.id.br7);
        Switch br8switch = (Switch) view.findViewById(R.id.br8);
        Switch br9switch = (Switch) view.findViewById(R.id.br9);
        Switch br10switch = (Switch) view.findViewById(R.id.br10);
        Switch br11switch = (Switch) view.findViewById(R.id.br11);
        Switch br12switch = (Switch) view.findViewById(R.id.br12);
        Switch br13switch = (Switch) view.findViewById(R.id.br13);
        Switch br14switch = (Switch) view.findViewById(R.id.br14);
        Switch br15switch = (Switch) view.findViewById(R.id.br15);
        Switch br16switch = (Switch) view.findViewById(R.id.br16);
        Switch br17switch = (Switch) view.findViewById(R.id.br17);
        Switch br18switch = (Switch) view.findViewById(R.id.br18);
        Switch br19switch = (Switch) view.findViewById(R.id.br19);
        Switch br20switch = (Switch) view.findViewById(R.id.br20);
        Switch br21switch = (Switch) view.findViewById(R.id.br21);
        Switch br22switch = (Switch) view.findViewById(R.id.br22);
        Switch br23switch = (Switch) view.findViewById(R.id.br23);
        Switch br24switch = (Switch) view.findViewById(R.id.br24);
        Switch br25switch = (Switch) view.findViewById(R.id.br25);
        Switch br26switch = (Switch) view.findViewById(R.id.br26);
        Switch br27switch = (Switch) view.findViewById(R.id.br27);
        Switch br28switch = (Switch) view.findViewById(R.id.br28);
        Switch br29switch = (Switch) view.findViewById(R.id.br29);
        Switch br30switch = (Switch) view.findViewById(R.id.br30);
        Switch br31switch = (Switch) view.findViewById(R.id.br31);
        Switch br32switch = (Switch) view.findViewById(R.id.br32);
        Switch br33switch = (Switch) view.findViewById(R.id.br33);
        Switch br34switch = (Switch) view.findViewById(R.id.br34);
        Switch br35switch = (Switch) view.findViewById(R.id.br35);
        Switch br36switch = (Switch) view.findViewById(R.id.br36);
        Switch br37switch = (Switch) view.findViewById(R.id.br37);
        Switch br38switch = (Switch) view.findViewById(R.id.br38);
        Switch br39switch = (Switch) view.findViewById(R.id.br39);
        Switch br40switch = (Switch) view.findViewById(R.id.br40);
        Switch br41switch = (Switch) view.findViewById(R.id.br41);
        Switch br42switch = (Switch) view.findViewById(R.id.br42);
        Switch br43switch = (Switch) view.findViewById(R.id.br43);
        Switch br44switch = (Switch) view.findViewById(R.id.br44);
        Switch br45switch = (Switch) view.findViewById(R.id.br45);
        Switch br46switch = (Switch) view.findViewById(R.id.br46);
        Switch br47switch = (Switch) view.findViewById(R.id.br47);
        Switch br48switch = (Switch) view.findViewById(R.id.br48);
        Switch br49switch = (Switch) view.findViewById(R.id.br49);
        Switch br50switch = (Switch) view.findViewById(R.id.br50);
        Switch br51switch = (Switch) view.findViewById(R.id.br51);
        Switch br52switch = (Switch) view.findViewById(R.id.br52);
        Switch br53switch = (Switch) view.findViewById(R.id.br53);
        Switch br54switch = (Switch) view.findViewById(R.id.br54);
        Switch br55switch = (Switch) view.findViewById(R.id.br55);
        Switch br56switch = (Switch) view.findViewById(R.id.br56);
        Switch br57switch = (Switch) view.findViewById(R.id.br57);
        Switch br58switch = (Switch) view.findViewById(R.id.br58);
        Switch br59switch = (Switch) view.findViewById(R.id.br59);
        Switch br60switch = (Switch) view.findViewById(R.id.br60);
        Switch br61switch = (Switch) view.findViewById(R.id.br61);
        Switch br62switch = (Switch) view.findViewById(R.id.br62);
        Switch br63switch = (Switch) view.findViewById(R.id.br63);
        Switch br64switch = (Switch) view.findViewById(R.id.br64);
        Switch br65switch = (Switch) view.findViewById(R.id.br65);
        Switch br66switch = (Switch) view.findViewById(R.id.br66);
        Switch br67switch = (Switch) view.findViewById(R.id.br67);
        Switch br68switch = (Switch) view.findViewById(R.id.br68);

        SharedPreferences sp = getActivity().getSharedPreferences("switchState",MODE_PRIVATE);

        boolean br1state = sp.getBoolean("br1", false);
        boolean br2state = sp.getBoolean("br2", false);
        boolean br3state = sp.getBoolean("br3", false);
        boolean br4state = sp.getBoolean("br4", false);
        boolean br5state = sp.getBoolean("br5", false);
        boolean br6state = sp.getBoolean("br6", false);
        boolean br7state = sp.getBoolean("br7", false);
        boolean br8state = sp.getBoolean("br8", false);
        boolean br9state = sp.getBoolean("br9", false);
        boolean br10state = sp.getBoolean("br10", false);
        boolean br11state = sp.getBoolean("br11", false);
        boolean br12state = sp.getBoolean("br12", false);
        boolean br13state = sp.getBoolean("br13", false);
        boolean br14state = sp.getBoolean("br14", false);
        boolean br15state = sp.getBoolean("br15", false);
        boolean br16state = sp.getBoolean("br16", false);
        boolean br17state = sp.getBoolean("br17", false);
        boolean br18state = sp.getBoolean("br18", false);
        boolean br19state = sp.getBoolean("br19", false);
        boolean br20state = sp.getBoolean("br20", false);
        boolean br21state = sp.getBoolean("br21", false);
        boolean br22state = sp.getBoolean("br22", false);
        boolean br23state = sp.getBoolean("br23", false);
        boolean br24state = sp.getBoolean("br24", false);
        boolean br25state = sp.getBoolean("br25", false);
        boolean br26state = sp.getBoolean("br26", false);
        boolean br27state = sp.getBoolean("br27", false);
        boolean br28state = sp.getBoolean("br28", false);
        boolean br29state = sp.getBoolean("br29", false);
        boolean br30state = sp.getBoolean("br30", false);
        boolean br31state = sp.getBoolean("br31", false);
        boolean br32state = sp.getBoolean("br32", false);
        boolean br33state = sp.getBoolean("br33", false);
        boolean br34state = sp.getBoolean("br34", false);
        boolean br35state = sp.getBoolean("br35", false);
        boolean br36state = sp.getBoolean("br36", false);
        boolean br37state = sp.getBoolean("br37", false);
        boolean br38state = sp.getBoolean("br38", false);
        boolean br39state = sp.getBoolean("br39", false);
        boolean br40state = sp.getBoolean("br40", false);
        boolean br41state = sp.getBoolean("br41", false);
        boolean br42state = sp.getBoolean("br42", false);
        boolean br43state = sp.getBoolean("br43", false);
        boolean br44state = sp.getBoolean("br44", false);
        boolean br45state = sp.getBoolean("br45", false);
        boolean br46state = sp.getBoolean("br46", false);
        boolean br47state = sp.getBoolean("br47", false);
        boolean br48state = sp.getBoolean("br48", false);
        boolean br49state = sp.getBoolean("br49", false);
        boolean br50state = sp.getBoolean("br50", false);
        boolean br51state = sp.getBoolean("br51", false);
        boolean br52state = sp.getBoolean("br52", false);
        boolean br53state = sp.getBoolean("br53", false);
        boolean br54state = sp.getBoolean("br54", false);
        boolean br55state = sp.getBoolean("br55", false);
        boolean br56state = sp.getBoolean("br56", false);
        boolean br57state = sp.getBoolean("br57", false);
        boolean br58state = sp.getBoolean("br58", false);
        boolean br59state = sp.getBoolean("br59", false);
        boolean br60state = sp.getBoolean("br60", false);
        boolean br61state = sp.getBoolean("br61", false);
        boolean br62state = sp.getBoolean("br62", false);
        boolean br63state = sp.getBoolean("br63", false);
        boolean br64state = sp.getBoolean("br64", false);
        boolean br65state = sp.getBoolean("br65", false);
        boolean br66state = sp.getBoolean("br66", false);
        boolean br67state = sp.getBoolean("br67", false);
        boolean br68state = sp.getBoolean("br68", false);

        setState(br1state, br1switch);
        setState(br2state, br2switch);
        setState(br3state, br3switch);
        setState(br4state, br4switch);
        setState(br5state, br5switch);
        setState(br6state, br6switch);
        setState(br7state, br7switch);
        setState(br8state, br8switch);
        setState(br9state, br9switch);
        setState(br10state, br10switch);
        setState(br11state, br11switch);
        setState(br12state, br12switch);
        setState(br13state, br13switch);
        setState(br14state, br14switch);
        setState(br15state, br15switch);
        setState(br16state, br16switch);
        setState(br17state, br17switch);
        setState(br18state, br18switch);
        setState(br19state, br19switch);
        setState(br20state, br20switch);
        setState(br21state, br21switch);
        setState(br22state, br22switch);
        setState(br23state, br23switch);
        setState(br24state, br24switch);
        setState(br25state, br25switch);
        setState(br26state, br26switch);
        setState(br27state, br27switch);
        setState(br28state, br28switch);
        setState(br29state, br29switch);
        setState(br30state, br30switch);
        setState(br31state, br31switch);
        setState(br32state, br32switch);
        setState(br33state, br33switch);
        setState(br34state, br34switch);
        setState(br35state, br35switch);
        setState(br36state, br36switch);
        setState(br37state, br37switch);
        setState(br38state, br38switch);
        setState(br39state, br39switch);
        setState(br40state, br40switch);
        setState(br41state, br41switch);
        setState(br42state, br42switch);
        setState(br43state, br43switch);
        setState(br44state, br44switch);
        setState(br45state, br45switch);
        setState(br46state, br46switch);
        setState(br47state, br47switch);
        setState(br48state, br48switch);
        setState(br49state, br49switch);
        setState(br50state, br50switch);
        setState(br51state, br51switch);
        setState(br52state, br52switch);
        setState(br53state, br53switch);
        setState(br54state, br54switch);
        setState(br55state, br55switch);
        setState(br56state, br56switch);
        setState(br57state, br57switch);
        setState(br58state, br58switch);
        setState(br59state, br59switch);
        setState(br60state, br60switch);
        setState(br61state, br61switch);
        setState(br62state, br62switch);
        setState(br63state, br63switch);
        setState(br64state, br64switch);
        setState(br65state, br65switch);
        setState(br66state, br66switch);
        setState(br67state, br67switch);
        setState(br68state, br68switch);

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
