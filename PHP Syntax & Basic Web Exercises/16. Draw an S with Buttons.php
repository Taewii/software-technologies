<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
</head>
<body>
<?php
    $cols = 5;
    $rows = 9;

    for ($i=0; $i < $rows; $i++) {        
        for ($j=0; $j < $cols; $j++) { 
            if ($i == 0 || $i == 4 || $i == 8 || ($j == 0 && $i < 4) || ($j == 4 && $i > 4)) {
                echo "<button style='background-color: blue'>1</button>";
            } else {
                echo "<button>0</button>";
            }
            
        }
        echo "<br>";
    }
?>
</body>
</html>