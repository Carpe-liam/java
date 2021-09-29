class Node {
  /**
   * Constructs a new Node instance. Executed when the 'new' keyword is used.
   * @param {any} data The data to be added into this new instance of a Node.
   *    The data can be anything, just like an array can contain strings,
   *    numbers, objects, etc.
Expand
algos.js
3 KB
Instructor_ShawnC — 09/27/2021
heading out for lunch a little early. I'll back back
videos are converting
Instructor_ShawnC — 09/27/2021
i'm back!
Alex_Tyler — 09/27/2021
@Instructor_ShawnC could you answer a quick question for me? -> in main room 
Instructor_ShawnC — 09/27/2021
@cohort-ShawnC 🏫 Afternoon session in 10 minutes!
Instructor_ShawnC — 09/27/2021
Thats it for me. Have a good night everyone
Sal_Nunez — 09/27/2021
Taking a long break, if any need any help feel free to reach out though, although seems most people here are very self sufficient :grogu_tea:
Instructor_ShawnC — Yesterday at 9:02 AM
Tuesday's Algo file
class Node {
  /**
   * Constructs a new Node instance. Executed when the 'new' keyword is used.
   * @param {any} data The data to be added into this new instance of a Node.
   *    The data can be anything, just like an array can contain strings,
   *    numbers, objects, etc.
Expand
algos.js
4 KB
Sal_Nunez — Yesterday at 9:58 AM
  insertAtFront(data) {
    let newNode = new Node(data);
    if (this.isEmpty()){
      this.head = newNode;
    } else {
      newNode.next = this.head;
      this.head = newNode;
    }
    return this;
  }
Vincent_Guerena — Yesterday at 10:02 AM
removeHead() {
        if(this.head == null){
            return null
        }

        var removed = this.head;
        this.head = removed.next;
        removed.next = null;

        return this

    }
Spencer_Rauch — Yesterday at 10:03 AM
on this one, I don't think you need the if / else -- if it's empty, this.head will be null so newNode.next = this.head can still run just fine 🙂
Instructor_SadieF — Yesterday at 11:01 AM
@cohort-ShawnC 🏫  btw -- who is moonchild? I was doing attendance and wasn't sure.. feel free to dm as needed.
Vincent_Guerena — Yesterday at 11:01 AM
George
Alex_Tyler — Yesterday at 11:11 AM
that's a fantastic name lol
Instructor_ShawnC — Yesterday at 12:11 PM
heading to lunch
Sadie will be starting off the 1pm Singly Linked List session
Instructor_ShawnC — Yesterday at 12:59 PM
@cohort-ShawnC 🏫 
I am back from lunch.
The Singly Linked List Discussion is starting in a few minutes in the main zoom room. Mainly just a Q&A.
Completely Optional
Instructor_SadieF — Yesterday at 1:04 PM
@cohort-ShawnC 🏫 SLL Extravaganza starting now!
(optional)
Instructor_ShawnC — Yesterday at 1:50 PM
SSL discussion whiteboard. You'll need to zoom in
Image
Instructor_SadieF — Yesterday at 3:39 PM
@cohort-ShawnC 🏫 https://forms.gle/mb8YgfjfTU8NgEbT6
Google Docs
Java Day 1 Assignment Reflection (October)
This survey is primarily to gather student reflections about the assignments on day 1, not the learning content, but any input is welcome!
Image
Instructor_ShawnC — Yesterday at 4:13 PM
@cohort-ShawnC 🏫 Small annoucement.
All of the lecture videos are put into an unlisted youtube playlist. The link for that playlist is on the schedule now should you want it.
Instructor_ShawnC — Yesterday at 5:01 PM
Thats it for me everyone. See you all tomorrow!
Instructor_SadieF — Yesterday at 5:21 PM
@cohort-ShawnC 🏫  -- heads up -- I'm going to add a check list to the PHI assignment, to help clarify the tasks. If you've already finished it ignore this.
Instructor_ShawnC — Today at 9:04 AM
class Node {
  /**
   * Constructs a new Node instance. Executed when the 'new' keyword is used.
   * @param {any} data The data to be added into this new instance of a Node.
   *    The data can be anything, just like an array can contain strings,
   *    numbers, objects, etc.
Expand
algos.js
6 KB
﻿
class Node {
  /**
   * Constructs a new Node instance. Executed when the 'new' keyword is used.
   * @param {any} data The data to be added into this new instance of a Node.
   *    The data can be anything, just like an array can contain strings,
   *    numbers, objects, etc.
   * @returns {Node} This new Node instance is returned automatically without
   *    having to be explicitly written (implicit return).
   */
  constructor(data) {
    this.data = data;
    /**
     * This property is used to link this node to whichever node is next
     * in the list. By default, this new node is not linked to any other
     * nodes, so the setting / updating of this property will happen sometime
     * after this node is created.
     */
    this.next = null;
  }
}

/**
 * Class to represent a list of linked nodes. Nodes CAN be linked together
 * without this class to form a linked list, but this class helps by providing
 * a place to keep track of the start node (head) of the list at all times and
 * as a place to add methods (functions inside an object) so that every new
 * linked list that is instantiated will inherit helpful the same helpful
 * methods, just like every array you create inherits helpful methods.
 */
class SinglyLinkedList {
  /**
   * Constructs a new instance of an empty linked list that inherits all the
   * methods.
   * @returns {SinglyLinkedList} The new list that is instantiated is implicitly
   *    returned without having to explicitly write "return".
   */
  constructor() {
    this.head = null;
  }

