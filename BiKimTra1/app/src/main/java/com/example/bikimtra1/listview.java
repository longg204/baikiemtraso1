package com.example.bikimtra1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class listview extends AppCompatActivity {
    private ListView lvchiensi;
    ArrayList<cacchiensi> arraychiensi;
    chiensiadapter adapter;
    private int vitri = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        lvchiensi = (ListView) findViewById(R.id.listviewcongan);
        arraychiensi = new ArrayList<>();
        arraychiensi.add(new cacchiensi("Nguyễn Văn A", "Đại Tá", "Quân khu 5", "Việt Nam", "5", R.drawable.congan));
        arraychiensi.add(new cacchiensi("Nguyễn Văn A", "Đại Tá", "Quân khu 5", "Việt Nam", "5", R.drawable.congan));
        arraychiensi.add(new cacchiensi("Nguyễn Văn A", "Đại Tá", "Quân khu 5", "Việt Nam", "5", R.drawable.congan));
        arraychiensi.add(new cacchiensi("Nguyễn Văn A", "Đại Tá", "Quân khu 5", "Việt Nam", "5", R.drawable.congan));
        arraychiensi.add(new cacchiensi("Nguyễn Văn A", "Đại Tá", "Quân khu 5", "Việt Nam", "5", R.drawable.congan));
        arraychiensi.add(new cacchiensi("Nguyễn Văn A", "Đại Tá", "Quân khu 5", "Việt Nam", "5", R.drawable.congan));
        arraychiensi.add(new cacchiensi("Nguyễn Văn A", "Đại Tá", "Quân khu 5", "Việt Nam", "5", R.drawable.congan));
        arraychiensi.add(new cacchiensi("Nguyễn Văn A", "Đại Tá", "Quân khu 5", "Việt Nam", "5", R.drawable.congan));
        arraychiensi.add(new cacchiensi("Nguyễn Văn A", "Đại Tá", "Quân khu 5", "Việt Nam", "5", R.drawable.congan));
        arraychiensi.add(new cacchiensi("Nguyễn Văn A", "Đại Tá", "Quân khu 5", "Việt Nam", "5", R.drawable.congan));


        adapter = new chiensiadapter(this, R.layout.chiensi, arraychiensi);
        lvchiensi.setAdapter(adapter);

        lvchiensi.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                vitri = i;
                new AlertDialog.Builder(listview.this)
                        .setIcon(android.R.drawable.ic_delete)
                        .setTitle("Are you sure?")
                        .setMessage("Do you want delete this Item?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                arraychiensi.remove(vitri);
                                adapter.notifyDataSetChanged();
                            }
                        })
                        .setNegativeButton("No", null)
                        .show();
                return true;
            }
        });
    }
}