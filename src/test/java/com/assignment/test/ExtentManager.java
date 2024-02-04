package com.assignment.test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;
    private static ExtentTest test;

    // Ensure thread safety
    public synchronized static ExtentReports createInstance() {
        if (extent == null) {
            String reportName = "ExtentReport.html";
            ExtentSparkReporter spark = new ExtentSparkReporter("target/" +reportName);
            extent = new ExtentReports();
            extent.attachReporter(spark);
        }
        return extent;
    }

    // Ensure thread safety
    public synchronized static ExtentTest createTest(String testName) {
        if (extent == null) {
            createInstance();
        }
        test = extent.createTest(testName);
        return test;
    }
}