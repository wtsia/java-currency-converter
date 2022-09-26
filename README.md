# java-currency-converter
### Author: Higinio L.P., Winston T.
program that converts currency from United States Dollar (USD) to Renminbu (RMB), and vice versa
- use multiple values to test

## creating Javadocs
run `javadoc <filename>.java` in a terminal or use the Eclipse `'Project' >> 'Generate Javadoc'`  which will generate static assets, as well as javascript files that present the program in standard Java documentation format.
- in this program, it will be done by opening a terminal and typing `javadoc Conversion.java`
```
/**
* Format used to generate javadoc entries
* @param lists parameters in javadocs
* @return lists what is returned
* Place comment blocks above the method in use for javadocs to generate documentation
*/
```

## Program tree:
constant variables (defaults): USD to RMB conversion as 1 to 7.05
- `unitUsdToRmb = 7.05;`: 1 USD is equal to 7.05 RMB  
- `unitRmbToUsd = 0.14;`: 1 RMB is equal to 0.14 USD

user: interacts through the `menu` and `main`

`presentMenu`: 
- presents menu of options to the user and returns the options chosen by the user
- returns the value to main

`main`:
- asks the user to enter the value to be converted
- reads value
- calls appropriate `currency method`
- prints value returned from conversion
- formats in 1 decimal digit
- uses switch statement

`convertUsdToRmb`: 
- receives `double` parameter containing value of RMB and returns its equivalent in USD

`convertRmbToUsd`: 
- receives `double` parameter containing value of USD and returns its equivalent in RMB


