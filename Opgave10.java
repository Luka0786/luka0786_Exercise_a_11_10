package Kap11Exercise10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Opgave10
{
    /*
    Write a method removeOddLength that accepts a set of strings as
    a parameter and that removes all of the strings of odd length from the set.
    */

    public static void main(String[] args)
    {
        Set<String> setWithStrings = new HashSet<>();
        setWithStrings.add("Helloo");
        setWithStrings.add("Test");
        setWithStrings.add("Testing");
        setWithStrings.add("Hej med dig");
        setWithStrings.add("Bacon");
        setWithStrings.add("Juice");
        setWithStrings.add("Kat");
        setWithStrings.add("Even");

        System.out.println(removeOddLength(setWithStrings));

    }

    public static Set<String> removeOddLength(Set<String> stringSet)
    {
        Set<String> setOfStrings = new HashSet<>(stringSet);
        Iterator<String> iterator = stringSet.iterator();

        while (iterator.hasNext())
        {
            String next = iterator.next();
            if (next.length() % 2 != 0)
            {
                setOfStrings.remove(next);
            }
        }
        return setOfStrings;
    }
}
