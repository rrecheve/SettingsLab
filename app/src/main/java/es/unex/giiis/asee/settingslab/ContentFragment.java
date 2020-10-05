package es.unex.giiis.asee.settingslab;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ContentFragment extends Fragment {

    TextView mContent;
    Activity mActivity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View inf = inflater.inflate(R.layout.fragment_content, container, false);
        mContent = (TextView) inf.findViewById(R.id.content_text);
        return inf;

    }

    @Override
    public void onAttach(Activity activity) {
        //TODO Auto-generated method stub
        super.onAttach(activity);

        mActivity = activity;
    }

    @Override
    public void onResume() {
        super.onResume();

        String username;

        //TODO Get the username from the preferences


        mContent.setText("Hello, "+username+"!");
    }
}