<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
    <form>
        N: <input type="text" name="num" />
        <input type="submit" />
    </form>
	<?php
if (isset($_GET['num'])) {
    $num = intval($_GET['num']);

    $a = 0;
    $b = 1;

    echo $b . " ";
    for ($i = 0; $i < $num - 1; $i++) {
        $c = $a + $b;
        echo $c . " ";
        $a = $b;
        $b = $c;
    }
}
?>
</body>
</html>