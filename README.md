# final_project
/////////////////////////////USER///////////////////////////////

1)registr an user

http://localhost:8080/api/users/register

{
    "username": "testuser",
    "password": "password123",
    "email": "testuser@example.com"
}


2)loggin an user

http://localhost:8080/api/users/login

{
    "username": "testuser",
    "password": "password123"
}

////////////////////////////CATEGORY//////////////////////////////

3)craate a category

http://localhost:8080/api/categories

{
    "name": "Electronics"
}

///////////////////////////PRODUCT////////////////////////////////

4)create a product

http://localhost:8080/api/products

{
    "name": "Sample Product",
    "description": "This is a sample product.",
    "price": 99.99,
    "category": {
        "id": 1  
    }
}

5)update a product

http://localhost:8080/api/products

{
    "id": 1,  
    "name": "Updated Product",
    "description": "This is an updated product.",
    "price": 89.99,
    "category": {
        "id": 1  
    }
}

6)delete a product

http://localhost:8080/api/products/1

7)get products by category

http://localhost:8080/api/products/category/1

8)get products by price range

http://localhost:8080/api/products/price-range?minPrice=50&maxPrice=100

////////////////////////////////////RATING////////////////////////////////

9)create a rating - works

http://localhost:8080/api/ratings

{
    "score": 5,
    "comment": "Great product!",
    "product": {
        "id": 1
    }
}

10)get ratinfs by product - works

http://localhost:8080/api/ratings/product/1

////////////////////////////////////BASKET/////////////////////////////////


11)get basket by user - works

http://localhost:8080/api/baskets/user/1

12)update basket - works

http://localhost:8080/api/baskets

{
    "id": 1,
    "user": {
        "id": 1
    },
    "products": [
        {
            "id": 1
        }
    ]
}

////////////////////////////////////ORDER////////////////////////////////////


13)create a orfer

http://localhost:8080/api/orders

{
    "user": {
        "id": 1  // Use the correct user ID
    },
    "products": [
        {
            "id": 1  // Use the correct product ID
        }
    ],
    "orderDate": "2024-07-29",
    "status": "Pending"
}

14)get orders by user

http://localhost:8080/api/orders/user/1

15)Get Orders by User and Date Range

http://localhost:8080/api/orders/user/1/date-range?startDate=2024-07-01&endDate=2024-07-29

///////////////////////////////////COUPON////////////////////////////////////////


16)Get Kupon by Code

http://localhost:8080/api/coupons/SOME_CODE


