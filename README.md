# Selenium Automation - XPath Axes Practice 🚀

This repository contains automated test scripts for a Quiz Web Application using **Selenium WebDriver** and **Java**. The primary focus of this project is to implement advanced **XPath Axes** .

---

## 🎯 Test Scenarios Covered
1. **Question Verification:** Validated if the quiz question is correctly displayed on the webpage using the `child::h1` axis.
2. **Missing Option Validation:** Verified the error handling when the submit button is clicked without selecting any radio button (Expected: "Please select the City!").
3. **Dynamic Options Iteration:** Iterated through all dynamic radio buttons and labels utilizing the `descendant::` axis combined with a `for` loop.
4. **Result Verification:** 
   - Selecting **Delhi** (Correct Option) triggers the **"Correct Answer!"** message.
   - Selecting any other option triggers the **"Wrong Answer!"** message.

---

## 🛠️ Tech Stack & Concepts Applied
* **Language:** Java (JDK 11+)
* **Framework:** Selenium WebDriver
* **Browser:** Chrome Browser (ChromeDriver)
* **Advanced XPath Techniques:** `child::`, `descendant::`, Indexing (`div[2]`)
* **Core Java Concepts:** Loops, Conditional Statements (`if-else`)

---

## 🚀 How to Run the Project Locally

1. **Clone the Repository:**
```bash
   git clone [https://github.com/vikram-automation/Selenium-Xpath-Axes-Practice.git](https://github.com/vikram-automation/Selenium-Xpath-Axes-Practice.git)
