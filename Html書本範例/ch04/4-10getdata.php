<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <div style="background-color:rgb(67, 144, 180); font-size: 30px; color:<?php print($_GET['color']); ?>;">
    日期：
    <?php   
    print($_GET['date']); ?>
    時間：
    <?php
    print($_GET['time']); ?>
    <br>   
    </div>
</body>
</html>