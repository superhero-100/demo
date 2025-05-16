
import java.util.ArrayList;
import java.util.Collection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tagline
 */
public class CollectionDemo {

    public static void main(String[] args) {

        // Collection interface extends Iterable interace
        // add remove contains size isEmpty addAll removeAll toIterator toArray
        Collection<Integer> collection = new ArrayList<>();
        collection.add(11);

    }

}

// java.util
// │
// ├── Collection (I)
// │ ├── Iterable (I) form lang package Fail-Fast vs Fail-Safe Iterators
// arrayLiast concurrent modidifaction modification ex
// fail-Safe ConcurrentHashMap, CopyOnWriteArrayList
// │ │ └── Iterator (I)
// │ │ └── ListIterator (I)
// │ │ └── Spliterator (I)
// │ │
// │ ├── List (I) extends Collection
// │ │ ├── ArrayList (C)
// │ │ ├── LinkedList (C)
// │ │ ├── Vector (C)
// │ │ │ └── Stack (C)
// │ │
// │ ├── Set (I) extends Collection
// │ │ ├── HashSet (C)
// │ │ │ └── LinkedHashSet (C)
// │ │ ├── EnumSet (C) [abstract]
// │ │ │ ├── RegularEnumSet (C) [package-private]
// │ │ │ └── JumboEnumSet (C) [package-private]
// │ │ └── SortedSet (I)
// │ │ └── NavigableSet (I)
// │ │ └── TreeSet (C)
// │ │
// │ └── Queue (I) extends Collection
// │ ├── Deque (I)
// │ │ ├── ArrayDeque (C)
// │ │ └── LinkedList (C) [also List]
// │ ├── PriorityQueue (C)
// │ └── ConcurrentLinkedQueue (C)
// │
// ├── Map (I) [NOT a subtype of Collection]
// │ ├── HashMap (C)
// │ │ ├── LinkedHashMap (C)
// │ │ └── WeakHashMap (C)
// │ ├── EnumMap (C)
// │ ├── IdentityHashMap (C)
// │ ├── SortedMap (I)
// │ │ └── NavigableMap (I)
// │ │ └── TreeMap (C)
// │ └── Hashtable (C)
// │ └── Properties (C)

// ├── Utility Classes
// │ ├── Collections (C) – static methods (e.g. sort, shuffle)
// │ └── Arrays (C) – static methods (e.g. sort, binarySearch)

// java.util.concurrent
// │
// concurrent linkedqueue
// ├── BlockingQueue (I) extends Queue
// │ ├── ArrayBlockingQueue (C)
// │ ├── LinkedBlockingQueue (C)
// │ ├── PriorityBlockingQueue (C)
// │ ├── SynchronousQueue (C)
// │ └── DelayQueue (C)

// ├── TransferQueue (I) extends BlockingQueue
// │ └── LinkedTransferQueue (C)

// ├── BlockingDeque (I) extends BlockingQueue, Deque
// │ └── LinkedBlockingDeque (C)

// ├── ConcurrentMap (I) extends Map
// │ ├── ConcurrentHashMap (C)
// │ └── ConcurrentSkipListMap (C)

// ├── ConcurrentNavigableMap (I) extends NavigableMap, ConcurrentMap
// │ └── ConcurrentSkipListMap (C)

// ├── CopyOnWriteArrayList (C) [implements List]
// ├── CopyOnWriteArraySet (C) [implements Set]
// ├── ConcurrentLinkedDeque (C) [implements Deque]
