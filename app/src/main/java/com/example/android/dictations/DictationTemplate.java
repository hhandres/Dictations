package com.example.android.dictations;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;


public class DictationTemplate extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_dictation_template, container, false);
        Bundle bundle = this.getArguments();
        String pdfUrl = bundle.getString("pdfLink");
        WebView myWebView = (WebView) rootView.findViewById(R.id.view_PDF);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.getSettings().setBuiltInZoomControls(true);
        myWebView.loadUrl(pdfUrl);
        Toast.makeText(getActivity(), "Loading Dictation Template and Answer", Toast.LENGTH_LONG).show();
        myWebView.setWebViewClient(new WebViewClient());

        Button audioButton = (Button) rootView.findViewById(R.id.audio_button);
        audioButton.setOnClickListener(this);

        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onClick(View v) {
        Bundle bundle = this.getArguments();
        String audioUrl = bundle.getString("audioLink");
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(audioUrl));
        startActivity(intent);


    }
}
