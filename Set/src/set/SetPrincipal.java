package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author jimmy rios
 */
public class SetPrincipal {

    /**
     * no puede haber elementos repetidos en las colecciones que impelmentan la
     * interfaz set Estructura de datos dinamica hashset: Conjunto de datos que
     * no se almacena en un orden esecifico, se garantiza que no hay datos
     * duplicados TreeSet: Los elementos se organizan de menor a mayor
     * LinkedGashSet: los elementos el conjunto se encuentran en el orden que se
     * insertan, parecido a una lista pero sin dejar ingresar valores repetidos
     * sorterset:Provee un total ordenamiento de los elementos del conjunto
     */
    public static void main(String[] args) {
        //hashSet
        Set<Integer> personas = new HashSet<Integer>();
        personas.add(15);
        personas.add(30);
        personas.add(115);//repetido
        personas.add(21);
        personas.add(56);
        personas.add(115);//repetido
        System.out.println("--------HashSet-----------");
        for (Integer iterador : personas) {
            System.out.print(iterador + "/");
        }
        System.out.println();

        //linkedHashSet
        Set<Integer> mascotas = new LinkedHashSet<Integer>();
        mascotas.add(2);
        mascotas.add(2);
        mascotas.add(5);
        mascotas.add(8);
        mascotas.add(100);
        mascotas.add(-5);
        System.out.println("--------LinkedHashSet-----");
        for (Integer inte : mascotas) {
            System.out.print(inte + "/");
        }
        System.out.println();

        //TreeSet
        Set<Integer> partidos = new TreeSet<Integer>();
        partidos.add(20);
        partidos.add(40);//repetido
        partidos.add(40);//repetido
        partidos.add(40);//repetido
        partidos.add(25);
        partidos.add(19);
        partidos.add(15);
        partidos.add(35);
        partidos.remove(1);//elminar elemina solo uno 40, no todos 
        System.out.println("--------TreeSEt-----------");
        for (Integer inter : partidos) {
            System.out.print(inter + "/");
        }
        System.out.println();
        System.out.println("Cuantos paridos no repitidos hay: " + partidos.size());

        String valor = (partidos.contains(35)) ? "Si" : "No";
        System.out.println(valor);

        /**
         * SortedSet Inetfaz de la collecion de java extiende de set proporciona
         * un orden total a sus elementos SORT=Ordenamiento -QuickSort
         */
        SortedSet<String> videoJuegos = new TreeSet<>();
        videoJuegos.add("DOOM");//duplicado
        videoJuegos.add("LOL");
        videoJuegos.add("DOOM");//duplicado
        videoJuegos.add("DBZ");
        videoJuegos.add("PALADINS");
        videoJuegos.add("ARK");
        videoJuegos.add("FIFA 2020");

        System.out.println("----------SortedSet-------");

        System.out.println("Sorted set: " + videoJuegos);
        System.out.println("Fisrt game: " + videoJuegos.first());
        System.out.println("Last game: " + videoJuegos.last());
        /**
         * SortedSet+ elementos antes de fifa 2020
         */
        System.out.println("-----SortedSet-headSet-----");
        SortedSet<String> beforefifa2020 = videoJuegos.headSet("FiFA 2020");// imprmie todo hasta el elemento que uno pide 
        System.out.println(beforefifa2020);

        /**
         * SUBSET= ICLUDING AND EXLUDING
         */
        System.out.println("-----SortedSet-subset-----");
        SortedSet<String> entrelol_Ark = videoJuegos.subSet("DOOM", "PALADINS");
        System.out.println(entrelol_Ark);
        
        /**
         * TAILSET= getting elements afetr (including)
         */
        System.out.println("-----SortedSet-tailSet-----");
        
        SortedSet<String>bdz= videoJuegos.tailSet("DBZ");
        System.out.println(bdz);
        
    }
}