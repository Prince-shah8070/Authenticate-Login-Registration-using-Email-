<%-- View Page --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link rel=”stylesheet” href=”https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css” />
        <link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>  
        <script>
            function validate()
            {
                var password1 = document.getElementById("pass").value;
                console.log(password1);
                var password2 = document.getElementById("confirm_pass").value;
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
            <h1 class="text-center">Signup Page</h1> <br />
            <form action="signup" method="post" name="signup" onsubmit="return validate();">
                <div class="form-group">
                    <label>Name:</label>
                    <input type="text" name="name" class="form-control" placeholder="Your name" required>
                </div>
                <div class="form-group">
                    <label>Email: </label>
                    <input type="email" name="email" class="form-control" placeholder="Email Address" required>
                </div>
                
                <div class="form-group">
                    <label for="pass1">Password: </label>
                    <input id="pass" type="password" name="password1" class="form-control bi bi-eye-slash bi-eye" placeholder="Password" required>
                </div>
                <div class="form-group">
                    <label for="pass2">Password: </label>
                    <input id="confirm_pass" type="password" name="password2" class="form-control bi bi-eye-slash bi-eyes" placeholder="Re-Enter Password" required>
                </div>
               
                <input type="submit" class="btn btn-primary btn-block" value="Login" /><br />
            </form>
        </div>
    </body>
</html>