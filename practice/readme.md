# Package Practice

This package contains a class `Singlylinkedlist` that implements a singly linked list (SLL).

## Class: `Singlylinkedlist`

### Fields

- `head`: Represents the head node of the SLL.
- `tail`: Represents the tail node of the SLL.
- `size`: Represents the number of nodes in the SLL.

### Methods

- `CreateSinglelinkedlist(int nodeValue)`: Creates a SLL with a single node containing the given `nodeValue`. It sets the head, tail, and size accordingly. The method returns the head node.
- `insertInlinkedlist(int nodeValue, int location)`: Inserts a new node with the given `nodeValue` at the specified `location` in the SLL. If the `location` is 0, the new node becomes the new head. If the `location` is greater than or equal to the size of the SLL, the new node becomes the new tail. Otherwise, the new node is inserted at the specified location. The method updates the head, tail, and size accordingly.
- `tsll()`: Traverses the SLL and prints the values of all nodes in order. It starts from the head node and follows the next pointers until the end of the SLL is reached. If the SLL is empty, it prints a message indicating that the SLL doesn't exist.
- `searchNode(int nodeValue)`: Searches for a node with the given `nodeValue` in the SLL. It starts from the head node and checks each node's value until a match is found. If the node is found, it prints the value and position of the node. If the node is not found, it prints a message indicating that the node was not found. The method returns `true` if the node is found and `false` otherwise.
- `doN(int location)`: Deletes the node at the specified `location` in the SLL. If the `location` is 0, the head node is deleted. If the `location` is greater than or equal to the size of the SLL, the tail node is deleted. Otherwise, the node at the specified location is deleted. The method updates the head, tail, and size accordingly.

Note: The implementation assumes the existence of a class `Node` that represents a single node in the SLL. The details of the `Node` class are not provided in this README.

## Usage

1. Create an instance of the `Singlylinkedlist` class.
2. Use the available methods to manipulate the SLL:
    - Use `CreateSinglelinkedlist` to create a SLL or initialize it with a single node.
    - Use `insertInlinkedlist` to insert a node at a specific location in the SLL.
    - Use `tsll` to print the values of all nodes in the SLL.
    - Use `searchNode` to search for a specific node in the SLL.
    - Use `doN` to delete a node at a specific location in the SLL.
