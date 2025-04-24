# 📝 Todo List

This is a Todo List service with PostgreSQL database integration.

---

## 📦 Models

### ✅ ToDo

| Field         | Type    | Description                    |
|---------------|---------|--------------------------------|
| `id`          | Long    | Unique identifier              |
| `description` | String  | Task description               |
| `deleted`     | Boolean | Logical deletion flag          |
| `registerDate`| Date    | Creation date                  |
| `updateDate`  | Date    | Last update date               |
| `user`        | User    | Associated user                |

---

### 👤 User

| Field         | Type     | Description                    |
|---------------|----------|--------------------------------|
| `id`          | Long     | User identifier                |
| `name`        | String   | User's name                    |
| `deleted`     | Boolean  | Logical deletion flag          |
| `registerDate`| Date     | Creation date                  |
| `updateDate`  | Date     | Last update date               |
| `userData`    | UserData | Additional user details        |

---

### 📇 UserData

| Field     | Type         | Description                   |
|-----------|--------------|-------------------------------|
| `userId`  | Long         | Reference to the user ID      |
| `email`   | String       | Email address                 |
| `phone`   | String       | Phone number                  |
| `age`     | Number       | Age                           |
| `gender`  | Enum(Gender) | Gender                        |

---

## 🚀 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL

---

## ▶️ How to Run the Project

```bash
# Clone the repository
git clone https://github.com/your-username/todo-list.git

# Navigate into the project folder
cd todo-list

# Run using Maven
./mvnw spring-boot:run
