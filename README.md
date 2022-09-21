# java-currency-converter
program that converts currency from United States Dollar (USD) to Renminbu (RMB), and vice versa

Program tree:
constant variables (defaults): USD to RMB conversion as 1 to 7.05
user: interacts through the menu

menu: 
- presents menu of options to the user and returns the options chosen by the user
- returns the value to main

main:
- asks the user to enter the value to be converted
- reads value
- calls appropriate `currency method`
- prints value returned from conversion
- formats in 1 decimal digit
- uses switch statement

`currency method`: receives `double` parameter containing value of RMB and returns its equivalent in USD

`currency method`: receives `double` parameter containing value of USD and returns its equivalent in RMB


