package toong.vn.androidfragmentinviewpagerlifecycle.fragment;

import android.support.v4.app.Fragment;
import android.util.Log;

/**
 * Created by PhanVanLinh on 27/11/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class BaseFragment extends Fragment {
    protected String TAG = getClass().getSimpleName();

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        Log.i(TAG, "setUserVisibleHint " + isVisibleToUser + " - " + isResumed());
    }
}
