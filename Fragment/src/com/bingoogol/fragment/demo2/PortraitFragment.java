package com.bingoogol.fragment.demo2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bingoogol.fragment.R;

/**
 * @author bingoogol@sina.com 14-2-25.
 */
public class PortraitFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_demo2_portrait, null);
    }
}
