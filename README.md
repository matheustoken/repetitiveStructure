# Java Challenge: Athlete Data Analysis

## Description
This challenge involves creating a Java program to process data about athletes. The program should follow these steps:

1. Read a quantity `N` (assuming `N > 0`).
2. For each athlete, read their:
   - Name
   - Gender (M/F)
   - Height
   - Weight

3. Based on the collected data, generate the following report:
   - **Average weight of the athletes**
   - **Name of the tallest athlete**
   - **Percentage of men**
   - **Average height of women** (if any)

4. If no women are registered, the program should display the message: "Não há mulheres cadastradas" (No women registered), and the average height of women cannot be calculated.

5. **Validation**:
   - Ensure that height and weight values are positive numbers (no non-positive values).
   - Ensure that gender values are either "F" for female or "M" for male. If an invalid gender is entered, prompt the user to input the gender again until a valid option is provided.

## Objective:
Develop a Java program that:
- Reads the total number of athletes and their information.
- Validates the input data, ensuring positive values for height and weight, and correct gender values ("F" or "M").
- Calculates and generates the report with the required statistics.

## Expected Behavior:
- The program should continuously prompt the user until valid input is entered for each field.
- It should print the required statistics, handling the case where no women are registered correctly.
- The average weight, the tallest athlete, the percentage of men, and the average height of women should be displayed in the final report.

## Example Output: 
![image](https://github.com/user-attachments/assets/c6930ff5-59d6-4045-9afc-24cf56d85a14)

## Actor
Matheus Accorsi


