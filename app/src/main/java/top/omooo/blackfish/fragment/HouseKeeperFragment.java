package top.omooo.blackfish.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import top.omooo.blackfish.R;

/**
 * Created by Omooo on 2018/2/25.
 */

public class HouseKeeperFragment extends android.support.v4.app.Fragment {
    public static HouseKeeperFragment newInstance() {
        HouseKeeperFragment fragment = new HouseKeeperFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_housekeeper_layout, null);
        return view;
    }
}