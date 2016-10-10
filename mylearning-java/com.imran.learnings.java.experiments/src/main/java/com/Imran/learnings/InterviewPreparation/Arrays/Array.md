**Array**
* An array is an contiguous area of memory which allocates equal size for elements stored and indexed by contiguous integer
* Single and multi dimensional: array accessing is always constant
- For single: arry_addr+ elemnt_size(current_index- start_index).
- For Multi-dimension: arry_addr+ elemnt_size[(current_row-start) * column + (cuurent_row - start)]
 
Array accessing:

| Action        | Add            | Remove  |
| ------------- |:-------------: | -------:|
|Beginnning     | O(n)           | O(n)    |
|Middle         | O(n)           | O(n)    |
|End			| O(1)           | O(1)    |
|Indexing	     O(1)-- constant time

_**Note: _ at the end its just an update so it just needs to access the array and get the 
element out of it

* Dynamic array/Vector/ReSizing Array:
* In computer science, a dynamic array, growable array, resizable array, dynamic table, mutable array, or array list is a random access
* Videos: * Part1: https://www.youtube.com/watch?v=wXeBVndWA78
          * Part2: https://www.youtube.com/watch?v=6ijRCyt28DE
* API in Dynamic Array:
- From the client point, the user creates the new resizable array object and would be able to the
 element onto it, arbitary of the fixed elements in it.
 
 Let us say myArray.append(1);//Should add the element !
 
- So the API should contain the following methods:
 * append(data) //at the end of the array O(1)
 * append(index,data) // at the the beginning or middle
 * isFull //check if full or not
 * and other member variables to work on..
 
 
 
 
 * ArrayList vs. vector in Java:
 
 - Vector is just the old version of the array list which is implemented basically as doubling the size of the existing array
   whereas the arrayList allocates based on the 50% allocation
 - Mostly for the synchronization purposes better use the vector, advice always use declare your list as
   collection.SynchronizedList
 -  
 
