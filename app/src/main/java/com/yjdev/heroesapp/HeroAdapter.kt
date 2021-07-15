package com.yjdev.heroesapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.yjdev.heroesapp.databinding.ItemSuperheroBinding

class HeroAdapter(val superHero: List<SuperHero>):RecyclerView.Adapter<HeroAdapter.HeroHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HeroHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.render(superHero[position])
    }

    override fun getItemCount(): Int {
        return superHero.size
    }

    class HeroHolder(val view:View):RecyclerView.ViewHolder(view){
        val binding = ItemSuperheroBinding.bind(view)
        fun render(superhero: SuperHero){
            binding.tvRealName.text = superhero.realName
            binding.tvSuperHeroName.text = superhero.superHeroName
            binding.tvPublisher.text = superhero.publisher
            Picasso.get().load(superhero.image).into(binding.ivHero)


        }
    }
}