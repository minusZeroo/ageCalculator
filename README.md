# Age Calculator API
An API takes in a request body as below

Endpoint: /user

Method: POST

>Sample payload/request:
```JSON
{
   "name": "Paul",
    "surname": "Jideani",
    "dateOfBirth": "1992-07-07"
}
```

>Output:
```JSON
{
    "name": "Paul",
    "surname": "Jideani",
    "currentAge": 29,
    "dateOfBirth": null
}
