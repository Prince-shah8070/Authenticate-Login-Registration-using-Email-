<%-- View Page --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Set New Password</title>
        <link rel=”stylesheet” href=”https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css” />
        <link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>  
        <script>
            function validate()
            {
                var password1 = document.getElementById("password1").value;
                console.log(password1);
                var password2 = document.getElementById("password2").value;
                console.log(password2);
                if(password1 !== password2)
                {
                    window.alert("Passwrod is not matching!");
                    return false;
                }
            }
        </script>
    </head>
    <body>
        <div class="container center mt-5 col-md-4 p-5 border border-primary">
            <h1 class="text-center">Set New Password</h1> <br />
            <form action="setPassword" method="post" name="forget" onsubmit="return validate();">
            
     <%--      <div class="form-group">
                    <label>Email: </label>
                    <input type="email" name="email" class="form-control" placeholder="Email Address" required>
                </div> --%>
            
                <div class="form-group">
                    <label>Enter OTP: </label>
                    <input type="number" name="otp" class="form-control" placeholder="Enter OTP" required>
                </div>
                
                <div class="form-group">
                    <label>Password: </label>
                    <input type="password" name="pass" id="password1" class="form-control bi bi-eye-slash bi-eye" placeholder="Enter Password" required>
                </div>
                <div class="form-group">
                    <label>Password: </label>
                    <input type="password" name="pass" id="password2" class="form-control bi bi-eye-slash bi-eye" placeholder="Re-Enter Password" required>
                </div>
           
                <input type="submit" class="btn btn-primary btn-block" value="Submit" /><br />
            </form>
        </div>
    </body>
</html>