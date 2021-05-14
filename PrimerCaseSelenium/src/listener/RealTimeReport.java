package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class RealTimeReport implements ITestListener {

    @Override
    public void onTestStart(ITestResult result){
        System.out.println("Test Started ----->" +result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("Test pass ----->" +result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("Test failed ----->" +result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result){
        System.out.println("Test skipped ----->" +result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result){

    }

    @Override
    public void onStart(ITestContext context){
        System.out.println("Start Execute" + context.getName() );
    }

    @Override
    public void onFinish(ITestContext context){
        System.out.println("End Execute" + context.getName() );
    }
}
