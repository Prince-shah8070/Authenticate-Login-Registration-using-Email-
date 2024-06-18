<%-- View Page --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
    </head>
    <body>
        <div class="container center mt-5 col-md-4 p-5 border border-primary">
            <h1 class="text-center">Login Page</h1> <br />
            <form action="login" method="post">
                <div class="form-group">
                    <label>Email: </label>
                    <input type="email" name="email" id="email" class="form-control" placeholder="Email Address" required>
                </div>
                
                <div class="form-group">
                    <label>Password: </label>
                    <input type="password" name="pass" id="password" class="form-control bi bi-eye-slash bi-eye" placeholder="Password" required>
                </div>
               
                <input type="submit" class="btn btn-primary btn-block" value="Login" /><br />
                
                <p class="display-6 text-center">
                Create new Account?<a href="signupPage.jsp" class="link-primary">Signup</a>
                </p>
                <p class="display-6 text-center">
                <a href="forgetPassword.jsp" class="link-primary">Forget Password</a>
                </p>
            </form>
        </div>
    </body>
</html>
