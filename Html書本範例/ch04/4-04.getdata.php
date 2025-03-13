<?php
    //接收表單資訊，用GET方法
    $gender = $_GET["gender"];
    //檢查是否有勾選複選的項目(檢查集合是否存在)
    if (isset($_GET["interest"])){
        $interest = $_GET["interest"];
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
    <div>
        <p>性別： 
            <?php print($gender); ?> 
        </p>
        <p>興趣： 
            <?php 
            //檢查是否有勾選複選的項目(檢查集合是否存在)
                if (isset($_GET["interest"])){
                    foreach($interest as $item){
                        print($item."<br>");
                    }
                }
                else{
                    print("無");
                }

            ?> 
        </p>
    </div>
    
</body>
</html>