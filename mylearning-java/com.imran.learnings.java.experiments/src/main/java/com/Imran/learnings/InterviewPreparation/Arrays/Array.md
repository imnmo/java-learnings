**Array**
* An array is an contiguous area of memory which allocates equal size for elements stored and indexed by contiguous integer
* Single and multi dimensional: array accessing is always constant
- For single: arry_addr+ elemnt_size(current_index- start_index).
- For Multi-dime: arry_addr+ elemnt_size[(current_row-start) * column + (cuurent_row - start)]
 
Array accessing:

| Action        | Add            | Remove  |
| ------------- |:-------------: | -------:|
|Beginnning     | O(n)           | O(n)    |
|Middle         | O(n)           | O(n)    |
|End			| O(1)           | O(1)    |

_**Note: _ at the end its just an update so it just needs to access the array and get the 
element out of it

