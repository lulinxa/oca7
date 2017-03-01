class Person {
  String name;
  Person (String name) {
    this.name = name;
  }
}

public class StringBuilderTest {
   public static void main(String args[]){
     /*
      * value = new char[16];
      */
     StringBuilder sb1 = new StringBuilder(); // 16 chars
     
     StringBuilder sb2 = new StringBuilder(sb1); 
     StringBuilder sb3 = new StringBuilder(50); // 50 chars initial capacity

     /*
      * value = new char[str.length + 16];
      */
     StringBuilder sb4 = new StringBuilder("My StringBuilder string");

     /*
      * append()
      */
     sb1.append(true);
     sb1.append(10);
     sb1.append('a');
     sb1.append(20.99f);
     sb1.append(20.99);
     sb1.append("Bok");
     Person p = new Person("Name");
     sb1.append(p);     
     System.out.println(sb1);

     sb1 = new StringBuilder("* "); 
     char name[] = {'J', 'a', 'v', 'K', 'a', '7'};
     sb1.append(name, 1, 5); // begining index, numberOfChars -> uses System.arraycopy -> throws ArrayIndexOutOfBOunds
     System.out.println(sb1);

     
     sb1 = new StringBuilder();
     sb1.append("Java");
     String s = new String("Oracle");
     sb1.append(s);
     sb1.append(new String("7"));
     System.out.println(sb1);

     /*
      * ensureCapacity() method of SB
      */
     System.out.println(sb1.capacity());
     sb1.ensureCapacity(17);
     System.out.println(sb1.capacity());
     // expandCapacity can be called only from package :)
     //sb1.expandCapacity(100); // not public
     sb1.ensureCapacity(100);
     System.out.println(sb1.capacity());
      
     /*
      * insert()
      */
     sb2 = new StringBuilder("Vladir");
     sb2.insert(5, "mi"); // also works with char
     System.out.println(sb2);
     sb2.delete(5, 7); // or use delete(4, 6) on "Vladimir" :)
     System.out.println(sb2);
     sb2.insert(4, "im");
     System.out.println(sb2);
     sb2.insert(5, false);
     sb2.insert(1, true);
     System.out.println(sb2);
     sb2.insert(4, 99.99);
     System.out.println(sb2);

     sb2 = new StringBuilder("123");
     name = "Java".toCharArray();
     sb2.insert(1, name, 1, 2); //indexToInsert, array, beginning index, numberOfChars
     System.out.println(sb2);

     sb2.appendCodePoint(121);
     System.out.println(sb2);
     System.out.println(sb2.codePointAt(0));
    
     /*
      * delete() deleteCharAt()
      */
     // "JavaOracle7"
     sb1.delete(7, sb1.length()); // indexStart, indexEnd excluding last int position
     System.out.println(sb1);
    
     sb1.deleteCharAt(sb1.length()-1);
     System.out.println(sb1);

     sb3 = new StringBuilder("First Last");
     //    FirstLast       First#Last
     sb3.deleteCharAt(5).insert(5, "#");
     System.out.println(sb3);

     /*
      * replace()
      */
     sb4 = new StringBuilder("0123456");
     sb4.replace(2, 4, "A");
     System.out.println(sb4);

     /* subSequence() */
     System.out.println(sb4.subSequence(2, 4));
     System.out.println(sb4);
   }
 }
