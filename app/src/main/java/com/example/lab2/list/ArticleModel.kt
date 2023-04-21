package com.example.lab2.list

import android.icu.text.CaseMap.Title
import android.media.Image
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize data class ArticleModel(
    val image: String,
    val title: String,
    val ingredients: String,
    val price: String
) : Parcelable {
    companion object {

        fun createDefultData(): List<ArticleModel> {
            val list = ArrayList<ArticleModel>()
            list.add(ArticleModel("https://images.pexels.com/photos/8472630/pexels-photo-8472630.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1","Філадельфія хияши","Рис, сир філадельфія, лосось, хіяші","240 грн"))
            list.add(ArticleModel("https://images.pexels.com/photos/12437583/pexels-photo-12437583.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1","Якомога","Японський рис, лосось, сир філадельфія, авокадо, огірок","290 грн"))
            list.add(ArticleModel("https://images.pexels.com/photos/8472649/pexels-photo-8472649.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1","Унагі рол","Рис, вугор, сир філадельфія, огірок, соус унагі","230 грн"))
            return list
        }
    }
}
