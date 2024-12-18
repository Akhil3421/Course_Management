# Course_Management


### Endpoints

---

Authorization:
- **Type:** Basic Auth
- **Username:** `admin`
- **Password:** `adminPassword`


### 1. Create Student

**POST** `localhost:8080/createstudent`

Create a new student record.

#### Request Body:
json
```
{
    "name": "akhil",
    "add": "pcpl"
}
```
## Get Subjects

**Endpoint:**  
**GET** `localhost:8080/getsubjects`

**Description:**  
Fetch the list of all subjects.

## Create Subject

**Endpoint:**  
**POST** `localhost:8080/createsubject`

**Description:**  
Create a new subject record.

**Request Body:**  
```json
{
    "name": "math"
}
```

## Register User

**Endpoint:**  
**POST** `localhost:8080/register`

**Description:**  
Register a new user (e.g., a student).

**Request Body:**  
```json
{
    "username": "student1",
    "password": "password123",
    "email": "student1@example.com",
    "role": "STUDENT"
}
```


