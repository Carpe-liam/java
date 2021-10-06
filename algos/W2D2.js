class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

/**
 * Class to represent a queue using an array to store the queued items.
 * Follows a FIFO (First In First Out) order where new items are added to the
 * back and items are removed from the front.
 */
class Queue {
    constructor() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    isEmpty() {
        // return true if SLStack is empty
        // return false if SLStack is not empty
        if (this.head == null) {
        return true;
        } else {
        return false;
        }
    }

    size() {
        // return length of SLStack
        let counter = 0;
        let runner = this.head;
        if (!this.isEmpty()) {
            counter++;
        }
        while (runner.next != null) {
            runner = runner.next;
            counter++;
        }
        return counter;
    }

    enqueue(newVal) {
        // push newVal to end of Queue
        let newNode = new Node(newVal);
        if(this.isEmpty()) {
            this.head = newNode;
            this.head.next = this.tail;
            this.size++
        } else if(this.tail == null) {
            this.tail = newNode;
            this.head.next = this.tail;
            this.size++
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
            this.size++
        }
        return this;
    }

    dequeue() {
        // remove and return the data at the front of the queue
        let node = this.head;

    if (this.isEmpty()) {
        return null;
    }

    if (this.head.next == null) {
        this.head = null;
        this.tail = null;
        this.size = 0;
        return node.data;
    }

    this.head = this.head.next;
    this.size--;
    return node.data;
    
    }

    front() {
    // return the data at the front of the queue without removing
    if (this.isEmpty()) {
        return null;
    }
    return this.head.data;
    }


    // EXTRA
    print() {
        if (this.isEmpty()) return false;

        let runner = this.head;

        while (runner != null) {
            console.log(runner.data);
            runner = runner.next;
        }
        return this;
    }
}

var que = new Queue();
que.enqueue(5);
que.enqueue(6);
que.enqueue(5);
que.enqueue(4);
que.enqueue(2);
que.print();