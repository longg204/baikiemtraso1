package com.example.bikimtra1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class chiensiadapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<cacchiensi> cacchiensiList;

    public chiensiadapter(Context context, int layout, List<cacchiensi> cacchiensiList) {
        this.context = context;
        this.layout = layout;
        this.cacchiensiList = cacchiensiList;
    }

    @Override
    public int getCount() {
        return cacchiensiList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHoder{
        ImageView img;
        TextView txttenchiensi, txtcapbac, txtnoicongtac, txtquocgia, txtsosao;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHoder hoder;
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(layout, null);
            hoder = new ViewHoder();

            hoder.txttenchiensi = (TextView) view.findViewById(R.id.tencongan);
            hoder.txtcapbac = (TextView) view.findViewById(R.id.capbac);
            hoder.txtnoicongtac = (TextView) view.findViewById(R.id.noicongtac);
            hoder.txtquocgia = (TextView) view.findViewById(R.id.quocgia);
            hoder.txtsosao = (TextView) view.findViewById(R.id.sosao);
            hoder.img = (ImageView) view.findViewById(R.id.congan);
            view.setTag(hoder);
        }else{
            hoder = (ViewHoder) view.getTag();
        }

        cacchiensi cacchiensi =cacchiensiList.get(i);
        hoder.txttenchiensi.setText(cacchiensi.getTen());
        hoder.txtcapbac.setText(cacchiensi.getCapbac());
        hoder.txtnoicongtac.setText(cacchiensi.getNoicongtac());
        hoder.txtquocgia.setText(cacchiensi.getQuocgia());
        hoder.txtsosao.setText(cacchiensi.getSosao());
        hoder.img.setImageResource(cacchiensi.getImg());
        return view;
    }
}

