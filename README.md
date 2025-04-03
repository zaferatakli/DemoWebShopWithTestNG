
---

# Demo Web Shop Project with TestNG

## 📌 Table of Contents
- [Project Description](#project-description)
- [Project Structure](#project-structure)
- [User Stories and Test Scenarios](#user-stories-and-test-scenarios)
- [Tools and Technologies Used](#tools-and-technologies-used)
- [Project Team](#project-team)
- [GitHub Repository](#github-repository)
- [License](#license)

---

## 📝 Project Description

This project automates key test scenarios on **Demo Web Shop** using **TestNG** and the **Page Object Model (POM)**. Tests are configured and executed through the **`testng.xml`** file. Browser selection and other parameters are managed via the **`configuration.properties`** file under the `resources` folder.

✅ Key Features:
- Designed with **POM architecture**
- Uses **TestNG XML** for test control
- Supports **parallel** and **cross-browser testing**
- Flexible **browser configuration** via `.properties` file

🔗 [Demo Web Shop Website](https://demowebshop.tricentis.com/)  
🔗 [JUnit Version Repository](https://github.com/zaferatakli/DemoWebShopProject)
🔗 [TestNG Version Repository](https://github.com/zaferatakli/DemoWebShopWithTestNG)

---

## 🏗 Project Structure

```
DemoWebShopWithTestNG/
│
├── src/
│   ├── test/
│   │   ├── java/
│   │   │   ├── actions/           # High-level user interactions
│   │   │   ├── base/              # Base classes (e.g., BaseDriver)
│   │   │   ├── pages/             # Page Object Model classes
│   │   │   ├── tests/             # TestNG test cases
│   │   │   └── utilities/         # Utility classes (MyFunc, ConfigReader, etc.)
│   │   └── resources/
│   │       └── configuration.properties  # Browser config, URLs, credentials
│   │
│   └── XML/                       # TestNG XML files
└── README.md                      # Project documentation

```

---

## 🧑‍💻 User Stories and Test Scenarios

### **1️⃣ US_201 - User Registration**
**Scenario Description:**  
As a user, I should be able to register on the web store to shop and access other features.

**Expected Result:**  
When valid information is entered, the account should be created successfully. If the email is already in use, an appropriate error message should be displayed.

---

### **2️⃣ US_202 - Negative Registration**
**Scenario Description:**  
As a user, I want to see an error message when trying to register with an already used email address.

**Expected Result:**  
The system should show: "The Specified Email Already Exists."

---

### **3️⃣ US_203 - Logout**
**Scenario Description:**  
As a user, I should be able to log out of my account to ensure shopping security.

**Expected Result:**  
The user should be logged out and redirected to the login page.

---

### **4️⃣ US_204 - Login**
**Scenario Description:**  
As a user, I should be able to log in to my account to manage shopping and account details.

**Expected Result:**  
Login should be successful with valid credentials.

---

### **5️⃣ US_205 - Negative Login**
**Scenario Description:**  
As a user, I want to test invalid login scenarios to ensure the system's security.

**Expected Result:**  
An appropriate "Login was unsuccessful" message should appear in all negative cases.

---

### **6️⃣ US_206 - Place an Order**
**Scenario Description:**  
As a user, I should be able to place an order using a credit card.

**Expected Result:**  
The order should be successfully placed and the message “Your order has been successfully processed!” should be displayed.

---

### **7️⃣ US_207 - Survey Participation**
**Scenario Description:**  
As a user, I should be able to vote in a community poll and view results.

**Expected Result:**  
Logged-in users should see results after voting. Non-logged-in users should see the message "Only Registered Users Can Vote."

---

### **8️⃣ US_208 - Negative Coupon/Gift Card**
**Scenario Description:**  
As a user, I want to test the system response when using unavailable coupons or gift cards.

**Expected Result:**  
The system should show relevant messages and still allow a successful checkout.

---

### **9️⃣ US_209 - Download Order History**
**Scenario Description:**  
As a user, I want to view and download my past order invoices.

**Expected Result:**  
User should be able to download the invoice from the order details page.

---

## 🚀 Tools and Technologies Used

| **Tool / Technology**     | **Description**                           |
|---------------------------|-------------------------------------------|
| **Java**                  | Programming language                      |
| **TestNG**                | Testing framework                         |
| **Selenium WebDriver**    | Web automation tool                       |
| **Maven**                 | Dependency and build manager              |
| **Page Object Model (POM)**| Reusable and maintainable test structure |
| **TestNG XML**            | Test configuration and grouping           |
| **configuration.properties** | Manages browser, URL, and other configs |
| **Git / GitHub**          | Version control system                    |

---

## 👨‍💻 Project Team

| **Name**             | **Role**                        | **Assigned User Stories** |
|----------------------|---------------------------------|---------------------------|
| **Zafer Ataklı**     | Project Lead - QA Automation Engineer | US_206                    |
| **Tugba Kılıç**      | QA Automation Engineer          | US_209                    |
| **Rifat Batir**      | QA Automation Engineer          | US_203, US_204            |
| **Nuri Öztürk**      | QA Automation Engineer          | US_208                    |
| **Yiğit Çam**        | QA Automation Engineer          | US_207                    |
| **Azim Korkmaz**     | QA Automation Engineer          | US_202                    |
| **Sibel Öztemel**    | QA Automation Engineer          | US_201                    |
| **Mert Can Özdemir** | QA Automation Engineer          | US_205                    |

---

## 🔗 GitHub Repository

- 🔄 [Current TestNG Version with POM](https://github.com/zaferatakli/DemoWebShopWithTestNG)
- 📂 [JUnit Version (Completed)](https://github.com/zaferatakli/DemoWebShopProject)

---

## 📝 License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).

---

