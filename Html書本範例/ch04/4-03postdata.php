<?php
    $username = $_POST['username'];
    $passwd = $_POST['passwd'];
    //和資料庫確認帳號密碼是否正確(存在)
    $dbuser = "hotaruinori"; // 資料庫帳號
    $dbpassword = "0939993371" ;  //資料庫密碼
    $host = "127.0.0.1"; //資料庫IP 192.168.64.111
    $db = "mydb"; //操作的資料庫名稱
    // 進行資料庫連線的指令
    $conn = mysqli_connect($host,$dbuser,$dbpassword) or die("資料庫連線失敗");
    //指定要操作的資料庫
    mysqli_select_db($conn, $db);
    //製作SQL指令
    $sql = "SELECT * FROM login WHERE username = '".$username."' and passwd = '".$passwd."'";
    print("SQL指令:".$sql);
    //執行資料查詢指令
    $result = mysqli_query($conn, $sql) or die(sqli_error());

    //讀取查詢資料
    if ($row = mysqli_fetch_row($result)){ // 有讀到一筆資料時
        print("帳號密碼正確");
    }
    else{                               //沒有讀到資料時
        header('Location: 2-11div.html');
        print("登入失敗");
        exit;
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
        <table style="border: 1px solid blue ; width: 80% ;height:50%; margin=15px">
            <tr>
                <th>帳號</th><th>密碼</th>

            </tr>
            <tr>
                <td>
                <?php print $username; ?>
                <?php print $passwd; ?>
                </td>
            </tr>

        </table>

    </div>
</body>
</html>