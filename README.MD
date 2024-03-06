# Quick tutorial for regualr expressions
## Task
Given a string (located in text file testFile.txt)
```
"select books.* into "& gvr("id_1") &  " from books where id = " & vr("id") & " and name = " & vr("name") & " and author = " & vr("author") & " and price = " & vr("price") & " and date = " & vr("date") & " and time = " & vr("time") & " and datetime = " & vr("datetime") & " and timestamp = " & yvr("timestamp") & " and year = " & vr("year") & " and month = " & vr("month") & " and day = " & vr("day") & " and hour = " & vr("hour") & " and minute = " & vr("minute") & " and second = " & vr("second") & " and millisecond = " & vr("millisecond") & " and microsecond = " & tvr("microsecond") & " and nanosecond = " & vr("nanosecond") & " and picosecond = " & vr("picosecond") & " and femtosecond = " & vr("femtosecond") & " and attosecond = " & vr("attosecond") & " and zeptosecond = " & vr("zeptosecond") & " and yoctosecond = " & vr("yoctosecond") & " and name like " & vr("name") & " and author like " & vr("author") & " and price like " & evr("price") & " and date like " & vr("date") & " and time like " & vr("time") & " and datetime like " & vr("datetime") & " and timestamp like " & vr("timestamp") & " and year like " & vr("year") & " and month like " & vr("month") & " and day like " & vr("day") & " and hour like " & vr("hour") & " and minute like " & vr("minute") & " and second like " & vr("second") & " and millisecond like " & dvr("millisecond") & " and microsecond like " & vr("microsecond") & " and nanosecond like " & vr("nanosecond") & " and picosecond like " & vAr("pico_second") & " and femtosecond like " & v12r("femtosecond") & " and attose;"
```
Manipulate this string using regular expressions to get following string
```
"select books.* into . $gvr["id_1"] . " from books where id =  . $vr["id"] .  and name =  . $vr["name"] .  and author =  . $vr["author"] .  and price =  . $vr["price"] .  and date =  . $vr["date"] .  and time =  . $vr["time"] .  and datetime =  . $vr["datetime"] .  and timestamp =  . $yvr["timestamp"] .  and year =  . $vr["year"] .  and month =  . $vr["month"] .  and day =  . $vr["day"] .  and hour =  . $vr["hour"] .  and minute =  . $vr["minute"] .  and second =  . $vr["second"] .  and millisecond =  . $vr["millisecond"] .  and microsecond =  . $tvr["microsecond"] .  and nanosecond =  . $vr["nanosecond"] .  and picosecond =  . $vr["picosecond"] .  and femtosecond =  . $vr["femtosecond"] .  and attosecond =  . $vr["attosecond"] .  and zeptosecond =  . $vr["zeptosecond"] .  and yoctosecond =  . $vr["yoctosecond"] .  and name like  . $vr["name"] .  and author like  . $vr["author"] .  and price like  . $evr["price"] .  and date like  . $vr["date"] .  and time like  . $vr["time"] .  and datetime like  . $vr["datetime"] .  and timestamp like  . $vr["timestamp"] .  and year like  . $vr["year"] .  and month like  . $vr["month"] .  and day like  . $vr["day"] .  and hour like  . $vr["hour"] .  and minute like  . $vr["minute"] .  and second like  . $vr["second"] .  and millisecond like  . $dvr["millisecond"] .  and microsecond like  . $vr["microsecond"] .  and nanosecond like  . $vr["nanosecond"] .  and picosecond like  . $vAr["pico_second"] .  and femtosecond like  . $v12r["femtosecond"] . 
```
Therefore you can use only core Java Utils and Java IO (NIO) to read/write the file
For regular expression test please refer 
https://regex101.com/
If you copy /paste from the site be sure you do not get additional backslashes


## Some info regarding regular expressions (escape rules)
\\Q<some text to be commented out>\\E
\\ to escape the characters

Escapes for characters:
before " there is \\\"
before ( thre is \\(
before  [ there is \\[