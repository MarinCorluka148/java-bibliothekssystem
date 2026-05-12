# Java Library Management System

A console-based library management system written in Java.

The application can manage different types of media:

- Books
- Films
- Games

This project was created to practice object-oriented programming and basic software design in Java.

## Features

- Add new media
- Search media by title
- Borrow and return media
- Remove media
- Sort media by title or release year
- Save and load data using file serialization
- Input validation with exception handling

## Technologies and Concepts

- Java
- Object-Oriented Programming (OOP)
- Inheritance
- Abstract classes
- Interfaces
- Polymorphism
- ArrayList / Collections
- Comparator
- Exception Handling
- Serialization
- Console menu with Scanner

## Project Structure

- Medium → abstract base class
- Buch, Film, Spiel → subclasses
- Bibliothek → manages all media
- Main → console menu and user interaction

## How to Run

Compile the project:

```bash
javac -encoding UTF-8 src/ausleihe/*.java
```

Run the application:

```bash
java -cp src ausleihe.Main
```

## Author

Marin Corluka
