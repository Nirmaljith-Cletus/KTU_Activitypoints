package com.example.asus.ktu_activitypoints;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;



public class ListAdapter extends BaseAdapter {

    private Context context;
    private  int layout;
    private ArrayList<List> List;

    public ListAdapter(Context context, int layout, ArrayList<List> List) {
        this.context = context;
        this.layout = layout;
        this.List = List;
    }

    @Override
    public int getCount() {
        return List.size();
    }

    @Override
    public Object getItem(int position) {
        return List.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder{
        ImageView imageView;
        TextView txtName, txtPoints;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View row = view;
        ViewHolder holder = new ViewHolder();

        if(row == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(layout, null);

            holder.txtName = (TextView) row.findViewById(R.id.txtName);
            holder.txtPoints = (TextView) row.findViewById(R.id.txtPrice);
            holder.imageView = (ImageView) row.findViewById(R.id.imgFood);
            row.setTag(holder);
        }
        else {
            holder = (ViewHolder) row.getTag();
        }

        List list = List.get(position);

        holder.txtName.setText(list.getName());
        holder.txtPoints.setText(list.getPoints());

        byte[] CertificateImage = list.getImage();
        Bitmap bitmap = BitmapFactory.decodeByteArray(CertificateImage, 0, CertificateImage.length);
        holder.imageView.setImageBitmap(bitmap);

        return row;
    }
}
