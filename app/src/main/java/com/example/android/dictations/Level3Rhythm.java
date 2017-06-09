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
 * Created by Hoyt on 6/8/2017.
 */

public class Level3Rhythm extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_level3_rhythm, container, false);


        Switch l3r1switch = (Switch) view.findViewById(R.id.l3r1);
        Switch l3r2switch = (Switch) view.findViewById(R.id.l3r2);
        Switch l3r3switch = (Switch) view.findViewById(R.id.l3r3);
        Switch l3r4switch = (Switch) view.findViewById(R.id.l3r4);
        Switch l3r5switch = (Switch) view.findViewById(R.id.l3r5);
        Switch l3r6switch = (Switch) view.findViewById(R.id.l3r6);
        Switch l3r7switch = (Switch) view.findViewById(R.id.l3r7);
        Switch l3r8switch = (Switch) view.findViewById(R.id.l3r8);
        Switch l3r9switch = (Switch) view.findViewById(R.id.l3r9);
        Switch l3r10switch = (Switch) view.findViewById(R.id.l3r10);
        Switch l3r11switch = (Switch) view.findViewById(R.id.l3r11);
        Switch l3r12switch = (Switch) view.findViewById(R.id.l3r12);
        Switch l3r13switch = (Switch) view.findViewById(R.id.l3r13);
        Switch l3r14switch = (Switch) view.findViewById(R.id.l3r14);
        Switch l3r15switch = (Switch) view.findViewById(R.id.l3r15);
        Switch l3r16switch = (Switch) view.findViewById(R.id.l3r16);
        Switch l3r17switch = (Switch) view.findViewById(R.id.l3r17);
        Switch l3r18switch = (Switch) view.findViewById(R.id.l3r18);
        Switch l3r19switch = (Switch) view.findViewById(R.id.l3r19);
        Switch l3r20switch = (Switch) view.findViewById(R.id.l3r20);
        Switch l3r21switch = (Switch) view.findViewById(R.id.l3r21);
        Switch l3r22switch = (Switch) view.findViewById(R.id.l3r22);
        Switch l3r23switch = (Switch) view.findViewById(R.id.l3r23);
        Switch l3r24switch = (Switch) view.findViewById(R.id.l3r24);
        Switch l3r25switch = (Switch) view.findViewById(R.id.l3r25);
        Switch l3r26switch = (Switch) view.findViewById(R.id.l3r26);
        Switch l3r27switch = (Switch) view.findViewById(R.id.l3r27);
        Switch l3r28switch = (Switch) view.findViewById(R.id.l3r28);
        Switch l3r29switch = (Switch) view.findViewById(R.id.l3r29);
        Switch l3r30switch = (Switch) view.findViewById(R.id.l3r30);
        Switch l3r31switch = (Switch) view.findViewById(R.id.l3r31);
        Switch l3r32switch = (Switch) view.findViewById(R.id.l3r32);
        Switch l3r33switch = (Switch) view.findViewById(R.id.l3r33);
        Switch l3r34switch = (Switch) view.findViewById(R.id.l3r34);
        Switch l3r35switch = (Switch) view.findViewById(R.id.l3r35);
        Switch l3r36switch = (Switch) view.findViewById(R.id.l3r36);
        Switch l3r37switch = (Switch) view.findViewById(R.id.l3r37);
        Switch l3r38switch = (Switch) view.findViewById(R.id.l3r38);
        Switch l3r39switch = (Switch) view.findViewById(R.id.l3r39);
        Switch l3r40switch = (Switch) view.findViewById(R.id.l3r40);
        Switch l3r41switch = (Switch) view.findViewById(R.id.l3r41);
        Switch l3r42switch = (Switch) view.findViewById(R.id.l3r42);
        Switch l3r43switch = (Switch) view.findViewById(R.id.l3r43);
        Switch l3r44switch = (Switch) view.findViewById(R.id.l3r44);
        Switch l3r45switch = (Switch) view.findViewById(R.id.l3r45);
        
        
        SharedPreferences sp = getActivity().getSharedPreferences("switchState",MODE_PRIVATE);

        boolean l3r1state = sp.getBoolean("l3r1", false);
        boolean l3r2state = sp.getBoolean("l3r2", false);
        boolean l3r3state = sp.getBoolean("l3r3", false);
        boolean l3r4state = sp.getBoolean("l3r4", false);
        boolean l3r5state = sp.getBoolean("l3r5", false);
        boolean l3r6state = sp.getBoolean("l3r6", false);
        boolean l3r7state = sp.getBoolean("l3r7", false);
        boolean l3r8state = sp.getBoolean("l3r8", false);
        boolean l3r9state = sp.getBoolean("l3r9", false);
        boolean l3r10state = sp.getBoolean("l3r10", false);
        boolean l3r11state = sp.getBoolean("l3r11", false);
        boolean l3r12state = sp.getBoolean("l3r12", false);
        boolean l3r13state = sp.getBoolean("l3r13", false);
        boolean l3r14state = sp.getBoolean("l3r14", false);
        boolean l3r15state = sp.getBoolean("l3r15", false);
        boolean l3r16state = sp.getBoolean("l3r16", false);
        boolean l3r17state = sp.getBoolean("l3r17", false);
        boolean l3r18state = sp.getBoolean("l3r18", false);
        boolean l3r19state = sp.getBoolean("l3r19", false);
        boolean l3r20state = sp.getBoolean("l3r20", false);
        boolean l3r21state = sp.getBoolean("l3r21", false);
        boolean l3r22state = sp.getBoolean("l3r22", false);
        boolean l3r23state = sp.getBoolean("l3r23", false);
        boolean l3r24state = sp.getBoolean("l3r24", false);
        boolean l3r25state = sp.getBoolean("l3r25", false);
        boolean l3r26state = sp.getBoolean("l3r26", false);
        boolean l3r27state = sp.getBoolean("l3r27", false);
        boolean l3r28state = sp.getBoolean("l3r28", false);
        boolean l3r29state = sp.getBoolean("l3r29", false);
        boolean l3r30state = sp.getBoolean("l3r30", false);
        boolean l3r31state = sp.getBoolean("l3r31", false);
        boolean l3r32state = sp.getBoolean("l3r32", false);
        boolean l3r33state = sp.getBoolean("l3r33", false);
        boolean l3r34state = sp.getBoolean("l3r34", false);
        boolean l3r35state = sp.getBoolean("l3r35", false);
        boolean l3r36state = sp.getBoolean("l3r36", false);
        boolean l3r37state = sp.getBoolean("l3r37", false);
        boolean l3r38state = sp.getBoolean("l3r38", false);
        boolean l3r39state = sp.getBoolean("l3r39", false);
        boolean l3r40state = sp.getBoolean("l3r40", false);
        boolean l3r41state = sp.getBoolean("l3r41", false);
        boolean l3r42state = sp.getBoolean("l3r42", false);
        boolean l3r43state = sp.getBoolean("l3r43", false);
        boolean l3r44state = sp.getBoolean("l3r44", false);
        boolean l3r45state = sp.getBoolean("l3r45", false);
        

        setState(l3r1state, l3r1switch);
        setState(l3r2state, l3r2switch);
        setState(l3r3state, l3r3switch);
        setState(l3r4state, l3r4switch);
        setState(l3r5state, l3r5switch);
        setState(l3r6state, l3r6switch);
        setState(l3r7state, l3r7switch);
        setState(l3r8state, l3r8switch);
        setState(l3r9state, l3r9switch);
        setState(l3r10state, l3r10switch);
        setState(l3r11state, l3r11switch);
        setState(l3r12state, l3r12switch);
        setState(l3r13state, l3r13switch);
        setState(l3r14state, l3r14switch);
        setState(l3r15state, l3r15switch);
        setState(l3r16state, l3r16switch);
        setState(l3r17state, l3r17switch);
        setState(l3r18state, l3r18switch);
        setState(l3r19state, l3r19switch);
        setState(l3r20state, l3r20switch);
        setState(l3r21state, l3r21switch);
        setState(l3r22state, l3r22switch);
        setState(l3r23state, l3r23switch);
        setState(l3r24state, l3r24switch);
        setState(l3r25state, l3r25switch);
        setState(l3r26state, l3r26switch);
        setState(l3r27state, l3r27switch);
        setState(l3r28state, l3r28switch);
        setState(l3r29state, l3r29switch);
        setState(l3r30state, l3r30switch);
        setState(l3r31state, l3r31switch);
        setState(l3r32state, l3r32switch);
        setState(l3r33state, l3r33switch);
        setState(l3r34state, l3r34switch);
        setState(l3r35state, l3r35switch);
        setState(l3r36state, l3r36switch);
        setState(l3r37state, l3r37switch);
        setState(l3r38state, l3r38switch);
        setState(l3r39state, l3r39switch);
        setState(l3r40state, l3r40switch);
        setState(l3r41state, l3r41switch);
        setState(l3r42state, l3r42switch);
        setState(l3r43state, l3r43switch);
        setState(l3r44state, l3r44switch);
        setState(l3r45state, l3r45switch);
        
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
