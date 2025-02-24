shopping_list = []

def add_item(item):
    shopping_list.append(item)
    print(item, "added to the list.")

def remove_item(item):
    if item in shopping_list:
        shopping_list.remove(item)
        print(item, "removed from the list.")
    else:
        print("Item not found in the list.")

while True:
    action = input("Add or Remove item? (type 'exit' to quit): ")
    if action.lower() == "exit":
        break
    elif action == "Add":
        item = input("Enter item to add: ")
        add_item(items)
    elif action == "Remove":
        item = input("Enter item to remove: ")
        remove_item(item)
    else:
        print("Invalid action. Please choose 'Add', 'Remove', or 'exit'.")

print("Final shopping list:", shoppinglist)