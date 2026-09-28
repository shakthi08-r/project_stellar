# Java Quiz App

## Description

A simple console-based multiple-choice quiz written in Java. The program asks five Java questions, checks each answer, and shows a result summary with score, percentage, and grade at the end.

## Features

- 5 multiple-choice questions (options A, B, C)
- Input validation: only A, B, or C is accepted (case-insensitive)
- Invalid input shows an error and repeats the same question
- Instant feedback after each answer, with the correct answer shown when wrong
- Final report: total questions, correct answers, wrong answers, score, percentage, and result

## Technologies Used

- Java (JDK 8 or higher)
- Console (command line) interface

## Concepts Demonstrated

- Collections Framework (`ArrayList` for questions and answers)
- Exception handling (`try-catch`, `throw`)
- Loops and conditional statements
- User input with `Scanner`
- String handling and regular expressions (`matches("[ABC]")`)
- Formatted output with `printf`

## How to Run

1. Make sure Java is installed:

   ```bash
   java -version
   javac -version
   ```

2. Open a terminal in the project folder (`QuizApp/`).

3. Compile:

   ```bash
   javac src/QuizApp.java
   ```

4. Run:

   ```bash
   java -cp src QuizApp
   ```

## Example Output

```text
================================
          JAVA QUIZ
================================

1. Which language is platform independent?
A. C
B. Java
C. Python
Enter your answer (A/B/C): X
Invalid option! Please enter A, B or C.

1. Which language is platform independent?
A. C
B. Java
C. Python
Enter your answer (A/B/C): b
Correct!

2. Which keyword creates an object?
A. class
B. new
C. static
Enter your answer (A/B/C): A
Wrong!
Correct answer: B

...

================================
          QUIZ RESULT
================================
Total Questions : 5
Correct Answers : 4
Wrong Answers   : 1
Final Score     : 4/5
Percentage      : 80.00%
Result          : Excellent!
================================
```

## Project Structure

```text
QuizApp/
├── src/
│   └── QuizApp.java
└── README.md
```

## Future Improvements

- Load questions from a text file
- Shuffle the order of questions
- Add a timer for each question
- Add difficulty levels or multiple quiz categories
- Save high scores

## Author

Shakthi
