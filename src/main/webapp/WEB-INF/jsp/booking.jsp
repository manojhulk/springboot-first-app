<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
       <style>
          body {
                 background-image: url('/images/car2.jpg');
                 background-repeat: no-repeat;
                 background-attachment: fixed;
                 background-size: cover;
          }
       </style>
       <title>Booking</title>
    </head>
    <body>
      <h2 style="color:white">BOOKING DETAILS</h2>
      <form method="post">
         <input type="text"  class="form-control mt-4" name="uname" placeholder="Your name as start" required/><br><br>
         <input type="text" class="form-control mt-3" name="veh" placeholder="vehicle model"required/><br><br>
         <input type="text" class="form-control mt-3" name="stn" placeholder="start-date(YYYY-MM-DD)"required/><br><br>
         <input type="text" class="form-control mt-3" name="rtn" placeholder="return-date(YYYY-MM-DD)"required/><br><br>

         <div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
            <button class="btn btn-primary btn-lg">BOOK</button>
         </div>
      </form>
    </body>
</html>