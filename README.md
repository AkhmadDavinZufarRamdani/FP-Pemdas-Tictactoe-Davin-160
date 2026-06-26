# FP-Pemdas-Tictactoe-Davin-160
# Simple Tic-Tac-Toe Game with Java Swing, Login, and Statistics
##  Student Information
| Field | Information |
|-------|-------------|
| Name | Akhmad Davin Zufar Ramdani |
| Student ID | 5026251160 |
| Class | A |
| Course | ES234211 – Programming Fundamental |
| Semester | Genap 2025/2026 |

---

## Project Description

This project is a desktop-based Tic-Tac-Toe game developed using **Java Swing** and **mySQL**. The application provides a login system connected to a database, personal game statistics tracking, and a Top 5 leaderboard system.

The player plays as **X** against a computer opponent (**O**). Game results are automatically stored in the database, including wins, losses, draws, and score updates.

---

##  Features

-  Login using mySQL database
-  Play Tic-Tac-Toe against a computer opponent
-  Record wins, losses, draws, and scores automatically
-  Display personal statistics
-  Display Top 5 players sorted by score and wins
-  JDBC integration with mySQL
-  Java Swing graphical user interface

---

## Score Calculation

| Result | Score Change |
|--------|--------------|
| Win | +10 points |
| Draw | +3 points |
| Lose | +0 points |

---
##  Database

**Database Used:** mySQL

### Create Database

```sql
CREATE DATABASE tictactoe1;
```

Connect to database:

```sql
\c tictactoe1
```

Create table:

```sql
CREATE TABLE players (
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    wins INT DEFAULT 0,
    losses INT DEFAULT 0,
    draws INT DEFAULT 0,
    score INT DEFAULT 0
);
```

Insert sample data:

```sql
INSERT INTO players (username, password)
VALUES ('student1', '12345');

INSERT INTO players (username, password)
VALUES ('student2', '12345');
```

---

##  How to Run

### 1. Start mySQL

Make sure mySQL service is running.

### 2. Create Database

Execute the SQL commands above.

### 3. Download mySQL JDBC Driver

https://jdbc.mySQL.org/

### 4. Add Driver to Project

Add the JDBC `.jar` file into your project's classpath.

### 5. Configure DatabaseManager.java

```java
private static final String URL =
        "jdbc:mySQL://localhost:5432/tictactoe1";

private static final String USER =
        "postgres";

private static final String PASSWORD =
        "your_password";
```

### 6. Compile Project

Compile all `.java` files inside `src`.

### 7. Run Program

Run:

```text
Main.java
```

### 8. Login

Example:

```text
Username : student1
Password : 12345
```

---
#  Project Structure

```text
src
│
├── Main.java
├── DatabaseManager.java
├── Player.java
├── PlayerService.java
├── GameLogic.java
├── LoginFrame.java
├── MainMenuFrame.java
├── GameFrame.java
├── StatisticsFrame.java
└── TopScorersFrame.java
```

---

##  Class Explanation

| Class | Responsibility |
|-------|----------------|
| Main | Entry point of the application |
| DatabaseManager | Handles JDBC connection to mySQL |
| Player | Stores player information |
| PlayerService | Handles login, statistics updates, and leaderboard queries |
| GameLogic | Handles game rules and computer moves |
| LoginFrame | Login window |
| MainMenuFrame | Main menu window |
| GameFrame | Tic-Tac-Toe game window |
| StatisticsFrame | Displays personal statistics |
| TopScorersFrame | Displays Top 5 leaderboard |

---

##  Application Flow

```text
Main
 ↓
LoginFrame
 ↓
MainMenuFrame
 ├── Start Game → GameFrame
 ├── Statistics → StatisticsFrame
 ├── Top 5 Scorers → TopScorersFrame
 └── Exit
```

---
#  Screenshots

## Login

<p align="center">
  <img src="screenshots/login.png" width="500">
</p>

## Main Menu

<p align="center">
  <img src="screenshots/main_menu.png" width="500">
</p>

## Game

<p align="center">
  <img src="screenshots/game.png" width="500">
</p>

## Statistics

<p align="center">
  <img src="screenshots/statistics.png" width="500">
</p>

## Top 5 Scorers

<p align="center">
  <img src="screenshots/top5.png" width="500">
</p>

---

#  Technologies Used

- Java
- Java Swing
- JDBC
- mySQL
- IntelliJ IDEA
