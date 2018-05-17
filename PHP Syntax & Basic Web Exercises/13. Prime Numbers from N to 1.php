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

        for ($i = $num; $i > 0; $i--) {

            if (isPrime($i)) {
                echo $i . " ";
            }
        }
    }

    function isPrime($number)
    {
        if ($number == 1) return false;
        if ($number == 2) return true;

        for ($i = 2; $i <= ceil(sqrt($number)); ++$i) {
            if ($number % $i == 0) return false;
        }

        return true;
    }
    ?>

</body>
</html>