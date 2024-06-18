<%-- View Page --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Set Password</title>
        <link rel=”stylesheet” href=”https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css” />
        <link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>  
    </head>
    <body>
        <div class="container center mt-5 col-md-4 p-5 border border-primary">
            <h1 class="text-center">Forget Password</h1> <br />
            <form action="forget" method="post">
            
                <div class="form-group">
                    <label>Email: </label>
                    <input type="email" name="email" class="form-control" placeholder="Email Address" required>
                </div>   
                
                <p class="display-6 text-center">
                <input type="submit" value="Next" class="btn btn-block btn-primary">
                </p>    
            </form>
        </div>
    </body>
</html>