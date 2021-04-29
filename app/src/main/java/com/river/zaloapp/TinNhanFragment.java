package com.river.zaloapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class TinNhanFragment extends Fragment {

    RecyclerView recyclerViewMessage;
    ArrayList<TinNhan> listMessage = new ArrayList();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tin_nhan, container, false);

        recyclerViewMessage = v.findViewById(R.id.rcTinNhan);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getData();

        DanhSachMessageAdapter adapter = new DanhSachMessageAdapter(getContext(), listMessage);

        recyclerViewMessage.setAdapter(adapter);
        recyclerViewMessage.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    private void getData() {
        listMessage.add(new TinNhan(R.drawable.image1, "Ha Nam", "dang o day"));
        listMessage.add(new TinNhan(R.drawable.image2, " Truong Son", "Vo tu di"));
        listMessage.add(new TinNhan(R.drawable.image3, "Sang Pham", " The nao"));
        listMessage.add(new TinNhan(R.drawable.image4, "Do Ha", "Mua to"));
        listMessage.add(new TinNhan(R.drawable.image, "Hung Son", "di vhoi deI"));

        listMessage.add(new TinNhan(R.drawable.image1, "Ha Nam", "dang o day"));
        listMessage.add(new TinNhan(R.drawable.image2, " Truong Son", "Vo tu di"));
        listMessage.add(new TinNhan(R.drawable.image3, "Sang Pham", " The nao"));
        listMessage.add(new TinNhan(R.drawable.image4, "Do Ha", "Mua to"));
        listMessage.add(new TinNhan(R.drawable.image, "Hung Son", "di vhoi deI"));

        listMessage.add(new TinNhan(R.drawable.image1, "Ha Nam", "dang o day"));
        listMessage.add(new TinNhan(R.drawable.image2, " Truong Son", "Vo tu di"));
        listMessage.add(new TinNhan(R.drawable.image3, "Sang Pham", " The nao"));
        listMessage.add(new TinNhan(R.drawable.image4, "Do Ha", "Mua to"));
        listMessage.add(new TinNhan(R.drawable.image, "Hung Son", "di vhoi deI"));

        listMessage.add(new TinNhan(R.drawable.image1, "Ha Nam", "dang o day"));
        listMessage.add(new TinNhan(R.drawable.image2, " Truong Son", "Vo tu di"));
        listMessage.add(new TinNhan(R.drawable.image3, "Sang Pham", " The nao"));
        listMessage.add(new TinNhan(R.drawable.image4, "Do Ha", "Mua to"));
        listMessage.add(new TinNhan(R.drawable.image, "Hung Son", "di vhoi deI"));
    }
}