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
 * Created by Hoyt on 7/1/2017.
 */

public class Level4Rhythm extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_level4_rhythm, container, false);


        Switch l4r1switch = (Switch) view.findViewById(R.id.l4r1);
        Switch l4r2switch = (Switch) view.findViewById(R.id.l4r2);
        Switch l4r3switch = (Switch) view.findViewById(R.id.l4r3);
        Switch l4r4switch = (Switch) view.findViewById(R.id.l4r4);
        Switch l4r5switch = (Switch) view.findViewById(R.id.l4r5);
        Switch l4r6switch = (Switch) view.findViewById(R.id.l4r6);
        Switch l4r7switch = (Switch) view.findViewById(R.id.l4r7);
        Switch l4r8switch = (Switch) view.findViewById(R.id.l4r8);
        Switch l4r9switch = (Switch) view.findViewById(R.id.l4r9);
        Switch l4r10switch = (Switch) view.findViewById(R.id.l4r10);
        Switch l4r11switch = (Switch) view.findViewById(R.id.l4r11);
        Switch l4r12switch = (Switch) view.findViewById(R.id.l4r12);
        Switch l4r13switch = (Switch) view.findViewById(R.id.l4r13);
        Switch l4r14switch = (Switch) view.findViewById(R.id.l4r14);
        Switch l4r15switch = (Switch) view.findViewById(R.id.l4r15);
        Switch l4r16switch = (Switch) view.findViewById(R.id.l4r16);
        Switch l4r17switch = (Switch) view.findViewById(R.id.l4r17);
        Switch l4r18switch = (Switch) view.findViewById(R.id.l4r18);
        Switch l4r19switch = (Switch) view.findViewById(R.id.l4r19);
        Switch l4r20switch = (Switch) view.findViewById(R.id.l4r20);
        Switch l4r21switch = (Switch) view.findViewById(R.id.l4r21);
        Switch l4r22switch = (Switch) view.findViewById(R.id.l4r22);
        Switch l4r23switch = (Switch) view.findViewById(R.id.l4r23);
        Switch l4r24switch = (Switch) view.findViewById(R.id.l4r24);
        Switch l4r25switch = (Switch) view.findViewById(R.id.l4r25);
        Switch l4r26switch = (Switch) view.findViewById(R.id.l4r26);
        Switch l4r27switch = (Switch) view.findViewById(R.id.l4r27);
        Switch l4r28switch = (Switch) view.findViewById(R.id.l4r28);
        Switch l4r29switch = (Switch) view.findViewById(R.id.l4r29);
        Switch l4r30switch = (Switch) view.findViewById(R.id.l4r30);

        SharedPreferences sp = getActivity().getSharedPreferences("switchState",MODE_PRIVATE);

        boolean l4r1state = sp.getBoolean("l4r1", false);
        boolean l4r2state = sp.getBoolean("l4r2", false);
        boolean l4r3state = sp.getBoolean("l4r3", false);
        boolean l4r4state = sp.getBoolean("l4r4", false);
        boolean l4r5state = sp.getBoolean("l4r5", false);
        boolean l4r6state = sp.getBoolean("l4r6", false);
        boolean l4r7state = sp.getBoolean("l4r7", false);
        boolean l4r8state = sp.getBoolean("l4r8", false);
        boolean l4r9state = sp.getBoolean("l4r9", false);
        boolean l4r10state = sp.getBoolean("l4r10", false);
        boolean l4r11state = sp.getBoolean("l4r11", false);
        boolean l4r12state = sp.getBoolean("l4r12", false);
        boolean l4r13state = sp.getBoolean("l4r13", false);
        boolean l4r14state = sp.getBoolean("l4r14", false);
        boolean l4r15state = sp.getBoolean("l4r15", false);
        boolean l4r16state = sp.getBoolean("l4r16", false);
        boolean l4r17state = sp.getBoolean("l4r17", false);
        boolean l4r18state = sp.getBoolean("l4r18", false);
        boolean l4r19state = sp.getBoolean("l4r19", false);
        boolean l4r20state = sp.getBoolean("l4r20", false);
        boolean l4r21state = sp.getBoolean("l4r21", false);
        boolean l4r22state = sp.getBoolean("l4r22", false);
        boolean l4r23state = sp.getBoolean("l4r23", false);
        boolean l4r24state = sp.getBoolean("l4r24", false);
        boolean l4r25state = sp.getBoolean("l4r25", false);
        boolean l4r26state = sp.getBoolean("l4r26", false);
        boolean l4r27state = sp.getBoolean("l4r27", false);
        boolean l4r28state = sp.getBoolean("l4r28", false);
        boolean l4r29state = sp.getBoolean("l4r29", false);
        boolean l4r30state = sp.getBoolean("l4r30", false);

        setState(l4r1state, l4r1switch);
        setState(l4r2state, l4r2switch);
        setState(l4r3state, l4r3switch);
        setState(l4r4state, l4r4switch);
        setState(l4r5state, l4r5switch);
        setState(l4r6state, l4r6switch);
        setState(l4r7state, l4r7switch);
        setState(l4r8state, l4r8switch);
        setState(l4r9state, l4r9switch);
        setState(l4r10state, l4r10switch);
        setState(l4r11state, l4r11switch);
        setState(l4r12state, l4r12switch);
        setState(l4r13state, l4r13switch);
        setState(l4r14state, l4r14switch);
        setState(l4r15state, l4r15switch);
        setState(l4r16state, l4r16switch);
        setState(l4r17state, l4r17switch);
        setState(l4r18state, l4r18switch);
        setState(l4r19state, l4r19switch);
        setState(l4r20state, l4r20switch);
        setState(l4r21state, l4r21switch);
        setState(l4r22state, l4r22switch);
        setState(l4r23state, l4r23switch);
        setState(l4r24state, l4r24switch);
        setState(l4r25state, l4r25switch);
        setState(l4r26state, l4r26switch);
        setState(l4r27state, l4r27switch);
        setState(l4r28state, l4r28switch);
        setState(l4r29state, l4r29switch);
        setState(l4r30state, l4r30switch);

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
