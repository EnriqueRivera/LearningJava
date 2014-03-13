package c7_genericsAndCollections;

/*
Set interface:
A Set cares about uniqueness—it doesn't allow duplicates.

HashSet:  
It uses the hashcode
of the object being inserted, so the more efficient your hashCode() implementation
the better access performance you'll get. Use this class when you want a collection
with no duplicates and you don't care about order when you iterate through it.

LinkedHashSet:   
Use this class instead of HashSet when you care about the iteration order
When you iterate through a HashSet the order is unpredictable, while a LinkedHashSet 
lets you iterate through the elements in the order in which they were inserted.

TreeSet:    
It uses a Red-Black tree structure, and guarantees that the elements will be in 
ascending order, according to natural order.
implements NavigableSet.
*/

public class SetClasses {
}