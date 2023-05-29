# Package Practice1

This package contains a class `csll` that implements a circular singly linked list (CSLL). The CSLL is a type of linked list in which the last node of the list points back to the first node, creating a circular structure.

## Class: `csll`

### Fields

- `head`: Represents the head node of the CSLL.
- `tail`: Represents the tail node of the CSLL.
- `size`: Represents the number of nodes in the CSLL.

### Methods

- `createcsll(int nodeValue)`: Creates a CSLL with a single node containing the given `nodeValue`. It sets the head, tail, and size accordingly. The method returns the head node.
- `insertcsll(int nodeValue, int location)`: Inserts a new node with the given `nodeValue` at the specified `location` in the CSLL. If the `location` is 0, the new node becomes the new head. If the `location` is greater than or equal to the size of the CSLL, the new node becomes the new tail. Otherwise, the new node is inserted at the specified location. The method updates the head, tail, and size accordingly.
- `transversecsll()`: Traverses the CSLL and prints the values of all nodes in order. It starts from the head node and follows the next pointers until the end of the CSLL is reached. If the CSLL is empty, it prints a message indicating that the CSLL doesn't exist.
- `searchNode(int nodeValue)`: Searches for a node with the given `nodeValue` in the CSLL. It starts from the head node and checks each node's value until a match is found. If the node is found, it prints the value and position of the node. If the node is not found, it prints a message indicating that the node was not found. The method returns `true` if the node is found and `false` otherwise.
- `deleteNode(int location)`: Deletes the node at the specified `location` in the CSLL. If the `location` is 0, the head node is deleted. If the `location` is greater than or equal to the size of the CSLL, the tail node is deleted. Otherwise, the node at the specified location is deleted. The method updates the head, tail, and size accordingly.

Note: The implementation assumes the existence of a class `Node` that represents a single node in the CSLL. The details of the `Node` class are not provided in this README.

## Usage

1. Create an instance of the `csll` class.
2. Use the available methods to manipulate the CSLL:
    - Use `createcsll` to create a CSLL or initialize it with a single node.
    - Use `insertcsll` to insert a node at a specific location in the CSLL.
    - Use `transversecsll` to print the values of all nodes in the CSLL.
    - Use `searchNode` to search for a specific node in the CSLL.
    - Use `deleteNode` to delete a node at a specific location in the CSLL.
