COMP3110 Project – Line Mapping Tool

This project implements a line-mapping tool that compares old and new versions of Java source files. The tool identifies which lines stayed the same, which lines changed, and which lines were deleted. An evaluator and dataset are included for verifying the accuracy of the mapping logic.

Project Overview

All comparisons use the datasets inside the project folder:

Old files end with _1.java

New files end with _2.java

The program automatically:

Reads each old file

Finds its matching new file

Compares them line-by-line

Prints all mappings to the console

Saves results to output.txt

A screenshot showing the accuracy and evaluation metrics has also been uploaded to the repository for reference.

Files Included
Source Code (src/project/)

Main.java – Runs the line-mapping process

LineMapper.java – Mapping logic

LineMapping.java – Data structure for a mapping

LineMapperEvaluator.java – Evaluation and accuracy reporting

Datasets

eclipseTest – Original dataset

new dataset – Additional test files

Other Files

output.txt – Mapping results

FinalProject.zip – Complete project upload

Accuracy Screenshot – Shows evaluation summary and accuracy percentage

How to Run

Open the project in Eclipse.

To run the mapping tool:
→ src/project/Main.java
→ Run → Run As → Java Application

To run the evaluator:
→ src/project/LineMapperEvaluator.java

Results appear in the console and inside output.txt.

Team Members

Anha Ashraf Liya (110154128) – liya@uwindsor.ca

Mahmood Hasan (110157161) – hasan6d@uwindsor.ca

Sobaan Khan (110038342) - khan49@uwindsor.ca

Jay Dodd (110108904) – dodd9@uwindsor.ca

Paramjit Kaur Sidhu (110158683) – sidhu5b@uwindsor.ca
