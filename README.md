
# **BreadStack Assignment**

## **Project Overview**
This project implements **Hybrid Automation Framework** for functional testing using **Selenium WebDriver** with **TestNG** and integrates **Allure Reports** for test reporting. It includes modular, maintainable, and reusable components for web automation testing.

---

## **Technologies Used**
- **Java** (JDK 21): Main programming language.
- **Selenium WebDriver 4.25.0**: Browser automation.
- **TestNG 7.10.2**: Test framework.
- **Maven**: Build tool for dependency management.
- **Allure 2.29.1**: Advanced test reporting.
- **Log4j 2.24.2**: Logging framework.
- **RestAssured 5.5.0**: API testing.
- **Gson**: JSON data processing.

---

## **Project Structure**
```
BreadStackAssignment/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── [Project Source Code]
│   ├── test/
│       ├── java/
│       │   └── [Test Cases with TestNG]
│       └── resources/
│           └── RunAdminTestcase.xml   # TestNG Suite File
├── pom.xml                            # Maven configuration
└── README.md                          # Project documentation
```

---

## **Features**
- **TestNG Integration**: Test execution is managed with TestNG.
- **Allure Reports**: Generates visually appealing test reports.
- **Parallel Execution**: Configured TestNG suite for efficient test runs.
- **API Testing**: Utilized RestAssured for testing RESTFUL APIs.

---

## **Setup Instructions**

### **1. Prerequisites**
- Install **Java JDK 21**.
- Install **Apache Maven**.
- Set up **ChromeDriver** for Selenium.

---

### **2. Clone Repository**
```bash
git clone https://github.com/tunganh222Z/BreadStackAsignment.git
cd BreadStackAsignment
```

---

### **3. Build Project**
Execute Maven to install dependencies:
```bash
mvn clean install
```

---

### **4. Run Test Suite**
Execute TestNG XML suite to run the test cases:
```bash
mvn test
```

---

### **5. Generate Allure Report**
1. Run tests to generate results.
2. Serve the Allure report:
   ```bash
   allure serve ./allure-results
   ```

---

## **Dependencies**
Key libraries used:
- **Selenium**: Browser automation.
- **TestNG**: Test execution and management.
- **Allure**: Reporting tool.
- **RestAssured**: API testing library.

---

## **Test Execution**
- All tests are configured in **RunAdminTestcase.xml**.
- Allure reports are stored in `src/allure-results`.

---

## **Author**
**GitHub**: [https://github.com/tunganh222Z](https://github.com/tunganh222Z)  
**LinkedIn**: [Anh Ma Doan Tung](https://www.linkedin.com/in/anh-ma-doan-tung-0107a51ab/)

---

## **License**
This project is licensed under the MIT License.

---

### **Future Enhancements**
- Extend API testing scenarios.
- Add support for cross-browser testing.
