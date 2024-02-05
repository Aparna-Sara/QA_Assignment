# QA_Assignment
Assignment to print a list of prime numbers between a range of 2 numbers

This repository contains a data-driven testing project for prime number detection.

## Table of Contents

- [Introduction](#introduction)
- [Project Structure](#project-structure)
- [Setup](#setup)
- [How to Run](#how-to-run)
- [Test Reports](#test-reports)

## Introduction

This project is designed to demonstrate data-driven testing using TestNG. It includes a prime number detection functionality implemented with Java.

## Project Structure

The project is structured as follows:

- `src/main/java/com/assignment/core`: Contains the core functionality for prime number detection.
- `src/test/java/com/assignment/test`: Includes TestNG test classes and ExtentReportListener for generating test reports.
- `src/test/java/com/assignment/testData`: Provides test data using TestNG DataProvider.
- `src/test/resources`: Holds test data in the form of an Excel spreadsheet.
- `test-output`: Directory where test reports are generated.

## Setup

1. **Java Development Kit (JDK):**
   - Make sure you have Java Development Kit (JDK) installed. You can download it from [Oracle's website](https://www.oracle.com/java/technologies/javase-downloads.html).

2. **Apache Maven:**
   - Ensure Apache Maven is installed. You can download it from [Maven's official website](https://maven.apache.org/download.cgi).

3. **Clone the Repository:**
   ```bash
   git clone https://github.com/Aparna-Sara/QA_Assignment.git

## How to Run

1. Navigate to the Project Directory:
cd QA_Assignment

2. Run Tests:
Execute the following Maven command to run the tests
mvn clean test

## Test Reports

After running the tests, you can find the test reports in the 'target' directory. Open the report to view detailed test results.
