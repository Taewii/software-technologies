<!DOCTYPE html>
<html lang="en">
<head>
    <title>Celsius - Fahrenheit</title>
</head>
<body>
<form>
    Celsius: <input type="text" name="cel" />
    <input type="submit" value="Convert">
    <?php
    if (isset($_GET['cel'])) {
        $cel = floatval($_GET['cel']);
        $fh = ($cel * 1.8) + 32;
        echo "$cel &deg;C = $fh &deg;F";
    }
    ?>
</form>
<form>
    Fahrenheit: <input type="text" name="fah" />
    <input type="submit" value="Convert">
    <?php
    if (isset($_GET['fah'])) {
        $fh = floatval($_GET['fah']);
        $cel = ($fh - 32) / 1.8;
        echo "$fh &deg;F = $cel &deg;C";
    }
    ?>
</form>

</body>
</html>