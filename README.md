# komoot

#Software Details:
Operating System: Windows 10 Pro
Software: Eclipse IDE for Java Developers
Version: 2019-09 R (4.13.0)

# Hardware: 
PC: Dell Insperion 15, 3000 Series

# Configuration:
1. Download Selenium-java-3.141.59
2. Download chromedriver.exe (Chrome Browser Version: Version 83.0.4103.116)
3. Download Testng-7.3.0.jar
4. Install Testng plugin with Maven for Eclipse IDE

How to run the tests:
1. Download and install Eclipse IDE 
2. Download and unzip Selenium-java, ChromeDriver and Testng and keep them in a folder
3. Open Eclipse IDE and install the Testng plugin by going to Help->Install New Software
4. Git clone the project into your local folder and open the project in eclipse IDE
5. Locate the libraries by (Right clicking)going to properties->Java Build Path->Libraries (Tab), Now click on Add External JARs and JARs of Selenium-java, ChromeDriver and Testng (from Step2)
6. Finally Run all four test cases one by one by right clicking on the testcases and Run As->TestNG Test

Step By Step Description of TestCases and SQL Tasks:
Please find the documentation in doc/step_description_SQL.pdf