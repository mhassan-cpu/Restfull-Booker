# Restful Booker API

![Restful Booker](Download.png)

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Available Endpoints](#available-endpoints)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Restful Booker is a simple yet powerful booking API that provides functionality for creating, retrieving, updating, and deleting booking records. It is commonly used for testing automation frameworks and API learning purposes.


## Local Testing Execution Example 

[Local Testing Execution Example] (Example.gif)

## Features

- **Create Booking**: Add a new booking with user details and booking dates.
- **Retrieve Booking(s)**: Get all booking IDs or detailed booking information by ID.
- **Update Booking**: Fully update an existing booking record.
- **Partial Update**: Partially update fields of a booking.
- **Delete Booking**: Delete a booking by ID.
- **Authentication**: Secure update and delete operations via token-based authentication.

## Installation

To set up the Restful Booker API locally, follow these steps:

Clone the repository:

git clone https://github.com/mhassan-cpu/Restfull-Booker.git

Navigate to the project directory:

cd restful-booker-platform

Install dependencies (using Maven or Node.js if applicable for your setup):

For Node.js mock server:

npm install

Configure the application:

Set up any environment variables if needed (e.g., database, ports).

Run the application:

For Node.js server:

npm start


## Usage

You can interact with the API using tools like:
- **Postman**
- **Newman**
- **cURL**
- **Automated frameworks** (like Rest Assured, Cypress, etc.)

Authentication (token generation) is required for operations like `PUT`, `PATCH`, and `DELETE`.

## Available Endpoints

### Booking APIs

- `GET /booking` : Retrieve all booking IDs.
- `GET /booking/:id` : Retrieve details of a specific booking.
- `POST /booking` : Create a new booking.
- `PUT /booking/:id` : Update an entire booking (requires token).
- `PATCH /booking/:id` : Partially update a booking (requires token).
- `DELETE /booking/:id` : Delete a booking (requires token).

### Auth APIs

- `POST /auth` : Create a new token to authorize secure operations.

## Example Request - Create Booking

```bash
POST /booking
Content-Type: application/json

{
  "firstname" : "Jim",
  "lastname" : "Brown",
  "totalprice" : 111,
  "depositpaid" : true,
  "bookingdates" : {
      "checkin" : "2018-01-01",
      "checkout" : "2019-01-01"
  },
  "additionalneeds" : "Breakfast"
}
```

## Contributing

We welcome contributions for:
- Improving API documentation
- Creating additional test cases
- Expanding booking features

### Steps to Contribute
1. Fork the repository.
2. Create a feature branch.
3. Submit a pull request.

## License

Restful Booker is open-source and available freely for educational and testing purposes. No license restrictions.

---

> ✨ Happy Booking Automation Testing with Restful Booker! ✨

