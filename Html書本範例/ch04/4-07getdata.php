<?php 
    if (isset($_GET["season"])){
        $season = $_GET["season"];
    }

?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 季節:
    //檢查是否有勾選複選的項目(檢查集合是否存在)
        if (isset($_GET["season"])){
            foreach($season as $item){
                print($item."<br>");
            }
        }
        else{
            print("無");
        }
    ?>
    
</body>
</html>