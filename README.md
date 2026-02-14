# CIS-566-Group1-Project1

Repository for Group1-Project1

Assignment Description:
CIS 476/566 Software Architecture and Design patterns

An electronic company specializes in manufacturing devices such as smartphones, tablet, laptops, and smartwatches. Each device has different components. Suppose you are writing a program to test the components of the devices. The components we are interested in are displays, batteries, and processors. These components are different in different device. Each device has its own program for testing these components. To know which test to run, you will need to instantiate objects that correspond to each one of the components.

 

We assume that device to be tested are stored in a configuration file (text file). Because this situation fits the Abstract Factory pattern so well, you can use that pattern to organize the creation of objects that correspond to each device. You will also need to use the variation of singleton pattern to ensure that at most two instances of each device in each test run. Please note finishing running all devices specified in the configuration file is considered as one test run.

 
Here is an example of the configuration file content. You can create your own.

Smartphone

Smartwatch

Laptop

Smartwatch

Laptop

Tablet

Laptop

Smartwatch

Smartphone

Tablet

Questions

1) Give the UML diagram. You should integrate singleton into abstract factory pattern.

2) Give the code (in any language) based on the UML class diagram given in 1). As output, you need to display three different messages (e.g., “Display Smartphone”, Battery Smartphone”, and “Processor Smartphone”) for the device specified in configuration file. You should give a warning message if the same device is asked to run more than twice.

3) Zip your UML diagram, source code, output screen shot in one .zip file and upload to class project I folder in Canvas before due.

Additional information from email:

1. Cover Page
Project: Class Project 1

Team name:

Team members: name, UMID

2. Team Plan and Roles
Create a table like this:

Task Owner Planned start Planned end
UML class diagram			
UML sequence diagrams			
Abstract Factory code			
Singleton variation code			
Config file parser			
Output formatting and warnings			
Integration and zip packaging			
 

3. Gantt Chart
Insert a Gantt chart table, or paste a screenshot from any tool, for example Excel, Google Sheets, or a Gantt chart generator.

4. Realized Work Summary
This section is about what actually got done, not the design details.

4.1 Completed tasks
Bullet list of completed tasks, with who did them and the artifact produced. Example:

Completed UML class diagram including Abstract Factory and singleton variation, by Member A, file class_diagram.png

Implemented factory interfaces and concrete factories, by Member B, folder src/factory

Implemented instance limit logic for max two instances per device per run, by Member C, file InstanceManager.java

4.2 Example
Choose one code snippet from your project (15 to 30 lines) that demonstrates how a part of your implementation follows your UML class diagram and UML sequence diagram.

Your submission must include:

Chosen scenario
Describe the scenario represented by your snippet, for example processing one device entry and running tests, or handling the third request warning.

Code snippet with numbered mapping
Paste the selected code snippet and add inline comments that label the sequence steps using number. Each numbered comment should correspond to a message or step in your sequence diagram.

Explanation, 5 to 8 sentences
In 5 to 8 sentences, explain:

how the snippet corresponds to your class diagram structure, naming the specific classes and methods involved

how each numbered line in the snippet maps to the sequence diagram messages in order, including the normal path and the warning path if applicable

4.3 Deviations from plan
Briefly state what changed compared to the plan and why. Examples:

We simplified output formatting to match project requirements

We changed implementation approach for the singleton variation

5. Verification Checklist
A short checklist to show you met requirements.

Configuration file is read line by line

For each device occurrence, three component test messages are printed

Warning is printed when a device is requested more than twice in the same run

UML includes Abstract Factory and singleton variation integration

Sequence diagrams include normal case and warning case

Zip file contains UML, code, output screenshot

6. Reflection Questions
Answer as a team, then optionally add one short individual note per member.

Why is Abstract Factory a good match for this problem? What would become harder if you used simple conditionals or direct constructors instead?

When a device appears a third time in the configuration file, what exactly happens in your system? Do you skip all tests, skip only object creation, or run tests with existing instances? Explain the reasoning.

If you were to add a new device type, what changes are required in your design and code, and how does Abstract Factory help or not help?

What was the biggest integration challenge when merging everyone’s code (naming mismatches, UML differences, file structure, logic conflicts)? How did you resolve it?
What to include in the zip file at submission
Group report PDF using this template

UML class diagram file

UML sequence diagram file(s)

Source code

Output screenshot
