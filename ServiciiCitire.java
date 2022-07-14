package com.itfactory;

import java.io.IOException;
import java.util.List;

   public class ServiciiCitire {

       public static boolean fisierGol(List<String> continutFisier) throws IOException {

           if (!(continutFisier.isEmpty())) {
               return false;
           } else {
               return true;
           }
       }

       public static boolean cautareCuvant(List<String> continutFisier, String cuvantCautat){
           if (continutFisier.contains(cuvantCautat)) {
               return true;
           } else {
               return false;
           }
       }
   }