  /**
   * Calls insertAtBack on each item of the given array.
   * - Time: O(n * m) n = list length, m = arr.length.
   * - Space: O(1) constant.
   * @param {Array<any>} vals The data for each new node.
   * @returns {SinglyLinkedList} This list.
   */
  seedFromArr(vals) {
    for (const item of vals) {
      this.insertAtBack(item);
    }
    return this;
  }

  /**
   * Converts this list into an array containing the data of each node.
   * - Time: O(n) linear.
   * - Space: O(n).
   * @returns {Array<any>} An array of each node's data.
   */
  toArr() {
    const arr = [];
    let runner = this.head;

    while (runner) {
      arr.push(runner.data);
      runner = runner.next;
    }
    return arr;
  }

  /**
   * Determines if this list is empty.
   * - Time: O(?).
   * - Space: O(?).
   * @returns {boolean}
   */
  isEmpty() {
    return this.head === null;
  }

  /**
   * Creates a new node with the given data and inserts it at the back of
   * this list.
   * - Time: O(?).
   * - Space: O(?).
   * @param {any} data The data to be added to the new node.
   * @returns {SinglyLinkedList} This list.
   */
  insertAtBack(data) {
    let newNode = new Node(data);

    if (this.isEmpty()) {
      this.head = newNode;
    } else {
      let runner = this.head;

      while (runner.next != null) {
        runner = runner.next;
      }
      runner.next = newNode;
    }

    return this;
  }

  /**
   * Creates a new node with the given data and inserts that node at the front
   * of this list.
   * - Time: (?).
   * - Space: (?).
   * @param {any} data The data for the new node.
   * @returns {SinglyLinkedList} This list.
   */
  insertAtFront(data) {
    if (this.isEmpty()) {
        this.head = new Node(data);
        return this;
    }

    let newNode = new Node(data);
    newNode.next = this.head;
    this.head = newNode;

    return this;
  }

  /**
   * Removes the first node of this list.
   * - Time: (?).
   * - Space: (?).
   * @returns {any} The data from the removed node.
   */
  removeHead() {
    if (this.isEmpty()) return null;

    let currHead = this.head;
    this.head = currHead;
    currHead.next = null;

    return currHead.data;
  }

  // EXTRA
  /**
   * Calculates the average of this list.
   * - Time: (?).
   * - Space: (?).
   * @returns {number|NaN} The average of the node's data.
   */
  average() {
    if (this.isEmpty()) return null;

    let sum = 0;
    let len = 0;
    let runner = this.head;

    while (runner != null) {
      sum += runner.data;
      len++;
      runner = runner.next;
    }

    return sum / len;
  }

  // ========================== DAY 3 START ====================================

  /**
   * Removes the last node of this list.
   * - Time: O(?).
   * - Space: O(?).
   * @returns {any} The data from the node that was removed.
   */
  removeBack1() {
      if (this.isEmpty()) return null;
      let runner = this.head
      if(this.head.next == null) {
        this.head = null;
        return this;
    }
    while(runner.next.next != null) {
        runner = runner.next;
        return this;
    }
    runner.next = null;
  }


  removeBack() {
    let removedData;
    if (this.isEmpty() || this.head.next == null) {
        return this.removeHead();
    } else {
        let walker = this.head;
        let runner = walker.next;
        while (runner.next != null) {
            walker = runner;
            runner = runner.next;
        }
        removedData = runner;
        walker.next = null;
        return removedData.data
    }
}

  /**
   * Determines whether or not the given search value exists in this list.
   * - Time: O(?).
   * - Space: O(?).
   * @param {any} val The data to search for in the nodes of this list.
   * @returns {boolean}
   */
    contains(val) {
        let runner = this.head;
        while(runner.next != null) {
            if(runner.data === val) {
                return true;
            }
            runner = runner.next;
        }
        return false;
    }

  /**
   * Determines whether or not the given search value exists in this list.
   * - Time: O(?).
   * - Space: O(?).
   * @param {any} val The data to search for in the nodes of this list.
   * @param {?node} current The current node during the traversal of this list
   *    or null when the end of the list has been reached.
   * @returns {boolean}
   */
    containsRecursive(val, current = this.head) {
        if(current.data === val) {
            return true;
        } else if(current.next ==null){
            return false;
        } else {
            return this.containsRecursive(val, current=current.next);
        }
    }

  // EXTRA
  /**
   * Recursively finds the maximum integer data of the nodes in this list.
   * - Time: O(?).
   * - Space: O(?).
   * @param {Node} runner The start or current node during traversal, or null
   *    when the end of the list is reached.
   * @param {Node} maxNode Keeps track of the node that contains the current
   *    max integer as it's data.
   * @returns {?number} The max int or null if none.
   */
    recursiveMax(runner = this.head, maxNode = this.head) {
        if (runner.next === null) {
            return maxNode.data;
        } else if (maxNode.data >= runner.data) {
            return this.recursiveMax( runner=runner.next, maxNode = maxNode);
        } else { 
            return this.recursiveMax(maxNode = runner, runner = runner);
        }

    } 
}

const emptyList = new SinglyLinkedList();
const singleNodeList = new SinglyLinkedList().seedFromArr([1]);
const unorderedList = new SinglyLinkedList().seedFromArr([
  -5, -10, 4, -3, 6, 1, -7, 2,
]);

console.log(unorderedList.removeBack());