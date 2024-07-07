package app;

import set.AdvancedSet;
import set.AdvancedSetInterface;
import set.ArrayCollection;

public class HomeworkP4Test 
{
  public static void main(String[] args)
  {
    AdvancedSetInterface<String> test;
    test = new AdvancedSet<String>();
    test.add("alpha");
    test.add("beta");
    test.add("gamma");
    test.add("delta");
    test.add("epsilon");
    AdvancedSetInterface<String> test2;
    test2 = new AdvancedSet<String>();
    test2.add("cat");
    test2.add("dog");
    test2.add("boat");
    ArrayCollection<String> resultant;
    resultant = test.union((ArrayCollection<String>) test2);
    
    System.out.println("After union is performed, resultant set checked");
    System.out.println("Expect 'true': " + resultant.contains("cat"));
    System.out.println("Expect 'false': " + resultant.contains("batman"));
    System.out.println("Expect 'true': " + resultant.contains("dog"));
    System.out.println("Expect 'true': " + resultant.contains("alpha"));
    System.out.println("Expect 'false': " + resultant.contains("zeta"));
    
    test2.remove("cat");
    test2.remove("dog");
    test2.add("epsilon");
    test2.add("delta");
    resultant=null;
    resultant = test.difference((ArrayCollection<String>) test2);
    
    System.out.println("Modifying the two sets and a difference is checked");
    System.out.println("Expect 'false': " + resultant.contains("delta"));
    System.out.println("Expect 'false': " + resultant.contains("epsilon"));
    System.out.println("Expect 'true': " + resultant.contains("alpha"));
    System.out.println("Expect 'true': " + resultant.contains("beta"));
    System.out.println("Expect 'true': " + resultant.contains("gamma"));

    test.add("dog");
    test2.add("dog");
    resultant=null;
    resultant = test.intersection((ArrayCollection<String>) test2);
    
    System.out.println("Modifying the two sets and intersection is checked");
    System.out.println("Expect 'true': " + resultant.contains("dog"));
    System.out.println("Expect 'false': " + resultant.contains("boat"));

   }
}