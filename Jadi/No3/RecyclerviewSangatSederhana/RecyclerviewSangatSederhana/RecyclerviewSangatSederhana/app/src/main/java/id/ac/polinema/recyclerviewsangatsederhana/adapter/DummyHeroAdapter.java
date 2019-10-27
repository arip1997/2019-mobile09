package id.ac.polinema.recyclerviewsangatsederhana.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.R;
import id.ac.polinema.recyclerviewsangatsederhana.models.DummyHero;

public class DummyHeroAdapter extends RecyclerView.Adapter<DummyHeroAdapter.MyViewHolder> {
    List<DummyHero> heroList;

    public DummyHeroAdapter(List<DummyHero> heroList) {
        this.heroList = heroList;
    }

    @NonNull
    @Override
    public DummyHeroAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View dummyHeroView = layoutInflater.inflate(R.layout.item_dummy_hero,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(dummyHeroView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DummyHeroAdapter.MyViewHolder holder, int position) {
        DummyHero hero = heroList.get(position);
        holder.dummyName.setText(hero.getDummyName());
        Picasso.get().load(hero.getPhotoName())
                .placeholder(R.drawable.ic_launcher_background)
                .into(holder.imageContact);
    }

    @Override
    public int getItemCount() {
        return (heroList != null) ? heroList.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView dummyName;
        public ImageView imageContact;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            dummyName = itemView.findViewById(R.id.heroName);
            imageContact = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
