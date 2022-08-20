package com.faith.recipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.faith.recipeapp.adapter.MainCategoryAdapter
import com.faith.recipeapp.adapter.SubCategoryAdapter
import com.faith.recipeapp.entities.Recipes
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    var accMainCategory=ArrayList<Recipes>()
    var accSubCategory=ArrayList<Recipes>()

    var mainCategoryAdapter=MainCategoryAdapter()
    var subCategoryAdapter=SubCategoryAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //temporary data
        accMainCategory.add(Recipes(1,"Beef"))
        accMainCategory.add(Recipes(2,"Chicken"))
        accMainCategory.add(Recipes(3,"Dessert"))
        accMainCategory.add(Recipes(4,"Lamb"))

        mainCategoryAdapter.setData(accMainCategory)

        accSubCategory.add(Recipes(1,"Beef and Mustard pie"))
        accSubCategory.add(Recipes(2,"Chicken and mushroom hotpot"))
        accSubCategory.add(Recipes(3,"Banana pancakes"))
        accSubCategory.add(Recipes(4,"Kapsalon"))

        subCategoryAdapter.setData(accSubCategory)

        rv_main_category.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rv_main_category.adapter=mainCategoryAdapter

        rv_sub_category.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
       rv_sub_category.adapter=subCategoryAdapter

    }
}