<?php
header("Content-Type: text/html; charset=utf-8");
// 檢查檔案是否上傳成功要用 $_FILES , ===為完全相等的意思,值相等型別也要相等
if ($_FILES['my_file']['error'] === UPLOAD_ERR_OK){
  print('檔案名稱: ' . $_FILES['my_file']['name'] . '<br>');
  print('檔案類型: ' . $_FILES['my_file']['type'] . '<br>');
  print('檔案大小: ' . ($_FILES['my_file']['size'] / 1024 /1024) . ' MB<br>');
  print('暫存名稱: ' . $_FILES['my_file']['tmp_name'] . '<br>');

  // 檢查檔案是否已經存在
  if (file_exists('upload/' . $_FILES['my_file']['name'])){
    print('檔案已存在。<br>');
  } 
  else {
    $file = $_FILES['my_file']['tmp_name'];  // 取得伺服器端檔案暫存
    $dest = 'upload/' . $_FILES['my_file']['name'];

    // 將檔案移至指定位置
    move_uploaded_file($file, $dest);
  }
} 
elseif ($_FILES['my_file']['error'] === UPLOAD_ERR_INI_SIZE){
  print('上傳檔案超過伺服器限制上傳大小。<br>');
}
//如果一開始檢查檔案上傳失敗

else {
  print('錯誤代碼：' . $_FILES['my_file']['error'] . '<br>');
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
    
</body>
</html>