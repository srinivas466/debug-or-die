users = {
    "user1": "pass123",
    "user2": "abc456",
    "admin": "adminpass"
}

username = input("Enter username: ")
password = input("Enter password: ")

if users[username] == password:
    print("Login successful!")
else:
    print("Incorrect password or username.")

print("Goodbye!"