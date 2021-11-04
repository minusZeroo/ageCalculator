# Age Calculator
An API takes in a request body as below

Endpoint: /user

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
    "currentAge": 31,
    "dateOfBirth": null
}
