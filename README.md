# buffered-query
This package can execute many queries of the same type all at once. 

There is a base class that can connect to a MySQL database using MySQLi and can queue multiple queries in a buffer to be executed later all at once using mysqli_multi_query.

There are sub-classes that can compose and queue queries of different types from parameters values.

Currently there are sub-classes for queueing INSERT, UPDATE and LOAD DATA INFILE queries.
