Java OOP Assessment (Intermediate)
📌 Scenario: Library Management System

You are building a simple system to manage a library. The system must handle books and different types of members.

🎯 Objectives

Your solution must demonstrate:

✅ Encapsulation (private fields + getters/setters)
✅ Inheritance (base class + subclasses)
✅ Use of loops
✅ Conditional logic
✅ Accessing, updating, and deleting data from attributes (e.g., arrays or lists)
🧱 Requirements
1. Base Class: LibraryItem

Create a class with:

Attributes (Encapsulation required)
title (String)
id (String)
isAvailable (boolean)
Methods
Getters and setters for all fields
checkoutItem() → marks item as unavailable
returnItem() → marks item as available
2. Subclass: Book (Inheritance)

Extend LibraryItem

Additional Attributes
author (String)
genre (String)
Methods
Constructor to initialize all fields
Override toString() to display book details
3. Base Class: Member
Attributes (Encapsulation)
name (String)
memberId (String)
borrowedBooks (Array or ArrayList of Book objects)
Methods
borrowBook(Book book)
Only allow borrowing if the book is available
Use conditionals
returnBook(String bookId)
Use a loop to find the book
Remove it from the list
viewBorrowedBooks()
Use a loop to display all borrowed books
4. Subclass: PremiumMember

Extend Member

Additional Attribute
maxBooksAllowed (int)
Requirements
Override borrowBook():
Use a conditional to check if the member reached their limit
Prevent borrowing if limit exceeded
5. Library Class
Attributes
books (ArrayList<Book>)
Methods
addBook(Book book)
removeBook(String id)
Use loop to find and delete a book
searchBook(String title)
Return matching books (use loop + condition)
displayAvailableBooks()
Show only available books
🧠 Functional Requirements

Your program must demonstrate:

✔ Loops
Searching books
Listing borrowed books
Removing books
✔ Conditionals
Checking availability
Borrow limits
Prevent invalid operations
✔ Data Manipulation
Add books
Remove books
Borrow/return books
🖥️ Main Program

Create a Main class to:

Create several books
Add them to the library
Create:
1 normal member
1 premium member
Simulate:
Borrowing books
Returning books
Removing a book from the library
Displaying available books
🧩 Example Output (Guideline)
Book borrowed successfully.
Book is not available.
You have reached your borrowing limit.
Returning book...
Book removed from library.
Available books:
- The Hobbit by Tolkien

library-system/
│
├── src/main/java/
│   └── library/
│       ├── LibraryItem.java
│       ├── Book.java
│       ├── Member.java
│       ├── PremiumMember.java
│       ├── Library.java
│       └── Main.java
│
├── src/test/java/
│   └── library/
│       ├── LibraryTest.java
│       ├── MemberTest.java
│       └── BookTest.java
│
└── pom.xml