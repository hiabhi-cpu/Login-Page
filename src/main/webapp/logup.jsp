<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style>
        body{
            background-color: rgb(237, 234, 234);
        }
        .box{
            border:2px solid white;
            height:550px;
            width:550px;
            margin-left: 300px;
            margin-top: 50px;
            background-color: white;
            border-radius: 15px;
            font-family: 'Karma', serif;

        }

        .email{
            width:510px;
            height:30px;
            margin-left: 20px;
            border-radius: 2px;
        }
        
        .password{
            width:510px;
            height:30px;
            margin-left: 20px;
            border-radius: 2px;
        }

        .submit{
            background-color: rgb(230, 89, 89);
            height: 40px; 
            width:100px;
            margin-left: 250px;
            color:white;
           font-family: 'Karma', serif;

        }
        .submit:hover{
            background-color: rgb(198, 45, 45);
        }
       
    </style>
<body>
        <div class="box">
            <div style="border:1px solid white;"><h1 style="text-align: center; color:rgb(230, 89, 89)">Pet Pitaara</h1></div>
            <h2 style="margin-left: 20px;">Sign Up</h2>
            <p style="margin-left: 20px; font-size: 17px; font-family: 'Karma',serif; ">Email: </p>
            	<form action="signupnew">
                <input type:"email" name="email" value="" class="email"> <br>
                <br>
                <p style="margin-left: 20px; font-size: 17px;">Set Password:</p>
                <input type:"password" name="password" value="" class="password">
                <br>
                <br>
                <div style="margin-left: 20px; font-size: 17px;">${obj}</div>
                
                <br>
                <br>
                <button class="submit">Sign Up</button>
				</form>
        </div>
        
        
    </body>


</body>
</html>