# 🎵 Music Playlist Management System (Java)

A simple **console-based Music Playlist Management System** developed in **Java**. This project allows users to manage a playlist by adding, viewing, searching, and removing songs using an `ArrayList`.

---

## 📌 Features

- ➕ Add a new song
- 📃 View all songs in the playlist
- 🔍 Search for a song by title
- ❌ Remove a song from the playlist
- 🚪 Exit the application

---

## 🛠 Technologies Used

- Java
- ArrayList (Java Collections Framework)
- Scanner Class
- Object-Oriented Programming (OOP)

---

## 📂 Project Structure

```
MusicPlaylist.java
```

### Classes

#### Song
Stores the details of a song.

**Attributes**
- `title`
- `artist`

**Constructor**
```java
Song(String title, String artist)
```

---

#### MusicPlaylist
Contains the main menu and playlist operations.

---

## 📋 Menu

```
===== MUSIC PLAYLIST =====
1. Add Song
2. View Playlist
3. Search Song
4. Remove Song
5. Exit
```

---

## 🚀 How to Run

### 1. Compile the program

```bash
javac MusicPlaylist.java
```

### 2. Run the program

```bash
java MusicPlaylist
```

---

## 💻 Example Output

```
===== MUSIC PLAYLIST =====
1. Add Song
2. View Playlist
3. Search Song
4. Remove Song
5. Exit

Enter your choice: 1

Enter Song Title: Believer
Enter Artist Name: Imagine Dragons

Song Added!
```

Viewing the playlist:

```
Playlist:

----------------------
Title : Believer
Artist: Imagine Dragons
```

Searching a song:

```
Enter Song Title: believer

Song Found!
Title : Believer
Artist: Imagine Dragons
```

Removing a song:

```
Enter Song Title: Believer

Song Removed!
```

---

## 🧠 Concepts Used

- Classes and Objects
- Constructors
- ArrayList
- Scanner
- Loops (`while`, enhanced `for`)
- Switch Statement
- Conditional Statements (`if-else`)
- Lambda Expression (`removeIf`)
- String Comparison (`equalsIgnoreCase`)

---

## ⚙️ How It Works

1. The program starts with an empty playlist.
2. Users can continuously choose options from the menu.
3. Songs are stored in an `ArrayList<Song>`.
4. Songs can be searched or removed by their title.
5. The application ends when the user selects **Exit**.

---

## 📌 Future Improvements

- Save playlist to a file
- Load playlist when the program starts
- Add album and genre information
- Sort songs alphabetically
- Play songs (GUI version)
- Search by artist
- Edit song details
- Mark favorite songs
- Shuffle playlist

---

## 👨‍💻 Author

**Raj Sharma**

BCA Student | Java Beginner Project

---

## 📄 License

This project is open-source and available for learning and educational purposes.
