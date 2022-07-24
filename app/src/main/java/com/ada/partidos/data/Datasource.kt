package com.ada.partidos.data

import com.ada.partidos.R
import com.ada.partidos.model.Partido

class Datasource {
    fun cargarPartidos():List<Partido>{
        return listOf<Partido>(
            Partido(R.string.Fecha1,R.drawable.argentina,R.drawable.arabia),
            Partido(R.string.Fecha2,R.drawable.argentina,R.drawable.mexico),
            Partido(R.string.Fecha3,R.drawable.polonia,R.drawable.argentina)
        )
    }
}