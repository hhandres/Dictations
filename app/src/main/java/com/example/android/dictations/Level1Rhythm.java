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
 * Created by Hoyt on 4/30/2017.
 */

public class Level1Rhythm extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_level1_rhythm, container, false);


        Switch l1r1switch = (Switch) view.findViewById(R.id.l1r1);
        Switch l1r2switch = (Switch) view.findViewById(R.id.l1r2);
        Switch l1r3switch = (Switch) view.findViewById(R.id.l1r3);
        Switch l1r4switch = (Switch) view.findViewById(R.id.l1r4);
        Switch l1r5switch = (Switch) view.findViewById(R.id.l1r5);
        Switch l1r6switch = (Switch) view.findViewById(R.id.l1r6);
        Switch l1r7switch = (Switch) view.findViewById(R.id.l1r7);
        Switch l1r8switch = (Switch) view.findViewById(R.id.l1r8);
        Switch l1r9switch = (Switch) view.findViewById(R.id.l1r9);
        Switch l1r10switch = (Switch) view.findViewById(R.id.l1r10);
        Switch l1r11switch = (Switch) view.findViewById(R.id.l1r11);
        Switch l1r12switch = (Switch) view.findViewById(R.id.l1r12);
        Switch l1r13switch = (Switch) view.findViewById(R.id.l1r13);
        Switch l1r14switch = (Switch) view.findViewById(R.id.l1r14);
        Switch l1r15switch = (Switch) view.findViewById(R.id.l1r15);
        Switch l1r16switch = (Switch) view.findViewById(R.id.l1r16);
        Switch l1r17switch = (Switch) view.findViewById(R.id.l1r17);
        Switch l1r18switch = (Switch) view.findViewById(R.id.l1r18);
        Switch l1r19switch = (Switch) view.findViewById(R.id.l1r19);
        Switch l1r20switch = (Switch) view.findViewById(R.id.l1r20);
        Switch l1r21switch = (Switch) view.findViewById(R.id.l1r21);
        Switch l1r22switch = (Switch) view.findViewById(R.id.l1r22);
        Switch l1r23switch = (Switch) view.findViewById(R.id.l1r23);
        Switch l1r24switch = (Switch) view.findViewById(R.id.l1r24);
        Switch l1r25switch = (Switch) view.findViewById(R.id.l1r25);
        Switch l1r26switch = (Switch) view.findViewById(R.id.l1r26);
        Switch l1r27switch = (Switch) view.findViewById(R.id.l1r27);
        Switch l1r28switch = (Switch) view.findViewById(R.id.l1r28);
        Switch l1r29switch = (Switch) view.findViewById(R.id.l1r29);
        Switch l1r30switch = (Switch) view.findViewById(R.id.l1r30);
        Switch l1r31switch = (Switch) view.findViewById(R.id.l1r31);
        Switch l1r32switch = (Switch) view.findViewById(R.id.l1r32);
        Switch l1r33switch = (Switch) view.findViewById(R.id.l1r33);
        Switch l1r34switch = (Switch) view.findViewById(R.id.l1r34);
        Switch l1r35switch = (Switch) view.findViewById(R.id.l1r35);
        Switch l1r36switch = (Switch) view.findViewById(R.id.l1r36);
        Switch l1r37switch = (Switch) view.findViewById(R.id.l1r37);
        Switch l1r38switch = (Switch) view.findViewById(R.id.l1r38);
        Switch l1r39switch = (Switch) view.findViewById(R.id.l1r39);
        Switch l1r40switch = (Switch) view.findViewById(R.id.l1r40);
        Switch l1r41switch = (Switch) view.findViewById(R.id.l1r41);
        Switch l1r42switch = (Switch) view.findViewById(R.id.l1r42);
        Switch l1r43switch = (Switch) view.findViewById(R.id.l1r43);
        Switch l1r44switch = (Switch) view.findViewById(R.id.l1r44);
        Switch l1r45switch = (Switch) view.findViewById(R.id.l1r45);
        Switch l1r46switch = (Switch) view.findViewById(R.id.l1r46);
        Switch l1r47switch = (Switch) view.findViewById(R.id.l1r47);
        Switch l1r48switch = (Switch) view.findViewById(R.id.l1r48);
        Switch l1r49switch = (Switch) view.findViewById(R.id.l1r49);
        Switch l1r50switch = (Switch) view.findViewById(R.id.l1r50);
        Switch l1r51switch = (Switch) view.findViewById(R.id.l1r51);
        Switch l1r52switch = (Switch) view.findViewById(R.id.l1r52);
        Switch l1r53switch = (Switch) view.findViewById(R.id.l1r53);
        Switch l1r54switch = (Switch) view.findViewById(R.id.l1r54);
        Switch l1r55switch = (Switch) view.findViewById(R.id.l1r55);
        Switch l1r56switch = (Switch) view.findViewById(R.id.l1r56);
        Switch l1r57switch = (Switch) view.findViewById(R.id.l1r57);
        Switch l1r58switch = (Switch) view.findViewById(R.id.l1r58);
        Switch l1r59switch = (Switch) view.findViewById(R.id.l1r59);
        Switch l1r60switch = (Switch) view.findViewById(R.id.l1r60);
        Switch l1r61switch = (Switch) view.findViewById(R.id.l1r61);
        Switch l1r62switch = (Switch) view.findViewById(R.id.l1r62);
        Switch l1r63switch = (Switch) view.findViewById(R.id.l1r63);
        Switch l1r64switch = (Switch) view.findViewById(R.id.l1r64);
        Switch l1r65switch = (Switch) view.findViewById(R.id.l1r65);
        Switch l1r66switch = (Switch) view.findViewById(R.id.l1r66);
        Switch l1r67switch = (Switch) view.findViewById(R.id.l1r67);
        Switch l1r68switch = (Switch) view.findViewById(R.id.l1r68);
        Switch l1r69switch = (Switch) view.findViewById(R.id.l1r69);
        Switch l1r70switch = (Switch) view.findViewById(R.id.l1r70);
        Switch l1r71switch = (Switch) view.findViewById(R.id.l1r71);
        Switch l1r72switch = (Switch) view.findViewById(R.id.l1r72);
        Switch l1r73switch = (Switch) view.findViewById(R.id.l1r73);
        Switch l1r74switch = (Switch) view.findViewById(R.id.l1r74);
        Switch l1r75switch = (Switch) view.findViewById(R.id.l1r75);
        Switch l1r76switch = (Switch) view.findViewById(R.id.l1r76);
        Switch l1r77switch = (Switch) view.findViewById(R.id.l1r77);
        Switch l1r78switch = (Switch) view.findViewById(R.id.l1r78);
        Switch l1r79switch = (Switch) view.findViewById(R.id.l1r79);
        Switch l1r80switch = (Switch) view.findViewById(R.id.l1r80);
        Switch l1r81switch = (Switch) view.findViewById(R.id.l1r81);
        Switch l1r82switch = (Switch) view.findViewById(R.id.l1r82);
        Switch l1r83switch = (Switch) view.findViewById(R.id.l1r83);
        Switch l1r84switch = (Switch) view.findViewById(R.id.l1r84);
        Switch l1r85switch = (Switch) view.findViewById(R.id.l1r85);
        Switch l1r86switch = (Switch) view.findViewById(R.id.l1r86);
        Switch l1r87switch = (Switch) view.findViewById(R.id.l1r87);
        Switch l1r88switch = (Switch) view.findViewById(R.id.l1r88);
        Switch l1r89switch = (Switch) view.findViewById(R.id.l1r89);
        Switch l1r90switch = (Switch) view.findViewById(R.id.l1r90);
        Switch l1r91switch = (Switch) view.findViewById(R.id.l1r91);
        Switch l1r92switch = (Switch) view.findViewById(R.id.l1r92);
        Switch l1r93switch = (Switch) view.findViewById(R.id.l1r93);
        Switch l1r94switch = (Switch) view.findViewById(R.id.l1r94);
        Switch l1r95switch = (Switch) view.findViewById(R.id.l1r95);





        SharedPreferences sp = getActivity().getSharedPreferences("switchState",MODE_PRIVATE);

        boolean l1r1state = sp.getBoolean("l1r1", false);
        boolean l1r2state = sp.getBoolean("l1r2", false);
        boolean l1r3state = sp.getBoolean("l1r3", false);
        boolean l1r4state = sp.getBoolean("l1r4", false);
        boolean l1r5state = sp.getBoolean("l1r5", false);
        boolean l1r6state = sp.getBoolean("l1r6", false);
        boolean l1r7state = sp.getBoolean("l1r7", false);
        boolean l1r8state = sp.getBoolean("l1r8", false);
        boolean l1r9state = sp.getBoolean("l1r9", false);
        boolean l1r10state = sp.getBoolean("l1r10", false);
        boolean l1r11state = sp.getBoolean("l1r11", false);
        boolean l1r12state = sp.getBoolean("l1r12", false);
        boolean l1r13state = sp.getBoolean("l1r13", false);
        boolean l1r14state = sp.getBoolean("l1r14", false);
        boolean l1r15state = sp.getBoolean("l1r15", false);
        boolean l1r16state = sp.getBoolean("l1r16", false);
        boolean l1r17state = sp.getBoolean("l1r17", false);
        boolean l1r18state = sp.getBoolean("l1r18", false);
        boolean l1r19state = sp.getBoolean("l1r19", false);
        boolean l1r20state = sp.getBoolean("l1r20", false);
        boolean l1r21state = sp.getBoolean("l1r21", false);
        boolean l1r22state = sp.getBoolean("l1r22", false);
        boolean l1r23state = sp.getBoolean("l1r23", false);
        boolean l1r24state = sp.getBoolean("l1r24", false);
        boolean l1r25state = sp.getBoolean("l1r25", false);
        boolean l1r26state = sp.getBoolean("l1r26", false);
        boolean l1r27state = sp.getBoolean("l1r27", false);
        boolean l1r28state = sp.getBoolean("l1r28", false);
        boolean l1r29state = sp.getBoolean("l1r29", false);
        boolean l1r30state = sp.getBoolean("l1r30", false);
        boolean l1r31state = sp.getBoolean("l1r31", false);
        boolean l1r32state = sp.getBoolean("l1r32", false);
        boolean l1r33state = sp.getBoolean("l1r33", false);
        boolean l1r34state = sp.getBoolean("l1r34", false);
        boolean l1r35state = sp.getBoolean("l1r35", false);
        boolean l1r36state = sp.getBoolean("l1r36", false);
        boolean l1r37state = sp.getBoolean("l1r37", false);
        boolean l1r38state = sp.getBoolean("l1r38", false);
        boolean l1r39state = sp.getBoolean("l1r39", false);
        boolean l1r40state = sp.getBoolean("l1r40", false);
        boolean l1r41state = sp.getBoolean("l1r41", false);
        boolean l1r42state = sp.getBoolean("l1r42", false);
        boolean l1r43state = sp.getBoolean("l1r43", false);
        boolean l1r44state = sp.getBoolean("l1r44", false);
        boolean l1r45state = sp.getBoolean("l1r45", false);
        boolean l1r46state = sp.getBoolean("l1r46", false);
        boolean l1r47state = sp.getBoolean("l1r47", false);
        boolean l1r48state = sp.getBoolean("l1r48", false);
        boolean l1r49state = sp.getBoolean("l1r49", false);
        boolean l1r50state = sp.getBoolean("l1r50", false);
        boolean l1r51state = sp.getBoolean("l1r51", false);
        boolean l1r52state = sp.getBoolean("l1r52", false);
        boolean l1r53state = sp.getBoolean("l1r53", false);
        boolean l1r54state = sp.getBoolean("l1r54", false);
        boolean l1r55state = sp.getBoolean("l1r55", false);
        boolean l1r56state = sp.getBoolean("l1r56", false);
        boolean l1r57state = sp.getBoolean("l1r57", false);
        boolean l1r58state = sp.getBoolean("l1r58", false);
        boolean l1r59state = sp.getBoolean("l1r59", false);
        boolean l1r60state = sp.getBoolean("l1r60", false);
        boolean l1r61state = sp.getBoolean("l1r61", false);
        boolean l1r62state = sp.getBoolean("l1r62", false);
        boolean l1r63state = sp.getBoolean("l1r63", false);
        boolean l1r64state = sp.getBoolean("l1r64", false);
        boolean l1r65state = sp.getBoolean("l1r65", false);
        boolean l1r66state = sp.getBoolean("l1r66", false);
        boolean l1r67state = sp.getBoolean("l1r67", false);
        boolean l1r68state = sp.getBoolean("l1r68", false);
        boolean l1r69state = sp.getBoolean("l1r69", false);
        boolean l1r70state = sp.getBoolean("l1r70", false);
        boolean l1r71state = sp.getBoolean("l1r71", false);
        boolean l1r72state = sp.getBoolean("l1r72", false);
        boolean l1r73state = sp.getBoolean("l1r73", false);
        boolean l1r74state = sp.getBoolean("l1r74", false);
        boolean l1r75state = sp.getBoolean("l1r75", false);
        boolean l1r76state = sp.getBoolean("l1r76", false);
        boolean l1r77state = sp.getBoolean("l1r77", false);
        boolean l1r78state = sp.getBoolean("l1r78", false);
        boolean l1r79state = sp.getBoolean("l1r79", false);
        boolean l1r80state = sp.getBoolean("l1r80", false);
        boolean l1r81state = sp.getBoolean("l1r81", false);
        boolean l1r82state = sp.getBoolean("l1r82", false);
        boolean l1r83state = sp.getBoolean("l1r83", false);
        boolean l1r84state = sp.getBoolean("l1r84", false);
        boolean l1r85state = sp.getBoolean("l1r85", false);
        boolean l1r86state = sp.getBoolean("l1r86", false);
        boolean l1r87state = sp.getBoolean("l1r87", false);
        boolean l1r88state = sp.getBoolean("l1r88", false);
        boolean l1r89state = sp.getBoolean("l1r89", false);
        boolean l1r90state = sp.getBoolean("l1r90", false);
        boolean l1r91state = sp.getBoolean("l1r91", false);
        boolean l1r92state = sp.getBoolean("l1r92", false);
        boolean l1r93state = sp.getBoolean("l1r93", false);
        boolean l1r94state = sp.getBoolean("l1r94", false);
        boolean l1r95state = sp.getBoolean("l1r95", false);



        setState(l1r1state, l1r1switch);
        setState(l1r2state, l1r2switch);
        setState(l1r3state, l1r3switch);
        setState(l1r4state, l1r4switch);
        setState(l1r5state, l1r5switch);
        setState(l1r6state, l1r6switch);
        setState(l1r7state, l1r7switch);
        setState(l1r8state, l1r8switch);
        setState(l1r9state, l1r9switch);
        setState(l1r10state, l1r10switch);
        setState(l1r11state, l1r11switch);
        setState(l1r12state, l1r12switch);
        setState(l1r13state, l1r13switch);
        setState(l1r14state, l1r14switch);
        setState(l1r15state, l1r15switch);
        setState(l1r16state, l1r16switch);
        setState(l1r17state, l1r17switch);
        setState(l1r18state, l1r18switch);
        setState(l1r19state, l1r19switch);
        setState(l1r20state, l1r20switch);
        setState(l1r21state, l1r21switch);
        setState(l1r22state, l1r22switch);
        setState(l1r23state, l1r23switch);
        setState(l1r24state, l1r24switch);
        setState(l1r25state, l1r25switch);
        setState(l1r26state, l1r26switch);
        setState(l1r27state, l1r27switch);
        setState(l1r28state, l1r28switch);
        setState(l1r29state, l1r29switch);
        setState(l1r30state, l1r30switch);
        setState(l1r31state, l1r31switch);
        setState(l1r32state, l1r32switch);
        setState(l1r33state, l1r33switch);
        setState(l1r34state, l1r34switch);
        setState(l1r35state, l1r35switch);
        setState(l1r36state, l1r36switch);
        setState(l1r37state, l1r37switch);
        setState(l1r38state, l1r38switch);
        setState(l1r39state, l1r39switch);
        setState(l1r40state, l1r40switch);
        setState(l1r41state, l1r41switch);
        setState(l1r42state, l1r42switch);
        setState(l1r43state, l1r43switch);
        setState(l1r44state, l1r44switch);
        setState(l1r45state, l1r45switch);
        setState(l1r46state, l1r46switch);
        setState(l1r47state, l1r47switch);
        setState(l1r48state, l1r48switch);
        setState(l1r49state, l1r49switch);
        setState(l1r50state, l1r50switch);
        setState(l1r51state, l1r51switch);
        setState(l1r52state, l1r52switch);
        setState(l1r53state, l1r53switch);
        setState(l1r54state, l1r54switch);
        setState(l1r55state, l1r55switch);
        setState(l1r56state, l1r56switch);
        setState(l1r57state, l1r57switch);
        setState(l1r58state, l1r58switch);
        setState(l1r59state, l1r59switch);
        setState(l1r60state, l1r60switch);
        setState(l1r61state, l1r61switch);
        setState(l1r62state, l1r62switch);
        setState(l1r63state, l1r63switch);
        setState(l1r64state, l1r64switch);
        setState(l1r65state, l1r65switch);
        setState(l1r66state, l1r66switch);
        setState(l1r67state, l1r67switch);
        setState(l1r68state, l1r68switch);
        setState(l1r69state, l1r69switch);
        setState(l1r70state, l1r70switch);
        setState(l1r71state, l1r71switch);
        setState(l1r72state, l1r72switch);
        setState(l1r73state, l1r73switch);
        setState(l1r74state, l1r74switch);
        setState(l1r75state, l1r75switch);
        setState(l1r76state, l1r76switch);
        setState(l1r77state, l1r77switch);
        setState(l1r78state, l1r78switch);
        setState(l1r79state, l1r79switch);
        setState(l1r80state, l1r80switch);
        setState(l1r81state, l1r81switch);
        setState(l1r82state, l1r82switch);
        setState(l1r83state, l1r83switch);
        setState(l1r84state, l1r84switch);
        setState(l1r85state, l1r85switch);
        setState(l1r86state, l1r86switch);
        setState(l1r87state, l1r87switch);
        setState(l1r88state, l1r88switch);
        setState(l1r89state, l1r89switch);
        setState(l1r90state, l1r90switch);
        setState(l1r91state, l1r91switch);
        setState(l1r92state, l1r92switch);
        setState(l1r93state, l1r93switch);
        setState(l1r94state, l1r94switch);
        setState(l1r95state, l1r95switch);


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
