package toong.vn.androidfragmentinviewpagerlifecycle.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import toong.vn.androidfragmentinviewpagerlifecycle.R;
import toong.vn.androidfragmentinviewpagerlifecycle.SecondActivity;

public class Fragment3 extends BaseFragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView");
        View rootView = inflater.inflate(R.layout.fragment_3, container, false);
        rootView.findViewById(R.id.button_go_to_second_activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                startActivityForResult(intent, 200);
            }
        });
        return rootView;
    }

}
