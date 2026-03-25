

<%
String name = (String) request.getAttribute("name");
if(name == null){
name = "Employee";
}
%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Employee Dashboard</title>

<style>

*{
margin:0;
padding:0;
box-sizing:border-box;
font-family: Arial, sans-serif;
}

body{
background:#f4f6f9;
}

/* Navbar */

.navbar{
background:#4e73df;
color:white;
padding:15px 40px;
display:flex;
justify-content:space-between;
align-items:center;
}

.navbar h2{
font-weight:normal;
}

.logout{
text-decoration:none;
color:white;
background:#e74a3b;
padding:8px 15px;
border-radius:5px;
}

.logout:hover{
background:#c0392b;
}

/* Container */

.container{
padding:40px;
}

.welcome{
margin-bottom:30px;
}

.cards{
display:flex;
gap:20px;
margin-bottom:30px;
flex-wrap:wrap;
}

.card{
background:white;
padding:25px;
border-radius:10px;
box-shadow:0 5px 15px rgba(0,0,0,0.1);
flex:1;
min-width:200px;
text-align:center;
}

.card h3{
color:#555;
margin-bottom:10px;
}

/* Buttons */

.buttons{
display:flex;
gap:20px;
flex-wrap:wrap;
}

button{
padding:12px 25px;
border:none;
border-radius:6px;
font-size:16px;
cursor:pointer;
color:white;
}

.checkin{
background:#1cc88a;
}

.checkout{
background:#f6c23e;
}

.view{
background:#36b9cc;
}

button:hover{
opacity:0.9;
}

</style>

</head>

<body>

<div class="navbar">

<h2>Smart Attendance System</h2>

<a href="login.html" class="logout">Logout</a>

</div>

<div class="container">

<div class="welcome">

<h2>Welcome <%= name %></h2>

<p>Track your attendance easily.</p>

</div>

<div class="cards">

<div class="card">
<h3>Today's Status</h3>
<p>Pending</p>
</div>

<div class="card">
<h3>Check In</h3>
<p>--:--</p>
</div>

<div class="card">
<h3>Check Out</h3>
<p>--:--</p>
</div>

</div>

<div class="buttons">

<form action="checkin" method="post">
<button class="checkin">Check In</button>
</form>

<form action="checkout" method="post">
<button class="checkout">Check Out</button>
</form>

<form action="viewAttendance">
<button class="view">View Attendance</button>
</form>

</div>

</div>

</body>
</html>
