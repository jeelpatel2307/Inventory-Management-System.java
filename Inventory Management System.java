class Product:
    def __init__(self, product_id, name, price, quantity):
        self.product_id = product_id
        self.name = name
        self.price = price
        self.quantity = quantity

    def display_product(self):
        print(f"Product ID: {self.product_id}")
        print(f"Name: {self.name}")
        print(f"Price: ${self.price}")
        print(f"Quantity: {self.quantity}\n")


class Inventory:
    def __init__(self):
        self.products = {}

    def add_product(self, product):
        self.products[product.product_id] = product

    def remove_product(self, product_id):
        if product_id in self.products:
            del self.products[product_id]
            print(f"Product with ID {product_id} removed successfully.")
        else:
            print(f"Product with ID {product_id} does not exist.")

    def display_inventory(self):
        print("Inventory:")
        for product_id, product in self.products.items():
            product.display_product()


# Usage example
inventory = Inventory()

product1 = Product(1, "Laptop", 999, 10)
product2 = Product(2, "Mouse", 20, 50)
product3 = Product(3, "Keyboard", 50, 30)

inventory.add_product(product1)
inventory.add_product(product2)
inventory.add_product(product3)

inventory.display_inventory()

inventory.remove_product(2)

inventory.display_inventory()
