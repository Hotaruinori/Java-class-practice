<?php
   $username = $_GET['username'];
   $passwd = $_GET['passwd'];

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