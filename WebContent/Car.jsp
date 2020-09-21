<%@ page contentType="text/html; charset=UTF-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>購物車</title>
</head>
 
<body>
<form id="form1" name="form1" method="post" action="http://localhost:8080/0806/AddItem">
  <label></label>
  商品:
  <select name="itemID" id="itemID">
    <option value="烏龍茶">烏龍茶</option>
    <option value="綠茶">綠茶</option>
    <option value="紅茶">紅茶</option>
    <option value="鮮奶">鮮奶</option>
   
  </select>
  <p>數量:
    <label>
    <input name="quantity" type="text" id="quantity" value="1" />
    </label>
    <label>
    <input type="submit" name="Submit" value="確認購買" />
    </label>
    <a href="http://localhost:8080/0806/list">購物車清單</a></p>
</form>
</body>
</html>