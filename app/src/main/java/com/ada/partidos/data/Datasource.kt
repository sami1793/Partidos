package com.ada.partidos.data

import com.ada.partidos.R
import com.ada.partidos.model.Partido

class Datasource {
    fun cargarPartidos():List<Partido>{
        return listOf<Partido>(
            Partido(R.string.Fecha1,R.drawable.argentina,R.drawable.arabia),
            Partido(R.string.Fecha2,R.drawable.mexico,R.drawable.polonia),
            Partido(R.string.Fecha3,R.drawable.polonia,R.drawable.arabia),
            Partido(R.string.Fecha4,R.drawable.argentina,R.drawable.mexico),
            Partido(R.string.Fecha5,R.drawable.polonia, R.drawable.argentina),
            Partido(R.string.Fecha6,R.drawable.arabia, R.drawable.mexico)
        )
    }
}