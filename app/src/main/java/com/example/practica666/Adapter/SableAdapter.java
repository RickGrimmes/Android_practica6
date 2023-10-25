package com.example.practica666.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practica666.Models.Lightsaber;
import com.example.practica666.R;

import java.util.List;

public class SableAdapter extends RecyclerView.Adapter<SableAdapter.ViewHolder>
implements View.OnClickListener {

    private List<Lightsaber> lightsabers;
    private View.OnClickListener listener;



    public SableAdapter(List<Lightsaber> lightsabers){ this.lightsabers = lightsabers; }

    @NonNull
    @Override
    public SableAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate(R.layout.lightsaberitem, parent, false);

        v.setOnClickListener(this);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull SableAdapter.ViewHolder holder, int position) {
        Lightsaber l = lightsabers.get(position);
        holder.setData(l);
    }


    @Override
    public int getItemCount() { return lightsabers.size(); }

    public void setOnItemClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    @Override
    public void onClick(View v) {
        if (listener!=null){
            listener.onClick(v);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtpropietario, txthoja, txtcolor;

        Lightsaber lightsaberHolder;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtpropietario = itemView.findViewById(R.id.tvPropietario);
            txthoja = itemView.findViewById(R.id.tvHojas);
            txtcolor = itemView.findViewById(R.id.tvColor);
        }

        public void setData(Lightsaber l) {
            this.lightsaberHolder=l;
            txtcolor.setText(l.getColor());
            txthoja.setText(l.getHojas());
            txtpropietario.setText(l.getPropietario().getUsuario());
        }
    }
}
