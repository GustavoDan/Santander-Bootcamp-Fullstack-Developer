from random import randint, choice
from json import dump
from requests import get
from base64 import b64encode
from sys import argv

GENRES = [
    genre.capitalize()
    for genre in (
        "science fiction",
        "fantasy",
        "drama",
        "romance",
        "comedy",
        "zombie",
        "action",
        "historical",
        "horror",
        "war",
        "mystery",
    )
]

books = []

try:
    how_many_books = int(argv[1])
except:
    how_many_books = 10

for i in range(how_many_books):
    print(f"Generating book {i+1}")

    book = {
        "id": i,
        "name": f"Book {i+1}",
        "price": randint(1, 200),
        "quantity": randint(1, 1000),
        "genre": choice(GENRES),
        "img": b64encode(get("https://thisartworkdoesnotexist.com/").content).decode(),
    }

    books.append(book)

with open("books.json", "w") as f:
    dump(books, f, indent=4)
