package com.example.android.android_me.ui;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import java.util.List;

public class BodyPartFragment extends Fragment {

    private List<Integer> mImageIds;
    private int mListIndex;

    public void setmImageIds(List<Integer> mImageIds) {
        this.mImageIds = mImageIds;
    }

    public void setmListIndex(int mListIndex) {
        this.mListIndex = mListIndex;
    }

    public BodyPartFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_body_part,container,false);

        ImageView imageView= (ImageView) rootView.findViewById(R.id.body_part_image_view);

        if (mImageIds!=null)
        {
            imageView.setImageResource(mImageIds.get(mListIndex));

        }      else{
            Log.v("SIGMA","Fragment has null list of id's");
        }
        return  rootView;
    }
}
