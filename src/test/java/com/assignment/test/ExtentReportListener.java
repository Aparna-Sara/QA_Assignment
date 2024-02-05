package com.assignment.test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReportListener implements ITestListener {

    private ExtentReports extent = ExtentManager.createInstance();
    private ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest test = extent.createTest(result.getMethod().getMethodName());
        extentTest.set(test);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        extentTest.get().log(Status.PASS, MarkupHelper.createLabel(result.getName() + " - Test Passed", ExtentColor.GREEN));
    }

    @Override
    public void onTestFailure(ITestResult result) {
        extentTest.get().log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Failed", ExtentColor.RED));
        extentTest.get().fail(result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        if (extentTest.get() != null) {
            extentTest.get().log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Skipped", ExtentColor.YELLOW));
        } else {
            System.out.println(result.getName() + " - Test Skipped");
        }
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
