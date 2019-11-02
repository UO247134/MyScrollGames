package com.example.myscrollgames;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


    public class JuegoAdapter extends RecyclerView.Adapter<JuegoAdapter.MyViewHolder> {
        private List<Juego> juegoList;


        //Componentes de la vista. Clase interna que los define
        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView nombre;

            public MyViewHolder(View view) {
                super(view);
                nombre =  view.findViewById(R.id.nombre);

            }
        }

        public JuegoAdapter(List<Juego> juegoList) {
            this.juegoList = juegoList;
        }


        @NonNull
        @Override

        //Creacion de la vista de cada item
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            //instancia el recview.xml en un vista
            //si no ponemos false al attachRoot, casca y no dicen por qué
            View itemView= LayoutInflater.from(parent.getContext()).
                    inflate(R.layout.recviewcard,parent,false);


            return new MyViewHolder(itemView);
        }

        @Override
        //Asociación de contenido a los componentes de la vista
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            Juego video = juegoList.get(position);
            holder.nombre.setText(video.getNombre());

        }

        @Override
        public int getItemCount() {
            return juegoList.size();
        }


    }

