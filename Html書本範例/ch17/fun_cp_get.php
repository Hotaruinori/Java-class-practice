<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>jQuery Mobile 網路應用程式</title>
<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.3/jquery.mobile-1.4.3.min.css" />
<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script src="http://code.jquery.com/mobile/1.4.3/jquery.mobile-1.4.3.min.js"></script>
</head>
<body>
<div data-role="page" id="page">
  <div data-role="header" data-add-back-btn="true">
  	<h1>ChangePage Function</h1>
  </div>
  <div data-role="content" style="text-align:center">
	<?php
	if(isset($_GET['send'])&&($_GET['send']!="")){
		echo "傳送方式為:".$_GET['send'].", 值為:".$_GET['sendval'];
	}
	if(isset($_POST['send'])&&($_POST['send']!="")){
		echo "傳送方式為:".$_POST['send'].", 值為:".$_POST['sendval'];
	}	
    ?>
  </div>
  <div data-role="footer" data-position="fixed">
    <h4>jQuery Mobile</h4>
  </div>
</div>
</body>
</html>