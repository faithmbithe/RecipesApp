package com.faith.recipeapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.faith.recipeapp.R
import com.faith.recipeapp.entities.Recipes
import kotlinx.android.synthetic.main.item_rv_main_category.view.*


class MainCategoryAdapter:RecyclerView.Adapter<MainCategoryAdapter.RecipeViewHolder>(){

    var accMainCategory=ArrayList<Recipes>()
    class RecipeViewHolder(view:View):RecyclerView.ViewHolder(view){

    }
    fun setData(arrData :List<Recipes>){
        accMainCategory=arrData as ArrayList<Recipes> /* = java.util.ArrayList<com.faith.recipeapp.entities.Recipes> */
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        return RecipeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_rv_main_category,parent,false))
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
holder.itemView.tv_dish_name.text=accMainCategory[position].dishName
    }

    override fun getItemCount(): Int {
        return accMainCategory.size
    }
}