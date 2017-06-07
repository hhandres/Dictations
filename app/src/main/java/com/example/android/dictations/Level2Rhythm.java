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
 * Created by Hoyt on 6/6/2017.
 */

public class Level2Rhythm extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_level2_rhythm, container, false);


        Switch l2r1switch = (Switch) view.findViewById(R.id.l2r1);
        Switch l2r2switch = (Switch) view.findViewById(R.id.l2r2);
        Switch l2r3switch = (Switch) view.findViewById(R.id.l2r3);
        Switch l2r4switch = (Switch) view.findViewById(R.id.l2r4);
        Switch l2r5switch = (Switch) view.findViewById(R.id.l2r5);
        Switch l2r6switch = (Switch) view.findViewById(R.id.l2r6);
        Switch l2r7switch = (Switch) view.findViewById(R.id.l2r7);
        Switch l2r8switch = (Switch) view.findViewById(R.id.l2r8);
        Switch l2r9switch = (Switch) view.findViewById(R.id.l2r9);
        Switch l2r10switch = (Switch) view.findViewById(R.id.l2r10);
        Switch l2r11switch = (Switch) view.findViewById(R.id.l2r11);
        Switch l2r12switch = (Switch) view.findViewById(R.id.l2r12);
        Switch l2r13switch = (Switch) view.findViewById(R.id.l2r13);
        Switch l2r14switch = (Switch) view.findViewById(R.id.l2r14);
        Switch l2r15switch = (Switch) view.findViewById(R.id.l2r15);
        Switch l2r16switch = (Switch) view.findViewById(R.id.l2r16);
        Switch l2r17switch = (Switch) view.findViewById(R.id.l2r17);
        Switch l2r18switch = (Switch) view.findViewById(R.id.l2r18);
        Switch l2r19switch = (Switch) view.findViewById(R.id.l2r19);
        Switch l2r20switch = (Switch) view.findViewById(R.id.l2r20);
        Switch l2r21switch = (Switch) view.findViewById(R.id.l2r21);
        Switch l2r22switch = (Switch) view.findViewById(R.id.l2r22);
        Switch l2r23switch = (Switch) view.findViewById(R.id.l2r23);
        Switch l2r24switch = (Switch) view.findViewById(R.id.l2r24);
        Switch l2r25switch = (Switch) view.findViewById(R.id.l2r25);
        Switch l2r26switch = (Switch) view.findViewById(R.id.l2r26);
        Switch l2r27switch = (Switch) view.findViewById(R.id.l2r27);
        Switch l2r28switch = (Switch) view.findViewById(R.id.l2r28);
        Switch l2r29switch = (Switch) view.findViewById(R.id.l2r29);
        Switch l2r30switch = (Switch) view.findViewById(R.id.l2r30);
        Switch l2r31switch = (Switch) view.findViewById(R.id.l2r31);
        Switch l2r32switch = (Switch) view.findViewById(R.id.l2r32);
        Switch l2r33switch = (Switch) view.findViewById(R.id.l2r33);
        Switch l2r34switch = (Switch) view.findViewById(R.id.l2r34);
        Switch l2r35switch = (Switch) view.findViewById(R.id.l2r35);
        Switch l2r36switch = (Switch) view.findViewById(R.id.l2r36);
        Switch l2r37switch = (Switch) view.findViewById(R.id.l2r37);
        Switch l2r38switch = (Switch) view.findViewById(R.id.l2r38);
        Switch l2r39switch = (Switch) view.findViewById(R.id.l2r39);
        Switch l2r40switch = (Switch) view.findViewById(R.id.l2r40);
        Switch l2r41switch = (Switch) view.findViewById(R.id.l2r41);
        Switch l2r42switch = (Switch) view.findViewById(R.id.l2r42);
        Switch l2r43switch = (Switch) view.findViewById(R.id.l2r43);
        Switch l2r44switch = (Switch) view.findViewById(R.id.l2r44);
        Switch l2r45switch = (Switch) view.findViewById(R.id.l2r45);
        Switch l2r46switch = (Switch) view.findViewById(R.id.l2r46);
        Switch l2r47switch = (Switch) view.findViewById(R.id.l2r47);
        Switch l2r48switch = (Switch) view.findViewById(R.id.l2r48);
        Switch l2r49switch = (Switch) view.findViewById(R.id.l2r49);
        Switch l2r50switch = (Switch) view.findViewById(R.id.l2r50);
        





        SharedPreferences sp = getActivity().getSharedPreferences("switchState",MODE_PRIVATE);

        boolean l2r1state = sp.getBoolean("l2r1", false);
        boolean l2r2state = sp.getBoolean("l2r2", false);
        boolean l2r3state = sp.getBoolean("l2r3", false);
        boolean l2r4state = sp.getBoolean("l2r4", false);
        boolean l2r5state = sp.getBoolean("l2r5", false);
        boolean l2r6state = sp.getBoolean("l2r6", false);
        boolean l2r7state = sp.getBoolean("l2r7", false);
        boolean l2r8state = sp.getBoolean("l2r8", false);
        boolean l2r9state = sp.getBoolean("l2r9", false);
        boolean l2r10state = sp.getBoolean("l2r10", false);
        boolean l2r11state = sp.getBoolean("l2r11", false);
        boolean l2r12state = sp.getBoolean("l2r12", false);
        boolean l2r13state = sp.getBoolean("l2r13", false);
        boolean l2r14state = sp.getBoolean("l2r14", false);
        boolean l2r15state = sp.getBoolean("l2r15", false);
        boolean l2r16state = sp.getBoolean("l2r16", false);
        boolean l2r17state = sp.getBoolean("l2r17", false);
        boolean l2r18state = sp.getBoolean("l2r18", false);
        boolean l2r19state = sp.getBoolean("l2r19", false);
        boolean l2r20state = sp.getBoolean("l2r20", false);
        boolean l2r21state = sp.getBoolean("l2r21", false);
        boolean l2r22state = sp.getBoolean("l2r22", false);
        boolean l2r23state = sp.getBoolean("l2r23", false);
        boolean l2r24state = sp.getBoolean("l2r24", false);
        boolean l2r25state = sp.getBoolean("l2r25", false);
        boolean l2r26state = sp.getBoolean("l2r26", false);
        boolean l2r27state = sp.getBoolean("l2r27", false);
        boolean l2r28state = sp.getBoolean("l2r28", false);
        boolean l2r29state = sp.getBoolean("l2r29", false);
        boolean l2r30state = sp.getBoolean("l2r30", false);
        boolean l2r31state = sp.getBoolean("l2r31", false);
        boolean l2r32state = sp.getBoolean("l2r32", false);
        boolean l2r33state = sp.getBoolean("l2r33", false);
        boolean l2r34state = sp.getBoolean("l2r34", false);
        boolean l2r35state = sp.getBoolean("l2r35", false);
        boolean l2r36state = sp.getBoolean("l2r36", false);
        boolean l2r37state = sp.getBoolean("l2r37", false);
        boolean l2r38state = sp.getBoolean("l2r38", false);
        boolean l2r39state = sp.getBoolean("l2r39", false);
        boolean l2r40state = sp.getBoolean("l2r40", false);
        boolean l2r41state = sp.getBoolean("l2r41", false);
        boolean l2r42state = sp.getBoolean("l2r42", false);
        boolean l2r43state = sp.getBoolean("l2r43", false);
        boolean l2r44state = sp.getBoolean("l2r44", false);
        boolean l2r45state = sp.getBoolean("l2r45", false);
        boolean l2r46state = sp.getBoolean("l2r46", false);
        boolean l2r47state = sp.getBoolean("l2r47", false);
        boolean l2r48state = sp.getBoolean("l2r48", false);
        boolean l2r49state = sp.getBoolean("l2r49", false);
        boolean l2r50state = sp.getBoolean("l2r50", false);
        



        setState(l2r1state, l2r1switch);
        setState(l2r2state, l2r2switch);
        setState(l2r3state, l2r3switch);
        setState(l2r4state, l2r4switch);
        setState(l2r5state, l2r5switch);
        setState(l2r6state, l2r6switch);
        setState(l2r7state, l2r7switch);
        setState(l2r8state, l2r8switch);
        setState(l2r9state, l2r9switch);
        setState(l2r10state, l2r10switch);
        setState(l2r11state, l2r11switch);
        setState(l2r12state, l2r12switch);
        setState(l2r13state, l2r13switch);
        setState(l2r14state, l2r14switch);
        setState(l2r15state, l2r15switch);
        setState(l2r16state, l2r16switch);
        setState(l2r17state, l2r17switch);
        setState(l2r18state, l2r18switch);
        setState(l2r19state, l2r19switch);
        setState(l2r20state, l2r20switch);
        setState(l2r21state, l2r21switch);
        setState(l2r22state, l2r22switch);
        setState(l2r23state, l2r23switch);
        setState(l2r24state, l2r24switch);
        setState(l2r25state, l2r25switch);
        setState(l2r26state, l2r26switch);
        setState(l2r27state, l2r27switch);
        setState(l2r28state, l2r28switch);
        setState(l2r29state, l2r29switch);
        setState(l2r30state, l2r30switch);
        setState(l2r31state, l2r31switch);
        setState(l2r32state, l2r32switch);
        setState(l2r33state, l2r33switch);
        setState(l2r34state, l2r34switch);
        setState(l2r35state, l2r35switch);
        setState(l2r36state, l2r36switch);
        setState(l2r37state, l2r37switch);
        setState(l2r38state, l2r38switch);
        setState(l2r39state, l2r39switch);
        setState(l2r40state, l2r40switch);
        setState(l2r41state, l2r41switch);
        setState(l2r42state, l2r42switch);
        setState(l2r43state, l2r43switch);
        setState(l2r44state, l2r44switch);
        setState(l2r45state, l2r45switch);
        setState(l2r46state, l2r46switch);
        setState(l2r47state, l2r47switch);
        setState(l2r48state, l2r48switch);
        setState(l2r49state, l2r49switch);
        setState(l2r50state, l2r50switch);

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
