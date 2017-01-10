<?php
if ($dbhandle = sqlite_open('mysqlitedb', 0666, $sqliteerror)):
   $query  = "SELECT x, y FROM sometable LIMIT 3;";
   $result = sqlite_query($dbhandle, $query);

   // usage with sqlite_fetch_all
   $array1 = sqlite_fetch_all($result, SQLITE_ASSOC);

   // the "well known practice"
   $i = '0';
   while ($row = sqlite_fetch_array($result, SQLITE_ASSOC)):
       $array2["$i"] = $row;
       $i++;
   endwhile;

   sqlite_close($dbhandle);
endif;
?>
