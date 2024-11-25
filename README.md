# jdbc-pMpdularApproch

The SaleDao class is a DAO (Data Access Object) used to interact with a MySQL database to manage a table named Sales. It provides methods to create the table and perform basic CRUD operations.

CreateTable()

Creates a table named Sale with columns id, product, and amount.

insertData()

Inserts a record into the Sales table using placeholder values for SalesId, product, and Amount.

Updates the product field in the Sales table for a specified SalesId.

deleteData()

Deletes a record from the Sales table where SalesId matches a given value.

fetchData()

Fetches all records from the Sales table and prints the SalesId, product, and Amount columns.
