# Google Sheets Automation
This project aims to provide automation capabilities for Google Sheets using Java. With this utility, you can easily create, write, and manipulate data in Google Sheets programmatically.

## Main Java Class: GoogleSheets.java
This class, located in the package restassured.playground, serves as the core of the Google Sheets automation functionalities. Below is a brief overview of the main functionalities provided:

### Methods
createSheetAndColumn(String sheetName, List<String> columnNames): Creates a new sheet in the specified Google Sheets document along with specified column names.

writeDataGoogleSheets(String sheetName,List<? extends Object> outputData): Writes data to a specified sheet in Google Sheets.

getRows(String sheetName): Retrieves the number of rows in a specified sheet.

getRows(): Retrieves the number of rows in the default test data sheet.

getSpreadSheetValues(String sheetName): Retrieves all values from a specified sheet.

getSpreadSheetValues(): Retrieves all values from the default test data sheet.

getCellContent(int rownum,int colnum): Retrieves the content of a specific cell.

getLastColumnNum(): Retrieves the index of the last column in the data.

authorize(): Authorizes access to Google Sheets API using OAuth 2.0.

getSpreadsheetInstance(): Retrieves an instance of the Google Sheets service.

getSpreadsheetValuesFromRange(String sheetID, String range): Retrieves values from a specified range in a sheet.

createNewSheet(String existingSpreadSheetID, String newsheetTitle): Creates a new sheet in the specified Google Sheets document.

writeSheet(List<? extends Object> outputData, String sheetAndRange): Writes data to a specified range in a sheet.

### Dependencies
Google API Client Library: google-api-client
Google Sheets API: google-api-services-sheets
### Usage
To use this class, ensure that you have the necessary dependencies installed and provide the appropriate credentials for accessing Google Sheets API. Then, you can instantiate the GoogleSheets class and utilize its methods for automation tasks.

For detailed usage examples and integration guidelines, please refer to the provided code and documentation.

Note: This README serves as a basic guide. For comprehensive documentation and further assistance, please refer to the official Google Sheets API documentation and JavaDocs.

Feel free to contribute, report issues, or suggest enhancements to this project. Happy automating! 🚀
