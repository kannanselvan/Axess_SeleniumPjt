# Axess_SeleniumPjt

## 📌 Overview

**Axess_SeleniumPjt** is a Selenium-based test automation framework built using Java. It is designed for scalable, maintainable, and efficient UI test automation with support for Cucumber (BDD), reporting, and CI/CD integration.

---

## 🛠️ Tech Stack

* **Language:** Java
* **Automation Tool:** Selenium WebDriver
* **Build Tool:** Maven
* **Framework:** Cucumber (BDD)
* **Reporting:** Allure Reports
* **CI/CD:** Jenkins

---

## 📁 Project Structure

```
Axess_SeleniumPjt/
│── .idea/                # IntelliJ project settings
│── .mvn/                 # Maven wrapper files
│── allure-report/        # Generated Allure reports
│── allure-results/       # Raw Allure results
│── logs/                 # Execution logs
│── src/
│   ├── main/
│   │   ├── java/         # Core framework code
│   │   └── resources/    # Config files
│   ├── test/
│   │   ├── java/         # Test cases & step definitions
│   │   └── resources/    # Feature files
│── target/               # Compiled files
│── .gitignore            # Git ignored files
│── Jenkinsfile           # CI/CD pipeline config
│── pom.xml               # Maven dependencies
```

---

## 🚀 Features

* Page Object Model (POM) design pattern
* Cucumber BDD support
* Cross-browser testing
* Allure reporting integration
* Logging support
* Jenkins pipeline ready

---

## ⚙️ Setup Instructions

### 1. Prerequisites

Make sure you have:

* Java (JDK 8 or higher)
* Maven installed
* Browser (Chrome/Edge)
* IDE (IntelliJ recommended)

---

### 2. Clone the Repository

```bash
git clone https://github.com/your-repo/Axess_SeleniumPjt.git
cd Axess_SeleniumPjt
```

---

### 3. Install Dependencies

```bash
mvn clean install
```

---

### 4. Run Tests

```bash
mvn test
```

---

### 5. Generate Allure Report

```bash
allure serve allure-results
```

---

## 📊 Reporting

* Allure reports are generated in:

```
/allure-report
```

* Raw results:

```
/allure-results
```

---

## 🔄 CI/CD Integration

* Jenkins pipeline is configured using **Jenkinsfile**
* Supports automated build and execution

---

## 📜 Logging

Logs are stored in:

```
/logs
```

---

## 🤝 Contribution

1. Fork the repo
2. Create a feature branch
3. Commit changes
4. Push and create PR

---

## 📧 Contact

For any queries or support, please contact the project maintainer.

---

## ⭐ Notes

* Ensure browser drivers are properly configured
* Update config files before execution
* Keep dependencies updated

---
