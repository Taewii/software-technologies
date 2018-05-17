<!DOCTYPE html>
<html lang="en">
<head>
    <title>Capital-Case Words</title>
</head>
<body>
<form>
    <textarea rows="10" name="text"></textarea> <br>
    <input type="submit" value="Extract">
</form>

<?php
if (isset($_GET['text'])) {
    $text = $_GET['text'];
    preg_match_all('/\w+/', $text, $words);
    $words = $words[0];

    $result = array_filter($words, function ($word) {
        return strtoupper($word) == $word;
    });

    echo implode(", ", $result);
}
?>
</body>
</html>