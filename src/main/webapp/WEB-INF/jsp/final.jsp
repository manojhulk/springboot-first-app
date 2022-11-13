<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
       <style>
               body {
                 background-image: url('/images/par.jpg');
                 background-repeat: no-repeat;
                 background-attachment: fixed;
                 background-size: cover;
               }
       </style>
       <title>BookingStatus</title>
       <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
      <h2>Booking Status</h2>
      <hr>
      <i class="fa-li fa fa-check-square" style="font-size:40px;text-align:center;width:50%"></i>
      <h2 align="center">Your booking is successful</i></h2><br><br>
      <h2 align="center">BOOKING-ID : ${bookId}</h2><br>
      <div class="form-submit" align="center">
         <button class="btn btn-primary" type="submit"><a href="/welcome" style="text-align:center;text-decoration: none;">Home</a></button>
      </div>
    </body>
</html>