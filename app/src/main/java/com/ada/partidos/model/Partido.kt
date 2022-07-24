package com.ada.partidos.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Partido (@StringRes val stringResourceId: Int,
                    @DrawableRes val imageResourceId:Int, @DrawableRes val imageResourceId2: Int){
}