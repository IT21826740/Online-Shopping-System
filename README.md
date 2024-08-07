# Online-Shopping-System

Here’s a comprehensive question that requires the use of various OOP concepts such as inheritance, encapsulation, polymorphism, and abstraction:

## Question: Online Shopping System

### Problem Statement

You are tasked with designing a simple online shopping system. The system should manage different types of products, handle customer orders, and calculate the total order cost. The following features should be implemented using OOP concepts:

1. **Product Class**:
   - A base class `Product` with attributes `productID`, `name`, and `price`.
   - Methods to get and set the product details.

2. **Electronics and Clothing Classes**:
   - Two derived classes `Electronics` and `Clothing` that inherit from `Product`.
   - Each class should have additional attributes and methods specific to their category.

3. **Customer Class**:
   - A class `Customer` with attributes `customerID`, `name`, and `email`.
   - Methods to get and set customer details.

4. **Order Class**:
   - A class `Order` with attributes `orderID`, `customer`, and a list of `products`.
   - Methods to add products to the order and calculate the total order cost.

### Requirements

1. **Product Class**:
   - Attributes: `productID` (int), `name` (String), `price` (double).
   - Methods:
     - `getProductID()`, `getName()`, `getPrice()`, `setProductID(int)`, `setName(String)`, `setPrice(double)`.

2. **Electronics Class**:
   - Inherits from `Product`.
   - Additional Attributes: `warrantyPeriod` (int in months).
   - Methods: `getWarrantyPeriod()`, `setWarrantyPeriod(int)`.

3. **Clothing Class**:
   - Inherits from `Product`.
   - Additional Attributes: `size` (String), `material` (String).
   - Methods: `getSize()`, `getMaterial()`, `setSize(String)`, `setMaterial(String)`.

4. **Customer Class**:
   - Attributes: `customerID` (int), `name` (String), `email` (String).
   - Methods: `getCustomerID()`, `getName()`, `getEmail()`, `setCustomerID(int)`, `setName(String)`, `setEmail(String)`.

5. **Order Class**:
   - Attributes: `orderID` (int), `customer` (Customer), `products` (ArrayList<Product>).
   - Methods:
     - `addProduct(Product)`: Adds a product to the order.
     - `calculateTotalCost()`: Calculates and returns the total cost of the order.

### Example Output
```
Customer: John Doe, Email: john@example.com
Order ID: 1001
Products in the order:
1. Laptop - $800.0
2. T-Shirt - $20.0
Total Order Cost: $820.0
```

### Explanation of OOP Concepts:

1. **Encapsulation**: Each class encapsulates its data and provides methods to get and set the data.
2. **Inheritance**: `Electronics` and `Clothing` classes inherit from the `Product` class.
3. **Polymorphism**: The `getDetails` method is overridden in the `Electronics` and `Clothing` classes to provide specific details for each product type.
4. **Abstraction**: The `Product` class provides a general representation of a product, while the derived classes provide specific implementations for different product types.

This question and solution provide a comprehensive understanding of key OOP concepts and their application in a real-world scenario.

**Question Generate : ChatGPT**
**SELF TRY**
**LEARN-JAVA Q3**
