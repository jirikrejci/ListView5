package com.example.jirka.listview5;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jirka on 23.6.2016.
 */
public class MujBaseAdapter extends BaseAdapter {

    Context context;
    List<Polozka> items;

    public MujBaseAdapter(Context context, List<Polozka> items) {
        this.context = context;
        this.items = items;
    }
    private class ViewHolder
    {
        ImageView imImageView;
        TextView tvTitle;
        TextView tvPopis;
    }

    @Override
    public int getCount() {
        return  items.size();
    }

    @Override
    public Object getItem(int pozice) {   // musí vrátit ukazatel na objekt položky = struktury s jedním řádkem
        return items.get(pozice);
    }

    @Override
    public long getItemId(int pozice) {
        return items.indexOf(getItem(pozice));  //??? tohle nechápu, proč tak složitě? Uvidíme při debug
    }

    @Override
    public View getView(int pozice, View convertView, ViewGroup parent) {
        ViewHolder hld = null;

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_item, null);

            hld = new ViewHolder();
            hld.tvPopis = (TextView) convertView.findViewById(R.id.tvPopis);
            hld.tvTitle = (TextView) convertView.findViewById(R.id.tvNazev);
            hld.imImageView = (ImageView) convertView.findViewById(R.id.imObrazek);

            convertView.setTag(hld);
        }
        else
        {
            hld = (ViewHolder) convertView.getTag();
        }

        Polozka polozka = (Polozka) getItem(pozice);
        hld.tvPopis.setText(polozka.getPopis());
        hld.tvTitle.setText(polozka.getNazev());
        hld.imImageView.setImageResource(polozka.getObrId());

        return convertView;
    }
}
