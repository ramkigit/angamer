# angamer
demo tests

A. Instructions to Setup: 
  1. Install eclipse
  2. Clone the project and import it as a Maven Project
  3. Install the TestNG plugin for eclipse

B. High level Project Structure

com.angamer.features

com.angamer.<>
            .apitest.steps
            .apitest.runner
            .apitest.utils.data
            
            .uitests.hooks
            .uitests.pages
            .uitests.steps
            .uitests.testrunner


C. Instructions to Run the Tests:
  1. For UI : Right click on the StoreTestRunner.java and click on Run As > TestNG test
  2. For API : Right click on the GetCarDetailsTestRunner.java and click on Run As > TestNG test

D. Viewing Reports :
  1. After the test execution, we can view the extent report on demo/test-output/spark/index.html