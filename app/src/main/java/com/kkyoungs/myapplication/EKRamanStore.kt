package com.kkyoungs.myapplication

class EKRamanStore:RamanStore() {
    override fun createRaman(type: String): Raman? {
         return when (type) {
             "BulDak" -> {
                 return BulDackRaman()
             }
             "Sin" -> {
                 return SinRaman()
             }

             "Kok" -> {
                 return KokKokRaman()
             }

             else -> {
                  null
             }
         }
    }
}