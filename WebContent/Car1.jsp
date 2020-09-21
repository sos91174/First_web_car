<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
    <option value="咖啡">咖啡</option>
    <option value="蘋果汁">蘋果汁</option>
   
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