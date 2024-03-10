<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Design" %></h1>
<br/>
<form method="post">
  <label>
    <input type="text" name="username" placeholder="Username">
  </label>
  <br/>
  <label>
    <input type="password" name="password" placeholder="Password">
  </label>
  <br/>
  <label>
    <input type="email" name="email" placeholder="Email">
  </label>
  <br/>
  <label>
    <select name="gender">
      <option value="male">Male</option>
      <option value="female">Female</option>
    </select>
  </label>
  <br/>
  <label>
    <input type="date" name="dateOfBirth" placeholder="Date of Birth">
  </label>
  <br/>
  <button type="submit">Submit</button>
</form>
</body>
</html>